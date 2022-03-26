package com.example.mydictionary.contracts

import com.example.mydictionary.model.AppState

interface Presenter<T : AppState, V : View> {
    fun attachView(view: V)
    fun detachView(view: V)
    fun getData(word: String, isOnline: Boolean)
}