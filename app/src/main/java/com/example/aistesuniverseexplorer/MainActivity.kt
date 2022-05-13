package com.example.aistesuniverseexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.aistesuniverseexplorer.models.Planet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array = arrayOf(1,2)
        var planet = Planet(1, "darco", 0.3, 0.3, array, array).getPlanetFromResources(0, resources)
        Log.d("Planet at index 0 ",planet.toString())

    }
}