package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsa extends Exception {
    public final boolean zza;

    public zzsa(int i10, int i11, int i12, int i13, int i14, zzv zzvVar, boolean z10, Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i11).length();
        int length2 = String.valueOf(i12).length();
        int length3 = String.valueOf(i13).length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i14).length() + 2 + strValueOf.length());
        sb2.append("AudioTrack init failed 0 Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append(") ");
        sb2.append(strValueOf);
        sb2.append("");
        super(sb2.toString(), exc);
        this.zza = false;
    }
}
