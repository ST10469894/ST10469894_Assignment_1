package za.co.varsitycollege.st10469894.st10469894assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val back = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView2)
        val enter = findViewById<Button>(R.id.button2)
        val entertime = findViewById<EditText>(R.id.editTextText)
        val food = findViewById<TextView>(R.id.textView)

        // the meals of the food menu
        val morning = listOf("scrambled eggs", "sausage", "cheese", "toast","waffles")
        val midday = listOf("crisp chips", "salads", "grilled cheese", "panini", "water")
        val afternoon = listOf("tea","cheese and crackers", "fresh fruit", "muffins")
        val midafternoon = listOf("cupcake", "tacos", "granola bars")
        val dinner = listOf("grilled chicken, rice and roasted veggies")
        val afterdinner = listOf("pop corn", "ice cream", "chips", "biscuits")
enter.setOnClickListener {
    //if the user the wrong time
    if (entertime.text.toString() == "morning") {
        textview.text = "Greetings ,your breakfast is ready${morning}"

    } else if (entertime.text.toString() == "midday")
        textview.text = "Greetings ,your lunch is ready${midday}"
    else if (entertime.text.toString() == "afternoon")
        textview.text = "Greeting ,your lunch is ready${afternoon}"
    else if (entertime.text.toString() == "midafternoon")
        textview.text = "Greetings ,your snacks are ready${midafternoon}"
    else if (entertime.text.toString() == "dinner")
        textview.text = "Greetings ,your supper is ready${dinner}"
    else if (entertime.text.toString() == "afterdinner")
        textview.text = "Goodnight ,your snacks are ready${afterdinner}"
}
        back.setOnClickListener{
            entertime.text.clear()
            textview.text="Meals"

        }




            }
        }
