package test.koushik.aidlserver.Connection;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.Toast;

public class Serverconnectionclass implements ServiceConnection {

    Context con;

public Serverconnectionclass(Context con)
{
this.con=con;
}



    @Override
    public void onServiceConnected(ComponentName componentName , IBinder iBinder) {
        Toast.makeText(con,componentName.getClassName()+" connected",Toast.LENGTH_LONG).show();



    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {
        Toast.makeText(con,componentName.getClassName()+" disconnect",Toast.LENGTH_LONG).show();
    }
}
