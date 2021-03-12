package id.co.dhanapps.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.co.dhanapps.R

class GlideBindingAdapter {
    companion object {

        @JvmStatic
        @BindingAdapter("imageUrl")
        fun setImageResource(view: ImageView, url: String) { // This methods should not have any return type, = declaration would make it return that object declaration.
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_baseline_image_24)
                .error(R.drawable.ic_launcher_background)

            Glide.with(view.context)
                .setDefaultRequestOptions(requestOptions)
                .load(url)
                .into(view)
        }

        @JvmStatic
        @BindingAdapter("imageRes")
        fun setImageUrl(view: ImageView, res: Int){
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_baseline_image_24)
                .error(R.drawable.ic_launcher_background)

            Glide.with(view.context)
                .setDefaultRequestOptions(requestOptions)
                .asBitmap()
                .load(res)
                .into(view)
        }
    }

}