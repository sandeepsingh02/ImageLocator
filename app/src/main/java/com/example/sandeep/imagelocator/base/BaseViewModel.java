package com.example.sandeep.imagelocator.base;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


public class BaseViewModel extends ViewModel {

    public abstract static class Factory extends ViewModelProvider.NewInstanceFactory {
        public abstract BaseViewModel getClassInstance();
        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return (T) getClassInstance();
        }
    }

}
