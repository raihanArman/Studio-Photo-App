package id.co.dhanapps.view.home

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.co.dhanapps.repository.HomeRepository

class HomeViewModelProviderFactory(val app: Application, val homeRepository: HomeRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(app, homeRepository) as T
    }
}