package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzahz implements zzahq {
    public final String zza;

    private zzahz(String str) {
        this.zza = str;
    }

    public static zzahz zzb(zzet zzetVar) {
        return new zzahz(zzetVar.zzK(zzetVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final int zza() {
        return 1852994675;
    }
}
