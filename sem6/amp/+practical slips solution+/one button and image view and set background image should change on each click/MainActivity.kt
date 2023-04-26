import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var button: Button

    private var imageIndex: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        // Set initial background image
        imageView.setBackgroundResource(R.drawable.image1)

        button.setOnClickListener(View.OnClickListener {
            // Change background image on each click
            if (imageIndex == 1) {
                imageView.setBackgroundResource(R.drawable.image2)
                imageIndex = 2
            } else {
                imageView.setBackgroundResource(R.drawable.image1)
                imageIndex = 1
            }
        })
    }
}
