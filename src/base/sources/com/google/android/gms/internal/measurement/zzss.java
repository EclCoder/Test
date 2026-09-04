package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzss implements zzrt {
    private final zzafj zza;
    private final zzadf zzb = zzadf.zza();

    private zzss(zzafj zzafjVar) {
        this.zza = zzafjVar;
    }

    public static zzss zzb(zzafc zzafcVar) {
        return new zzss(zzafcVar.zzcj());
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs zzrsVar) throws IOException {
        InputStream inputStreamZzc = zzst.zzc(zzrsVar);
        try {
            zzafc zzafcVar = (zzafc) this.zza.zza(inputStreamZzc, this.zzb);
            if (inputStreamZzc != null) {
                inputStreamZzc.close();
            }
            return zzafcVar;
        } catch (Throwable th2) {
            if (inputStreamZzc != null) {
                try {
                    inputStreamZzc.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
