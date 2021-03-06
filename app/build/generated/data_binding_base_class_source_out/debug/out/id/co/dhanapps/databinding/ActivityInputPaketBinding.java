// Generated by data binding compiler. Do not edit!
package id.co.dhanapps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import id.co.dhanapps.R;
import id.co.dhanapps.data.Paket;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityInputPaketBinding extends ViewDataBinding {
  @NonNull
  public final Button btnUpdate;

  @NonNull
  public final EditText etHarga;

  @NonNull
  public final EditText etNama;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivDelete;

  @Bindable
  protected Paket mPaket;

  protected ActivityInputPaketBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnUpdate, EditText etHarga, EditText etNama, ImageView ivBack, ImageView ivDelete) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnUpdate = btnUpdate;
    this.etHarga = etHarga;
    this.etNama = etNama;
    this.ivBack = ivBack;
    this.ivDelete = ivDelete;
  }

  public abstract void setPaket(@Nullable Paket paket);

  @Nullable
  public Paket getPaket() {
    return mPaket;
  }

  @NonNull
  public static ActivityInputPaketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_input_paket, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInputPaketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityInputPaketBinding>inflateInternal(inflater, R.layout.activity_input_paket, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityInputPaketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_input_paket, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInputPaketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityInputPaketBinding>inflateInternal(inflater, R.layout.activity_input_paket, null, false, component);
  }

  public static ActivityInputPaketBinding bind(@NonNull View view) {
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
  public static ActivityInputPaketBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityInputPaketBinding)bind(component, view, R.layout.activity_input_paket);
  }
}
