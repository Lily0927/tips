package com.example.lily.tips;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {
    private Button checkbutton;
    private EditText inputmoney;
    private TextView firsttip;
    private TextView secondtip;
    private TextView thirdtip;
    private TextView firstmon;
    private TextView secondmon;
    private TextView thirdmon;
    int money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        checkbutton= (Button) findViewById(R.id.button);
        checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputmoney= (EditText) findViewById(R.id.editText);
                money=Integer.parseInt(inputmoney.getText().toString());
                double first=money*0.15;
                double second=money*0.20;
                double third=money*0.30;
                firsttip=(TextView) findViewById(R.id.textView4);
                firsttip.setText(""+first+"$");
                secondtip=(TextView) findViewById(R.id.output2);
                secondtip.setText(""+second+"$");
                thirdtip=(TextView) findViewById(R.id.output3);
                thirdtip.setText(""+third+"$");
                firstmon=(TextView) findViewById(R.id.moneyview1);
                firstmon.setText(""+(money+first)+"$");
                secondmon=(TextView) findViewById(R.id.moneyview2);
                secondmon.setText(""+(money+second)+"$");
                thirdmon=(TextView) findViewById(R.id.moneyview3);
                thirdmon.setText(""+(money+third)+"$");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
}
