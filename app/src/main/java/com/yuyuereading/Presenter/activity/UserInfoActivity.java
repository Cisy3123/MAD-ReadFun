package com.yuyuereading.Presenter.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yuyuereading.Presenter.utils.ShakeListener;
import com.yuyuereading.R;

public class UserInfoActivity extends AppCompatActivity {
    Context context=UserInfoActivity.this;
    Button userReturn;
    private ShakeListener mShakeListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        findView();
        initShake();
        onClick();
    }

    private void onClick() {
        userReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void findView() {
        userReturn=findViewById(R.id.user_info_return_button);
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    private void initShake() {
        mShakeListener=new ShakeListener(this);
        mShakeListener.setOnShakeListener(new ShakeListener.OnShakeListenerCallBack() {
            @Override
            public void onShake() {
                Intent intent = new Intent(context, ShakeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
