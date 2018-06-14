package company.kallamarciniak.checkmein;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class classActivity extends AppCompatActivity {


    public static List<String> myCodesList = new ArrayList<String>();

    private ArrayAdapter<String> adapter;

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_class);


        listView = findViewById(R.id.myyListView);

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, myCodesList);

        listView.setAdapter(adapter);
    };


}



