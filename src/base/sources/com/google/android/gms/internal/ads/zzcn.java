package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcn extends Exception {
    public zzcn(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb2.append(str);
        sb2.append(" ");
        sb2.append(strValueOf);
        super(sb2.toString());
    }
}
