package com.exemple.ista

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EcranDeux(){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red
                ),
                title = { Text(text = "Facebook") },
actions = {
    Icon(Icons.Filled.Notifications, contentDescription ="" )
}
                )
        }
    ) {
      Column (
            horizontalAlignment = Alignment.CenterHorizontally,
          modifier = Modifier
              .padding(it)
              .fillMaxWidth()){
        Text(text = "Brig")
          Spacer(modifier = Modifier.height(40.dp))
          Text(text = "Bonjour")
      }
    }
}


@Preview()
@Composable
fun EcranDeuxPreview(){
    EcranDeux()
}

