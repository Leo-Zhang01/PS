package sg.edu.rp.c346.ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    TextView tv;
    ArrayList<Holiday> secular, ethinic;
    ArrayAdapter aa;
    ArrayList<Holiday> selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        lv = findViewById(R.id.listView);
        tv = findViewById(R.id.textView);
        tv.setText(type);
        secular = new ArrayList<>();
        ethinic = new ArrayList<>();   
        secular.add(new Holiday("New Year's Day","1 January 2018",getDrawable(R.drawable.new_year)));
        ethinic.add(new Holiday("Chinese New Year","16-17 February 2018",getDrawable(R.drawable.cny)));
        secular.add(new Holiday("Good Friday","30 March 2018",getDrawable(R.drawable.good_friday)));
        secular.add(new Holiday("Labour Day","1 May 2018",getDrawable(R.drawable.labour_day)));
        ethinic.add(new Holiday("Vesak day","29 May 2018",getDrawable(R.drawable.vesak_day)));
        ethinic.add(new Holiday("Hari Raya Puasa","15 June 2018",getDrawable(R.drawable.hari_raya_puasa)));
        secular.add(new Holiday("National Day","9 August 2018",getDrawable(R.drawable.national_day)));
        ethinic.add(new Holiday("Deepavali","6 November 2018",getDrawable(R.drawable.deepavali)));
        secular.add(new Holiday("Christmas Day","25 December 2018",getDrawable(R.drawable.christmas)));
        tv.setText(type);
        selected = new ArrayList<>();
        if(type.equals("Secular")){
            selected = secular;
            aa = new HolidayAdapter(this, R.layout.row, secular);
        }else{
            selected = ethinic;
            aa = new HolidayAdapter(this, R.layout.row, ethinic);
        }
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getBaseContext(),selected.get(position).getName()+" date: "+selected.get(position).getDate(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
