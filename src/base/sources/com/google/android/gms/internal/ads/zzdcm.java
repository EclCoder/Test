package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdcm {
    public static final zzcdn zza(Context context, VersionInfoParcel versionInfoParcel, zzfkf zzfkfVar, zzcdj zzcdjVar) {
        zzcdk zzcdkVar = zzfkfVar.zzA;
        if (zzcdkVar == null) {
            return null;
        }
        zzfkk zzfkkVar = zzfkfVar.zzs;
        return new zzcdi(context, versionInfoParcel, zzcdkVar, zzfkkVar != null ? zzfkkVar.zzb : null, zzcdjVar);
    }
}
