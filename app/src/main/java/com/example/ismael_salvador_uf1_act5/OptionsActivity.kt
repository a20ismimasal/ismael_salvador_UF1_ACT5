package com.example.ismael_salvador_uf1_act5

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OptionsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val buttonToMenu = findViewById<Button>(R.id.buttonToMain)

        buttonToMenu.setOnClickListener {
            finish()
        }
    }
}
