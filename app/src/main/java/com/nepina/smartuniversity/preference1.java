package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.PersistableBundle;
import android.preference.PreferenceActivity;

import android.os.Bundle;

public class preference1 extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }


}