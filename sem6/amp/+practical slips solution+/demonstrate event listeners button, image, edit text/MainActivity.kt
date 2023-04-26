class MainActivity : AppCompatActivity(), View.OnLongClickListener, View.OnTouchListener, View.OnKeyListener {

    private lateinit var button: Button
    private lateinit var imageView: ImageView
    private lateinit var editText: EditText
    private lateinit var messageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)
        editText = findViewById(R.id.editText)
        messageTextView = findViewById(R.id.messageTextView)

        button.setOnClickListener {
            messageTextView.text = "Button clicked!"
        }

        button.setOnLongClickListener(this)

        imageView.setOnTouchListener(this)

        editText.setOnKeyListener(this)
    }

    override fun onLongClick(view: View?): Boolean {
        messageTextView.text = "Button long-clicked!"
        return true
    }

    override fun onTouch(view: View?, event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> messageTextView.text = "Image touched down!"
            MotionEvent.ACTION_UP -> messageTextView.text = "Image touched up!"
            MotionEvent.ACTION_POINTER_DOWN -> messageTextView.text = "Image pointer down!"
        }
        return true
    }

    override fun onKey(view: View?, keyCode: Int, event: KeyEvent?): Boolean {
        if (event?.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
            val message = editText.text.toString()
            messageTextView.text = "You typed: $message"
            return true
        }
        return false
    }
}
