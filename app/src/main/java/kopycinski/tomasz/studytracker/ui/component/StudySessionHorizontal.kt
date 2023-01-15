package kopycinski.tomasz.studytracker.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kopycinski.tomasz.studytracker.data.entity.StudySession

@Composable
fun StudySessionHorizontal(
    studySession: StudySession
) {
    Row(
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = studySession.timeMillis.toString())
    }
}