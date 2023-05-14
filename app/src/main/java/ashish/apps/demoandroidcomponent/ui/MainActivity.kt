package ashish.apps.demoandroidcomponent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import ashish.apps.demoandroidcomponent.R
import ashish.apps.demoandroidcomponent.network.RetrofitRepository
import ashish.apps.demoandroidcomponent.network.RetrofitApi
import ashish.apps.demoandroidcomponent.network.RetrofitInstance
import ashish.apps.demoandroidcomponent.viewModel.MainViewModel
import ashish.apps.demoandroidcomponent.viewModel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    val textView : TextView
    get() = findViewById(R.id.textView)
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val api: QuotesApi = RetrofitInstance.getInstance().create(QuotesApi::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val response = api.getQuoteList(1)
            if(response != null && response.body() != null) {
                textView.text = response.body()!!.results.get(0).author
            }
        }*/
        val repositry = RetrofitRepository(RetrofitInstance.getInstance().create(RetrofitApi::class.java))
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repositry)).get(MainViewModel::class.java)

        // above two line code remove bt dependencies injection.
        mainViewModel.quoteData.observe(this) {
            Log.d("result", it.results.get(0).author)
            textView.text = it.results.get(0).author
        }

    }
}
