package mfm.learn.buttoncounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private Button buttonAdd;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText) findViewById(R.id.editText);
        buttonAdd = (Button) findViewById(R.id.addCatatan);
        textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod( new ScrollingMovementMethod());
        View.OnClickListener hasil = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasilKeluaran = "\n Saya berhasil Alhamdulillah";
                textView.append(hasilKeluaran);
            }
        };

        View.OnLongClickListener hmm = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String jawaban = "\nI Love You";
                textView.append(jawaban);
                return true;
            }
        };

        buttonAdd.setOnClickListener (hasil);
        buttonAdd.setOnLongClickListener(hmm);
    }
}
