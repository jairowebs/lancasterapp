

package www.colegiolancaster.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    private EditText vl1,vl2;
    private RadioButton rb1,rb2;
    private EditText etn,etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        vl1=(EditText) findViewById(R.id.txt1);
        vl2=(EditText) findViewById(R.id.txt2);
        rb1=(RadioButton) findViewById(R.id.radioButton1);
        rb2=(RadioButton) findViewById(R.id.radioButton2);

    etn = (EditText) findViewById (R.id.txt1) ;
    etp = (EditText) findViewById (R.id.txt2);
    }
    public void  decidir (View view){
        String valor1_string =vl1.getText().toString();
        String valor2_string =vl2.getText().toString();

        if (rb1.isChecked()== true){
            Intent i = new Intent(this, ProfileuserActivity.class);
            startActivity(i);
            
        } else if (rb2.isChecked()== true) {
            Intent i = new Intent(this,AdminProfileActivity.class);
            startActivity(i);
            
        }
    }
    //metodo boton
    public  void ingresar (View View){
        String nombre = etn.getText().toString();
        String contrasena = etp.getText().toString();
if (nombre.length() == 0){
    Toast.makeText(this,"debes ingresar tu nombre",Toast.LENGTH_LONG).show();
}
if (contrasena.length() == 0){
    Toast.makeText(this,"debes ingresar tu contraseña",Toast.LENGTH_LONG).show();
}
if (nombre.length()!= 0 && contrasena.length() != 0){
    Toast.makeText(this,"ingresando.....",Toast.LENGTH_LONG).show();
        }
    }


}