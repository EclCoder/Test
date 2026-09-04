package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f30507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30509c;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f30508b = i10;
        this.f30507a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f30509c += b(str, jSONObject);
                JSONObject jSONObjectPut = this.f30507a.put(str, jSONObject);
                if (jSONObjectPut != null) {
                    this.f30509c -= b(str, jSONObjectPut);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(this.f30508b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f30508b));
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f30507a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f30507a.keySet());
        }
        return hashSet;
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f30509c < 0 || (this.f30507a.isEmpty() && this.f30509c != 0)) {
                        break;
                    }
                    if (this.f30509c > i10 && !this.f30507a.isEmpty()) {
                        Map.Entry<String, JSONObject> next = this.f30507a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f30507a.remove(key);
                            this.f30509c -= iB;
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
}
