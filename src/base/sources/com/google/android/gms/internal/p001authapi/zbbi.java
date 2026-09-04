package com.google.android.gms.internal.p001authapi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zbbi extends zbbj {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbbj zbc;

    zbbi(zbbj zbbjVar, int i10, int i11) {
        Objects.requireNonNull(zbbjVar);
        this.zbc = zbbjVar;
        this.zba = i10;
        this.zbb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zbbd.zba(i10, this.zbb, "index");
        return this.zbc.get(i10 + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbj, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final Object[] zbb() {
        return this.zbc.zbb();
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final int zbd() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbg
    final boolean zbf() {
        return true;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbbj
    /* JADX INFO: renamed from: zbh */
    public final zbbj subList(int i10, int i11) {
        zbbd.zbc(i10, i11, this.zbb);
        int i12 = this.zba;
        return this.zbc.subList(i10 + i12, i11 + i12);
    }
}
