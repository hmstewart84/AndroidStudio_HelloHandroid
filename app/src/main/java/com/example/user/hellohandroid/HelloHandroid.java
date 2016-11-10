package com.example.user.hellohandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

/**
 * Created by user on 29/08/2016.
 */
public class HelloHandroid extends AppCompatActivity{

    EditText mQuestionEditText;
    Button mShakeButton;


             @Override
             protected void onCreate(Bundle savedInstanceState) {
                Log.d("HelloHandroid:", "onCreateCalled");
                super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);

                 mQuestionEditText = (EditText)findViewById(R.id.question_text);
                 mShakeButton = (Button)findViewById(R.id.shake_button);

                 mShakeButton.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         String question = mQuestionEditText.getText().toString();
                         Log.d("Handroid", "shake button clicked");
                         Log.d("Handroid", "The question asked was '" + question + "'");

                         String[] answers = {
                                 "Llamas",
                                 "Sloths",
                                 "Sheep",
                                 "Horses",
                                 "Narwal",
                                 "Monkeys",
                                 "Dogs",
                                 "Elephants",
                                 "Giraffes",
                                 "Iguanas",
                                 "Kangaroos",

                         };
                         Random rand = new Random();
                         int index = rand.nextInt(answers.length);
                         String answer = answers[index];

                         Intent intent = new Intent(HelloHandroid.this, AnswerActivity.class);
                         intent.putExtra("answer", answer);

                         startActivity(intent);

                     }
                 });
             }
}