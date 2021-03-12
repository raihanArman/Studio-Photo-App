package id.co.dhanapps.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lid/co/dhanapps/utils/GlideBindingAdapter;", "", "()V", "Companion", "app_debug"})
public final class GlideBindingAdapter {
    public static final id.co.dhanapps.utils.GlideBindingAdapter.Companion Companion = null;
    
    public GlideBindingAdapter() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void setImageResource(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageRes"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, int res) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lid/co/dhanapps/utils/GlideBindingAdapter$Companion;", "", "()V", "setImageResource", "", "view", "Landroid/widget/ImageView;", "url", "", "setImageUrl", "res", "", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"imageUrl"})
        public final void setImageResource(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"imageRes"})
        public final void setImageUrl(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, int res) {
        }
        
        private Companion() {
            super();
        }
    }
}