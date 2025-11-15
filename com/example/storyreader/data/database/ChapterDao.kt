package com.example.storyreader.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ChapterDao {

    @Query("SELECT * FROM chapters WHERE storyId = :storyId")
    suspend fun getChaptersByStoryId(storyId: Int): List<Chapter>

    @Query("SELECT * FROM chapters WHERE id = :id")
    suspend fun getChapterById(id: Int): Chapter?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertChapter(chapter: Chapter)

    @Delete
    suspend fun deleteChapter(chapter: Chapter)
}