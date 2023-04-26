import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mAuth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

        val btnRegister = findViewById<Button>(R.id.btn_register)
        btnRegister.setOnClickListener {
            val name = findViewById<EditText>(R.id.et_name).text.toString().trim()
            val age = findViewById<EditText>(R.id.et_age).text.toString().trim()
            val gender = findViewById<EditText>(R.id.et_gender).text.toString().trim()
            val dob = findViewById<EditText>(R.id.et_dob).text.toString().trim()
            val username = findViewById<EditText>(R.id.et_username).text.toString().trim()
            val password = findViewById<EditText>(R.id.et_password).text.toString().trim()

            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (age.isEmpty()) {
                Toast.makeText(this, "Please enter age", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (gender.isEmpty()) {
                Toast.makeText(this, "Please enter gender", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (dob.isEmpty()) {
                Toast.makeText(this, "Please enter date of birth", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username.isEmpty()) {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            mAuth.createUserWithEmailAndPassword(username, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = mAuth.currentUser
                        val userInfo = HashMap<String, Any>()
                        userInfo["name"] = name
                        userInfo["age"] = age
                        userInfo["gender"] = gender
                        userInfo["dob"] = dob

                        db.collection("users").document(user!!.uid)
                            .set(userInfo)
                            .addOnSuccessListener { documentReference ->
                                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
                                finish()
                            }
                            .addOnFailureListener { e ->
                                Toast.makeText(this, "Registration failed: ${e.message}", Toast.LENGTH_SHORT).show()
                            }
                    } else {
                        Toast.makeText(this, "Registration failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}
