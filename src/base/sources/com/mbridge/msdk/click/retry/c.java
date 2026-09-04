package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f28503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28505c;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f28504b = i10;
        this.f28503a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVar = this.f28503a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f28504b));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVarRemove = this.f28503a.remove(str);
                if (bVarRemove != null) {
                    this.f28505c -= b(str, bVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f28505c += b(str, bVar);
                    b bVarPut = this.f28503a.put(str, bVar);
                    if (bVarPut != null) {
                        this.f28505c -= b(str, bVarPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(this.f28504b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f28505c < 0 || (this.f28503a.isEmpty() && this.f28505c != 0)) {
                        break;
                    }
                    if (this.f28505c > i10 && !this.f28503a.isEmpty()) {
                        Map.Entry<String, b> next = this.f28503a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f28503a.remove(key);
                            this.f28505c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f28503a.keySet());
        }
        return hashSet;
    }
}
