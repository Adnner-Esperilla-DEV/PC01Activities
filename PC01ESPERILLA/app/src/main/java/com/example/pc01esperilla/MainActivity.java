package com.example.pc01esperilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_llamar = (Button)findViewById(R.id.btnCalcular);
        btn_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et1 =((EditText)findViewById(R.id.txtTalla));
                EditText et2 =((EditText)findViewById(R.id.txtPeso));
                TextView tv1=((TextView)findViewById(R.id.txtResultado));
                TextView tv2=((TextView)findViewById(R.id.txtRecomendacion));
                TextView tv3=((TextView)findViewById(R.id.txtimcn));
                double talla = Double.parseDouble(et1.getText().toString());
                double talla2=talla/100;
                double peso = Double.parseDouble(et2.getText().toString());
                int imc = (int) (peso / (talla2*talla2));
                String totalString = String.valueOf(imc);
                tv1.setText( R.string.textimc );
                tv3.setText(totalString);
                if(imc<=20){
                    tv2.setText(R.string.rec1);
                }
                if(imc<=25  && imc>20){
                    tv2.setText(R.string.rec2);
                }
                if(imc<=30  && imc>25){
                    tv2.setText(R.string.rec3);
                }
                if(imc<=40  && imc>30){
                    tv2.setText(R.string.rec4);
                }
                if(imc>40){
                    tv2.setText(R.string.rec5);
                }
            }
        });
    }
}