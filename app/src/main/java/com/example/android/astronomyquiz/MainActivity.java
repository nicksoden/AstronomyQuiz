package com.example.android.astronomyquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*Resets quiz back to the way it started*/
    public void restartQuiz(View View) {
        EditText editTextQuestionOne = (EditText) findViewById(R.id.answer_question_1);
        editTextQuestionOne.getText().clear();

        CheckBox optionIo = (CheckBox) findViewById(R.id.option_two_io);
        optionIo.setChecked(false);
        CheckBox optionTitan = (CheckBox) findViewById(R.id.option_two_titan);
        optionTitan.setChecked(false);
        CheckBox optionGanymede = (CheckBox) findViewById(R.id.option_two_ganymede);
        optionGanymede.setChecked(false);
        CheckBox optionEuropa = (CheckBox) findViewById(R.id.option_two_europa);
        optionEuropa.setChecked(false);
        CheckBox optionCallisto = (CheckBox) findViewById(R.id.option_two_callisto);
        optionCallisto.setChecked(false);

        EditText editTextQuestionThree = (EditText) findViewById(R.id.answer_question_3);
        editTextQuestionThree.getText().clear();

        RadioGroup radioGroupFour = (RadioGroup) findViewById(R.id.radio_group_four);
        radioGroupFour.clearCheck();

        RadioGroup radioGroupFive = (RadioGroup) findViewById(R.id.radio_group_five);
        radioGroupFive.clearCheck();

        RadioGroup radioGroupSix = (RadioGroup) findViewById(R.id.radio_group_six);
        radioGroupSix.clearCheck();

        CheckBox optionMars = (CheckBox) findViewById(R.id.option_seven_mars);
        optionMars.setChecked(false);
        CheckBox optionJupiter = (CheckBox) findViewById(R.id.option_seven_jupiter);
        optionJupiter.setChecked(false);
        CheckBox optionEarth = (CheckBox) findViewById(R.id.option_seven_earth);
        optionEarth.setChecked(false);
        CheckBox optionNeptune = (CheckBox) findViewById(R.id.option_seven_neptune);
        optionNeptune.setChecked(false);
        CheckBox optionVenus = (CheckBox) findViewById(R.id.option_seven_venus);
        optionVenus.setChecked(false);
        CheckBox optionMercury = (CheckBox) findViewById(R.id.option_seven_mercury);
        optionMercury.setChecked(false);
        CheckBox optionSaturn = (CheckBox) findViewById(R.id.option_seven_saturn);
        optionSaturn.setChecked(false);
        CheckBox optionUranus = (CheckBox) findViewById(R.id.option_seven_uranus);
        optionUranus.setChecked(false);

        CheckBox optionCharon = (CheckBox) findViewById(R.id.option_eight_charon);
        optionCharon.setChecked(false);
        CheckBox optionDeimos = (CheckBox) findViewById(R.id.option_eight_deimos);
        optionDeimos.setChecked(false);
        CheckBox optionEnceladus = (CheckBox) findViewById(R.id.option_eight_enceladus);
        optionEnceladus.setChecked(false);
        CheckBox optionPhobos = (CheckBox) findViewById(R.id.option_eight_phobos);
        optionPhobos.setChecked(false);
        CheckBox optionOberon = (CheckBox) findViewById(R.id.option_eight_oberon);
        optionOberon.setChecked(false);

        result = 0;

        /*Puts view of layout back to the top*/
        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        scrollView.fullScroll(ScrollView.FOCUS_UP);
    }

    public void submitQuestions(View view) {

        /* retrieves answer for Question 1 */
        EditText editTextQuestionOne = (EditText) findViewById(R.id.answer_question_1);
        String questionOneWord = editTextQuestionOne.getText().toString().toLowerCase();
        boolean questionOneResult = checkQuestionOne(questionOneWord);

        /*retrieves answer for Question 2*/
        CheckBox optionIo = (CheckBox) findViewById(R.id.option_two_io);
        boolean choiceIo = optionIo.isChecked();
        CheckBox optionTitan = (CheckBox) findViewById(R.id.option_two_titan);
        boolean choiceTitan = optionTitan.isChecked();
        CheckBox optionGanymede = (CheckBox) findViewById(R.id.option_two_ganymede);
        boolean choiceGanymede = optionGanymede.isChecked();
        CheckBox optionEuropa = (CheckBox) findViewById(R.id.option_two_europa);
        boolean choiceEuropa = optionEuropa.isChecked();
        CheckBox optionCallisto = (CheckBox) findViewById(R.id.option_two_callisto);
        boolean choiceCallisto = optionCallisto.isChecked();
        boolean questionTwoResult = checkQuestionTwo(choiceIo, choiceTitan, choiceGanymede, choiceEuropa, choiceCallisto);

        /*Retrieves answer for Question #3*/
        EditText editTextQuestionThree = (EditText) findViewById(R.id.answer_question_3);
        String questionThreeWord = editTextQuestionThree.getText().toString().toLowerCase();
        boolean questionThreeResult = checkQuestionThree(questionThreeWord);

        /*Retrieves answer for Question #4*/
        RadioButton optionFourD = (RadioButton) findViewById(R.id.option_four_d);
        boolean choiceFourD = optionFourD.isChecked();
        boolean questionFourResult = checkQuestionFour(choiceFourD);

        /*Retrieves answer for Question #5*/
        RadioButton optionFiveA = (RadioButton) findViewById(R.id.option_five_titan);
        boolean choiceFiveA = optionFiveA.isChecked();
        RadioButton optionFiveB = (RadioButton) findViewById(R.id.option_five_mercury);
        boolean choiceFiveB = optionFiveB.isChecked();
        boolean questionFiveResult = checkQuestionFive(choiceFiveA);

        /*Retrieves answer for Question #6*/
        RadioButton optionSixC = (RadioButton) findViewById(R.id.option_six_c);
        boolean choiceSixC = optionSixC.isChecked();
        boolean questionSixResult = checkQuestionSix(choiceSixC);

        /*Retrieves answer for Question #7*/
        CheckBox optionMars = (CheckBox) findViewById(R.id.option_seven_mars);
        boolean choiceMars = optionMars.isChecked();
        CheckBox optionJupiter = (CheckBox) findViewById(R.id.option_seven_jupiter);
        boolean choiceJupiter = optionJupiter.isChecked();
        CheckBox optionEarth = (CheckBox) findViewById(R.id.option_seven_earth);
        boolean choiceEarth = optionEarth.isChecked();
        CheckBox optionNeptune = (CheckBox) findViewById(R.id.option_seven_neptune);
        boolean choiceNeptune = optionNeptune.isChecked();
        CheckBox optionVenus = (CheckBox) findViewById(R.id.option_seven_venus);
        boolean choiceVenus = optionVenus.isChecked();
        CheckBox optionMercury = (CheckBox) findViewById(R.id.option_seven_mercury);
        boolean choiceMercury = optionMercury.isChecked();
        CheckBox optionSaturn = (CheckBox) findViewById(R.id.option_seven_saturn);
        boolean choiceSaturn = optionSaturn.isChecked();
        CheckBox optionUranus = (CheckBox) findViewById(R.id.option_seven_uranus);
        boolean choiceUranus = optionUranus.isChecked();
        boolean questionSevenResult = checkQuestionSeven(choiceJupiter, choiceSaturn, choiceUranus, choiceNeptune, choiceMercury, choiceVenus, choiceEarth, choiceMars);

        /*Retrieves score for question #8*/
        CheckBox optionCharon = (CheckBox) findViewById(R.id.option_eight_charon);
        boolean choiceCharon = optionCharon.isChecked();
        CheckBox optionDeimos = (CheckBox) findViewById(R.id.option_eight_deimos);
        boolean choiceDeimos = optionDeimos.isChecked();
        CheckBox optionEnceladus = (CheckBox) findViewById(R.id.option_eight_enceladus);
        boolean choiceEnceladus = optionEnceladus.isChecked();
        CheckBox optionPhobos = (CheckBox) findViewById(R.id.option_eight_phobos);
        boolean choicePhobos = optionPhobos.isChecked();
        CheckBox optionOberon = (CheckBox) findViewById(R.id.option_eight_oberon);
        boolean choiceOberon = optionOberon.isChecked();
        boolean questionEightResult = checkQuestionEight(choiceCharon, choiceDeimos, choiceEnceladus, choicePhobos, choiceOberon);

        /*Calculates final score and the popup toast that is created when the Submit Answer button is pressed*/
        result = calculateScore(questionOneResult, questionTwoResult, questionThreeResult, questionFourResult, questionFiveResult, questionSixResult, questionSevenResult, questionEightResult);
        String messageResult = "";
        if (result >= 5) {
            messageResult = "passed";
        } else {
            messageResult = "failed";
        }
        Toast.makeText(this, "You score is: " + result + "/8" + "\nYou " + messageResult + " the quiz!" + "\n" + "\nQuestion 1: " + questionOneResult + "\nQuestion 2: " + questionTwoResult + "\nQuestion 3: " + questionThreeResult + "\nQuestion 4: " + questionFourResult + "\nQuestion 5: " + questionFiveResult + "\nQuestion 6: " + questionSixResult + "\nQuestion 7: " + questionSevenResult + "\nQuestion 8: " + questionEightResult, Toast.LENGTH_LONG).show();
    }

    private boolean checkQuestionOne(String questionOneAnswer) {
        String answer = questionOneAnswer;
        if (answer.equals("eight") || (answer.equals("8"))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkQuestionTwo(boolean choiceIo, boolean choiceTitan, boolean choiceGanymede, boolean choiceEuropa, boolean choiceCallisto) {
        return (choiceIo && choiceEuropa && choiceGanymede && choiceCallisto && !choiceTitan);
    }

    private boolean checkQuestionThree(String questionThreeAnswer) {
        return (questionThreeAnswer.equals("uranus"));
    }

    private boolean checkQuestionFour(boolean choiceFourD) {
        return (choiceFourD);
    }

    private boolean checkQuestionFive(boolean choiceFiveTitan) {
        return (choiceFiveTitan);
    }

    private boolean checkQuestionSix(boolean choiceSixC) {
        return (choiceSixC);
    }

    private boolean checkQuestionSeven(boolean choiceJupiter, boolean choiceSaturn, boolean choiceUranus, boolean choiceNeptune, boolean choiceMercury, boolean choiceVenus, boolean choiceEarth, boolean choiceMars) {
        return (choiceJupiter && choiceSaturn && choiceNeptune && choiceUranus && !choiceMercury && !choiceVenus && !choiceEarth && !choiceMars);
    }

    private boolean checkQuestionEight(boolean choiceCharon, boolean choiceDeimos, boolean choiceEnceladus, boolean choicePhobos, boolean choiceOberon) {
        return (choiceDeimos && choicePhobos && !choiceCharon && !choiceEnceladus && !choiceOberon);
    }

    private int calculateScore(boolean question1Result, boolean question2Result, boolean question3Result, boolean question4Result, boolean question5Result, boolean question6Result, boolean question7Result, boolean question8Result) {
        int score = 0;
        if (question1Result) {
            score += 1;
        }
        if (question2Result) {
            score += 1;
        }
        if (question3Result) {
            score += 1;
        }
        if (question4Result) {
            score += 1;
        }
        if (question5Result) {
            score += 1;
        }
        if (question6Result) {
            score += 1;
        }
        if (question7Result) {
            score += 1;
        }
        if (question8Result) {
            score += 1;
        }
        return score;
    }

}