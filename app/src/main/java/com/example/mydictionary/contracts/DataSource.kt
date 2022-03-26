package com.example.mydictionary.contracts

import android.database.Observable

interface DataSource<T> {
    fun getData(word: String): Observable<T>
}