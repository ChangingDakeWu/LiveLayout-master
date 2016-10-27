package com.example.qyzb_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.qyzb_v1.View.LiveViewFragment;
import com.example.qyzb_v1.View.MainDialogFragment;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*这里可以看到的就是我们将初始化直播的Fragment添加到了这个页面作为填充
        * 并且将MainDialogFragment显示在该页面的顶部已达到各种不同交互的需求*/

        //1->LiveViewFragment

        //2->MainDialogFragment()-2a->EmptyFragment
        //                        2b->LayerFragment
        LiveViewFragment liveViewFragment = new LiveViewFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flmain, liveViewFragment).commit();
        new MainDialogFragment().show(getSupportFragmentManager(),"MainDialogFragment");

        //测试网络连接
        /*imageView = (ImageView)this.findViewById(R.id.imageview);

        Button button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String url = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
                        //"http://op.juhe.cn/onebox/weather/query?cityname=%E6%B8%A9%E5%B7%9E&key=8cefcc14bdf72dc0e435518115441adc";
                VolleyGetData getData = new VolleyGetData(MainActivity.this);
                getData.request_image(imageView, url);
            }
        });*/
    }


}
