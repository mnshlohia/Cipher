package com.example.maddy.ciphertrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.logging.Logger;

public class Main2Activity extends AppCompatActivity {
    String encryptedStr;
    String decryptedStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MainActivity mainActivity= null;
        try {
            mainActivity = new MainActivity();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String dummyStr = "manish";

        // Encrypting our dummy String
        try {
            encryptedStr= MainActivity.byteArrayToHexString(mainActivity.encrypt(dummyStr));
            Log.v("Encrypted",encryptedStr);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
           decryptedStr = new String(mainActivity.decrypt(encryptedStr));
            Log.v("Decrypted",decryptedStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
