import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stories")
data class Story(
    @PrimaryKey val id: Int,
    val title: String,
    val author: String,
    val genre: String,
    val summary: String,
    val coverUrl: String
)