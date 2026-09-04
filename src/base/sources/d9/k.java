package d9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f36478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f36479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f36480c;

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // d9.e
    public synchronized m get(String str) {
        if (this.f36480c.containsKey(str)) {
            return (m) this.f36480c.get(str);
        }
        d dVarB = this.f36478a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f36479b.a(str));
        this.f36480c.put(str, mVarCreate);
        return mVarCreate;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f36481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f36482b = null;

        a(Context context) {
            this.f36481a = context;
        }

        private Map c() {
            if (this.f36482b == null) {
                this.f36482b = a(this.f36481a);
            }
            return this.f36482b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }

        private Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w(qnwOeeQSSWa.aGSGEtJQhHARPdv, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }
    }

    k(a aVar, i iVar) {
        this.f36480c = new HashMap();
        this.f36478a = aVar;
        this.f36479b = iVar;
    }
}
