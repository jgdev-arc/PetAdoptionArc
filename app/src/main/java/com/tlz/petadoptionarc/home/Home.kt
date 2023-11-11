package com.tlz.petadoptionarc.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tlz.petadoptionarc.components.PetInfoItem
import com.tlz.petadoptionarc.components.TopBar
import com.tlz.petadoptionarc.data.DummyPetDataSource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    onSwitchClick:() -> Unit,
    onPetClick: (Int) -> Unit
) {
val petList = DummyPetDataSource.dogList
    Scaffold(
        topBar = {
            TopBar {
                onSwitchClick()
            }
        }
    ) {paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            itemsIndexed(petList) {index, pet ->
                PetInfoItem(pet = pet) {
                    onPetClick(index)
                }
            }
        }
    }


}

@Preview(showSystemUi = true)
@Composable
fun PrevItem() {
    Home(onSwitchClick = {}) {

    }
}