package com.example.navpractice.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navpractice.navigation.OtpScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreenUi(NavController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        TopAppBar(
            title = { Text("") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Filled.KeyboardArrowLeft,
                        contentDescription = "Back",
                        Modifier.size(35.dp)
                    )
                }
            },
        )

        Text(
            "Sign up with Email",
            modifier = Modifier.padding(top = 30.dp),
            fontSize = 27.sp,
            fontWeight = FontWeight.W700,
            fontFamily = FontFamily.SansSerif
        )
        Text(
            " Please create your account using your \n" +
                    "                           email.",
            modifier = Modifier.padding(top = 5.dp), fontSize = 14.sp, fontWeight = FontWeight.W400,
        )
        Spacer(modifier = Modifier.height(height = 48.dp))


        var emailtext by remember { mutableStateOf("") }

        TextField(
            value = emailtext,
            onValueChange = { newtext -> emailtext = newtext },
            placeholder = { Text("Email", fontSize = 14.sp) },
            modifier = Modifier
                .height(52.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .clip(shape = RoundedCornerShape(7)),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x663E3E67),
                unfocusedContainerColor = Color(0x663E3E67),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent

            )
        )
        Spacer(modifier = Modifier.height(height = 15.dp))
        var passwordtext by remember { mutableStateOf("") }
        TextField(
            value = passwordtext, onValueChange = { newpasstext -> passwordtext = newpasstext },
            placeholder = { Text("Password", fontSize = 14.sp) },
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
        var confpassword by remember { mutableStateOf("") }
        TextField(value = confpassword,
            onValueChange = { newconfo -> confpassword = newconfo },
            placeholder = { Text("Confirm Password", fontSize = 14.sp) },
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

        Spacer(modifier = Modifier.height(height = 20.dp))
        var passwordmsg by remember { mutableStateOf("") }
        Button(
            onClick = {
//                if (passwordtext == confpassword && passwordtext.isEmpty())
                    NavController.navigate(OtpScreen)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .height(height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF095DEC))
        ) {
            Text("Continue", fontSize = 16.sp, color = Color.White)

        }


    }
}