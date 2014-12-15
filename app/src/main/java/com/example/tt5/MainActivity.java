package com.example.tt5;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClicOk(View v)
    {
        Button btOK=(Button)findViewById(R.id.btOK);
        TextView tvName=(TextView)findViewById(R.id.tvNombre);
        String strName=tvName.getText().toString();

        TextView tvPasswd=(TextView)findViewById(R.id.tvPassword);
        String strPasswd=tvName.getText().toString();


    }

    public void onClicCancel(View v)
    {
        Button btCancel=(Button)findViewById(R.id.btCancel);
    }
}
