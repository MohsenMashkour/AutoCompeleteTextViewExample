package com.mkrdeveloper.autocompeletetextviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<AutoCompleteTextView>(R.id.aTxt)

        val colors = resources.getStringArray(R.array.colors)

        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors)

        txt.setAdapter(arrayAdapter)
        txt.threshold = 0
    }
}