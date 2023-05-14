package ashish.apps.demoandroidcomponent.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ashish.apps.demoandroidcomponent.network.RetrofitRepository

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(private val repositry: RetrofitRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repositry) as T
    }
}