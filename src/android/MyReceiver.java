package org.bsc.cordova;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.String.format;
import static java.lang.String.valueOf;


public class MyReceiver extends BroadcastReceiver {	
	@Override
	public void onReceive(Context context, Intent intent) {
                 LocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);
	}
}
