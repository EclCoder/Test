package com.google.android.gms.internal.measurement;

import com.google.common.collect.i0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzse implements zzro {
    private OutputStream zza;
    private zzsm zzb;

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void zza(List list) {
        OutputStream outputStream = (OutputStream) i0.d(list);
        if (outputStream instanceof zzsm) {
            this.zzb = (zzsm) outputStream;
            this.zza = (OutputStream) list.get(0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void zzb() throws IOException {
        zzc();
    }

    public final void zzc() throws IOException {
        if (this.zzb == null) {
            throw new zzsk("Cannot sync underlying stream");
        }
        this.zza.flush();
        this.zzb.zzb();
    }
}
