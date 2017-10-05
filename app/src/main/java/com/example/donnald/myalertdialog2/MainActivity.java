package com.example.donnald.myalertdialog2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openDialog (View view) {
        CustomDialog dialog = new CustomDialog();
        dialog.show(getFragmentManager(),"hello");
    }
}
