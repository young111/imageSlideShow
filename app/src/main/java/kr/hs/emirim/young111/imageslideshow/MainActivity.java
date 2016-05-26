package kr.hs.emirim.young111.imageslideshow;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip = (ViewFlipper)findViewById(R.id.view_flip);
        flip.setFlipInterval(2000);
        Button butStart = (Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butStop = (Button)findViewById(R.id.but_stop);
        butStart.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.but_start :
                flip.startFlipping();
                break;
            case R.id.but_stop :
                flip.stopFlipping();
                break;
        }
    }
}
