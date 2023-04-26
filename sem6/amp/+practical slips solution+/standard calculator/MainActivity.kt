import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var input = ""
    private var result = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the click listener for all buttons
        button_0.setOnClickListener(this)
        button_1.setOnClickListener(this)
        button_2.setOnClickListener(this)
        button_3.setOnClickListener(this)
        button_4.setOnClickListener(this)
        button_5.setOnClickListener(this)
        button_6.setOnClickListener(this)
        button_7.setOnClickListener(this)
        button_8.setOnClickListener(this)
        button_9.setOnClickListener(this)
        button_add.setOnClickListener(this)
        button_subtract.setOnClickListener(this)
        button_multiply.setOnClickListener(this)
        button_divide.setOnClickListener(this)
        button_clear.setOnClickListener(this)
        button_equals.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button_0 -> input += "0"
            R.id.button_1 -> input += "1"
            R.id.button_2 -> input += "2"
            R.id.button_3 -> input += "3"
            R.id.button_4 -> input += "4"
            R.id.button_5 -> input += "5"
            R.id.button_6 -> input += "6"
            R.id.button_7 -> input += "7"
            R.id.button_8 -> input += "8"
            R.id.button_9 -> input += "9"
            R.id.button_add -> inputOperator("+")
            R.id.button_subtract -> inputOperator("-")
            R.id.button_multiply -> inputOperator("*")
            R.id.button_divide -> inputOperator("/")
            R.id.button_clear -> clearInput()
            R.id.button_equals -> calculateResult()
        }
        text_input.text = input
    }

    private fun inputOperator(operator: String) {
        if (input.isNotEmpty() && input.last().isDigit()) {
            input += operator
        } else if (input.isNotEmpty() && input.last() == '+' || input.last() == '-' ||
                   input.last() == '*' || input.last() == '/') {
            input = input.dropLast(1) + operator
        }
    }

    private fun clearInput() {
        input = ""
        result = ""
        text_result.text = ""
    }

    private fun calculateResult() {
        if (input.isNotEmpty() && input.last().isDigit()) {
            result = evaluateExpression(input).toString()
            text_result.text = result
        }
    }

    private fun evaluateExpression(expression: String): Double {
        val numbers = mutableListOf<Double>()
        val operators = mutableListOf<Char>()
        var number = ""

        for (char in expression) {
            if (char.isDigit() || char == '.') {
                number += char
            } else {
                if (number.isNotEmpty()) {
                    numbers.add(number.toDouble())
                    number = ""
                }
                if (char == '+' || char == '-' || char == '*' || char == '/') {
                    operators.add(char)
                }
            }
        }
        if (number.isNotEmpty()) {
            numbers.add(number.toDouble())
        }

        var result = numbers[0]
        for (i in 1 until numbers.size) {
            when (operators[i - 1]) {
                '+' -> result += numbers[i]
                '-' -> result -= numbers[i]
                '*' -> result *= numbers[i]
                '/' -> result /= numbers[i]
            }
        }
        return result
    }
}
