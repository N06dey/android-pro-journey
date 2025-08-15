package com.example.basic_ci

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.basic_ci.ui.theme.Basic_CiTheme
import com.example.basics_ci.ui.screens.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Basic_CiTheme {
                HomePage(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

