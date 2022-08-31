package com.ex.myfirstapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

    private lateinit var counterA : TextView
    private lateinit var buttonclick : Button
    private lateinit var counterB : TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterA=findViewById(R.id.teama)
        counterB=findViewById(R.id.teamb)
        buttonclick=findViewById(R.id.button1)
        buttonclick=findViewById(R.id.button2)
        buttonclick=findViewById(R.id.button3)
        buttonclick=findViewById(R.id.button4)
        buttonclick=findViewById(R.id.button5)
        buttonclick=findViewById(R.id.button6)
        buttonclick=findViewById(R.id.button7)


        var timesclicked = 0

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)


        button1.setOnClickListener{
            timesclicked += 3
            counterA.text= timesclicked.toString()
        }
        button2.setOnClickListener{
            timesclicked += 3
            counterB.text= timesclicked.toString()
        }
        button3.setOnClickListener{
            timesclicked += 2
            counterB.text= timesclicked.toString()
        }
        button4.setOnClickListener{
            timesclicked += 2
            counterA.text= timesclicked.toString()
        }
        button5.setOnClickListener{
            timesclicked += 1
            counterA.text= timesclicked.toString()
        }
        button6.setOnClickListener{
            timesclicked += 1
            counterB.text= timesclicked.toString()
        }
        button7.setOnClickListener{
            timesclicked = 0
            counterA.text= timesclicked.toString()
            counterB.text= timesclicked.toString()

        }

    }

    override fun onClick(view: View?) {
        if (view?.id ==R.id.button7){
            Log.d("click event"," a button7 is clicked")
            Toast.makeText(this,"New Game start", Toast.LENGTH_LONG).show()

        }
    }
}

