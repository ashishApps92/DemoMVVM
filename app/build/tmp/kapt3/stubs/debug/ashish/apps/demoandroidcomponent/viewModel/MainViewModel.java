package ashish.apps.demoandroidcomponent.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lashish/apps/demoandroidcomponent/viewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lashish/apps/demoandroidcomponent/network/RetrofitRepository;", "(Lashish/apps/demoandroidcomponent/network/RetrofitRepository;)V", "quoteData", "Landroidx/lifecycle/LiveData;", "Lashish/apps/demoandroidcomponent/model/QuoteData;", "getQuoteData", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final ashish.apps.demoandroidcomponent.network.RetrofitRepository repository = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    ashish.apps.demoandroidcomponent.network.RetrofitRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ashish.apps.demoandroidcomponent.model.QuoteData> getQuoteData() {
        return null;
    }
}