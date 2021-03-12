package id.co.dhanapps.view.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.FragmentSignInBinding
import id.co.dhanapps.utils.Constant.Companion.ID_USER_KEY
import id.co.dhanapps.utils.Constant.Companion.LOGIN_KEY
import id.co.dhanapps.utils.Constant.Companion.LOGIN_STATUS
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.home.MainActivity

class SignInFragment : Fragment() {

    lateinit var dataBinding: FragmentSignInBinding
    private lateinit var viewModel: LoginViewModel
    private var sharedPreferences: SharedPreferences? = null
    private var editor: SharedPreferences.Editor? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_in, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as LoginActivity).viewModel
        sharedPreferences = activity!!.getSharedPreferences(LOGIN_KEY, Context.MODE_PRIVATE)
        editor = sharedPreferences?.edit()

        viewModel.loginMutable.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Success -> {
                    response.data?.let {
                        if (it.value == 1) {
                            saveDataUser(it?.studio)
                        }else{
                            Toast.makeText(context, "${it?.message}", Toast.LENGTH_LONG).show()
                        }
                    }
                }
                is Resource.Error ->{
                    response.message?.let {
                        Toast.makeText(context, it, Toast.LENGTH_LONG).show()
                    }
                }
            }
        })


        dataBinding.btnSignIn.setOnClickListener {
            viewModel.getLoginUser(dataBinding.etEmail.text.toString(), dataBinding.etPassword.text.toString())
        }


        dataBinding.tvRegistrasi.setOnClickListener(View.OnClickListener { setFragment(SignUpFragment()) })

    }

    private fun saveDataUser(studio: Studio) {
        val idUser: String? = studio?.idStudio
        editor!!.putString(ID_USER_KEY, idUser)
        editor!!.putBoolean(LOGIN_STATUS, true)
        editor!!.commit()
        val intent = Intent(activity, MainActivity::class.java)
        activity!!.startActivity(intent)
        activity!!.finish()
    }


    private fun setFragment(fragment: Fragment) {
        val parentLayout = (dataBinding.root.context as LoginActivity).binding.frameLogin
        val transaction = activity!!.supportFragmentManager.beginTransaction()
        transaction.replace(parentLayout.id, fragment)
        transaction.commit()
    }
}