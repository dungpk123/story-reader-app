package com.example.storyreader.data.database

class FavoriteDao {
    private val favorites = mutableListOf<String>() // Assuming favorites are stored as a list of Strings, can be changed to your preferred type

    fun getAllFavorites(): List<String> {
        return favorites
    }

    fun isFavorite(storyId: String): Boolean {
        return favorites.contains(storyId)
    }

    fun addFavorite(storyId: String) {
        if (!isFavorite(storyId)) {
            favorites.add(storyId)
        }
    }

    fun removeFavorite(storyId: String) {
        favorites.remove(storyId)
    }
}