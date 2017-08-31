package com.codesch.afdolash.blive.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.codesch.afdolash.blive.R;

public class AccountActivity extends AppCompatActivity {

    LinearLayout lin_changeEmail, lin_changePass, lin_delAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        setTitle("Account");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lin_changeEmail = (LinearLayout) findViewById(R.id.lin_changeEmail);
        lin_changePass = (LinearLayout) findViewById(R.id.lin_changePass);
        lin_delAccount = (LinearLayout) findViewById(R.id.lin_delAccount);

        lin_changeEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, CurrentPassActivity.class);
                intent.putExtra("btnChanged", "Ubah Alamat Email");
                startActivity(intent);
            }
        });

        lin_changePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, CurrentPassActivity.class);
                intent.putExtra("btnChanged", "Ubah Kata Sandi");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
