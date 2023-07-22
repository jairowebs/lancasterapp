

package www.colegiolancaster.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




    }
    public void siguiente1 (View View){
        Intent siguiente1 = new Intent(this,ProfileuserActivity.class);
        startActivity(siguiente1);
    }
    public void siguiente2 (View View) {
        Intent siguiente2 = new Intent(this, AdminProfileActivity.class);
        startActivity(siguiente2);

        }
}