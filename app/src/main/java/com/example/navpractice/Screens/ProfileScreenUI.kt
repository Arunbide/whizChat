package com.example.navpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navpractice.navigation.HomeScreen
import com.example.navpractice.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreenUI(NavController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(title = { Text("Your Profile") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                        contentDescription = "Back",
                        Modifier.size(35.dp)
                    )

                }
            }

        )
        Spacer(modifier = Modifier.size(size = 20.dp))
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "profiepic",
            modifier = Modifier.size(height = 100.dp, width = 100.dp)
        )
        Spacer(modifier = Modifier.height(height = 35.dp))
            var firstname by remember { mutableStateOf("") }
        TextField(
            value = firstname, onValueChange = {firstname=it},
            placeholder = { Text("First Name",fontSize = 14.sp) },
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 52.dp)
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)), colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x663E3E67),
                unfocusedContainerColor = Color(0x663E3E67),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent

            )
        )
        Spacer(modifier = Modifier.height(height = 15.dp))
        var lastname by remember { mutableStateOf("") }

        TextField(
            value = lastname, onValueChange = {lastname= it},
            placeholder = { Text("Last Name",fontSize = 14.sp) },
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 52.dp)
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)), colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x663E3E67),
                unfocusedContainerColor = Color(0x663E3E67),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent

            )
        )

        Spacer(modifier = Modifier.height(height = 15.dp))
         var Bio by remember { mutableStateOf("") }

        TextField(
            value = Bio, onValueChange = {Bio= it},
            placeholder = { Text("Bio (Optional)",fontSize = 14.sp) },
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 52.dp)
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)), colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x663E3E67),
                unfocusedContainerColor = Color(0x663E3E67),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent

            )
        )

        Spacer(modifier = Modifier.height(height = 15.dp))
          var instagramurl by remember { mutableStateOf("") }
        TextField(
            value = instagramurl, onValueChange = {instagramurl= it},
            placeholder = { Text("Instagram (Optional)",fontSize = 14.sp) },
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 52.dp)
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)), colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x663E3E67),
                unfocusedContainerColor = Color(0x663E3E67),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent

            )
        )


        Spacer(modifier = Modifier.height(height = 45.dp))
        Button(onClick = {
            NavController.navigate(HomeScreen)
        },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 33.dp).height(height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF095DEC))) {
            Text("Save", fontSize = 16.sp, color = Color.White)

        }

    }
}