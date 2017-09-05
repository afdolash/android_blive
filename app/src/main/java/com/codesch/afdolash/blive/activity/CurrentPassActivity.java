package com.codesch.afdolash.blive.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.codesch.afdolash.blive.R;

public class CurrentPassActivity extends AppCompatActivity {

    Button btn_change;
    TextView tv_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_pass);

        btn_change = (Button) findViewById(R.id.btn_change);
        tv_desc = (TextView) findViewById(R.id.tv_desc);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String strBtn =(String) extras.get("btnChanged");
            if(strBtn.equalsIgnoreCase("Ubah Alamat Email")) {
                btn_change.setText(strBtn);
                tv_desc.setText("Untuk mengubah alamat email Anda. Silahkan memasukkan kata sandi saat ini. Tekan 'Ubah Alamat Email' untuk melanjutkan.");
                btn_change.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(CurrentPassActivity.this, ChangeEmailActivity.class);
                        startActivity(intent);
                    }
                });
            }
            else if(strBtn.equalsIgnoreCase("Ubah Kata Sandi")) {
                btn_change.setText(strBtn);
                tv_desc.setText("Untuk mengubah kata sandi Anda. Silahkan memasukkan kata sandi saat ini. Tekan 'Ubah Kata Sandi' untuk melanjutkan.");

                btn_change.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(CurrentPassActivity.this, ChangePassActivity.class);
                        startActivity(intent);
                    }
                });
            }
        }
    }
}
