import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var gamesListView: ListView
    private lateinit var selectedGameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gamesListView = findViewById(R.id.games_listview)
        selectedGameTextView = findViewById(R.id.selected_game_textview)

        val games = listOf(
            "Minecraft",
            "Fortnite",
            "Call of Duty",
            "Assassin's Creed",
            "Grand Theft Auto",
            "Halo",
            "The Legend of Zelda",
            "Super Mario Bros.",
            "Pokemon",
            "League of Legends"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, games)
        gamesListView.adapter = adapter

        gamesListView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                selectedGameTextView.text = games[position]
            }
    }
}
