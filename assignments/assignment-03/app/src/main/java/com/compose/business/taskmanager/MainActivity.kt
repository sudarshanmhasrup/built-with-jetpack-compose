package com.compose.business.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
               TaskManagerApp(
                   modifier = Modifier.fillMaxSize()
               )
            }
        }
    }
}

@Composable
fun TaskManagerApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "Task complete"
        )
        Text(
            text = stringResource(R.string.all_tasks_completed),
            Modifier.padding(
                top = 24.dp,
                bottom = 8.dp
            ),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.nice_work)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TaskManagerAppPreview() {
    TaskManagerApp(
        modifier = Modifier.fillMaxSize()
    )
}