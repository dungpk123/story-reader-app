package com.example.storyreader.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "favorites",
    foreignKeys = [
        ForeignKey(
            entity = Story::class,
            parentColumns = ["id"],
            childColumns = ["storyId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
) 
data class Favorite(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val storyId: Int,
    val addedDate: Long = System.currentTimeMillis()
}