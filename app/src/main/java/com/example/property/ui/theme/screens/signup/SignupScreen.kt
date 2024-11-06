package com.example.property.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.property.R
import com.example.property.data.AuthViewModel
import com.example.property.navigation.ROUT_DETAILS
import com.example.property.navigation.ROUT_HOME
import com.example.property.navigation.ROUT_LOGIN
import com.example.property.navigation.ROUT_SIGNUP
import com.example.property.ui.theme.Purple40

@Composable
fun SignupScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(30.dp))


        Image(
            painter = painterResource(id = R.drawable.icon1),
            contentDescription = "home",
            modifier = Modifier
                .size(200.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "PropertyPlus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Purple40
        )

        Spacer(modifier = Modifier.height(10.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }


        OutlinedTextField(
            value = name ,
            onValueChange ={name = it},
            label = { Text(text = "Fullname")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person", tint = Purple40)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email ,
            onValueChange ={email = it},
            label = { Text(text = "EmailAddress")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email", tint = Purple40)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(
            value = password ,
            onValueChange ={password = it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lock", tint = Purple40)},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(
            value = confpassword ,
            onValueChange ={confpassword = it},
            label = { Text(text = "Confirm Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lock", tint = Purple40)},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

        Spacer(modifier = Modifier.height(20.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        Button(
            onClick = { authViewModel.signup(name, email, password,confpassword) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Purple40),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(text = "Create an account")
        }

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = { navController.navigate(ROUT_LOGIN) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Purple40),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(text = "login")

        }

    }


}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())}
