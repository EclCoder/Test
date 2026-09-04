package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgav extends zzidy implements zzifq {
    private zzgav() {
        throw null;
    }

    public final zzgav zza(String str) {
        str.getClass();
        zzbg();
        ((zzgax) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzgax) this.zza).zzb());
    }

    public final zzgav zzc(String str, zzgat zzgatVar) {
        str.getClass();
        zzgatVar.getClass();
        zzbg();
        ((zzgax) this.zza).zze().put(str, zzgatVar);
        return this;
    }

    /* synthetic */ zzgav(byte[] bArr) {
        super(zzgax.zzb);
    }
}
