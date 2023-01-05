package co.dh.selectableitem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.dh.selectableitem.repository.ItemRepository
import co.dh.selectableitem.ui.theme.SelectableItemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectableItemTheme {
                val itemRepository = ItemRepository()
                val getAllData = itemRepository.getAllData()


//                    SelectableLayout(
//                        selected = selected,
//                        title = "Apakah Anda Yakin",
//                        onClick = {
//                            selected = !selected
//                        }
//                    )
                LazyColumn(
                    contentPadding = PaddingValues(all = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(items = getAllData) { data ->
                        var selected by remember { mutableStateOf(data.selected) }

                        SelectableLayout(
                            itemModel = data,
                            selected = selected,
                            onClick = { selected = !selected }
                        )
                    }
                }


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SelectableItemTheme {
        Greeting("Android")
    }
}