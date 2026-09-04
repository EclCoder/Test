package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.collect.c0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsb {
    private final Uri.Builder zza = new Uri.Builder().scheme("file").authority("").path("/");
    private final c0.a zzb = c0.r();

    private zzsb() {
    }

    public final zzsb zza(File file) {
        this.zza.path(file.getAbsolutePath());
        return this;
    }

    public final Uri zzb() {
        return this.zza.encodedFragment(zzsp.zzb(this.zzb.m())).build();
    }

    /* synthetic */ zzsb(byte[] bArr) {
    }
}
