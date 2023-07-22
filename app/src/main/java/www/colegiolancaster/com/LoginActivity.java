package www.colegiolancaster.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {

    TextInputEditText editTextEmail, editTextPassword;
    Button FamiliasLogin;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        editTextEmail = findViewById(R.id.emailLogin);
        editTextPassword = findViewById(R.id.passLogin);
        progressBar = findViewById(R.id.progressbar);
        FamiliasLogin = findViewById(R.id.FamiliasLogin);
        textView = findViewById(R.id.registerNow);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
public void siguiente (View View){
    Intent siguiente = new Intent(this,MainActivity2.class);
    startActivity(siguiente);
}



}