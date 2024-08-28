package o.mysin.vkcustom.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ModeComment
import androidx.compose.material.icons.outlined.PersonPin
import androidx.compose.material.icons.outlined.SubdirectoryArrowRight
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import o.mysin.vkcustom.R

@Composable
fun PostCard() {
    Card(
        modifier =
            Modifier
                .border(width = 1.dp, color = Color.Gray),
        colors =
            CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background,
            ),
    ) {
        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(start = 6.dp, end = 6.dp, top = 6.dp, bottom = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TitlePostCard(
                avatar = painterResource(R.drawable.post_comunity_thumbnail),
                title = "уволено",
                time = "14:00",
            ) { Unit }

            Spacer(
                modifier =
                    Modifier
                        .height(12.dp),
            )

            Text(
                modifier =
                    Modifier
                        .fillMaxWidth(),
                text = "кабаныч, когда узнал, что если сотрудникам не платить они начинают умирать от голода",
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.SemiBold,
            )

            Spacer(
                modifier =
                    Modifier
                        .height(16.dp),
            )

            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(R.drawable.post_content_image),
                contentDescription = "Post Image",
                contentScale = ContentScale.FillWidth,
            )

            Spacer(
                modifier =
                    Modifier
                        .height(16.dp),
            )

            PanelStatisticsPost()
        }
    }
}

@Composable
private fun TitlePostCard(
    avatar: Painter,
    title: String,
    time: String,
    onMenuCardTap: () -> Unit,
) {
    Row(
        modifier =
            Modifier
                .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier =
                Modifier
                    .size(60.dp)
                    .padding(2.dp)
                    .clip(CircleShape)
                    .background(Color.White),
            painter = avatar,
            contentDescription = "Avatar group",
            contentScale = ContentScale.Fit,
        )

        Column(
            modifier =
                Modifier
                    .height(60.dp)
                    .padding(start = 4.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onBackground,
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = time,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
            )
        }

        Spacer(
            modifier =
                Modifier
                    .weight(1f),
        )

        Icon(
            modifier =
                Modifier
                    .clickable { onMenuCardTap() },
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = "Menu Post",
            tint = Color.Gray,
        )
    }
}

@Composable
private fun PanelStatisticsPost() {
    Row {
        StatisticItem(
            imageIcon = Icons.Outlined.PersonPin,
            title = "132",
        )

        Spacer(
            modifier =
                Modifier
                    .weight(1f),
        )
        StatisticItem(
            imageIcon = Icons.Outlined.SubdirectoryArrowRight,
            title = "132",
        )
        StatisticItem(
            imageIcon = Icons.Outlined.ModeComment,
            title = "132",
        )
        StatisticItem(
            imageIcon = Icons.Outlined.Favorite,
            title = "132",
        )
    }
}

@Composable
private fun StatisticItem(
    imageIcon: ImageVector,
    title: String,
) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
        )
        Icon(
            modifier =
                Modifier
                    .size(24.dp)
                    .clickable { },
            imageVector = imageIcon,
            contentDescription = "Menu Post",
            tint = Color.Gray,
        )
    }
}

@Preview
@Composable
fun PreviewPostCard() {
    PostCard()
}
