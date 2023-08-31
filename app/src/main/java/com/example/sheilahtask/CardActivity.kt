package com.example.sheilahtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sheilahtask.ui.theme.SheilahTaskTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Simplecard()
            CardWithShape()
 }
    }
}



@Preview(showBackground = true)
@Composable

fun Simplecard(){
    val paddingModifier = Modifier.padding(10.dp)
    Card(
        modifier = paddingModifier
    )
    {
        Text(text = "Simple Card With elevation",
            modifier = paddingModifier)
    }
}

@Composable
fun CardWithShape() {
    val paddingModifier = Modifier.padding(10.dp)
    Card(shape = RoundedCornerShape(20.dp),

        modifier = paddingModifier) {
        Text(text = "Round corner shape", modifier = paddingModifier)
    }
}