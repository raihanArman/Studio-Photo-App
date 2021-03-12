package id.co.dhanapps.databinding;
import id.co.dhanapps.R;
import id.co.dhanapps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditStudioBindingImpl extends ActivityEditStudioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_back, 7);
        sViewsWithIds.put(R.id.iv_user, 8);
        sViewsWithIds.put(R.id.iv_camera, 9);
        sViewsWithIds.put(R.id.btn_update, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditStudioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityEditStudioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            );
        this.etAlamat.setTag(null);
        this.etDeskripsi.setTag(null);
        this.etEmail.setTag(null);
        this.etNama.setTag(null);
        this.etNohp.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.user == variableId) {
            setUser((id.co.dhanapps.data.Studio) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable id.co.dhanapps.data.Studio User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
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
        id.co.dhanapps.data.Studio user = mUser;
        java.lang.String userNamaStudio = null;
        java.lang.String userDesrkripsi = null;
        java.lang.String userUsername = null;
        java.lang.String userEmail = null;
        java.lang.String userLokasi = null;
        java.lang.String userKontak = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.namaStudio
                    userNamaStudio = user.getNamaStudio();
                    // read user.desrkripsi
                    userDesrkripsi = user.getDesrkripsi();
                    // read user.username
                    userUsername = user.getUsername();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.lokasi
                    userLokasi = user.getLokasi();
                    // read user.kontak
                    userKontak = user.getKontak();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAlamat, userLokasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etDeskripsi, userDesrkripsi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNama, userNamaStudio);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNohp, userKontak);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, userUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}