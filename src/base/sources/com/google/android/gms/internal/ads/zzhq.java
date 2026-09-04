package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzhq extends IOException {
    public final int zza;

    public zzhq(int i10) {
        this.zza = i10;
    }

    public zzhq(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzhq(String str, Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzhq(Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
