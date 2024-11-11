package com.example.assignment3_p2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment3_p2.fragments.InputFragment
import com.example.assignment3_p2.fragments.OutputFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, InputFragment())
            .commit()

        findViewById<Button>(R.id.show_input_button).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InputFragment())
                .commit()
        }

        findViewById<Button>(R.id.show_output_button).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, OutputFragment())
                .commit()
        }
    }
}
