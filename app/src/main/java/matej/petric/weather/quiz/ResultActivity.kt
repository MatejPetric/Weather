package matej.petric.weather.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*
import matej.petric.weather.R
import matej.petric.weather.view.SplashActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = "$userName"

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        if (correctAnswers >= 5) {
            tv_score.text = "Your score is $correctAnswers out of $totalQuestions "
            tv_congratulations.text = "Hey, Congratulations!"
            btn_finish.text = "Open clima data"
        } else {
            tv_score.text = "Your score is $correctAnswers out of $totalQuestions "
            tv_congratulations.text = "Sorry, please try again !"
            btn_finish.text = "Try again"

        }

        btn_finish.setOnClickListener() {
            if (correctAnswers >= 5) {
                startActivity(Intent(this, SplashActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this, WelcomeActivity::class.java))
                finish()
            }
        }
    }
}