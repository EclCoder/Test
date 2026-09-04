package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziu extends IllegalStateException {
    public zziu(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21 + String.valueOf(i11).length() + 1);
        sb2.append("Buffer too small (");
        sb2.append(i10);
        sb2.append(" < ");
        sb2.append(i11);
        sb2.append(")");
        super(sb2.toString());
    }
}
