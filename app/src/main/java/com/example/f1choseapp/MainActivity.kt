package com.example.f1chooseapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.f1choseapp.R
import com.example.f1choseapp.alpine
import com.example.f1choseapp.aston
import com.example.f1choseapp.ferrari
import com.example.f1choseapp.haas
import com.example.f1choseapp.mclaren
import com.example.f1choseapp.mercedes
import com.example.f1choseapp.racingbulls
import com.example.f1choseapp.redbull
import com.example.f1choseapp.sauber
import com.example.f1choseapp.williams

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.redBullButton)
        val button2 = findViewById<Button>(R.id.scuderiaFerrariButton)
        val button3 = findViewById<Button>(R.id.mercedesButton)
        val button4 = findViewById<Button>(R.id.mclarenButton)
        val button5 = findViewById<Button>(R.id.williamsButton)
        val button6 = findViewById<Button>(R.id.astonMartinButton)
        val button7 = findViewById<Button>(R.id.alpineButton)
        val button8 = findViewById<Button>(R.id.racingBullsButton)
        val button9 = findViewById<Button>(R.id.sauberButton)
        val button10 = findViewById<Button>(R.id.haasButton)

        button1.setOnClickListener {
        val intent = Intent(this, redbull::class.java)
        startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, ferrari::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, mercedes::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,mclaren::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, williams::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this, aston::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this, alpine::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this, racingbulls::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this, sauber::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this, haas::class.java)
            startActivity(intent)
        }



    }
}