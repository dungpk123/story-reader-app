package com.example.storyreader.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [Story::class, Chapter::class, Favorite::class], version = 1, exportSchema = false)
abstract class StoryDatabase : RoomDatabase() {
    abstract fun storyDao(): StoryDao

    companion object {
        @Volatile
        private var INSTANCE: StoryDatabase? = null

        fun getDatabase(context: Context): StoryDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    StoryDatabase::class.java,
                    "story_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

@Entity(tableName = "story")
data class Story(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val author: String
)

@Entity(tableName = "chapter")
data class Chapter(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val storyId: Long,
    val title: String,
    val content: String
)

@Entity(tableName = "favorite")
data class Favorite(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val storyId: Long
)