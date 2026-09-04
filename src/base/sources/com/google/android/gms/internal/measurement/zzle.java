package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzle {
    private final u zza;

    zzle(u uVar) {
        this.zza = uVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        u uVar = uri != null ? (u) this.zza.get(uri.toString()) : null;
        if (uVar == null) {
            return null;
        }
        return (String) uVar.get(str3);
    }
}
