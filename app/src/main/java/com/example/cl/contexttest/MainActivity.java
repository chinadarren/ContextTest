package com.example.cl.contexttest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity  {
  TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textviw);
        tv.setText("全局Context \n" +
                "public class MyApplication extends Application {\n" +
                "\n" +
                "    private static Context context;\n" +
                "    @Override\n" +
                "    public void onCreate(){\n" +
                "        context = getApplicationContext();\n" +
                "    }\n" +
                "    public static Context getContext(){\n" +
                "        return context;\n" +
                "    }\n" +
                "\n" +
                "}"); 
    }

}
