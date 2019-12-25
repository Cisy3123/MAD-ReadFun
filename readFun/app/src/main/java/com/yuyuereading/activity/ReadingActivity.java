package com.yuyuereading.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.willy.ratingbar.ScaleRatingBar;
import com.yuyuereading.Model.bean.ReadInfo;
import com.yuyuereading.Model.bean._User;
import com.yuyuereading.Model.database.OperationReadInfo;
import com.yuyuereading.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.bmob.v3.BmobUser;

public class ReadingActivity extends AppCompatActivity {

    Context context=ReadingActivity.this;
    private Button returnButton;
    private Button reading_button;
    private TextView classfy;
    private EditText read_notes;
    private EditText read_reason;
    private String book_isbn;
    String book_score;
    String book_way;
    ScaleRatingBar bookRating;
    ReadInfo readInfo;
    private Boolean bmob_if_hava_read_info = false;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        //从图书详情页面获取信息
        getInfoFromBookInfo();
        findView();
        onClick();
        //放入初始化信息
        initInfo();
    }

    private void getInfoFromBookInfo() {
        Intent intent=getIntent();
    }

    private void initInfo() {
        //定义传给数据库操作类的handler
        @SuppressLint("HandlerLeak")
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 0) {
                    List<ReadInfo> list = (List<ReadInfo>) msg.obj;
                    if (list.size() != 0) {
                        ReadInfo readInfo = list.get(0);
                        Log.i("bmob", "handler传送成功:" + readInfo.getObjectId());
                        read_notes.setText(readInfo.getRead_notes());
                        read_reason.setText(readInfo.getRead_reason());

                        bmob_if_hava_read_info = true;
                    }
                }
            }
        };
        //通过ISBN先查询一下Bmob数据库中是否有此条记录,有的话就显示出来
        _User bmobUser = BmobUser.getCurrentUser(_User.class);
        OperationReadInfo.queryReadInfo(bmobUser, book_isbn,handler);
    }

    //添加控件id
    private void findView()
    {
        returnButton=findViewById(R.id.reading_return_button);
        read_notes = findViewById(R.id.reading_note_text);
        read_reason = findViewById(R.id.reading_reason);
        Spinner reading_way = findViewById(R.id.reading_way);
        classfy=findViewById(R.id.reading_classfy);
        reading_button = findViewById(R.id.reading_button);
    }

    //点击事件
    private void onClick(){
        //返回按钮
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        //读书分类按钮
        classfy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classfyinit();
            }
        });

        //完成记录
        reading_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }

    //初始化分类picker
    private void classfyinit(){
        String[] book={"推理悬疑","影视原著","青春言情","经济管理","互联网+","职场提升","成功励志","心理课堂","历史小说","职场小说"};
        final ArrayList<String> bookcalssfy=new ArrayList<>();
        bookcalssfy.addAll(Arrays.asList(book).subList(0, 10));
        OptionsPickerView  classOptions = new  OptionsPickerBuilder(this, new OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3 ,View v) {
                //返回的分别是三个级别的选中位置
                String selectclass=bookcalssfy.get(options1);
                classfy.setText(selectclass);
            }
        })
                .setSubmitText("确定")//确定按钮文字
                .setCancelText("取消")//取消按钮文字
                .setTitleText("选择图书分类")//标题
                .setSubCalSize(18)//确定和取消文字大小
                .setTitleSize(19)//标题文字大小
                .setTitleColor(Color.BLACK)//标题文字颜色
                .setSubmitColor(0XFF47E3E6)//确定按钮文字颜色
                .setCancelColor(0XFF47E3E6)//取消按钮文字颜色
                .setTitleBgColor(Color.WHITE)//标题背景颜色 Night mode
                .setBgColor(Color.WHITE)//滚轮背景颜色 Night mode
                .setContentTextSize(19)//滚轮文字大小
                .setSelectOptions(1)  //设置默认选中项
                .setOutSideCancelable(true)//点击外部dismiss default true
                .isDialog(true)//是否显示为对话框样式
                .build();
        classOptions.setPicker(bookcalssfy);//添加数据源
        classOptions.show();
    }


    public void onBackPressed()
    {
        finish();
    }
}
