package com.yummy.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AuthorizationActivity extends AppCompatActivity {

    TextView notRegTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        notRegTextView = (TextView) findViewById(R.id.notRegTextView);
    }

    public void notReg_Click(View view) {
        Intent intent = new Intent(AuthorizationActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }
}
