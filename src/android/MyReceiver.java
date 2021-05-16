package org.bsc.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.content.LocalBroadcastManager;

public class MyReceiver extends BroadcastReceiver {	
	@Override
	public void onReceive(Context context, Intent intent) {
		
		Log.e("myTag", "*******************BH1*****************");
		Log.e("myTag", "*******************BH2*****************");

		if(intent.getAction() != null && intent.getAction().equals("token.intent.ACTION_POWERCUT_RESULT")){
			 //LocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);

			Log.e("myTag", "*******************BH3*****************");
			Log.e("myTag", "*******************BH4*****************");
			 			 
			Intent sintent = new Intent("DENEME");
			//final Bundle child = new Bundle();
			//child.putString( "name", "joker");
			//final Bundle b = new Bundle();
			//b.putString( "data", "test");
			//b.putBoolean( "valid", true );
			//b.putBundle( "child", child );
			//sintent.putExtras( b);
			LocalBroadcastManager.getInstance(context).sendBroadcast(sintent);		
			 
			//Log.e("myTag", sintent.getAction());
			Log.e("myTag", intent.getStringExtra("paymentBody"));
			 
			//String method = null;			 
			//method = "javascript:window.broadcaster.fireEvent( 'baris', '123' );"; 
			
			//MyJavascriptPlugin  dd =new MyJavascriptPlugin();
			//dd.fireEvent(); 
			 
			//CDVBroadcaster cc=new CDVBroadcaster();
			 
			//cc.this.webView.loadUrl(method);
			 
			//Context context=this.cordova.getActivity().getApplicationContext();
			Intent myIntent=new Intent(context, com.bizimhesap.mobile.MainActivity.class);
			myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			myIntent.putExtra("paymentBody",intent.getStringExtra("paymentBody"));
			context.startActivity(myIntent);
			
			Log.e("myTag", "*******************BH7*****************");
			Log.e("myTag", "*******************BH8*****************");
			 
		 }
		
	}
}
