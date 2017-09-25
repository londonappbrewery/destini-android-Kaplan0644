package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView mstoryTextView;
    Button mbuttonBottom;
    Button mbuttonTop;

    // TODO: Steps 4 & 8 - Declare member variables here:
    int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mstoryTextView=(TextView)findViewById(R.id.storyTextView);
        mbuttonTop=(Button) findViewById(R.id.buttonTop);
        mbuttonBottom=(Button) findViewById(R.id.buttonBottom);

        //TODO : Delete here if anything goes wrong :)
        if(mStoryIndex==1){
            mstoryTextView.setText(R.string.T1_Story);
            mbuttonTop.setText(R.string.T1_Ans1);
            mbuttonBottom.setText(R.string.T1_Ans2);
        }

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex==1){
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=21;//Here I am leading code to 2nd tier,  left side
                }else if (mStoryIndex==21){//Left side's decisions for up button
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }else if(mStoryIndex==22){ //2nd tier right side , top button pressed
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=31;//Here I am leading code to 3rd tier, which is Buttons : down-up
                }else if (mStoryIndex==31){//3rd tier , top button pressed
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
            }
        });
        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex==1){
                    mstoryTextView.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex=22;//Here I am leading code to 2nd tier, right side
                }else if (mStoryIndex==21){//Left side's decisions for down button
                    mstoryTextView.setText(R.string.T5_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }else if (mStoryIndex==22){//2nd tier right side bottom button pressed
                    mstoryTextView.setText(R.string.T4_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
            }else if (mStoryIndex==31){//3rd tier , bottom button pressed
                    mstoryTextView.setText(R.string.T5_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
        }});


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
