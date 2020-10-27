package matej.petric.weather.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_details.*
import matej.petric.weather.R
import matej.petric.weather.viewModel.DetailsActivityViewModel
import kotlin.math.roundToLong

class DetailsActivity : AppCompatActivity() {

    private lateinit var viewModel: DetailsActivityViewModel


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        viewModel = ViewModelProvider(this).get(DetailsActivityViewModel::class.java)

        if (intent.hasExtra("name")) {
            tv_location.text = intent.getStringExtra("name")

        }
        if (intent.hasExtra("Location")) {
            val location = intent.getIntExtra("Location", 0)
            if (location > 0)

                viewModel.getWeather(location)

        }
        viewModel.showProgress.observe(this, {
            if (it) {
                details_progress.visibility = VISIBLE
            } else {
                details_progress.visibility = GONE
            }
        })
        viewModel.response.observe(this, {
            if (it != null)
                tv_temp.text = "${it.consolidated_weather[0].the_temp.roundToLong()}°C"
        })
    }
}