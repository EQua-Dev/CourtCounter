package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TeamScoreA;
    TextView TeamScoreB;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addthreeA(View V) {
        TeamScoreA = findViewById(R.id.TeamAScore);
        String tsa=TeamScoreA.getText().toString().trim();
        int add= Integer.parseInt(tsa);
        add= add+3;
        TeamScoreA.setText(String.valueOf(add));
    }

    public void addthreeB (View V) {
            TeamScoreB= findViewById(R.id.TeamBScore);
            String tsb=TeamScoreB.getText().toString().trim();
            int add= Integer.parseInt(tsb);
            add=add+3;
            TeamScoreB.setText(String.valueOf(add));
    }

    public void addtwoA (View V){
            TeamScoreA =findViewById(R.id.TeamAScore);
            String tsa=TeamScoreA.getText().toString().trim();
            int add= Integer.parseInt(tsa);
            add=add+2;
            TeamScoreA.setText(String.valueOf(add));
    }
    public void addtwoB (View V){
            TeamScoreB=findViewById(R.id.TeamBScore);
            String tsb= TeamScoreB.getText().toString().trim();
            int add=Integer.parseInt(tsb);
            add=add+2;
            TeamScoreB.setText(String.valueOf(add));
    }
    public void addoneA(View V){
            TeamScoreA=findViewById(R.id.TeamAScore);
            String tsa= TeamScoreA.getText().toString().trim();
            int add=Integer.parseInt(tsa);
            add=add+1;
            TeamScoreA.setText(String.valueOf(add));
    }
    public void addoneB(View V){
            TeamScoreB=findViewById(R.id.TeamBScore);
            String tsb= TeamScoreB.getText().toString().trim();
            int add= Integer.parseInt(tsb);
            add=add+1;
            TeamScoreB.setText(String.valueOf(add));
    }
    public void reset(View V){
            TeamScoreA=findViewById(R.id.TeamAScore);
            TeamScoreA.setText("0");
            TeamScoreB=findViewById(R.id.TeamBScore);
            TeamScoreB.setText("0");
    }
}
