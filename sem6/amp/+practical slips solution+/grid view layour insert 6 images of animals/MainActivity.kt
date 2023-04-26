class MainActivity : AppCompatActivity() {

    private val animalList = arrayOf(
        "Lion",
        "Tiger",
        "Elephant",
        "Giraffe",
        "Monkey",
        "Panda"
    )

    private val animalImages = intArrayOf(
        R.drawable.lion,
        R.drawable.tiger,
        R.drawable.elephant,
        R.drawable.giraffe,
        R.drawable.monkey,
        R.drawable.panda
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AnimalAdapter(this, animalList, animalImages)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, animalList[position], Toast.LENGTH_SHORT).show()
        }
    }
}

class AnimalAdapter(
    private val context: Context,
    private val animalList: Array<String>,
    private val animalImages: IntArray
) : BaseAdapter() {

    override fun getCount(): Int {
        return animalList.size
    }

    override fun getItem(position: Int): Any {
        return animalList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.animal_item, parent, false)
        val animalImage = view.findViewById<ImageView>(R.id.animalImage)
        val animalName = animalList[position]
        val animalImageId = animalImages[position]
        animalImage.setImageResource(animalImageId)
        animalImage.setOnClickListener {
            Toast.makeText(context, animalName, Toast.LENGTH_SHORT).show()
        }
        return view
    }
}
