package matej.petric.weather.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import matej.petric.weather.network.model.WeatherResponse
import matej.petric.weather.repository.DetailsActivityRepository

class DetailsActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = DetailsActivityRepository(application)
    val showProgress: LiveData<Boolean>
    val response: LiveData<WeatherResponse>

    init {
        showProgress = repository.showProgress
        response = repository.response
    }

    fun getWeather(woeId: Int) {
        repository.getWeather(woeId)
    }
}