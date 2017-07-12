package bawei.com.todayheadline_demo.GuidePage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import bawei.com.todayheadline_demo.R;
import bawei.com.todayheadline_demo.activity.MainActivity;

/**
 * 类描述： 今日头条引导页 三秒跳转  去模拟器状态栏
 * 创建人：xuyaxi
 * 创建时间：2017/7/12 10:28
 */
public class GuidePages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidepage);
        RemoveTheStatusBar();//去模拟器状态栏
        initJump();//引导页三面跳转。。
    }

    private void RemoveTheStatusBar() {
        getSupportActionBar().hide();
        //去状态栏 加沉浸式
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void initJump() {
        new Handler(new Handler.Callback() {
            //处理接收到的消息的方法
            @Override
            public boolean handleMessage(Message arg0) {
                //实现页面跳转
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                return false;
            }
        }).sendEmptyMessageDelayed(0, 3000); //表示延时三秒进行任务的执行
    }
}
