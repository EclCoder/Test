package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsc extends Exception {
    public zzsc(long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        sb2.append("Unexpected audio track timestamp discontinuity: expected ");
        sb2.append(j11);
        sb2.append(", got ");
        sb2.append(j10);
        super(sb2.toString());
    }
}
