package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdo {
    private final zzdk zza;

    private zzdo(zzdk zzdkVar) {
        int i10 = zzdg.zzb;
        this.zza = zzdkVar;
    }

    public static zzdo zza(char c10) {
        return new zzdo(new zzdk(new zzde(',')));
    }

    static /* bridge */ /* synthetic */ Iterator zzc(zzdo zzdoVar, CharSequence charSequence) {
        return new zzdl(zzdoVar, charSequence, zzdoVar.zza.zza);
    }

    public final Iterable zzb(CharSequence charSequence) {
        return new zzdm(this, charSequence);
    }
}
