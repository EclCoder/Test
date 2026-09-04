package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdl {
    private final OutputStream zza;

    private zzhdl(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhdl zzb(OutputStream outputStream) {
        return new zzhdl(outputStream);
    }

    public final void zza(zzhsz zzhszVar) throws IOException {
        try {
            zzhszVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
