package id.co.dhanapps.utils

import android.graphics.Rect
import android.location.Location
import android.os.Handler
import android.view.View
import android.widget.ScrollView

class Constant {
    companion object{
        const val BASE_URL = "http://192.168.43.22/gostudio_api/"

        var mLastLocation: Location? = null

        const val LOGIN_KEY = "login_key"
        const val ID_USER_KEY = "id_user"
        const val LOGIN_STATUS = "status_login"

        fun scrollToView(scrollView: View, view: View) {
            view.requestFocus()
            val scrollBounds = Rect()
            scrollView.getHitRect(scrollBounds)
            if (!view.getLocalVisibleRect(scrollBounds)) {
                Handler().post {
                    val toScroll: Int = getRelativeTop(view) - getRelativeTop(scrollView)
                    (scrollView as ScrollView).smoothScrollTo(0, toScroll - 120)
                }
            }
        }


        fun getRelativeTop(myView: View): Int {
            return if (myView.parent === myView.rootView) myView.top else myView.top + getRelativeTop(myView.parent as View)
        }
    }




}