package p7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.internal.p;
import gl.r;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import n7.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f49566a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f49567b = e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f49568c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49572a;

        a(String str) {
            this.f49572a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f49572a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f49573a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IBinder f49574b;

        public final IBinder a() throws InterruptedException {
            this.f49573a.await(5L, TimeUnit.SECONDS);
            return this.f49574b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            s.h(name, "name");
            this.f49573a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            s.h(name, "name");
            s.h(serviceBinder, "serviceBinder");
            this.f49574b = serviceBinder;
            this.f49573a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            s.h(name, "name");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && p.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage(FbValidationUtils.DEBUG_FB_PACKAGE);
                if (packageManager.resolveService(intent2, 0) != null && p.a(context, FbValidationUtils.DEBUG_FB_PACKAGE)) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final boolean b() {
        if (x7.a.c(e.class)) {
            return false;
        }
        try {
            if (f49568c == null) {
                f49568c = Boolean.valueOf(f49566a.a(h0.m()) != null);
            }
            Boolean bool = f49568c;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return false;
        }
    }

    public static final c c(String applicationId, List appEvents) {
        if (x7.a.c(e.class)) {
            return null;
        }
        try {
            s.h(applicationId, "applicationId");
            s.h(appEvents, "appEvents");
            return f49566a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return null;
        }
    }

    private final c d(a aVar, String str, List list) {
        c cVar;
        String str2;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            h.b();
            Context contextM = h0.m();
            Intent intentA = a(contextM);
            if (intentA == null) {
                return cVar2;
            }
            b bVar = new b();
            try {
                if (!contextM.bindService(intentA, bVar, 1)) {
                    return c.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderA = bVar.a();
                    if (iBinderA != null) {
                        c8.a aVarB = c8.a.AbstractBinderC0128a.B(iBinderA);
                        Bundle bundleA = d.a(aVar, str, list);
                        if (bundleA != null) {
                            aVarB.b(bundleA);
                            e1.l0(f49567b, "Successfully sent events to the remote service: " + bundleA);
                        }
                        cVar2 = c.OPERATION_SUCCESS;
                    }
                    contextM.unbindService(bVar);
                    e1.l0(f49567b, "Unbound from the remote service");
                    return cVar2;
                } catch (RemoteException e10) {
                    cVar = c.SERVICE_ERROR;
                    str2 = f49567b;
                    e1.k0(str2, e10);
                    contextM.unbindService(bVar);
                    e1.l0(str2, "Unbound from the remote service");
                    return cVar;
                } catch (InterruptedException e11) {
                    cVar = c.SERVICE_ERROR;
                    str2 = f49567b;
                    e1.k0(str2, e11);
                    contextM.unbindService(bVar);
                    e1.l0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } catch (Throwable th2) {
                contextM.unbindService(bVar);
                e1.l0(f49567b, "Unbound from the remote service");
                throw th2;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
            return null;
        }
    }

    public static final c e(String applicationId) {
        if (x7.a.c(e.class)) {
            return null;
        }
        try {
            s.h(applicationId, "applicationId");
            return f49566a.d(a.MOBILE_APP_INSTALL, applicationId, r.l());
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return null;
        }
    }
}
