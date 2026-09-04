package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzavw implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzavw zzb = new zzavw(1);
    static final /* synthetic */ zzavw zza = new zzavw(0);

    private /* synthetic */ zzavw(int i10) {
        this.zzc = i10;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzawm.zza(null) : new zzavz();
    }
}
