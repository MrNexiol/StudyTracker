package kopycinski.tomasz.studytracker.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kopycinski.tomasz.studytracker.data.AppDatabase
import kopycinski.tomasz.studytracker.data.dao.StudySessionDao

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "study-database"
        ).build()

    @Provides
    fun provideStudySessionDao(appDatabase: AppDatabase): StudySessionDao =
        appDatabase.studySessionDao()
}