package ashish.apps.demoandroidcomponent.network

import ashish.apps.demoandroidcomponent.model.QuoteData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {

    @GET("/quotes")
    suspend fun  getQuoteList(@Query("page") page : Int) : Response<QuoteData>
}