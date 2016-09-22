package cl.jgutierrez.android.infopuertos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PuertoActivity extends AppCompatActivity {
    private int puertoIdx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puerto);

        if(getIntent() == null) {
            finish();
        }

        puertoIdx = getIntent().getIntExtra("puertoIdx", 0);
        setTitle("Puerto " + puertoIdx);
    }
}
