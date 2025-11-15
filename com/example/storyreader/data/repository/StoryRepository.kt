package com.example.storyreader.data.repository

import kotlinx.coroutines.flow.Flow

class StoryRepository {

    suspend fun getAllStories(): Flow<List<Story>> {
        // Implementation goes here
    }

    suspend fun getStoryById(id: String): Flow<Story> {
        // Implementation goes here
    }

    suspend fun searchStories(query: String): Flow<List<Story>> {
        // Implementation goes here
    }

    suspend fun insertStory(story: Story) {
        // Implementation goes here
    }
}