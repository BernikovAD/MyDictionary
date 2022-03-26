package com.example.mydictionary.contracts

import com.example.mydictionary.model.AppState

interface View {
    fun renderData(appState: AppState)
}