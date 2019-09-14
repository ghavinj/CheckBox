package com.ghavinj.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckBox;
    private CheckBox dadCheckBox;
    private CheckBox grandpaCheckBox;

    private Button chooseButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBox = (CheckBox)findViewById(R.id.momCheckBoxID);
        dadCheckBox = (CheckBox)findViewById(R.id.dadCheckBoxID);
        grandpaCheckBox = (CheckBox)findViewById(R.id.grandpaCheckBoxID);

        chooseButton = (Button)findViewById(R.id.showButtonID);
        resultTextView = (TextView)findViewById(R.id.resultID);


        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString() + "Status is: " + momCheckBox.isChecked() + "\n" );
                stringBuilder.append(dadCheckBox.getText().toString() + " Status is: " + dadCheckBox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckBox.getText().toString() + "Status is: " + grandpaCheckBox.isChecked() + "\n");

                resultTextView.setText(stringBuilder);

            }
        });
    }
}
