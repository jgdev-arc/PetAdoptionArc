package com.tlz.petadoptionarc.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(onSwitchToggle: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hello Frank",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Adopt a new friend near you!",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 24.dp,
                    end = 36.dp
                )
        ) {
            PetSwitch {
                onSwitchToggle.invoke()
            }
        }
    }
}

@Composable
fun PetSwitch(onSwitchToggle:() -> Unit) {
    val icon = if (isSystemInDarkTheme()) {
        painterResource(id = com.tlz.petadoptionarc.R.drawable.ic_switch_on)
    } else {
        painterResource(id = com.tlz.petadoptionarc.R.drawable.ic_switch_off)
    }

    Icon(
        painter = icon,
        contentDescription = null,
        modifier = Modifier
            .size(24.dp, 24.dp)
            .clickable(onClick = { onSwitchToggle.invoke() }),
        tint = MaterialTheme.colorScheme.onSurface
    )





}


@Preview(showBackground = true)
@Composable
fun PrevTopBar() {
    TopBar {

    }
}