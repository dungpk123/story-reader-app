package com.example.storyreader.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "chapters",
    foreignKeys = [
        ForeignKey(
            entity = Story::class,
            parentColumns = ["id"],
            childColumns = ["storyId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Chapter(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val storyId: Int,
    val chapterNumber: Int,
    val title: String,
    val content: String,
    val uploadDate: Long = System.currentTimeMillis()
)