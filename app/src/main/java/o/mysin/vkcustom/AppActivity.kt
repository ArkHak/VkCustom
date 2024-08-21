package o.mysin.vkcustom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import o.mysin.vkcustom.ui.theme.VkCustomTheme

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VkCustomTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        UserInfo(name = "Олег", age = 5)
                    }
                }
            }
        }
    }
}


@Composable
fun UserInfo(
    name: String,
    age: Int,
) {
    Text(
        text = "Привет $name, тебе $age лет",
        color = Color.Green
    )
}

@Preview
@Composable
fun UserInfoPreview() {
    Column {
        repeat(10) {
            UserInfo(name = "Олег", age = 8)
            UserInfo(name = "Юля", age = 6)
        }
    }
}