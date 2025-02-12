package com.example.al_azharhealthmonitoringapp.uiscreens.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.al_azharhealthmonitoringapp.ui.theme.AlAzharHealthMonitoringAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlAzharHealthMonitoringAppTheme {

            }
        }
    }
}

