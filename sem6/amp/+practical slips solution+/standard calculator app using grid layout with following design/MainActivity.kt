import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var lastNumeric: Boolean = false
    private var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View) {
        tvInput.append((view as Button).text)
        lastNumeric = true
    }

    fun onDecimalPoint(view: View) {
        if (lastNumeric && !lastDot) {
            tvInput.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onClear(view: View) {
        tvInput.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onOperator(view: View) {
        if (lastNumeric && !isOperatorAdded(tvInput.text.toString())) {
            tvInput.append((view as Button).text)
            lastNumeric = false
            lastDot = false
        }
    }

    fun onEqual(view: View) {
        if (lastNumeric) {
            var value = tvInput.text.toString()
            var prefix = ""
            try {
                if (value.startsWith("-")) {
                    prefix = "-"
                    value = value.substring(1)
                }
                when {
                    value.contains("+") -> {
                        val splitValue = value.split("+")
                        var sum = 0.0
                        for (i in splitValue) {
                            sum += i.toDouble()
                        }
                        tvInput.text = prefix + sum.toString()
                    }
                    value.contains("-") -> {
                        val splitValue = value.split("-")
                        var diff = splitValue[0].toDouble()
                        for (i in 1 until splitValue.size) {
                            diff -= splitValue[i].toDouble()
                        }
                        tvInput.text = prefix + diff.toString()
                    }
                    value.contains("*") -> {
                        val splitValue = value.split("*")
                        var product = 1.0
                        for (i in splitValue) {
                            product *= i.toDouble()
                        }
                        tvInput.text = prefix + product.toString()
                    }
                    value.contains("/") -> {
                        val splitValue = value.split("/")
                        var quotient = splitValue[0].toDouble()
                        for (i in 1 until splitValue.size) {
                            quotient /= splitValue[i].toDouble()
                        }
                        tvInput.text = prefix + quotient.toString()
                    }
                }
            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("+") || value.contains("-") || value.contains("*") || value.contains(
                "/"
            )
        }
    }
}
