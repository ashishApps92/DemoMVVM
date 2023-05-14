package ashish.apps.demoandroidcomponent.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lashish/apps/demoandroidcomponent/network/RetrofitRepository;", "", "api", "Lashish/apps/demoandroidcomponent/network/RetrofitApi;", "(Lashish/apps/demoandroidcomponent/network/RetrofitApi;)V", "liveQuoteData", "Landroidx/lifecycle/LiveData;", "Lashish/apps/demoandroidcomponent/model/QuoteData;", "getLiveQuoteData", "()Landroidx/lifecycle/LiveData;", "mutableQuoteData", "Landroidx/lifecycle/MutableLiveData;", "getquotes", "", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RetrofitRepository {
    private final ashish.apps.demoandroidcomponent.network.RetrofitApi api = null;
    private final androidx.lifecycle.MutableLiveData<ashish.apps.demoandroidcomponent.model.QuoteData> mutableQuoteData = null;
    
    public RetrofitRepository(@org.jetbrains.annotations.NotNull()
    ashish.apps.demoandroidcomponent.network.RetrofitApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ashish.apps.demoandroidcomponent.model.QuoteData> getLiveQuoteData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getquotes(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}