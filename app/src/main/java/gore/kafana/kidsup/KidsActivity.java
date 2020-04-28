package gore.kafana.kidsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);

        //getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        //getActionBar().hide();

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://openuzmez.com/KidsUp/index.php");
    }
    public void onBackPressed(){
        Intent homeIntent = new Intent(KidsActivity.this, passKeyActivity.class);
        startActivity(homeIntent);

    }

}
