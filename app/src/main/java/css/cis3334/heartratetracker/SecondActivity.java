package css.cis3334.heartratetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.TextView;



/**
 * Created by mmaybon on 4/1/2017.
 */

public class SecondActivity extends AppCompatActivity {
    TextView pulseData;
    TextView rangeData;
    String name;
    Double num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        pulseData = (TextView) findViewById(R.id.pulse_text);
        rangeData = (TextView) findViewById(R.id.range_text);

        Bundle extras = getIntent().getExtras();
        name = extras.getString("MainName");
        num = extras.getDouble("MainNumber");

        pulseData.setText("Pulse: " + name);
        rangeData.setText("Range: " + num);
            }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("new", name);
        intent.putExtra("new", num*2);
        setResult(RESULT_OK, intent);
        super.finish();

    }



}
