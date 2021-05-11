package sg.edu.rp.c346.id20047778.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button buttonDisplayDate, buttonDispayTime, buttonReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.DatePicker);
        tp = findViewById(R.id.TimePicker);
        buttonDisplayDate = findViewById(R.id.buttonDisplayDate);
        buttonDispayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonReset = findViewById(R.id.ButtonReset);


        buttonDispayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String timeis = "Time now is " + tp.getCurrentHour()
                        + ":" + String.format("%02d", tp.getCurrentMinute()) +".";
                tvDisplay.setText(timeis);
            }
        });

        buttonDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dateis = "Date is " + dp.getDayOfMonth() + "/" +
                        dp.getMonth()+1 + "/" + dp.getYear() ;

                tvDisplay.setText(dateis);

            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(1,0,1);
            }
        });


    }
}
