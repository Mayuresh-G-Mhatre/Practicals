import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var financialYearSpinner: Spinner
    private lateinit var assessmentYearEditText: EditText
    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var genderRadioGroup: RadioGroup
    private lateinit var incomeEditText: EditText
    private lateinit var exemptedEditText: EditText
    private lateinit var calculateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        financialYearSpinner = findViewById(R.id.financial_year_spinner)
        assessmentYearEditText = findViewById(R.id.assessment_year_edit_text)
        nameEditText = findViewById(R.id.name_edit_text)
        ageEditText = findViewById(R.id.age_edit_text)
        genderRadioGroup = findViewById(R.id.gender_radio_group)
        incomeEditText = findViewById(R.id.income_edit_text)
        exemptedEditText = findViewById(R.id.exempted_edit_text)
        calculateButton = findViewById(R.id.calculate_button)

        // Set up financial year spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.financial_year_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            financialYearSpinner.adapter = adapter
        }

        // Set up calculate button click listener
        calculateButton.setOnClickListener {
            calculateTax()
        }
    }

    private fun calculateTax() {
        // Get values from input fields
        val financialYear = financialYearSpinner.selectedItem.toString()
        val assessmentYear = assessmentYearEditText.text.toString()
        val name = nameEditText.text.toString()
        val age = ageEditText.text.toString()
        val gender = findViewById<RadioButton>(genderRadioGroup.checkedRadioButtonId).text.toString()
        val income = incomeEditText.text.toString().toIntOrNull() ?: 0
        val exempted = exemptedEditText.text.toString().toIntOrNull() ?: 0

        // Calculate tax
        val taxableIncome = income - exempted
        var tax = 0.0

        if (taxableIncome > 250000) {
            val remainingIncome = taxableIncome - 250000
            if (remainingIncome <= 500000) {
                tax += (remainingIncome * 0.05)
            } else if (remainingIncome <= 1000000) {
                tax += (250000 * 0.05) + ((remainingIncome - 500000) * 0.2)
            } else {
                tax += (250000 * 0.05) + (500000 * 0.2) + ((remainingIncome - 1000000) * 0.3)
            }
        }

        // Display report in a Toast message
        val message = "Name: $name\n" +
                "Age: $age\n" +
                "Gender: $gender\n" +
                "Income: Rs $income\n" +
                "Exempted: Rs $exempted\n" +
                "Taxable Income: Rs $taxableIncome\n" +
                "Tax: Rs $tax"
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
