package com.example.sheilahtask

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sheilahtask.ui.theme.SheilahTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login()
 }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun login() {

    val email by remember {
        mutableStateOf("")
    }

    val password by remember {
        mutableStateOf("")
    }


    Box(

        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(painter = painterResource(id = R.drawable.img_4),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
            )
    }


    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()
            .padding(12.dp)

    ) {

        Image(painter = painterResource(id = R.drawable.img_1),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)

        )

        Text(text = "Please Login", fontSize = 30.sp, color = Color.Black)

        OutlinedTextField(
            value = email,
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email") },
            onValueChange = { email },
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password") },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(17.dp))

        Button(
            shape = RoundedCornerShape(5.dp),
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()

        ) {

            Text(text = "LOGIN", fontSize = 20.sp)

        }
        //another button





        var signup = LocalContext.current
        Button(

            shape = RoundedCornerShape(5.dp),
            onClick = { signup.startActivity(Intent(signup,SignupActivity::class.java)) },
            modifier = Modifier.fillMaxWidth()

        ) {

            Text(text = "SIGNUP", fontSize = 20.sp)

        }
    }
}