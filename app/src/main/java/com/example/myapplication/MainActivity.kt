package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button = findViewById(R.id.btResult1)
        val button2: Button = findViewById(R.id.btResult2)
        val button3: Button = findViewById(R.id.btResult3)
        val button4: Button = findViewById(R.id.btResult4)
        val button5: Button = findViewById(R.id.btResult5)
        var flag: String = "sum"
        val edtxt1: EditText = findViewById(R.id.edNum1)
        val edtxt2: EditText = findViewById(R.id.edNum2)
        val result: TextView = findViewById(R.id.textResult)
        val spinnerVal: Spinner = findViewById(R.id.spinner)
        var options = arrayOf("sum", "subtract", "multiply", "divide")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag=options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        button1.setOnClickListener {

            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            result.text = sum(x, y).toString();

        }
        button2.setOnClickListener {

            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            result.text = sub(x, y).toString();

        }
        button3.setOnClickListener {

            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            result.text = mul(x, y).toString();

        }
        button4.setOnClickListener {

            var x: Float = edtxt1.text.toString().toFloat();
            var y: Float = edtxt2.text.toString().toFloat();
            result.text = div(x, y).toString();

        }
        button5.setOnClickListener {
            if (flag == "sum") {
                var x: Int = edtxt1.text.toString().toInt();
                var y: Int = edtxt2.text.toString().toInt();
                result.text = sum(x, y).toString();
            } else if (flag == "subtract") {
                var x: Int = edtxt1.text.toString().toInt();
                var y: Int = edtxt2.text.toString().toInt();
                result.text = sub(x, y).toString();
            } else if (flag == "multiply") {
                var x: Int = edtxt1.text.toString().toInt();
                var y: Int = edtxt2.text.toString().toInt();
                result.text = mul(x, y).toString();
            } else if (flag == "divide") {
                var x: Float = edtxt1.text.toString().toFloat();
                var y: Float = edtxt2.text.toString().toFloat();
                result.text = div(x, y).toString();
            }
            
        }
    }
}
        public fun sum(a:Int,b:Int):Int
        {
            return a+b;
        }
         public fun sub(a:Int,b:Int):Int
        {
            return a-b;
        }
         public fun mul(a:Int,b:Int):Int
        {
            return a*b;
        }
         public fun div(a:Float,b:Float):Float
        {
            return a/b;
        }








