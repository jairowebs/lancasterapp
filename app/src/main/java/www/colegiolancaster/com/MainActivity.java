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
public void siguiente (View View){
    Intent siguiente = new Intent(this,MainActivity2.class);
    startActivity(siguiente);
}



}