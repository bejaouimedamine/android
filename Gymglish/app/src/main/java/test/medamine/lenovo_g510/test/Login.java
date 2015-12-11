package test.medamine.lenovo_g510.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Lenovo-G510 on 25-11-2015.
 */
public class Login extends Activity{
    Button button;
    EditText editText,editText2;
    String login,password;
    Boolean checked=false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(listener8);
    }

    View.OnClickListener listener8 = new View.OnClickListener() {
        public void onClick(View v) {
            checked=check();

            if(checked) {
                Intent i = new Intent(Login.this, Websites.class);
                startActivity(i);
            }
            else{
                runOnUiThread(new Runnable() {
                    public void run() {
                        Toast.makeText(Login.this, "Wrong login", Toast.LENGTH_LONG).show();
                    }
                });
            }
        }
    };

    private Boolean check(){
        login=editText.getText().toString();
        password=editText2.getText().toString();
        if(login.equals("root")&& password.equals("root"))
            return true;
        else
            return false;
    }
}
