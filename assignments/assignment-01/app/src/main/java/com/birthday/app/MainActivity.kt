package com.birthday.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                BirthdayApp(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun BirthdayApp(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.greeting_background),
            contentDescription = "Greeting card background",
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
        GreetingText(
            message = "Happy birthday Sam!",
            from = "Sudarshan.",
            modifier = modifier
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = message,
            fontSize = 40.sp,
            modifier = Modifier.padding(
                start = 40.dp,
                end = 40.dp
            ),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text(
            text = "From $from",
            fontSize = 28.sp,
            modifier = Modifier.align(
                alignment = Alignment.CenterHorizontally
            )
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun BirthdayAppPreview() {
    BirthdayApp(
        modifier = Modifier.fillMaxSize()
    )
}