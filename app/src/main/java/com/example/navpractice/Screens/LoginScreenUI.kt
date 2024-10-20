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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

import com.example.navpractice.navigation.HomeScreen
import com.example.navpractice.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreenUI(NavController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        TopAppBar(
            title = { Text("") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                        contentDescription = "Back",
                        Modifier.size(35.dp)
                    )
                }
            },
        )
        Image(
            painter = painterResource(R.drawable.logoapp),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(top = 0.dp)
        )
        Text(
            "Welcome Back!",
            modifier = Modifier.padding(top = 10.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.W700,
            fontFamily = FontFamily.SansSerif
        )
        Text(
            "Login to continue",
            modifier = Modifier.padding(top = 10.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.W400,
        )

        Spacer(modifier = Modifier.height(height = 35.dp))
        var LoginphoneMail by remember { mutableStateOf("") }
        TextField(
            value = LoginphoneMail, onValueChange = { LoginphoneMail=it },
            placeholder = { Text("Enter your email or phone", fontSize = 14.sp) },
            modifier = Modifier
                .height(52.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color(0x663E3E67),
                unfocusedContainerColor = Color(0x663E3E67)
            )

        )
        Spacer(modifier = Modifier.height(height = 15.dp))
        var PasswordLogin by remember { mutableStateOf("") }
        TextField(
            value = PasswordLogin,
            onValueChange = {PasswordLogin=it },
            placeholder = { Text("Password", fontSize = 14.sp) },
            modifier = Modifier
                .height(52.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0x663E3E67),
                focusedContainerColor = Color(0x663E3E67)
            )
        )

        Spacer(modifier = Modifier.height(height = 30.dp))
        var passwordmsg by remember { mutableStateOf("") }
        Button(
            onClick = {

                NavController.navigate(HomeScreen)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .height(height = 54.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF095DEC))
        ) {
            Text("Continue", fontSize = 16.sp, color = Color.White)

        }
}
}