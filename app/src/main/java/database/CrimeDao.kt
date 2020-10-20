package database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Query
import androidx.room.TypeConverters
import com.example.cri.Crime
import java.util.*

//@Database(entities = [ Crime::class ], version=1)
//@TypeConverters(CrimeTypeConverters::class)
@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>

}