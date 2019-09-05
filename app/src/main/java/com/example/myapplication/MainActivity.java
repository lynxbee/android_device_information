package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.os.Build;

public class MainActivity extends AppCompatActivity {

	public static String TAG = "DeviceInfo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	String board = Build.BOARD;
	String bootloader = Build.BOOTLOADER;
	String brand = Build.BRAND;
	String device = Build.DEVICE;
	String display = Build.DISPLAY;
	String hardware = Build.HARDWARE;
	String manufacturer = Build.MANUFACTURER;
	String model = Build.MODEL;
	String product = Build.PRODUCT;
	String serial = Build.SERIAL;

	Log.d(TAG, "Board: " + board + " Bootloader: " + bootloader + " Brand: " + brand + " Display: " + display);
	Log.d(TAG, "Hardware: " + hardware + " Manufacturer: " + manufacturer + " Model: " + model + " Product: " + product + " Serial: " + serial);

	// Refer for version codes : https://developer.android.com/reference/android/os/Build.VERSION_CODES.html
	String baseOs = Build.VERSION.BASE_OS;
	String codeName = Build.VERSION.CODENAME;
	String versionRelease = Build.VERSION.RELEASE;
	String sdk = Build.VERSION.SDK;
	int buildVersion = Build.VERSION.SDK_INT;

	Log.d(TAG, "BaseOs: " + baseOs + " CodeName: " + codeName + " Build Release Version: " + versionRelease + " Sdk: " + sdk + " Build SDK Version: " + buildVersion);

	if (buildVersion >= android.os.Build.VERSION_CODES.Q) {
		Log.d(TAG, "Android Version of This device is : Android Q : " + Build.VERSION.SDK_INT);
	} else if (buildVersion >= android.os.Build.VERSION_CODES.P) {
		Log.d(TAG, "Android Version of This device is : Android Pie : " + Build.VERSION.SDK_INT);
	} else {
		Log.d(TAG, "Android Version of This device is : " + Build.VERSION.SDK_INT);
	}

    }
}
