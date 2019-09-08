package com.tutorialsbuzz.androidswtich

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchCompat01.setOnCheckedChangeListener { buttonView, isChecked ->

            val msg: String = if (isChecked)
                "Switch Button is Checked"
            else
                "Switch Button is UnChecked"

            showToast(msg)
        }
    }

    private fun showToast(msg: String) {
        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
    }

}
