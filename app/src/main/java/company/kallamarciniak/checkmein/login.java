package company.kallamarciniak.checkmein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

    }

    public void opensignup(View view) {
        final Intent intencja = new Intent(this,signup.class);
        startActivity(intencja);
    }

    public void openmockup(View view) {
       passwordCheck();
    }

    public void passwordCheck(){
        EditText editTextID = findViewById(R.id.editText5);
        String IDdFromUser = editTextID.getText().toString();
        EditText editTextpassword = findViewById(R.id.editText7);
        String passwordFromUser = editTextpassword.getText().toString();
        if (IDdFromUser.equals("Admin") && passwordFromUser.equals("123")){
            final Intent intencja = new Intent(this, MainCockpit.class);
            startActivity(intencja);
        }
        else Toast.makeText(getApplicationContext(), "Your ID or password is incorrect.\n Please, try again.", Toast.LENGTH_LONG).show();
    }
}
