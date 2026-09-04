package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class c extends d implements k0 {
    private static final long serialVersionUID = 6588350623831699109L;

    protected c(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.d
    Collection D(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.d
    Collection E(Object obj, Collection collection) {
        return F(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.o0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.o0
    public Map g() {
        return super.g();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.o0
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }
}
