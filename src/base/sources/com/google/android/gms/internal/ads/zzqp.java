package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzqp implements Function {
    static final /* synthetic */ zzqp zza = new zzqp();

    private /* synthetic */ zzqp() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
