package com.lazydevelopers.app.eattendance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubmitAttendanceActivity extends AppCompatActivity {

    @BindView(R.id.dept)
    Spinner dept;
    @BindView(R.id.year)
    Spinner year;
    @BindView(R.id.sec)
    Spinner sec;
    @BindView(R.id.number)
    EditText number;
    @BindView(R.id.activity_submit_attendance)
    LinearLayout activitySubmitAttendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_attendance);
        ButterKnife.bind(this);
    }
}
