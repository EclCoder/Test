package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f30841b;

        b(String str, boolean z10) {
            this.f30840a = str;
            this.f30841b = z10;
        }

        public String a() {
            return this.f30840a;
        }

        public boolean b() {
            return this.f30841b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f30846a;

        public d(IBinder iBinder) {
            this.f30846a = iBinder;
        }

        public boolean a(boolean z10) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f30846a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z11 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z11;
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    return false;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f30846a;
        }

        public String getId() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f30846a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC0403c serviceConnectionC0403c = new ServiceConnectionC0403c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC0403c, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(serviceConnectionC0403c.a());
                b bVar = new b(dVar.getId(), dVar.a(true));
                context.unbindService(serviceConnectionC0403c);
                return bVar;
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            context.unbindService(serviceConnectionC0403c);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class ServiceConnectionC0403c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f30843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f30844b;

        private ServiceConnectionC0403c() {
            this.f30843a = new LinkedBlockingQueue<>(1);
            this.f30844b = false;
        }

        public IBinder a() {
            if (this.f30844b) {
                throw new IllegalStateException();
            }
            this.f30844b = true;
            return this.f30843a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f30843a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
