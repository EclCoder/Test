package com.bytedance.sdk.component.hnj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua<K, V> {
    private final Map<K, V> hnj = new HashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Map<V, Set<K>> f12908hn = new HashMap();

    public void hn(K k10) {
        Set<K> set;
        V vRemove = this.hnj.remove(k10);
        if (vRemove == null || (set = this.f12908hn.get(vRemove)) == null) {
            return;
        }
        set.remove(k10);
        if (set.isEmpty()) {
            this.f12908hn.remove(vRemove);
        }
    }

    public void hnj(Set<K> set, V v10) {
        for (K k10 : set) {
            if (this.hnj.containsKey(k10)) {
                hn(k10);
            }
        }
        Set<K> hashSet = this.f12908hn.get(v10);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f12908hn.put(v10, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.hnj.put(it.next(), v10);
        }
    }

    public V hnj(K k10) {
        return this.hnj.get(k10);
    }

    public void hnj() {
        this.hnj.clear();
        this.f12908hn.clear();
    }
}
