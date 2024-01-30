package com.jluqgon214.recuperacionrecyclerview.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jluqgon214.recuperacionrecyclerview.R
import com.jluqgon214.recuperacionrecyclerview.data.Superhero

@Composable
fun SuperHeroView(context: Context) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperheroes()) {
            ItemHero(Superhero = it, onItemSelected = {Toast.makeText(context, "${it.realName}", Toast.LENGTH_SHORT).show()})
        }
    }
}

@Composable
fun SuperHeroViewGrid(context: Context) {
    LazyVerticalGrid (
        columns = GridCells.Adaptive(130.dp),
        contentPadding =  PaddingValues(horizontal = 4.dp, vertical = 4.dp)
    ) {
        items(getSuperheroes()) {
            ItemHero(Superhero = it, onItemSelected = {Toast.makeText(context, "${it.realName}", Toast.LENGTH_SHORT).show()})
        }
    }
}

@Composable
fun ItemHero(Superhero: Superhero, onItemSelected: (Superhero) -> Unit) {
    Card(
        border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .clickable {
                    onItemSelected(Superhero)
                }
        ) {
            Image(
                painter = painterResource(Superhero.photo),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth(),
                contentDescription = "Superhero Avatar"

            )

            Text(text = Superhero.superheroName, fontSize = 20.sp)

            Text(text = Superhero.realName, fontSize = 15.sp)

            Text(text = Superhero.publisher, modifier = Modifier.padding(start = 150.dp), textAlign = TextAlign.End, fontSize = 10.sp)
        }
    }
}

fun getSuperheroes(): List<Superhero> {
    val listaSuperHeroes = mutableListOf<Superhero>()
    listaSuperHeroes.add(Superhero("Spiderman", "Petter Parker", "Marvel", R.drawable.spiderman))
    listaSuperHeroes.add(Superhero("Wolverine", "James Howlett", "Marvel", R.drawable.logan))
    listaSuperHeroes.add(Superhero("Batman", "Bruce Wayne", "DC", R.drawable.batman))
    listaSuperHeroes.add(Superhero("Thor", "Thor Odinson", "Marvel", R.drawable.thor))
    listaSuperHeroes.add(Superhero("Flash", "Jay Garrick", "DC", R.drawable.flash))
    listaSuperHeroes.add(Superhero("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern))
    listaSuperHeroes.add(Superhero("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman))
    return listaSuperHeroes
}