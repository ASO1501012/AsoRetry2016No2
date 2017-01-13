package jp.ac.asojuku.st.asoretry2016no2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Garudo24 on 2017/01/11.
 */public class mailActivity extends AppCompatActivity
        implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        Button btnSend = (Button) this.findViewById(R.id.button);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText edit01 = (EditText)findViewById(R.id.editText);
        String memo = edit01.getText().toString();
        Uri uri;
        uri = Uri.parse("mailto:" + "1501012@st.asojuku.ac.jp");

        Intent intent=new Intent(Intent.ACTION_SENDTO,uri);
        intent.putExtra(Intent.EXTRA_SUBJECT,"メモ");
        intent.putExtra(Intent.EXTRA_TEXT,memo);
        startActivity(intent);
    }
}