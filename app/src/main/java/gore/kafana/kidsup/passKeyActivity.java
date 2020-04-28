package gore.kafana.kidsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class passKeyActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_key);

        double randomDouble = Math.random();
        randomDouble = randomDouble * 10 + 1;
        final int randomInt = (int) randomDouble;
        double randomDouble2 = Math.random();
        randomDouble2 = randomDouble2 * 10 + 1;
        final int randomInt2 = (int) randomDouble2;

        editText = findViewById(R.id.editText);

        textView = findViewById(R.id.textView);
        textView.setText(randomInt + " x " + randomInt2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                String sTextFromET = editText.getText().toString();
                int nIntFromET = new Integer(sTextFromET).intValue();

                if (nIntFromET == randomInt * randomInt2){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
