package br.com.bruno.businesscard

import android.app.Application
import br.com.bruno.businesscard.data.AppDatabase
import br.com.bruno.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}