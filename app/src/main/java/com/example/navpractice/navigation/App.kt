package com.example.navpractice.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navpractice.Screens.HomeScreenUi
import com.example.navpractice.Screens.LoginScreenUI
import com.example.navpractice.Screens.OtpScreenUI
import com.example.navpractice.Screens.ProfileScreenUI
import com.example.navpractice.Screens.SignUpScreenUi
import com.example.navpractice.Screens.SignupPhoneUi
import com.example.navpractice.Screens.WalkThroughUi

@Composable
fun App(modifier: Modifier=Modifier){
    val NavController= rememberNavController()
    NavHost(navController=NavController,startDestination=walkThroughscreen) {
        composable<walkThroughscreen> {
            WalkThroughUi(NavController)
        }
        composable<HomeScreen> {
            HomeScreenUi(NavController)
        }
        composable<SignUpScreen> {
            SignUpScreenUi(NavController)
        }
       composable<OtpScreen> {
           OtpScreenUI(NavController)
       }
        composable<ProfileScreen> {
            ProfileScreenUI(NavController)
        }

        composable<SignUpPhone> {
            SignupPhoneUi(NavController)
        }
        composable<LoginScreen> {
            LoginScreenUI(NavController)
        }
    }
}