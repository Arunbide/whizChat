package com.example.navpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navpractice.R
import com.example.navpractice.navigation.ProfileScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtpScreenUI(NavController: NavHostController) {
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
            "Enter Code",
            modifier = Modifier.padding(top = 10.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.W700,
            fontFamily = FontFamily.SansSerif
        )
        Text(
            " We have sent you an Email with the Code to \n" +
                    "                   agbide7@gmail.com.",
            modifier = Modifier.padding(top = 10.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.W400,
        )
        var otp by remember { mutableStateOf("") }

        TextField(
            value = otp,
            onValueChange = {
                if (it.length <= 4)
                    otp = it
               if(it == "2113"){

                       NavController.navigate(ProfileScreen)
               }

            },
            placeholder = { Text("•  •  •  •", fontSize = 70.sp, fontWeight = FontWeight.W900) },
            textStyle = TextStyle(fontSize = 40.sp, letterSpacing = 30.sp),
            modifier = Modifier
                .padding(start = 75.dp, top = 10.dp)
                .height(height = 100.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Transparent

            )

        )


        Button(onClick = {

            NavController.navigate(ProfileScreen)
        },
            modifier = Modifier.fillMaxWidth().padding(start = 100.dp, end = 100.dp, bottom = 30.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)) {
            Text("Resend Code", color = Color(0xFF095DEC), fontSize = 18.sp, fontWeight = FontWeight.W500   )
        }

    }


}