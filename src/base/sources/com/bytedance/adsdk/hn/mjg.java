package com.bytedance.adsdk.hn;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class mjg<K, V> {
    private int aq;
    private int dkl;
    private int dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12017hn;
    private final LinkedHashMap<K, V> hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12018sk;

    private int qor(K k10, V v10) {
        int iHn = hn(k10, v10);
        if (iHn >= 0) {
            return iHn;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    protected int hn(K k10, V v10) {
        return 1;
    }

    public final V hnj(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.hnj.get(k10);
                if (v10 != null) {
                    this.dse++;
                    return v10;
                }
                this.aq++;
                V vHn = hn(k10);
                if (vHn == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f12018sk++;
                        vPut = this.hnj.put(k10, vHn);
                        if (vPut != null) {
                            this.hnj.put(k10, vPut);
                        } else {
                            this.f12017hn += qor(k10, vHn);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                hnj(this.qor);
                return vHn;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.dse;
            i11 = this.aq + i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.qor), Integer.valueOf(this.dse), Integer.valueOf(this.aq), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    protected V hn(K k10) {
        return null;
    }

    public mjg(int i10) {
        if (i10 > 0) {
            this.qor = i10;
            this.hnj = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException(QGbBllacZSmHKn.QpVioIuLnvnWKC);
    }

    public final V hnj(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.gjv++;
                    this.f12017hn += qor(k10, v10);
                    vPut = this.hnj.put(k10, v10);
                    if (vPut != null) {
                        this.f12017hn -= qor(k10, vPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hnj(this.qor);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void hnj(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f12017hn < 0 || (this.hnj.isEmpty() && this.f12017hn != 0)) {
                        break;
                    }
                    if (this.f12017hn > i10 && !this.hnj.isEmpty()) {
                        Map.Entry<K, V> next = this.hnj.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.hnj.remove(key);
                        this.f12017hn -= qor(key, value);
                        this.dkl++;
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
