package br.com.omnilabs.physiscale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.omnilabs.physiscale.Activity.WOMACIndexActivity;
//import android.R;

public class MainActivity extends AppCompatActivity {

    private Button btnGoToWOMACIndexView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnGoToWOMACIndexView = (Button) findViewById(R.id.btnGoToWOMACIndexView);
    }

    public void goToWOMACScaleView(View view) {
        Intent intent = new Intent(this, WOMACIndexActivity.class);
        startActivity(intent);
    }
}
