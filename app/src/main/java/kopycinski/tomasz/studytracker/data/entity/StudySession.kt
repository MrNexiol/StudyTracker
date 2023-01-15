package kopycinski.tomasz.studytracker.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudySession(
    val timeMillis: Long,
    @PrimaryKey(autoGenerate = true) val id: Long = 0
)
