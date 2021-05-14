package org.bsc.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

public class MyReceiver extends BroadcastReceiver {	
	@Override
	public void onReceive(Context context, Intent intent) {
                 //LocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);

		final Intent sintent = new Intent("didShow");

		final Bundle child = new Bundle();
		child.putString( "name", "joker");

		final Bundle b = new Bundle();
		b.putString( "data", "test");
		b.putBoolean( "valid", true );
		b.putBundle( "child", child );

		sintent.putExtras( b);

		LocalBroadcastManager.getInstance(this).sendBroadcast(sintent);		
		
		
	}
}
