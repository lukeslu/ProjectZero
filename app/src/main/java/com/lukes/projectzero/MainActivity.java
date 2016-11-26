package com.lukes.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String message = "Unknow";
                switch (view.getId()) {
                    case R.id.buttonMovie: {
                        message = "启动应用：热门电影";
                        break;
                    }
                    case R.id.buttonStock: {
                        message = "启动应用：股票雄鹰";
                        break;
                    }
                    case R.id.buttonReader: {
                        message = "启动应用：XYZ 阅读器";
                        break;
                    }
                    case R.id.buttonNews: {
                        message = "启动应用：最新闻";
                        break;
                    }
                    case R.id.buttonDesign: {
                        message = "启动应用：毕业设计";
                        break;
                    }
                }

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        };
        findViewById(R.id.buttonMovie).setOnClickListener(listener);
        findViewById(R.id.buttonStock).setOnClickListener(listener);
        findViewById(R.id.buttonReader).setOnClickListener(listener);
        findViewById(R.id.buttonNews).setOnClickListener(listener);
        findViewById(R.id.buttonDesign).setOnClickListener(listener);
    }
}
