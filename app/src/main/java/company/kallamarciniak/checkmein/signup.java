package company.kallamarciniak.checkmein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_signup);
    }

    public void openlogin(View view) {
        final Intent intencja = new Intent(this,login.class);
        startActivity(intencja);
    }

    public void tocken(View view) {
        Toast.makeText(getApplicationContext(), "To sign up you need an unique ID. \n Please contact with Admin. ", Toast.LENGTH_LONG).show();
    }

}