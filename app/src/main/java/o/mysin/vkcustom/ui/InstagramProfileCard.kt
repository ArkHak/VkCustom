package o.mysin.vkcustom.ui

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import o.mysin.vkcustom.ui.theme.VkCustomTheme

@Composable
fun InstagramProfileCard() {
    Card(
        modifier =
            Modifier
                .padding(8.dp),
        colors =
            CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground,
            ),
        shape =
            RoundedCornerShape(
                topStart = 4.dp,
                topEnd = 4.dp,
            ),
        border = BorderStroke(width = 2.dp, MaterialTheme.colorScheme.onBackground),
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier =
                    Modifier
                        .size(50.dp)
                        .background(color = Color.Green),
            )

            StatisticMetrics(
                value = "6.950",
                title = "Posts",
            )

            StatisticMetrics(
                value = "436M",
                title = "Followers",
            )

            StatisticMetrics(
                value = "76",
                title = "Following",
            )
        }
    }
}

@Composable
private fun StatisticMetrics(
    value: String,
    title: String,
) {
    Column(
        modifier =
            Modifier
                .size(80.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = value,
            fontSize = 16.sp,
        )

        Text(
            text = title,
            fontSize = 8.sp,
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    VkCustomTheme {
        InstagramProfileCard()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun PreviewCardDark() {
    VkCustomTheme {
        InstagramProfileCard()
    }
}
