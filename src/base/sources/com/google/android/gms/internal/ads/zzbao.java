package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbao extends zzban {
    private zzbao(Context context, zzbam zzbamVar) {
        super(context, zzbamVar);
    }

    public static zzbao zzt(Context context, zzawo zzawoVar) {
        zzbam zzbamVar = new zzbam(zzawoVar);
        zzban.zzo(context, zzbamVar);
        return new zzbao(context, zzbamVar);
    }
}
