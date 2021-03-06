// Generated by data binding compiler. Do not edit!
package id.co.dhanapps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import id.co.dhanapps.R;
import id.co.dhanapps.data.Studio;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailStudioBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final CollapsingToolbarLayout collapseToolbar;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivPamflet;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final RecyclerView rvGambar;

  @NonNull
  public final RelativeLayout rvLihatLokasi;

  @NonNull
  public final RecyclerView rvPaket;

  @NonNull
  public final TextView tvCall;

  @Bindable
  protected Studio mPangkalan;

  @Bindable
  protected String mJam;

  @Bindable
  protected String mTanggal;

  @Bindable
  protected String mLike;

  protected ActivityDetailStudioBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarLayout, CollapsingToolbarLayout collapseToolbar, ImageView ivBack,
      ImageView ivPamflet, NestedScrollView nestedScrollView, RecyclerView rvGambar,
      RelativeLayout rvLihatLokasi, RecyclerView rvPaket, TextView tvCall) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.collapseToolbar = collapseToolbar;
    this.ivBack = ivBack;
    this.ivPamflet = ivPamflet;
    this.nestedScrollView = nestedScrollView;
    this.rvGambar = rvGambar;
    this.rvLihatLokasi = rvLihatLokasi;
    this.rvPaket = rvPaket;
    this.tvCall = tvCall;
  }

  public abstract void setPangkalan(@Nullable Studio pangkalan);

  @Nullable
  public Studio getPangkalan() {
    return mPangkalan;
  }

  public abstract void setJam(@Nullable String jam);

  @Nullable
  public String getJam() {
    return mJam;
  }

  public abstract void setTanggal(@Nullable String tanggal);

  @Nullable
  public String getTanggal() {
    return mTanggal;
  }

  public abstract void setLike(@Nullable String like);

  @Nullable
  public String getLike() {
    return mLike;
  }

  @NonNull
  public static ActivityDetailStudioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail_studio, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailStudioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailStudioBinding>inflateInternal(inflater, R.layout.activity_detail_studio, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailStudioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail_studio, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailStudioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailStudioBinding>inflateInternal(inflater, R.layout.activity_detail_studio, null, false, component);
  }

  public static ActivityDetailStudioBinding bind(@NonNull View view) {
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
  public static ActivityDetailStudioBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailStudioBinding)bind(component, view, R.layout.activity_detail_studio);
  }
}
