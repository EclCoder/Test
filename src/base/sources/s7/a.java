package s7;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import bm.r;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import com.facebook.internal.y0;
import com.google.zxing.WriterException;
import com.google.zxing.c;
import com.google.zxing.d;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import ue.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51499a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51500b = a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f51501c = new HashMap();

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0798a implements NsdManager.RegistrationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f51502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f51503b;

        C0798a(String str, String str2) {
            this.f51502a = str;
            this.f51503b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            s.h(serviceInfo, "serviceInfo");
            a.a(this.f51503b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            s.h(NsdServiceInfo, "NsdServiceInfo");
            if (s.c(this.f51502a, NsdServiceInfo.getServiceName())) {
                return;
            }
            a.a(this.f51503b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            s.h(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            s.h(serviceInfo, "serviceInfo");
        }
    }

    private a() {
    }

    public static final void a(String str) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            f51499a.b(str);
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    private final void b(String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f51501c.get(str);
            if (registrationListener != null) {
                Object systemService = h0.m().getSystemService("servicediscovery");
                s.f(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    e1.k0(f51500b, e10);
                }
                f51501c.remove(str);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final Bitmap c(String str) {
        if (x7.a.c(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put(c.MARGIN, 2);
            try {
                b bVarA = new d().a(str, com.google.zxing.a.QR_CODE, 200, 200, enumMap);
                int iG = bVarA.g();
                int i10 = bVarA.i();
                int[] iArr = new int[iG * i10];
                for (int i11 = 0; i11 < iG; i11++) {
                    int i12 = i11 * i10;
                    for (int i13 = 0; i13 < i10; i13++) {
                        iArr[i12 + i13] = bVarA.f(i13, i11) ? -16777216 : -1;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, iG, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, i10, 0, 0, i10, iG);
                    return bitmapCreateBitmap;
                } catch (WriterException unused) {
                    return bitmapCreateBitmap;
                }
            } catch (WriterException unused2) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return null;
        }
    }

    public static final String d(Map map) {
        if (x7.a.c(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th2) {
                x7.a.b(th2, a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        s.g(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        s.g(MODEL, "MODEL");
        map.put("model", MODEL);
        String string = new JSONObject(map).toString();
        s.g(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    public static final boolean e() {
        if (x7.a.c(a.class)) {
            return false;
        }
        try {
            w wVarF = a0.f(h0.n());
            return wVarF != null && wVarF.x().contains(y0.Enabled);
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (x7.a.c(a.class)) {
            return false;
        }
        try {
            if (e()) {
                return f51499a.g(str);
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return false;
        }
    }

    private final boolean g(String str) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            HashMap map = f51501c;
            if (map.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + ("android-" + r.H(h0.F(), '.', '|', false, 4, null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = h0.m().getSystemService("servicediscovery");
            s.f(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            C0798a c0798a = new C0798a(str2, str);
            map.put(str, c0798a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0798a);
            return true;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }
}
