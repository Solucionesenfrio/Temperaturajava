package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText temp;
    TextView result;
    Button eval, salir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = (EditText) findViewById(R.id.temp);
        result = (TextView) findViewById(R.id.result);
        eval = (Button) findViewById(R.id.evaluar);
        salir = (Button) findViewById(R.id.salir);
        eval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eval();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });

    }

    private void eval(){
float x = Float.parseFloat(temp.getText().toString());
if (x < 36){
    result.setText("Temperatura Baja");
}else{if (x >=37){result.setText("Temperatura Alta");
}else{result.setText("Temperatura normal");  }
}
    }

    private void salir() {
        finish();
    }

}