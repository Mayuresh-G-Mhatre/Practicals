class MainActivity : AppCompatActivity() {

    private lateinit var randomNumberTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomNumberTextView = findViewById(R.id.randomNumberTextView)

        Thread(Runnable {
            try {
                Thread.sleep(3000) // Add a delay of 3 seconds
                val randomNum = (1..100).random() // Generate a random number between 1 and 100
                runOnUiThread {
                    randomNumberTextView.text = "Random Number: $randomNum"
                }
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }).start()
    }
}
