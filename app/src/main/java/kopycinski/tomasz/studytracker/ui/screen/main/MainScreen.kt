package kopycinski.tomasz.studytracker.ui.screen.main

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = viewModel()
) {
    val studySessions by viewModel.studySessionList.collectAsState()

    LazyColumn {
        item {
            Button(onClick = { viewModel.save() }) {
                Text(text = "Save")
            }
        }
        
        items(studySessions) {
            Text(text = it.timeMillis.toString())
        }
    }
}