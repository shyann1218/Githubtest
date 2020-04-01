package com.yaxon.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.trello.rxlifecycle2.components.support.RxFragmentActivity;

public class MainActivity extends RxFragmentActivity {

    private LoginPresenter mLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginPresenter = new LoginPresenter(this);
        findViewById(R.id.text_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.login("13459272002", "000000");
            }
        });
    }
}
