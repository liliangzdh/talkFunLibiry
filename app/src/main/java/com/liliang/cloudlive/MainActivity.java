package com.liliang.cloudlive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.talkfun.cloudlive.activity.AboutUsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textView.setText("hello");
    }


    @OnClick({R.id.button})
    public void click() {
        Toast.makeText(this, "hel", Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this, AboutUsActivity.class));
    }

}
