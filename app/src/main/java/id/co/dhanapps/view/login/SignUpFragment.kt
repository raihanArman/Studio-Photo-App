package id.co.dhanapps.view.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.FragmentSignUpBinding
import id.co.dhanapps.utils.Constant
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.home.MainActivity


class SignUpFragment : Fragment() {

    lateinit var dataBinding: FragmentSignUpBinding
    private lateinit var viewModel: LoginViewModel
    private var sharedPreferences: SharedPreferences? = null
    private var editor: SharedPreferences.Editor? = null
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.[a-z]+".toRegex()
    val passwordRegex = "(.*[0-9].*)".toRegex()
    private var isAtLeast8 = false
    var hasUppercase:kotlin.Boolean = false
    private  var hasNumber:kotlin.Boolean = false
    private  var isRegistrationClickable:kotlin.Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedPreferences = activity!!.getSharedPreferences(Constant.LOGIN_KEY, Context.MODE_PRIVATE)
        editor = sharedPreferences?.edit()

        viewModel = (context as LoginActivity).viewModel

        dataBinding.etPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                registrationDataCheck()
            }

            override fun afterTextChanged(s: Editable) {}
        })


        dataBinding.btnSignUp.setOnClickListener(View.OnClickListener {
            if (isConnectionInternet(requireContext())) {
                checkInput()
            } else {
                Toast.makeText(activity, "Tidak ada jaringan", Toast.LENGTH_SHORT).show()
            }
        })
        
        viewModel.registerMutable.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        saveDataUser(it?.studio)
                    }
                }
                is Resource.Error ->{

                }
                is Resource.Loading ->{

                }
            }
        })

        dataBinding.tvLogin.setOnClickListener(View.OnClickListener { setFragment(SignInFragment()) })

    }

    private fun saveDataUser(studio: Studio?) {

        val idUser: String? = studio?.idStudio
        editor!!.putString(Constant.ID_USER_KEY, idUser)
        editor!!.putBoolean(Constant.LOGIN_STATUS, true)
        editor!!.commit()
        val intent = Intent(activity, MainActivity::class.java)
        activity!!.startActivity(intent)
        activity!!.finish()
    }

    private fun setFragment(fragment: Fragment) {

        val parentLayout = (dataBinding.getRoot().getContext() as LoginActivity).binding.frameLogin
        val transaction = activity!!.supportFragmentManager.beginTransaction()
        transaction.replace(parentLayout.id, fragment)
        transaction.commit()
    }

    private fun isConnectionInternet(requireContext: Context): Boolean {
        val connectivityManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager != null) {
            val info = connectivityManager.allNetworkInfo
            if (info != null) {
                for (i in info.indices) {
                    if (info[i].state == NetworkInfo.State.CONNECTED) {
                        return true
                    }
                }
            }
        }
        return false
    }

    private fun registrationDataCheck() {
        val password: String = dataBinding.etPassword.getText().toString()
        val email: String = dataBinding.etEmail.getText().toString()

        if (password.length >= 8) {
            isAtLeast8 = true
            dataBinding.pItem1IconParent.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorCheckOk))
        } else {
            isAtLeast8 = false
            dataBinding.pItem1IconParent.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorCheckOk))
        }
        if (password.matches(regex = passwordRegex)) {
            hasUppercase = true
            dataBinding.pItem2IconParent.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorCheckOk))
        } else {
            hasUppercase = false
            dataBinding.pItem2IconParent.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorCheckOk))
        }
        if (password.matches(passwordRegex)) {
            hasNumber = true
            dataBinding.pItem3IconParent.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorCheckOk))
        } else {
            hasNumber = false
            dataBinding.pItem3IconParent.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorCheckOk))
        }

    }

    fun checkInput() {
        if (!TextUtils.isEmpty(dataBinding.etEmail.getText())) {
            if (dataBinding.etEmail.getText().toString().matches(emailPattern)) {
                if (!TextUtils.isEmpty(dataBinding.etNama.getText())) {
                    if (!TextUtils.isEmpty(dataBinding.etPassword.getText())) {
                        if (!TextUtils.isEmpty(dataBinding.etConfirmPassword.getText())) {
                            if (dataBinding.etPassword.length() >= 8) {
                                if (isAtLeast8 && hasUppercase && hasNumber) {
                                    if (dataBinding.etPassword.getText().toString().equals(dataBinding.etConfirmPassword.getText().toString())) {
                                        daftar();
                                    } else {
                                        dataBinding.etConfirmPassword.setError("Password tidak cocok");
                                        Constant.scrollToView(dataBinding.svSignUp, dataBinding.etConfirmPassword);
                                    }
                                } else {
                                    dataBinding.etPassword.setError("Password tidak sesuai");
                                    Constant.scrollToView(dataBinding.svSignUp, dataBinding.etPassword);
                                }
                            } else {
                                dataBinding.etPassword.setError("Password terlalu sedikit");
                                Constant.scrollToView(dataBinding.svSignUp, dataBinding.etPassword);
                            }
                        } else {
                            dataBinding.etConfirmPassword.setError("Konfirmasi password tidak boleh kosong");
                            Constant?.scrollToView(dataBinding.svSignUp, dataBinding.etConfirmPassword);
                        }
                    } else {
                        dataBinding.etPassword.setError("Password tidak boleh kosong");
                        Constant.scrollToView(dataBinding.svSignUp, dataBinding.etPassword);
                    }
                } else {
                    dataBinding.etNama.setError("Nama tidak boleh kosong");
                    Constant.scrollToView(dataBinding.svSignUp, dataBinding.etNama);
                }
            } else {
                dataBinding.etEmail.setError("Email tidak sesuai format");
                Constant.scrollToView(dataBinding.svSignUp, dataBinding.etEmail);
            }
        } else {
            dataBinding.etEmail.setError("Email tidak boleh kosong");
            Constant.scrollToView(dataBinding.svSignUp, dataBinding.etEmail);
        }
    }

    private fun daftar() {

        val nama: String = dataBinding.etNama.getText().toString()
        val email: String = dataBinding.etEmail.getText().toString()
        val alamat: String = dataBinding.etAlamat.getText().toString()
        val password: String = dataBinding.etPassword.getText().toString()

        viewModel.getRegisterUser(email, password, nama, alamat)

    }


}