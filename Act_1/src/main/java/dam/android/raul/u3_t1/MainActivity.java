package dam.android.raul.u3_t1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends LogActivity implements View.OnClickListener {

    private int count;

    private TextView tvDisplay;
    private Button buttonIncrease, buttonDecrease, buttonReset, buttonIncreasetwo, buttonDecreasetwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUI();
    }

    private void setUI() {
        tvDisplay = findViewById(R.id.tvDisplay);
        buttonIncrease = findViewById(R.id.buttonIncrease);
        buttonDecrease = findViewById(R.id.buttonDecrease);
        buttonReset = findViewById(R.id.buttonReset);
        buttonIncreasetwo = findViewById(R.id.buttonIncreasetwo);
        buttonDecreasetwo = findViewById(R.id.buttonDecreasetwo);

        //set onCliskListener
        buttonIncrease.setOnClickListener(this);
        buttonDecrease.setOnClickListener(this);
        buttonReset.setOnClickListener(this);
        buttonIncreasetwo.setOnClickListener(this);
        buttonDecreasetwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonIncrease:
                count++;
                break;
            case R.id.buttonDecrease:
                count--;
                break;
            case R.id.buttonIncreasetwo:
                count += 2;
                break;
            case R.id.buttonDecreasetwo:
                count -= 2;
                break;
            case R.id.buttonReset:
                count = 0;
                break;
        }
        tvDisplay.setText(getString(R.string.number_of_elements) + " : " + count);
    }


}
