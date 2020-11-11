package com.example.dragger2implementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dragger2implementation.basics.MainViewModel;
import com.example.dragger2implementation.di.DaggerMainViewModelInjector;


import javax.inject.Inject;

import static com.example.dragger2implementation.basics.Constants.MY_TAG;


public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;

    @Inject
     MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textId);
        button  =findViewById(R.id.button);


        DaggerMainViewModelInjector.create().injectField(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(MY_TAG, "onCreate: Data fetched");
                textView.setText(mMainViewModel.fetchData());
            }
        });
    }
}