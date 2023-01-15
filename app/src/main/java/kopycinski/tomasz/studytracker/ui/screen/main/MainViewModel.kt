package kopycinski.tomasz.studytracker.ui.screen.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kopycinski.tomasz.studytracker.data.dao.StudySessionDao
import kopycinski.tomasz.studytracker.data.entity.StudySession
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val studySessionDao: StudySessionDao
) : ViewModel() {
    private val _studySessionList = MutableStateFlow<List<StudySession>>(listOf())
    val studySessionList: StateFlow<List<StudySession>> = _studySessionList

    init {
        updateStudySessionList()
    }

    private fun updateStudySessionList() {
        studySessionDao.getAll().onEach {
            _studySessionList.value = it
        }.launchIn(viewModelScope)
    }

    fun save() = viewModelScope.launch {
        studySessionDao.save(StudySession(System.currentTimeMillis()))
    }
}