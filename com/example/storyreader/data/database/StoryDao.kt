package com.example.storyreader.data.database

class StoryDao {

    fun getAllStories(): List<Story> {
        // Logic to retrieve all stories
    }

    fun getStoryById(id: Int): Story? {
        // Logic to retrieve a story by its ID
    }

    fun insertStory(story: Story) {
        // Logic to insert a new story
    }

    fun deleteStory(id: Int) {
        // Logic to delete a story by its ID
    }

    fun searchStories(query: String): List<Story> {
        // Logic to search stories by query
    }
}

class Story(
    val id: Int,
    val title: String,
    val content: String
)