

package www.colegiolancaster.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    private EditText etn,etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    etn = (EditText) findViewById (R.id.txt1) ;
    etp = (EditText) findViewById (R.id.txt2);

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
      public void siguiente (View View){
        Intent siguiente = new Intent(this,ProfileuserActivity.class);
        startActivity(siguiente);}
        public void siguiente1 (View View) {
            Intent siguiente1 = new Intent(this, AdminProfileActivity.class);
            startActivity(siguiente1);


        }
}