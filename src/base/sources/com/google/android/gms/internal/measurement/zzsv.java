package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsv implements zzrt {
    private final zzafc zza;
    private zzro[] zzb;

    private zzsv(zzafc zzafcVar) {
        this.zza = zzafcVar;
    }

    public static zzsv zzb(zzafc zzafcVar) {
        return new zzsv(zzafcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs zzrsVar) throws IOException {
        Uri uriZza = zzsu.zza(zzrsVar.zzb());
        List listZzd = zzrsVar.zzd(zzrsVar.zza().zzj(uriZza));
        zzro[] zzroVarArr = this.zzb;
        if (zzroVarArr != null) {
            zzroVarArr[0].zza(listZzd);
        }
        try {
            OutputStream outputStream = (OutputStream) listZzd.get(0);
            try {
                this.zza.zzce(outputStream);
                zzro[] zzroVarArr2 = this.zzb;
                if (zzroVarArr2 != null) {
                    zzroVarArr2[0].zzb();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                zzrsVar.zza().zzl(uriZza, zzrsVar.zzb());
                return null;
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            try {
                zzrsVar.zza().zzk(uriZza);
            } catch (FileNotFoundException unused) {
            }
            if (e10 instanceof IOException) {
                throw ((IOException) e10);
            }
            throw new IOException(e10);
        }
    }

    public final zzsv zzc(zzro... zzroVarArr) {
        this.zzb = zzroVarArr;
        return this;
    }
}
