package com.example.createcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCreate, btnDiesel;
    private EditText EMake, EYear, EColor, EPrice, ESize;
    private TextView Output;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EMake = findViewById(R.id.etMake);
        EYear = findViewById(R.id.etYear);
        EColor = findViewById(R.id.etColor);
        EPrice = findViewById(R.id.etPrice);
        ESize = findViewById(R.id.etSize);
        Output = findViewById(R.id.tvOutput);
        btnCreate = findViewById(R.id.btnCreateCar);
        btnDiesel = findViewById(R.id.btnDiesel);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String manuf = EMake.getText().toString();
                int year = Integer.parseInt(EYear.getText().toString());
                float price = Float.parseFloat(EPrice.getText().toString());
                float size = Float.parseFloat(ESize.getText().toString());
                Output.append("This is vehicle no. " + i + "\n" + "Manufacturer: " + manuf +
                        "Current value: " + price + "Effective engine size: " + size + "\n");
            }
        });
    }
}
