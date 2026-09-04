package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsr implements zzrt {
    private boolean zza = false;

    static {
        new AtomicInteger();
    }

    private zzsr() {
    }

    public static zzsr zzb() {
        return new zzsr();
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs zzrsVar) throws IOException {
        if (this.zza) {
            if (zzrsVar.zze()) {
                throw new zzsk("Short circuit would skip transforms.");
            }
            return zzrsVar.zza().zzg(zzrsVar.zzb());
        }
        zzsj zzsjVarZza = zzsj.zza(zzst.zzc(zzrsVar));
        try {
            if (!(zzsjVarZza.zzb() instanceof zzsf)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((zzsf) zzsjVarZza.zzb()).zza();
            zzsjVarZza.close();
            return fileZza;
        } catch (Throwable th2) {
            try {
                zzsjVarZza.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final zzsr zzc() {
        this.zza = true;
        return this;
    }
}
