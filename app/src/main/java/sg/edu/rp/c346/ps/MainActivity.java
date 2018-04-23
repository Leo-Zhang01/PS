package sg.edu.rp.c346.ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> aa;
    ArrayList<String> type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        type = new ArrayList<String>();
        type.add("Secular");
        type.add("Ethnic & Religion");
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, type);
        listView.setAdapter(aa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("type", type.get(position));
                startActivity(intent);
            }
        });
    }
}
