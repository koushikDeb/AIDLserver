package test.koushik.aidlserver.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import test.koushik.aidlserver.classimplementedaidl.IMyaidlclass;

public class Sereverservice extends Service {
    public Sereverservice() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return  new IMyaidlclass();
    }
}
