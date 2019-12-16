package com.yuyuereading.Presenter.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yuyuereading.R;

public class ShakeActivity extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.today_sentence);
        initView();
        /*
        final View today_view = View.inflate(this, R.layout.today_sentence, null);
        setContentView(today_view);
        AlphaAnimation tt = new AlphaAnimation(0.3f,1.0f);
        tt.setDuration(2000);
        today_view.startAnimation(tt);
        tt.setAnimationListener(new Animation.AnimationListener()
        {
            //动画页面结束后要干嘛
            @Override
            public void onAnimationEnd(Animation arg0) {
                redirectTo();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
            @Override
            public void onAnimationStart(Animation animation) {}

        });*/
    }
    private void initView() {
        back=findViewById(R.id.sentence_return);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShakeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
