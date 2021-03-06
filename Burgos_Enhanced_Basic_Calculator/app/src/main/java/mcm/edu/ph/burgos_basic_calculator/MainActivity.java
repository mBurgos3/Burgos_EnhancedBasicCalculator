package mcm.edu.ph.burgos_basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Addition,Subtraction,Multiplication,Division,Modulo;
    private EditText et1, et2, et3;

    @Override
    //Methods
    //Functions
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addition = (Button) findViewById(R.id.button6);
        Subtraction = (Button) findViewById(R.id.button7);
        Multiplication = (Button) findViewById(R.id.button8);
        Division = (Button) findViewById(R.id.button9);
        Modulo = (Button) findViewById(R.id.button10);


        et1 = (EditText) findViewById(R.id.editTextNumberDecimal4);
        et2 = (EditText) findViewById(R.id.editTextNumberDecimal5);
        et3 = (EditText) findViewById(R.id.editTextNumberDecimal6);
        




        Addition.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Details", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 =Double.valueOf(et1.getText().toString());
                    double a2 =Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 + a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 =Double.valueOf(et1.getText().toString());
                    double a2 =Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 - a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 =Double.valueOf(et1.getText().toString());
                    double a2 =Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 =Double.valueOf(et1.getText().toString());
                    double a2 =Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 / a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });
        Modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 =Double.valueOf(et1.getText().toString());
                    double a2 =Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1 % a2;
                    et3.setText(String.valueOf(a3));


                }
            }
        });
    }
}



