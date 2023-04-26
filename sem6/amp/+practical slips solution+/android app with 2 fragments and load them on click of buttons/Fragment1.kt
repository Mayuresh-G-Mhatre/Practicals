import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment1 : Fragment() {

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        textView = view.findViewById(R.id.textView)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            Toast.makeText(context, "Fragment 1", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}
