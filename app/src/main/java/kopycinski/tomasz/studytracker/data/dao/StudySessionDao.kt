package kopycinski.tomasz.studytracker.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kopycinski.tomasz.studytracker.data.entity.StudySession
import kotlinx.coroutines.flow.Flow

@Dao
interface StudySessionDao {
    @Query("SELECT * FROM studysession")
    fun getAll(): Flow<List<StudySession>>

    @Insert
    suspend fun save(studySession: StudySession)
}