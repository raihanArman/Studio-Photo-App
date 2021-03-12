package id.co.dhanapps.databinding;
import id.co.dhanapps.R;
import id.co.dhanapps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignUpBindingImpl extends FragmentSignUpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_email, 1);
        sViewsWithIds.put(R.id.et_nama, 2);
        sViewsWithIds.put(R.id.et_alamat, 3);
        sViewsWithIds.put(R.id.etPasswordLayout, 4);
        sViewsWithIds.put(R.id.et_password, 5);
        sViewsWithIds.put(R.id.p_item_1_parent, 6);
        sViewsWithIds.put(R.id.p_item_1_icon_parent, 7);
        sViewsWithIds.put(R.id.p_item_2_parent, 8);
        sViewsWithIds.put(R.id.p_item_2_icon_parent, 9);
        sViewsWithIds.put(R.id.p_item_3_parent, 10);
        sViewsWithIds.put(R.id.p_item_3_icon_parent, 11);
        sViewsWithIds.put(R.id.et_confirm_password, 12);
        sViewsWithIds.put(R.id.btn_sign_up, 13);
        sViewsWithIds.put(R.id.tv_login, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentSignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[13]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (android.widget.RelativeLayout) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.TextView) bindings[14]
            );
        this.svSignUp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}