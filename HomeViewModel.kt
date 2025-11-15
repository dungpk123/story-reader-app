package com.example.storyreaderapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _state = MutableLiveData<HomeState>()
    val state: LiveData<HomeState> get() = _state

    init {
        _state.value = HomeState.Loading
    }

    fun loadStories() {
        _state.value = HomeState.Loading
        // Implement your story loading logic here
        // Update _state with the result
    }

    sealed class HomeState {
        object Loading : HomeState()
        data class Success(val stories: List<Story>) : HomeState()
        data class Error(val message: String) : HomeState()
    }
}

data class Story(val id: String, val title: String, val content: String)