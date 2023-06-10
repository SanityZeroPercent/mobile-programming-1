package ovh.gnztmpz.tugasnew2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnDialPhone;
    private Button btnOpenBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDialPhone=(Button)findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
        btnOpenBrowser = (Button)findViewById(R.id.btn_open_browser);
        btnOpenBrowser.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_dial_number:
                String phoneNumber = "081386262241";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_open_browser:
                Intent openBrowserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bsi.ac.id"));
                startActivity(openBrowserIntent);
                break;

        }
    }
}

