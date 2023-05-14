package ashish.apps.demoandroidcomponent.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ashish.apps.demoandroidcomponent.model.QuoteData

class RetrofitRepository(private val api: RetrofitApi) {
    private val mutableQuoteData = MutableLiveData<QuoteData>()

    val liveQuoteData : LiveData<QuoteData>
    get() = mutableQuoteData

    suspend fun getquotes(page: Int) {
        val response = api.getQuoteList(page)
        if (response.isSuccessful && response.body() != null) {
            mutableQuoteData.postValue(response.body())
        }
    }
}