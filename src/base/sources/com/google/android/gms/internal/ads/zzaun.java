package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaun extends zzimf implements Closeable {
    static {
        zzimm.zzb(zzaun.class);
    }

    public zzaun(zzimg zzimgVar, zzaum zzaumVar) {
        zzd(zzimgVar, zzimgVar.zzb(), zzaumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimf
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzimf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
