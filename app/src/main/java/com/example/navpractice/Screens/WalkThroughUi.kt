package com.example.navpractice.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navpractice.R
import com.example.navpractice.navigation.LoginScreen
import com.example.navpractice.navigation.SignUpPhone
import com.example.navpractice.navigation.SignUpScreen

@Composable
fun WalkThroughUi(NavController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.img_1),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(top = 0.dp)
        )
        Text(
            text = "  Connect easily with \nyou family and friends\n      over countries",
            fontSize = 24.sp,
            fontWeight = FontWeight.W600,
            lineHeight = 30.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 0.dp, top = 30.dp)
        )
        Spacer(modifier = Modifier.size(40.dp))
        Text("Terms & Privacy Policy", fontSize = 14.sp, fontWeight = FontWeight.W300, color = Color.Gray)

        Button(
            onClick = {
                NavController.navigate(SignUpScreen)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp, vertical = 15.dp)
                .height(55.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color(0xFF095DEC))
        ) {
            Text(
                "Continue with Email   ",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )
        }

        Button(
            onClick = {
                NavController.navigate(SignUpPhone  )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp, vertical = 1.dp).height(55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
        ) {
            Text("Continue with phone", color = Color(0xFF095DEC), fontSize = 15.sp, fontWeight = FontWeight.SemiBold)

        }
        Button(onClick = {
            NavController.navigate(LoginScreen)
        },
            modifier = Modifier.fillMaxWidth().padding(start = 25.dp, end = 25.dp, bottom = 30.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)) {
            Text("Login", color = Color(0xFF095DEC), fontSize = 15.sp, fontWeight = FontWeight.Bold)
        }
    }
}
