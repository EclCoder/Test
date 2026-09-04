package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsl extends zzsn implements zzsf {
    private final FileInputStream zza;
    private final File zzb;

    private zzsl(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.zza = fileInputStream;
        this.zzb = file;
    }

    public static zzsl zzb(File file) {
        return new zzsl(new FileInputStream(file), file);
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.zzb;
    }
}
