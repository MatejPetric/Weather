package matej.petric.weather.quiz

import matej.petric.weather.R

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country this flag belong to ?", R.drawable.ic_flag_of_argentina,
            "Maroco",
            "Argentina",
            "Madagascar",
            "Peru",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country this flag belong to ?", R.drawable.ic_flag_of_belgium,
            "Maroco",
            "Argentina",
            "Belgium",
            "Peru",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country this flag belong to ?", R.drawable.ic_flag_of_germany,
            "Croatia",
            "Germany",
            "Madagascar",
            "Peru",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country this flag belong to ?", R.drawable.ic_flag_of_india,
            "India",
            "China",
            "Korea",
            "Peru",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country this flag belong to ?", R.drawable.ic_flag_of_kuwait,
            "Hawaii",
            "Chile",
            "Madagascar",
            "Kuwait",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country this flag belong to ?", R.drawable.ic_flag_of_brazil,
            "Maroco",
            "Brazil",
            "Island",
            "Peru",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country this flag belong to ?", R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Belgium",
            "Serbia",
            "Chile",
            1
        )
        questionsList.add(que7)

        val que8 =
            Question(
                8, "What country this flag belong to ?", R.drawable.ic_flag_of_new_zealand,
                "Maroco",
                "England",
                "New Zeland",
                "Australia",
                3
            )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country this flag belong to ?", R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Pakistan",
            "Luxembourg",
            "Korea",
            1
        )
        questionsList.add(que9)

        val que10 =
            Question(
                10, "What country this flag belong to ?", R.drawable.ic_flag_of_australia,
                "Australia",
                "Argentina",
                "USA",
                "France",
                1
            )
        questionsList.add(que10)

        return questionsList

    }

}