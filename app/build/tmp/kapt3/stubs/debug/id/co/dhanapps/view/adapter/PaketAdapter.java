package id.co.dhanapps.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001aR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lid/co/dhanapps/view/adapter/PaketAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lid/co/dhanapps/view/adapter/PaketAdapter$ViewHolder;", "context", "Landroid/content/Context;", "type", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "listPaket", "", "Lid/co/dhanapps/data/Paket;", "getType", "()I", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListPaket", "paket", "", "ViewHolder", "app_debug"})
public final class PaketAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<id.co.dhanapps.view.adapter.PaketAdapter.ViewHolder> {
    private final java.util.List<id.co.dhanapps.data.Paket> listPaket = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final int type = 0;
    
    public final void setListPaket(@org.jetbrains.annotations.NotNull()
    java.util.List<id.co.dhanapps.data.Paket> paket) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public id.co.dhanapps.view.adapter.PaketAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.view.adapter.PaketAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int getType() {
        return 0;
    }
    
    public PaketAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int type) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lid/co/dhanapps/view/adapter/PaketAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lid/co/dhanapps/databinding/ItemPaketBinding;", "(Lid/co/dhanapps/view/adapter/PaketAdapter;Lid/co/dhanapps/databinding/ItemPaketBinding;)V", "getBinding", "()Lid/co/dhanapps/databinding/ItemPaketBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final id.co.dhanapps.databinding.ItemPaketBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final id.co.dhanapps.databinding.ItemPaketBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        id.co.dhanapps.databinding.ItemPaketBinding binding) {
            super(null);
        }
    }
}