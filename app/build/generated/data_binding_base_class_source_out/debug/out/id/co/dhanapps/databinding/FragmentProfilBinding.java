// Generated by data binding compiler. Do not edit!
package id.co.dhanapps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;
import id.co.dhanapps.R;
import id.co.dhanapps.data.Studio;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfilBinding extends ViewDataBinding {
  @NonNull
  public final Button btnEdit;

  @NonNull
  public final Button btnLogout;

  @NonNull
  public final CircleImageView ivStudio;

  @NonNull
  public final RecyclerView rvKarya;

  @NonNull
  public final RecyclerView rvPaket;

  @NonNull
  public final TextView tvStudio;

  @NonNull
  public final TextView tvTambahKarya;

  @NonNull
  public final TextView tvTambahPaket;

  @Bindable
  protected Studio mUser;

  protected FragmentProfilBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnEdit, Button btnLogout, CircleImageView ivStudio, RecyclerView rvKarya,
      RecyclerView rvPaket, TextView tvStudio, TextView tvTambahKarya, TextView tvTambahPaket) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnEdit = btnEdit;
    this.btnLogout = btnLogout;
    this.ivStudio = ivStudio;
    this.rvKarya = rvKarya;
    this.rvPaket = rvPaket;
    this.tvStudio = tvStudio;
    this.tvTambahKarya = tvTambahKarya;
    this.tvTambahPaket = tvTambahPaket;
  }

  public abstract void setUser(@Nullable Studio user);

  @Nullable
  public Studio getUser() {
    return mUser;
  }

  @NonNull
  public static FragmentProfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profil, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfilBinding>inflateInternal(inflater, R.layout.fragment_profil, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profil, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfilBinding>inflateInternal(inflater, R.layout.fragment_profil, null, false, component);
  }

  public static FragmentProfilBinding bind(@NonNull View view) {
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
  public static FragmentProfilBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfilBinding)bind(component, view, R.layout.fragment_profil);
  }
}
