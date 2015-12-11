package test.medamine.lenovo_g510.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lenovo-G510 on 25-11-2015.
 */
public class Website extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.website);
        Intent i=getIntent();
        String site=i.getStringExtra("site");
        WebView wb = (WebView) findViewById(R.id.webView);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl(site);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            Intent choix = new Intent(this, Websites.class);
            startActivity(choix);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    };
}
