package com.example.kalygin_v_3

import androidx.compose.foundation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun NoticeScreen(navController: NavController) {
    val White = Color(0xFFFFFFFF)
    val GrayBg = Color(0xFFF5F5F5)
    val LightGray = Color(0xFFF7F7F7)
    val DarkText = Color(0xFF2E2E2E)
    val LightTextGray = Color(0xFF007B23)
    val PrimaryGreen = Color(0xFF007B23)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = null,
                tint = PrimaryGreen,
                modifier = Modifier
                    .size(24.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
            Text(
                text = "Уведомления",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                color = DarkText
            )
            Spacer(modifier = Modifier.size(60.dp))
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp, bottom = 50.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(96.dp)
                    .background(
                        PrimaryGreen.copy(alpha = 0.1f),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(20.dp)
            ) {
                Text(
                    text = "Сегодня: Вы купили полис",
                    color = PrimaryGreen,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(96.dp)
                    .background(GrayBg, RoundedCornerShape(8.dp))
                    .padding(20.dp)
            ) {
                Text(
                    text = "Вчера:Вы купили полис",
                    color = LightTextGray,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(80.dp)
                    .background(GrayBg, RoundedCornerShape(8.dp))
                    .padding(20.dp)
            ) {
                Text(
                    text = "Вчера:Вы настроили личный кабинет",
                    color = LightTextGray,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(100.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                var checked1 by remember { mutableStateOf(true) }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Показывать действующие полисы",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                    Checkbox(
                        checked = checked1,
                        onCheckedChange = { checked1 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryGreen,
                            uncheckedColor = LightTextGray,
                            checkmarkColor = White
                        )
                    )
                }

                var checked2 by remember { mutableStateOf(false) }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Показываать Пуш-уведомления",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                    Checkbox(
                        checked = checked2,
                        onCheckedChange = { checked2 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryGreen,
                            uncheckedColor = LightTextGray,
                            checkmarkColor = White
                        )
                    )
                }

                var checked3 by remember { mutableStateOf(false) }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text ="Запомнить данные для входа",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                    Checkbox(
                        checked = checked3,
                        onCheckedChange = { checked3 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryGreen,
                            uncheckedColor = LightTextGray,
                            checkmarkColor = White
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(80.dp))
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(43.dp)
                .align(Alignment.BottomCenter)
                .background(LightGray)
        )
    }
}
