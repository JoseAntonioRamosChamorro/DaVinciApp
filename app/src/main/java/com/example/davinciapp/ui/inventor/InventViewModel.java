package com.example.davinciapp.ui.inventor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InventViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("   ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}