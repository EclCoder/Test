package androidx.collection;

import fl.g0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class n {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final s.b lock;
    private final s.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public n(int i10) {
        this.maxSize = i10;
        if (!(i10 > 0)) {
            s.d.a("maxSize <= 0");
        }
        this.map = new s.c(0, 0.75f);
        this.lock = new s.b();
    }

    private final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (!(iSizeOf >= 0)) {
            s.d.b("Negative size: " + obj + '=' + obj2);
        }
        return iSizeOf;
    }

    protected Object create(Object key) {
        kotlin.jvm.internal.s.h(key, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    protected void entryRemoved(boolean z10, Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    public final Object get(Object key) {
        Object objD;
        kotlin.jvm.internal.s.h(key, "key");
        synchronized (this.lock) {
            Object objA = this.map.a(key);
            if (objA != null) {
                this.hitCount++;
                return objA;
            }
            this.missCount++;
            Object objCreate = create(key);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objD = this.map.d(key, objCreate);
                    if (objD != null) {
                        this.map.d(key, objD);
                    } else {
                        this.size += a(key, objCreate);
                        g0 g0Var = g0.f38750a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objD != null) {
                entryRemoved(false, key, objCreate, objD);
                return objD;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final Object put(Object key, Object value) {
        Object objD;
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(key, value);
                objD = this.map.d(key, value);
                if (objD != null) {
                    this.size -= a(key, objD);
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objD != null) {
            entryRemoved(false, key, objD, value);
        }
        trimToSize(this.maxSize);
        return objD;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final Object remove(Object key) {
        Object objE;
        kotlin.jvm.internal.s.h(key, "key");
        synchronized (this.lock) {
            try {
                objE = this.map.e(key);
                if (objE != null) {
                    this.size -= a(key, objE);
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objE != null) {
            entryRemoved(false, key, objE, null);
        }
        return objE;
    }

    public void resize(int i10) {
        if (!(i10 > 0)) {
            s.d.a("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i10;
            g0 g0Var = g0.f38750a;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    protected int sizeOf(Object key, Object value) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            for (Map.Entry entry : this.map.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void trimToSize(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.c() || this.size == 0))) {
                        s.d.b("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= i10 || this.map.c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) gl.r.c0(this.map.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.e(key);
                    this.size -= a(key, value);
                    this.evictionCount++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
