package com.clmiberf.bookmanage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * 游客模式
 * 登陆后进入登录模式
 * Created by clmiberf on 2016/9/16.
 */
public class MainActivity extends Activity {

    private Button login;

    private Button tourst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_layout);
        login = (Button) findViewById(R.id.login_button);
        tourst = (Button) findViewById(R.id.tourst_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        tourst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SearchBooks.class);
                startActivity(intent);
            }
        });

    }
}
