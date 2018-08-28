package com.patrikrizek.uselesscities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * When user click on this button the method open the link to about section.
         */
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
    }


    /**
     * When user click on this button the method open the link to personal music cloud.
     */
    public void music(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://soundcloud.com/useless-cities"));
        startActivity(browserIntent);
    }

    /**
     * When user click on this button the method open the link to personal website account.
     */
    public void website(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uselesscities.co.uk"));
        startActivity(browserIntent);
    }

    /**
     * When user click on this button the method open email provider and fill up the form of email.
     */
    public void getInTouch(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:info@uselesscities.co.uk")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, new String(getString(R.string.button_getintouch)));
        intent.putExtra(Intent.EXTRA_TEXT, createEmailContent());
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Create email subject and a content of the email.
     */
    private String createEmailContent() {
        String emailMessage = "Dear Useless Cities,";
        emailMessage += "\n";
        emailMessage += "\n I am texting you through your mobile app.";
        emailMessage += "\n";
        emailMessage += "\n";
        emailMessage += "\n Best regards";
        return emailMessage;
    }

    /**
     * When user click on this icon the method open the link to personal facebook account.
     */
    public void social_media_facebook(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/UselessCities"));
        startActivity(browserIntent);
    }

    /**
     * When user click on this icon the method open the link to personal twitter account.
     */
    public void social_media_twitter(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/UselessCities"));
        startActivity(browserIntent);
    }

    /**
     * When user click on this icon the method open the link to personal instagram account.
     */
    public void social_media_instagram(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/UselessCitiesBand"));
        startActivity(browserIntent);
    }

    /**
     * When user click on this icon the method open the link to personal youtube account.
     */
    public void social_media_youtube(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCbaH3L6rdt93PjL1QwCvEgA"));
        startActivity(browserIntent);
    }

    /**
     * When user click on the text than the method open the link to the website of Mobile App Developer (Patrik Krizek).
     */
    public void mobileAppDeveloper(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.patrikrizek.com"));
        startActivity(browserIntent);
    }

}