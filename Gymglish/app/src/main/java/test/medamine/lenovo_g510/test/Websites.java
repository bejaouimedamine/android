package test.medamine.lenovo_g510.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Lenovo-G510 on 25-11-2015.
 */
public class Websites extends ActionBarActivity {
    ListView myliste;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.websites);
        String[] sites= new String[]{"http://www.gymglish.com","http://www.frantastique.com","http://www.vatefaireconjuguer.com"};
        myliste = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Websites.this,android.R.layout.simple_list_item_1,sites);
        myliste.setAdapter(adapter);
       myliste.setOnItemClickListener(
               new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       String Url = String.valueOf(parent.getItemAtPosition(position));
                       Intent intent = new Intent(Websites.this, Website.class);
                       intent.putExtra("site", Url);
                       startActivity(intent);
                   }
               }
       );

    }


    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent choix = new Intent(Websites.this, Login.class);
            startActivity(choix);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    };
}
