package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmk extends RuntimeException {
    private final int zza;

    public zzmk(int i10, String str, Throwable th2) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2 + str.length());
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i10);
        }
        super(strValueOf, th2);
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }
}
