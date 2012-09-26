package org.dojorio.fizzbuzz;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FizzBuzz extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz);
        Button btnFizzBuzz = (Button) findViewById(R.id.button1);
        btnFizzBuzz.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String result = "";
				
				EditText entrada = (EditText) findViewById(R.id.editText1);
				TextView tvresult = (TextView) findViewById(R.id.tvResult);
				
				if(entrada.getText().toString().trim().equals("") || entrada.getText().toString() == null){
					result = "Informe o número acima.";
				}else{
					int valor = Integer.parseInt(entrada.getText().toString()) ;
					
					if(valor % 3 == 0 && valor % 5 == 0){
						result = "FizzBuzz";
					}else if(valor % 3 == 0 ){
						result = "Fizz";
					}else if(valor % 5 == 0 ){
						result = "Buzz";
					}else{
						result = "Não é multiplo de nada";
					}
				}
				tvresult.setText(result);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_fizz_buzz, menu);
        return true;
    }
}
