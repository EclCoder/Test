package com.bytedance.sdk.component.sk.hn.qor.hnj;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor<K, V> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12967hn;
    private final LinkedHashMap<K, SoftReference<V>> hnj = new LinkedHashMap<>(0, 0.75f, true);

    public qor(int i10) {
        this.f12967hn = i10;
    }

    public synchronized V hnj(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.f12967hn <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.hnj.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.hnj.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.f12967hn), Integer.valueOf(this.hnj.size()));
    }

    public synchronized void hnj(K k10, V v10) {
        if (this.f12967hn <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.hnj.put(k10, new SoftReference<>(v10));
        int size = this.hnj.size();
        int i10 = this.f12967hn;
        if (size > i10) {
            hnj((int) (((double) i10) * 0.7d));
        }
    }

    public synchronized void hnj(int i10) {
        int size = this.hnj.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.hnj.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.hnj.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
