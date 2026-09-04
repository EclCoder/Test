package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgzs extends zzgzj {
    private final File zza;

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 20);
        sb2.append("Files.asByteSource(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final /* bridge */ /* synthetic */ InputStream zza() {
        return new FileInputStream(this.zza);
    }
}
