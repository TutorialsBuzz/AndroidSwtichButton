package com.tutorialsbuzz.androidradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gender.setOnCheckedChangeListener({ group, checkedId ->
            val radioButton = findViewById<View>(checkedId) as RadioButton
            Toast.makeText(this@MainActivity, radioButton.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
        })

    }
}
