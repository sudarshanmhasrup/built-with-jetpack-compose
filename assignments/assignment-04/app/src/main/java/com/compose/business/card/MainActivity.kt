package com.compose.business.card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.business.card.ui.theme.Poppins

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                BusinessCardApp(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Profile image",
            modifier = Modifier
                .clip(CircleShape)
                .height(140.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(
            text = "Sudarshan Mhasrup",
            fontSize = 24.sp,
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Column {
            ContactOptionEmail(
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun ContactOptionEmail(modifier: Modifier = Modifier, ) {
    Row(
        modifier = modifier.padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.at_icon),
            contentDescription = "Email icon",
            Modifier.height(16.dp)
        )
        Spacer(
            modifier = Modifier.width(14.dp)
        )
        Text(
            text = "sudarshanmhasrup@gmail.com",
            fontSize = 16.sp,
            fontFamily = Poppins,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardApp(
        modifier = Modifier.fillMaxSize()
    )
}
