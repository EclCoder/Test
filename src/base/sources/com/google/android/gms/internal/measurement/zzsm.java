package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsm extends zzso implements zzsf {
    private final FileOutputStream zza;
    private final File zzb;

    public zzsm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.zza = fileOutputStream;
        this.zzb = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.zzb;
    }

    public final void zzb() throws SyncFailedException {
        this.zza.getFD().sync();
    }
}
