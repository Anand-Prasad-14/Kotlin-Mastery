// The Song class must include these code elements:

// Properties for the title, artist, year published, and play count
// A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
// A method that prints a song description in this format:
// "[Title], performed by [artist], was released in [year published]."

class SongCatelog(
    var title: String,
    var artist: String,
    var yearPublished: Int,
    var playCount: Int,
) {
    
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription( ){
        println("$title, performed by $artist, was released in $yearPublished .")
    }
}

fun main() {
   val song = SongCatelog("shape of you" , "Anand", 2024 , 1_000_000)  //use underscores when writing large numbers such as the 1_000_000 value to make it more readable. 
   song.printDescription()
   println(song.isPopular)
}

// The solution contains a Song class with a default constructor that accepts all required parameters. 
// The Song class also has an isPopular property that uses a custom getter function, and a method that prints the description of itself.