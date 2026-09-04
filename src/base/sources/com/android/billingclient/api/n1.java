package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class n1 {
    static synchronized double a(final Context context) {
        return ((Double) e(new m1(context) { // from class: com.android.billingclient.api.l1
            @Override // com.android.billingclient.api.m1
            public final Object zza() {
                return Double.valueOf(2.0d);
            }
        }, Double.valueOf(2.0d))).doubleValue();
    }

    static synchronized long b(final Context context) {
        return ((Long) e(new m1(context) { // from class: com.android.billingclient.api.k1
            @Override // com.android.billingclient.api.m1
            public final Object zza() {
                return 3L;
            }
        }, 3L)).longValue();
    }

    static synchronized long c(final Context context) {
        return ((Long) e(new m1(context) { // from class: com.android.billingclient.api.i1
            @Override // com.android.billingclient.api.m1
            public final Object zza() {
                return 100L;
            }
        }, 100L)).longValue();
    }

    static synchronized long d(final Context context) {
        return ((Long) e(new m1(context) { // from class: com.android.billingclient.api.j1
            @Override // com.android.billingclient.api.m1
            public final Object zza() {
                return Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            }
        }, Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS))).longValue();
    }

    private static Object e(m1 m1Var, Object obj) {
        try {
            return m1Var.zza();
        } catch (Exception e10) {
            zzc.zzn("RuntimeFlags", "Fail to get the runtime flags: ".concat(e10.toString()));
            return obj;
        }
    }
}
