package gore.kafana.kidsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ChooseActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText emailText;
    EditText passwordText;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        mAuth = FirebaseAuth.getInstance();
        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);


        FirebaseUser user = mAuth.getCurrentUser();

        if (user != null) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }


        textView = findViewById(R.id.textView);

    }

    public void fastRegister(View v) {
        Intent homeIntent = new Intent(ChooseActivity.this, KidsActivity.class);
        startActivity(homeIntent);
    }

    public void RegisterAsAParent(View v) {
        Intent homeIntent = new Intent(ChooseActivity.this, signUpActivity.class);
        startActivity(homeIntent);
    }
}
