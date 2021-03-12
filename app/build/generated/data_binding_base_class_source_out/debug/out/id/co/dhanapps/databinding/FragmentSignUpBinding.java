// Generated by data binding compiler. Do not edit!
package id.co.dhanapps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import id.co.dhanapps.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSignUpBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final EditText etAlamat;

  @NonNull
  public final EditText etConfirmPassword;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etNama;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextInputLayout etPasswordLayout;

  @NonNull
  public final CardView pItem1IconParent;

  @NonNull
  public final RelativeLayout pItem1Parent;

  @NonNull
  public final CardView pItem2IconParent;

  @NonNull
  public final RelativeLayout pItem2Parent;

  @NonNull
  public final CardView pItem3IconParent;

  @NonNull
  public final RelativeLayout pItem3Parent;

  @NonNull
  public final ScrollView svSignUp;

  @NonNull
  public final TextView tvLogin;

  protected FragmentSignUpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSignUp, EditText etAlamat, EditText etConfirmPassword, EditText etEmail,
      EditText etNama, TextInputEditText etPassword, TextInputLayout etPasswordLayout,
      CardView pItem1IconParent, RelativeLayout pItem1Parent, CardView pItem2IconParent,
      RelativeLayout pItem2Parent, CardView pItem3IconParent, RelativeLayout pItem3Parent,
      ScrollView svSignUp, TextView tvLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSignUp = btnSignUp;
    this.etAlamat = etAlamat;
    this.etConfirmPassword = etConfirmPassword;
    this.etEmail = etEmail;
    this.etNama = etNama;
    this.etPassword = etPassword;
    this.etPasswordLayout = etPasswordLayout;
    this.pItem1IconParent = pItem1IconParent;
    this.pItem1Parent = pItem1Parent;
    this.pItem2IconParent = pItem2IconParent;
    this.pItem2Parent = pItem2Parent;
    this.pItem3IconParent = pItem3IconParent;
    this.pItem3Parent = pItem3Parent;
    this.svSignUp = svSignUp;
    this.tvLogin = tvLogin;
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSignUpBinding>inflateInternal(inflater, R.layout.fragment_sign_up, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSignUpBinding>inflateInternal(inflater, R.layout.fragment_sign_up, null, false, component);
  }

  public static FragmentSignUpBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSignUpBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSignUpBinding)bind(component, view, R.layout.fragment_sign_up);
  }
}