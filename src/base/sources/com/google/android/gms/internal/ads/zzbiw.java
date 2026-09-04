package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class zzbiw {
    public static final void zza(zzbiv zzbivVar, zzbit zzbitVar) {
        if (zzbitVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbitVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbivVar.zza(zzbitVar.zzb(), zzbitVar.zzc(), zzbitVar.zza(), zzbitVar.zzd());
    }
}
