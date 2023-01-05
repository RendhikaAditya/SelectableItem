package co.dh.selectableitem.repository

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import co.dh.selectableitem.model.ItemModel

class ItemRepository {
    fun getAllData():List<ItemModel>{
        return listOf(
            ItemModel(
                nama = "Bakso",
                harga = 10000,
                selected = false
            ),
            ItemModel(
                nama = "Nasi goreng",
                harga = 15000,
                selected = false
            ),
            ItemModel(
                nama = "Mie Ayam",
                harga = 12000,
                selected = false
            )

        )
    }
}