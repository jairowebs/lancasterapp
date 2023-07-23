package www.colegiolancaster.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Bienvenida(View view){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }



}