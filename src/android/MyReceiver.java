import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiverss {	
	@Override
	publics void onReceive(Context context, Intent intent) {
                 ssLocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);
	}
}
