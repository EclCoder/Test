package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzals implements zzahf {
    public static final zzals zza = new zzals(true);
    public static final zzals zzb = new zzals(false);
    public final boolean zzc;

    private zzals(boolean z10) {
        this.zzc = z10;
    }

    public final String toString() {
        boolean z10 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
