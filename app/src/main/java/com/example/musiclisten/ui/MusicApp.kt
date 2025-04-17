package com.example.musiclisten.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musiclisten.R
import com.example.musiclisten.ui.screens.HomeScreen


@Composable
fun MusicApp(modifier: Modifier = Modifier){
    Scaffold (topBar = { TopAppBar()}){ innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            HomeScreen()
        }
    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Image(
            painter = painterResource(R.drawable.wave_sound),
            contentDescription = "Profile Icon",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(45.dp)
                .clip(CircleShape)
        )
        Column {
            Text("Some Text", fontSize = 30.sp)
            Text("Some Other", fontSize = 10.sp)
        }
        Icon(
            Icons.Rounded.Notifications,
            contentDescription = "Notification Icon"
        )
    }
}

/**
 * Bottom Ap Bar
 */
@Preview(showBackground = true)
@Composable
fun MusicAppPreview(){
    MusicApp()
}