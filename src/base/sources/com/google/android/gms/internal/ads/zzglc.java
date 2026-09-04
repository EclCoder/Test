package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzglc extends RuntimeException {
    public zzglc() {
        this(0);
    }

    public zzglc(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 3);
        sb2.append("r: ");
        sb2.append(i10);
        super(sb2.toString());
    }

    public zzglc(int i10, Throwable th2) {
        super("r: 2", th2);
    }
}
