package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcz extends zzbdf {
    private final zzbbz zzh;
    private long zzi;

    public zzbcz(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11, zzbbz zzbbzVar) {
        super(zzbbsVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzaxmVar, i10, 53);
        this.zzh = zzbbzVar;
        if (zzbbzVar != null) {
            this.zzi = zzbbzVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
