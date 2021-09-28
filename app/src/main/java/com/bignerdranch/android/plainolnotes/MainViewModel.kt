package com.bignerdranch.android.plainolnotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.plainolnotes.data.NoteEntity
import com.bignerdranch.android.plainolnotes.data.SampleDataProvider

class MainViewModel : ViewModel() {

    val notesList = MutableLiveData<List<NoteEntity>>()
    
    init{
        notesList.value=SampleDataProvider.getNotes()
    }
}