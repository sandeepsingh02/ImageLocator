package com.example.sandeep.imagelocator.main;

import com.example.sandeep.imagelocator.base.BaseViewModel;

public class MainActivityViewModel extends BaseViewModel {
    //private MutableLiveData<DtoMianActivty> dtoMainActivityMutableLiveData=new MutableLiveData<>();
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}