package com.google.android.gms.internal.ads;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxp {
    public static zzfyu zza(Context context, int i10, zzbds zzbdsVar, String str, String str2, String str3, zzfxg zzfxgVar) {
        return new zzfxo(context, 1, zzbdsVar, str, str2, "1", zzfxgVar).zza(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);
    }
}
