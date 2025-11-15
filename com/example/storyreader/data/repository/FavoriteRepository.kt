import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

interface FavoriteRepository {
    fun getAllFavorites(): Flow<List<FavoriteItem>>
    suspend fun isFavorite(itemId: String): Boolean
    suspend fun addFavorite(item: FavoriteItem)
    suspend fun removeFavorite(itemId: String)
}

data class FavoriteItem(val id: String, val name: String)

class FavoriteRepositoryImpl: FavoriteRepository {
    private val favorites = mutableListOf<FavoriteItem>()

    override fun getAllFavorites(): Flow<List<FavoriteItem>> = flowOf(favorites)

    override suspend fun isFavorite(itemId: String): Boolean {
        return favorites.any { it.id == itemId }
    }

    override suspend fun addFavorite(item: FavoriteItem) {
        if (!isFavorite(item.id)) {
            favorites.add(item)
        }
    }

    override suspend fun removeFavorite(itemId: String) {
        favorites.removeIf { it.id == itemId }
    }
}