package com.example.storyreader.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chapters")
data class Chapter(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val storyId: Long,
    val chapterNumber: Int,
    val title: String,
    val content: String
)