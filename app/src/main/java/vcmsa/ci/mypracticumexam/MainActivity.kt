package vcmsa.ci.mypracticumexam
//Student number: ST10465158 name: Rumaisa Khan
import android.annotation.SuppressLint
import android.content.Intent
import android.media.Rating
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Companion object to store parallel arrays
    companion object {
        val songTitle = mutableListOf<String>()
        val artistName = mutableListOf<String>()
        val rating = mutableListOf<Int>()
        val comments = mutableListOf<String>()
        //Author: Zahra Bulbula
        //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //declarations for each category and button variables
        val songnameInput = findViewById<EditText>(R.id.etSongTitle)
        val artistnameInput = findViewById<EditText>(R.id.etArtistName)
        val ratingsInput = findViewById<EditText>(R.id.etRatings)
        val commentsInput = findViewById<EditText>(R.id.etComments)

        val addButton = findViewById<Button>(R.id.btnAdd)
        val goTosecond = findViewById<Button>(R.id.btnSecondScreen)
        val exitButton = findViewById<Button>(R.id.btnExit)
        //Author: Zahra Bulbula
        //URL: https://github.com/zb662000/PracticumGuide/tree/master/app

        addButton.setOnClickListener {
            //declaration of variables for the button which will add these songs to playlist
            val title = songnameInput.text.toString().trim()
            val artist = artistnameInput.text.toString().trim()
            val ratingStr = ratingsInput.text.toString().trim()
            val comment = commentsInput.text.toString().trim()
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app

            //Error handling to warn the user
            if (title.isEmpty() || artist.isEmpty() || ratingStr.isEmpty()) {
                Toast.makeText(this, "Please fill in all required fields.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
                //Author: Zahra Bulbula
                //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
            }
            //more error handling
            val ratings = ratingStr.toIntOrNull()
            if (ratings == null || ratings <= 0) {
                Toast.makeText(this, "Enter a valid quantity (> 0).", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
                //Author: Zahra Bulbula
                //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
            }

            songTitle.add(title)
            artistName.add(artist)
            rating.add(ratingStr)
            comments.add(comment)

            Toast.makeText(this, "Song Added!", Toast.LENGTH_SHORT).show()

            // Clear inputs
            songnameInput.text.clear()
            artistnameInput.text.clear()
            ratingsInput.text.clear()
            commentsInput.text.clear()
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app

        }
        //this button will take the user to the second screen
        goTosecond.setOnClickListener {
            startActivity(Intent(this, MainActivity2secondscreen::class.java))
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
        }
        // this button will let the user exit the app
        exitButton.setOnClickListener {
            finish()
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app

    }

    }
}
//error fix
private fun <E> MutableList<E>.add(element: String) {
    //Author: Zahra Bulbula
    //URL: https://github.com/zb662000/PracticumGuide/tree/master/app

}
