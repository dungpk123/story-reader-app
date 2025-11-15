package com.example.storyreader.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stories")
data class Story(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val author: String,
    val genre: String,
    val summary: String,
    val coverUrl: String = "",
    val rating: Float = 0f,
    val views: Int = 0
)