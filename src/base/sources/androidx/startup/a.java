package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r4.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f7250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f7251e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f7254c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f7253b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f7252a = new HashMap();

    a(Context context) {
        this.f7254c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objCreate;
        if (s4.a.d()) {
            try {
                s4.a.a(cls.getSimpleName());
            } catch (Throwable th2) {
                s4.a.b();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f7252a.containsKey(cls)) {
            objCreate = this.f7252a.get(cls);
        } else {
            set.add(cls);
            try {
                r4.a aVar = (r4.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = aVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f7252a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = aVar.create(this.f7254c);
                set.remove(cls);
                this.f7252a.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        s4.a.b();
        return objCreate;
    }

    public static a e(Context context) {
        if (f7250d == null) {
            synchronized (f7251e) {
                try {
                    if (f7250d == null) {
                        f7250d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7250d;
    }

    void a(Bundle bundle) {
        String string = this.f7254c.getString(b.f51080a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (r4.a.class.isAssignableFrom(cls)) {
                            this.f7253b.add(cls);
                        }
                    }
                }
                Iterator it = this.f7253b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    void b(Class cls) {
        try {
            try {
                s4.a.a("Startup");
                a(this.f7254c.getPackageManager().getProviderInfo(new ComponentName(this.f7254c, (Class<?>) cls), 128).metaData);
                s4.a.b();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } catch (Throwable th2) {
            s4.a.b();
            throw th2;
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f7251e) {
            try {
                objD = this.f7252a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f7253b.contains(cls);
    }
}
