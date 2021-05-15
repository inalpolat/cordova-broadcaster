package org.bsc.cordova;

import org.apache.cordova.CordovaPlugin;
import android.util.Log;

public class MyJavascriptPlugin extends CordovaPlugin {
  
  void fireEvent(){
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
  
  
      cordova.getThreadPool().execute(new Runnable() {
                  public void run() {
                  Log.e("myTag", "*******************BH300*****************");              
                  webView.loadUrl(method);
                  Log.e("myTag", "*******************BH400*****************");                
                }
            });  
  
}
