package test.koushik.aidlserver.classimplementedaidl;

import android.os.RemoteException;

import AIDLplace.IMyAidlInterface;

public class IMyaidlclass extends IMyAidlInterface.Stub {
    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

    }

    @Override
    public String interprocess(String processname, String value) throws RemoteException {





        return "called from "+processname+" input: "+value;
    }
}
