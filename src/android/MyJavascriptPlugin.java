package org.bsc.cordova;

import org.apache.cordova.CordovaPlugin;
import android.util.Log;

public class MyJavascriptPlugin extends CordovaPlugin {
  
  void fireEvent(){
    Log.e("myTag", "*******************BH999*****************");
    Log.e("myTag", "*******************BH8888*****************");
    
    String method = "javascript:window.broadcaster.fireEvent( 'baris', '123' );";
    
    webView.loadUrl(method);
  }
  
}
