package com.example.musiclisten.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musiclisten.R
import com.example.musiclisten.data.Music
import com.example.musiclisten.data.musicData

/**
 * Home Scree Layout
 */

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column ( modifier = modifier.fillMaxSize()){
        SearchBar()
        RecentlyPlayed(recentlyPlayedList = musicData)
    }
}

/**
 * Serach Section
 */
@Composable
fun SearchBar(modifier: Modifier = Modifier){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()
            .padding(5.dp)
    ){
        Text("Listen and Vibe", fontSize = 20.sp)
        Icon(
            Icons.Default.Search,
            contentDescription = "Search icon"
        )
    }
}

/**
 * Recently plated section
 */

@Composable
fun RecentlyPlayed(recentlyPlayedList: List<Music>, modifier: Modifier = Modifier){
    LazyColumn (modifier = modifier){
        items(recentlyPlayedList){ musicData ->
            CardItem(
                musicData = musicData,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}
/**
 * Card Item
 */
@Composable
fun CardItem(musicData: Music, modifier: Modifier = Modifier){
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(musicData.songImage),
                contentDescription = musicData.songName
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text( text = musicData.songName)
                Text( text = musicData.artistName)
            }
        }
    }
}


/**
 * Recommended for you
 */

@Composable
fun RecommendedSection(modifier: Modifier = Modifier){
    Column {
        Text("Recommended for you")
        LazyColumn {

        }
    }
}
/**
 * Play Button Icon
 */

@Composable
fun PlayIconItem(){

}
/**
 * Card Item preview
 */


@Preview
@Composable
fun CardItemPreview(){
    CardItem(musicData = Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123))
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}