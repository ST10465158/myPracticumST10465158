package vcmsa.ci.mypracticumexam
//Student number: ST10465158 name: Rumaisa Khan
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2secondscreen : AppCompatActivity() {
    private lateinit var outputText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activity2secondscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        outputText = findViewById(R.id.tvOutput)
        //button declarations
        val showsongsBtn = findViewById<Button>(R.id.btnShowSongs)
        val showaverageBtn = findViewById<Button>(R.id.btnShowAverage)
        val backBtn = findViewById<Button>(R.id.btnBack)
        //Author: Zahra Bulbula
        //URL: https://github.com/zb662000/PracticumGuide/tree/master/app

        showsongsBtn.setOnClickListener {
            //this button will diplay all the songs that the user entered when clicked
            displayItems(showAll = true)
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
        }

        showaverageBtn.setOnClickListener {
            //this button will display the average rating of the songs the user entered
            displayItems(showAll = false)
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
        }

        backBtn.setOnClickListener {
            //This button will take the user back to the main screen.
            finish()
            //Author: Zahra Bulbula
            //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
        }
    }
    private fun displayItems(showAll: Boolean) {
        val builder = StringBuilder()
        //this will let the user see what is on their playlist list hen they click the "show list of songs" button
        for (i in MainActivity.songTitle.indices) {
            val qty = MainActivity.rating[i]
            if (showAll || qty >= 0) {
                builder.append("Song: ${MainActivity.songTitle[i]}\n")
                builder.append("Artist: ${MainActivity.rating[i]}\n")
                builder.append("Rating: $qty\n")
                builder.append("Comments: ${MainActivity.comments[i]}\n\n")
                //Author: Zahra Bulbula
                //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
            }
    }
        //Error Handling
        outputText.text = if (builder.isEmpty()) "No songs to show." else builder.toString()
        //Author: Zahra Bulbula
        //URL: https://github.com/zb662000/PracticumGuide/tree/master/app
    }
}
