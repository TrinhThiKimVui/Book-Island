package com.example.bookisland.ui.writebook;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WritebooksViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public WritebooksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is writebook fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}