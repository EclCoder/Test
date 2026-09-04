package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgsx implements zzgtk {
    protected zzgsx() {
    }

    public static zzgsx zzc(char c10) {
        return new zzgsu(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
