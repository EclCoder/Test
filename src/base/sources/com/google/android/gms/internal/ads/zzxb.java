package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxb {
    private static final AtomicLong zza = new AtomicLong();

    public zzxb(long j10, zzht zzhtVar, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
