package com.geeksforgeeks.jcdivider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Creating a Scaffold Layout
            Scaffold(
                // Creating a Top Bar
                topBar = { TopAppBar(title = { Text("GFG | Divider", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },
                content = {

                    // Creating a Column View
                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                        // Creating a Row to display two Text and a Divider between them
                        Row(Modifier.height(IntrinsicSize.Min).background(Color.Yellow)) {

                            Text("Hello Geek!", fontSize = 20.sp)

                            Divider(color = Color.Green, modifier = Modifier.fillMaxHeight().width(1.dp))

                            Text("This is a Divider", fontSize = 20.sp)
                        }

                        // Adding a Space of height 100dp
                        Spacer(modifier = Modifier.height(100.dp))

                        // Creating a Column to display two Text and a Divider between them
                        Column(
                            Modifier.width(IntrinsicSize.Max).background(Color.Cyan)) {

                            Text("Hello Geek!", fontSize = 20.sp)

                            Divider(color = Color.Red, modifier = Modifier.fillMaxWidth().width(1.dp))

                            Text("This is a Divider", fontSize = 20.sp)
                        }
                    }
                }
            )
        }
    }
}
