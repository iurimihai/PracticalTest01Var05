package ro.pub.cs.systems.eim.practicaltest01var05.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import ro.pub.cs.systems.eim.practicaltest01var05.R;

public class PracticalTest01Var05MainActivity extends AppCompatActivity {

    private Button topLeft, topRight, center, bottomLeft, bottomRight;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var05_main);
    }
}