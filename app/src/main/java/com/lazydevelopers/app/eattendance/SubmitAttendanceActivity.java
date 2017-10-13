package com.lazydevelopers.app.eattendance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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
    @BindView(R.id.submit)
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_attendance);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.submit)
    public void onViewClicked() {
        boolean cancel=true;
        if(dept.getSelectedItemId()==-1||year.getSelectedItemId()==-1||sec.getSelectedItemId()==-1|| TextUtils.isEmpty(number.getText().toString()))
            Toast.makeText(this, "All Options Are COmpulsary", Toast.LENGTH_SHORT).show();
        else {
            DatabaseReference db= FirebaseDatabase.getInstance().getReference().child(dept.getSelectedItem().toString()).child(year.getSelectedItem().toString()+"-"+sec.getSelectedItem().toString());
            db.setValue(number.getText().toString());
            Toast.makeText(this, "Count has been uploaded successfully", Toast.LENGTH_SHORT).show();
        }
    }
}
