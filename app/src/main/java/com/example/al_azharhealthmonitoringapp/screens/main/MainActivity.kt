package com.example.al_azharhealthmonitoringapp.screens.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.al_azharhealthmonitoringapp.ui.theme.AlAzharHealthMonitoringAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition{true}
        CoroutineScope(Dispatchers.Main).launch {
            delay(4000)
            splashScreen.setKeepOnScreenCondition{false}
        }
        setContent {
            AlAzharHealthMonitoringAppTheme {
                Hello()
            }
        }
    }
}

@Composable
fun Hello(modifier: Modifier = Modifier) {
    Text(
        text = "Hello World",
        modifier = modifier.padding(16.dp) // Added padding for better UI
    )
}
