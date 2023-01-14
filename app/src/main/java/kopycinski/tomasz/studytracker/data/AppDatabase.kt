package kopycinski.tomasz.studytracker.data

import androidx.room.Database
import androidx.room.RoomDatabase
import kopycinski.tomasz.studytracker.data.dao.StudySessionDao
import kopycinski.tomasz.studytracker.data.entity.StudySession

@Database(entities = [StudySession::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun studySessionDao(): StudySessionDao
}