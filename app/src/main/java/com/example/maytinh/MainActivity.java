package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer sothunhat = 0;
    Integer sothuhai = 0;
    Character dau = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView ketQua = (TextView)findViewById(R.id.kq);
        Button so0 = (Button)findViewById(R.id.so0);
        so0.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"0");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so1 = (Button)findViewById(R.id.so1);
        so1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"1");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so2 = (Button)findViewById(R.id.so2);
        so2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"2");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so3 = (Button)findViewById(R.id.so3);
        so3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"3");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so4 = (Button)findViewById(R.id.so4);
        so4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"4");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so5 = (Button)findViewById(R.id.so5);
        so5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"5");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so6 = (Button)findViewById(R.id.so6);
        so6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"6");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so7 = (Button)findViewById(R.id.so7);
        so7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"7");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so8 = (Button)findViewById(R.id.so8);
        so8.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"8");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });
        Button so9 = (Button)findViewById(R.id.so9);
        so9.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ketQua.setText(ketQua.getText().toString()+"9");
                if(dau == null) {
                    sothunhat = Integer.parseInt(ketQua.getText().toString());
                } else {
                    sothuhai = Integer.parseInt(ketQua.getText().toString());
                }
            }
        });

        Button Cong = (Button)findViewById(R.id.daucong);
        Cong.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '+';
                ketQua.setText("");
            }
        });
        Button Tru = (Button)findViewById(R.id.dautru);
        Tru.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '-';
                ketQua.setText("");

            }
        });
        Button Nhan = (Button)findViewById(R.id.daunhan);
        Nhan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = 'x';
                ketQua.setText("");
            }
        });
        Button Chia = (Button)findViewById(R.id.dauchia);
        Chia.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '/';
                ketQua.setText("");
            }
        });

        Button Bang = (Button)findViewById(R.id.daubang);
        Bang.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dau != null) {
                    Integer kqua = 0;
                    switch (dau) {
                        case '+': kqua = sothunhat + sothuhai; break;
                        case '-': kqua = sothunhat - sothuhai; break;
                        case 'x': kqua = sothunhat * sothuhai; break;
                        case '/': kqua = sothunhat / sothuhai; break;
                    }
                    ketQua.setText(kqua.toString());
                    sothunhat = kqua;
                    dau = null;
                }
            }
        });

        Button xoaPhepTinh = (Button)findViewById(R.id.xoapheptinh);
        xoaPhepTinh.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                sothuhai = 0;
                sothunhat = 0;
                dau = null;
                ketQua.setText("0");

            }
        });

        Button xoaToanHang = (Button)findViewById(R.id.xoatoanhang);
        xoaToanHang.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                ketQua.setText("0");
            }
        });
        Button xoaChuSo = (Button)findViewById(R.id.xoachuso);
        xoaChuSo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=ketQua.getText().toString();
                if(s.length()<=1)
                    ketQua.setText("");
                else{
                    s=s.substring(0,s.length()-1);
                    ketQua.setText(s);
                }
            }
        });
    }


}