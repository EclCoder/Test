package com.google.android.gms.internal.p001authapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zbbk extends zbbj {
    static final zbbj zba = new zbbk(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    zbbk(Object[] objArr, int i10) {
        this.zbb = objArr;
        this.zbc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zbbd.zba(i10, this.zbc, "index");
        Object obj = this.zbb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final Object[] zbb() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final int zbd() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final boolean zbf() {
        return false;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbj, com.google.android.gms.internal.p001authapi.zbbg
    final int zbg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zbb;
        int i11 = this.zbc;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }
}
