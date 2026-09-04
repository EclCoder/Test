package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class b0 extends e implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f21667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f21668b;

    b0(Object obj, Object obj2) {
        this.f21667a = obj;
        this.f21668b = obj2;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final Object getKey() {
        return this.f21667a;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final Object getValue() {
        return this.f21668b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
