package ashish.apps.demoandroidcomponent.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ashish.apps.demoandroidcomponent.network.RetrofitRepository
import ashish.apps.demoandroidcomponent.model.QuoteData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: RetrofitRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getquotes(1)
        }
    }

    val quoteData : LiveData<QuoteData>
    get() = repository.liveQuoteData



}