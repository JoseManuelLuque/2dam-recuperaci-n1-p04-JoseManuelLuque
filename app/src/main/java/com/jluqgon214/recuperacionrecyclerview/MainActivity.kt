package com.jluqgon214.recuperacionrecyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.jluqgon214.recuperacionrecyclerview.ui.Ejemplo1
import com.jluqgon214.recuperacionrecyclerview.ui.SuperHeroView
import com.jluqgon214.recuperacionrecyclerview.ui.SuperHeroViewGrid
import com.jluqgon214.recuperacionrecyclerview.ui.theme.RecuperacionRecyclerViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecuperacionRecyclerViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SuperHeroViewGrid(context = getApplicationContext())
                }
            }
        }
    }
}