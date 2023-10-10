package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    Button btnCount;
    TextView tvMain;
    Spinner spSelectionOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.btnCount = findViewById(R.id.btnCount);
        this.tvMain = findViewById(R.id.tvMain);

        this.spSelectionOptions = (Spinner) findViewById(R.id.spSelectionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectionOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {

        String selectedItem = this.spSelectionOptions.getSelectedItem().toString();

        if (selectedItem.equalsIgnoreCase("Characters")) {

            int result = TextCounter.countCharacters(this.edUserInput.getText().toString());
            Log.i("CharactersCountResult", String.valueOf(result));

            if (result == 0) {

                this.tvMain.setText("After pressing the button, counted number will appear.");
                Toast.makeText(this, "There is nothing to count, must be at least one character!!!", Toast.LENGTH_LONG).show();
            }
            else{

                this.tvMain.setText(String.valueOf(result));
            }
        }
        else{

            int result = TextCounter.countWords(this.edUserInput.getText().toString());
            Log.i("WordsCountResult", String.valueOf(result));

            if (result == 0) {

                this.tvMain.setText("After pressing the button, counted number will appear.");
                Toast.makeText(this, "There is nothing to count, must be at least one character (can't be a number!!!)", Toast.LENGTH_LONG).show();
            }
            else{

                this.tvMain.setText(String.valueOf(result));
            }
        }
    }
}