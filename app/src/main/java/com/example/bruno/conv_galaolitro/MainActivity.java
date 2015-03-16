package com.example.bruno.conv_galaolitro;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    EditText gls,ltrs,result;
    Button butao1;
    String glss,ltrss;
    Double galao,litro,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gls=(EditText)findViewById(R.id.editText);
        ltrs=(EditText)findViewById(R.id.editText2);
        result=(EditText)findViewById(R.id.editText3);
        butao1=(Button)findViewById(R.id.button);
        butao1.setOnClickListener(butao1funcao);
    }

    private View.OnClickListener butao1funcao=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try{
                glss=gls.getText().toString();
                ltrss=ltrs.getText().toString();
                if ((glss.matches(""))){
                    litro=Double.parseDouble(ltrs.getText().toString());
                    res=litro*0.26417;
                    result.setText(String.valueOf(res));
                }
                if (ltrss.matches("")){
                    galao=Double.parseDouble(gls.getText().toString());
                    res=galao/0.26417;
                    result.setText(String.valueOf(res));

                }
            }
            catch (Exception e){
                result.setText("Erro");
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
