package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtq extends zzgtw {
    final /* synthetic */ zzgsy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtq(zzgty zzgtyVar, CharSequence charSequence, zzgsy zzgsyVar) {
        super(zzgtyVar, charSequence);
        this.zza = zzgsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzc(int i10) {
        Matcher matcher = ((zzgtb) this.zza).zza;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzd(int i10) {
        return ((zzgtb) this.zza).zza.end();
    }
}
