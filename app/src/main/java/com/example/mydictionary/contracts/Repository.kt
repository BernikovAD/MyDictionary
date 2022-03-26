package com.example.mydictionary.contracts

import android.database.Observable

interface Repository<T> {
    fun getData(word: String): Observable<T>
}