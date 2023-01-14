package kopycinski.tomasz.studytracker.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudySession(
    @PrimaryKey val id: Long,
    val dateMillis: Long
)
