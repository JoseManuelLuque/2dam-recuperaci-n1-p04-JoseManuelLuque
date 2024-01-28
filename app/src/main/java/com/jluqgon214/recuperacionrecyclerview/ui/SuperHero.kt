package com.jluqgon214.recuperacionrecyclerview.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jluqgon214.recuperacionrecyclerview.R
import com.jluqgon214.recuperacionrecyclerview.data.Superhero

@Composable
fun SuperHeroView() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperheroes()) {
            ItemHero(Superhero = it)
        }
    }
}

@Composable
fun ItemHero(Superhero: Superhero) {
    Card(border = BorderStroke(2.dp, Color.Red), modifier = Modifier.size(200.dp)) {
        Column {
            Image(
                painter = painterResource(Superhero.photo),
                contentDescription = "Superhero Avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth())

            Text(text = Superhero.superheroName)
            Text(text = Superhero.realName)
            Text(text = Superhero.publisher, modifier = Modifier.padding())
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