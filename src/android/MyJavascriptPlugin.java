package org.bsc.cordova;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import android.util.Log;

public class MyJavascriptPlugin extends CordovaPlugin {
  
  
  private CordovaWebView myWebView;
  
public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
  
    myWebView = webView;
    Log.e("myTag", "*******************BH444*****************");
    // your init code here
}
  
  
  public void fireEvent(){
    Log.e("myTag", "*******************BH100*****************");
    Log.e("myTag", "*******************BH200*****************");
    
    String method = "javascript:window.broadcaster.fireEvent( 'baris', '123' );";
    
    //webView.loadUrl(method);
//    cordova.getActivity().runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                Log.e("myTag", "*******************BH300*****************");              
//                webView.loadUrl(method);
//                Log.e("myTag", "*******************BH400*****************");                
//            }
//        });    
//  }
  
  
                Log.e("myTag", "*******************BH300*****************");              
                myWebView.loadUrl(method);
                Log.e("myTag", "*******************BH400*****************");                
           
    
  }
}
