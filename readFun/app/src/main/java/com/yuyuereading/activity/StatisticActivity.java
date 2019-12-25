package com.yuyuereading.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yuyuereading.R;

public class StatisticActivity extends AppCompatActivity {

    private TextView sumBook;
    private TextView sumDay;
    private TextView sumSeen;
    private TextView sumRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
        initView();
        getData();
        Button back = findViewById(R.id.statistic_return);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void getData() {
        sumBook.setText("1本");
        sumRecord.setText("6条");
        sumDay.setText("4天");
        sumSeen.setText("0本");
    }

    private void initView() {
        sumBook=findViewById(R.id.sum_book);
        sumDay=findViewById(R.id.sum_days);
        sumSeen=findViewById(R.id.seen_book);
        sumRecord=findViewById(R.id.sum_record);
    }
}
