package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzauc {
    private final int zza;
    private final List zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzauc(int i10, List list, int i11, InputStream inputStream) {
        this.zza = i10;
        this.zzb = list;
        this.zzc = i11;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final InputStream zzd() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
