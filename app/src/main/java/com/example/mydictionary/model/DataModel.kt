package com.example.mydictionary.model

import com.google.gson.annotations.SerializedName
import geekbrains.ru.translator.model.data.Meanings

class DataModel(
    @field:SerializedName("text") val text: String?,
    @field:SerializedName("meanings") val meanings: List<Meanings>?
)
