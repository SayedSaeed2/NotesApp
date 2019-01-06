package com.example.android.notesapp.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.notesapp.database.AppRepository;
import com.example.android.notesapp.database.NoteEntity;
import com.example.android.notesapp.utilities.SampleData;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    public LiveData<List<NoteEntity>> mNotes;
    private AppRepository mAppRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);

        mAppRepository = AppRepository.getInstance(application.getApplicationContext());
        mNotes = mAppRepository.mNotes;
    }


    public void addSampleData() {
        mAppRepository.addSampleData();
    }

    public void deleteAllNotes() {
        mAppRepository.deleteAllNotes();
    }
}
