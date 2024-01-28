package com.jluqgon214.recuperacionrecyclerview.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Ejemplo1() {
    val Lista = listOf("Elemento Lista 1", "Elemento Lista 2", "Elemento Lista 3", "Elemento Lista 4")
    LazyColumn { 
        item { Text(text = "Item 1") }
        items (3) {
            Text(text = "Item $it")
        }
        items(Lista) {
            Text(text = "$it")
        }
        item { Text(text = "Elemento final")}
    }
}