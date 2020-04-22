package strix.app.strix_editabletextviewexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/*
Created by Strix - http://strixdev.co.uk
*/

public class MainActivity extends AppCompatActivity {

    private EditText edittext;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        CreateKeyListener();
    }

    public void CreateKeyListener() {

        edittext = findViewById(R.id.editText);

        edittext.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ((event.getAction() == KeyEvent.ACTION_DOWN)
                        && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    Toast.makeText(context,
                            edittext.getText(), Toast.LENGTH_LONG).show();
                    return true;

                } else {
                    return false;
                }
            }
        });
    }
}