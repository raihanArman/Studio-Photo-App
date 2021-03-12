package id.co.dhanapps.databinding;
import id.co.dhanapps.R;
import id.co.dhanapps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailStudioBindingImpl extends ActivityDetailStudioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 5);
        sViewsWithIds.put(R.id.collapse_toolbar, 6);
        sViewsWithIds.put(R.id.iv_pamflet, 7);
        sViewsWithIds.put(R.id.iv_back, 8);
        sViewsWithIds.put(R.id.nested_scroll_view, 9);
        sViewsWithIds.put(R.id.rv_paket, 10);
        sViewsWithIds.put(R.id.tv_call, 11);
        sViewsWithIds.put(R.id.rv_gambar, 12);
        sViewsWithIds.put(R.id.rv_lihat_lokasi, 13);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailStudioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityDetailStudioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.RelativeLayout) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tanggal == variableId) {
            setTanggal((java.lang.String) variable);
        }
        else if (BR.pangkalan == variableId) {
            setPangkalan((id.co.dhanapps.data.Studio) variable);
        }
        else if (BR.like == variableId) {
            setLike((java.lang.String) variable);
        }
        else if (BR.jam == variableId) {
            setJam((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTanggal(@Nullable java.lang.String Tanggal) {
        this.mTanggal = Tanggal;
    }
    public void setPangkalan(@Nullable id.co.dhanapps.data.Studio Pangkalan) {
        this.mPangkalan = Pangkalan;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.pangkalan);
        super.requestRebind();
    }
    public void setLike(@Nullable java.lang.String Like) {
        this.mLike = Like;
    }
    public void setJam(@Nullable java.lang.String Jam) {
        this.mJam = Jam;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String pangkalanNamaStudio = null;
        java.lang.String pangkalanLokasi = null;
        java.lang.String pangkalanDesrkripsi = null;
        java.lang.String pangkalanKontak = null;
        id.co.dhanapps.data.Studio pangkalan = mPangkalan;

        if ((dirtyFlags & 0x12L) != 0) {



                if (pangkalan != null) {
                    // read pangkalan.namaStudio
                    pangkalanNamaStudio = pangkalan.getNamaStudio();
                    // read pangkalan.lokasi
                    pangkalanLokasi = pangkalan.getLokasi();
                    // read pangkalan.desrkripsi
                    pangkalanDesrkripsi = pangkalan.getDesrkripsi();
                    // read pangkalan.kontak
                    pangkalanKontak = pangkalan.getKontak();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, pangkalanNamaStudio);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, pangkalanDesrkripsi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, pangkalanKontak);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, pangkalanLokasi);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tanggal
        flag 1 (0x2L): pangkalan
        flag 2 (0x3L): like
        flag 3 (0x4L): jam
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}