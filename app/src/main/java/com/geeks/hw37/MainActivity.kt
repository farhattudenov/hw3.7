package com.geeks.hw37

import SecondFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = FirstFragment()
        val fragment2 = SecondFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer1, fragment1)
            .replace(R.id.fragmentContainer2, fragment2)
            .commit()
    }data class Song(val title: String, val artist: String)

}
