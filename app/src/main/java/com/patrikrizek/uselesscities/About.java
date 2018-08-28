package com.patrikrizek.uselesscities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
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
