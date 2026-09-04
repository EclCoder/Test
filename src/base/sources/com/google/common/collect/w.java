package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends u implements r0 {
    protected w() {
    }

    @Override // com.google.common.collect.r0
    public boolean c0(Object obj, int i10, int i11) {
        return k().c0(obj, i10, i11);
    }

    @Override // java.util.Collection, com.google.common.collect.r0
    public boolean equals(Object obj) {
        return obj == this || k().equals(obj);
    }

    @Override // com.google.common.collect.r0
    public int g0(Object obj) {
        return k().g0(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.r0
    public int hashCode() {
        return k().hashCode();
    }

    protected abstract r0 k();

    @Override // com.google.common.collect.r0
    public int q(Object obj, int i10) {
        return k().q(obj, i10);
    }

    @Override // com.google.common.collect.r0
    public int s(Object obj, int i10) {
        return k().s(obj, i10);
    }
}
