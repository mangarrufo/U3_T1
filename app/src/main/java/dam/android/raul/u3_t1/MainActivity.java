package dam.android.raul.u3_t1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Attributes
    private int count;

    private TextView tvDisplay;
    private Button buttonIncrease, buttonDecrease, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
    }

    private void setUI() {
        tvDisplay = findViewById(R.id.tvDisplays);
        buttonIncrease = findViewById(R.id.buttonIncrease);
        buttonDecrease = findViewById(R.id.buttonDecrease);
        buttonReset = findViewById(R.id.buttonReset);

        //set onCliskListener
        buttonIncrease.setOnClickListener(this);
        buttonDecrease.setOnClickListener(this);
        buttonReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonIncrease:
                count++;
                break;
            case R.id.buttonDecrease:
                count--;
                break;
            case R.id.buttonReset:
                count = 0;
                break;
        }
        tvDisplay.setText(getString(R.string.number_of_elements) + " : " + count);
    }
}

