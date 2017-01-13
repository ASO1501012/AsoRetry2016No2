package jp.ac.asojuku.st.asoretry2016no2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button googlebtn = (Button)this.findViewById(R.id.button);
        googlebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.co.jp/");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        Button mailbtn = (Button)this.findViewById(R.id.button2);
        mailbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mailActivity.class);
                startActivity(i);
            }
        });
    }

}
