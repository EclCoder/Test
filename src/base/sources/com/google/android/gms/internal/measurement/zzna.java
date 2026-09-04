package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.s;
import ql.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzna implements zzrt {
    private final boolean zza;

    public zzna(boolean z10) {
        this.zza = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs openContext) throws IOException {
        zznd zzndVarZzb;
        s.h(openContext, "openContext");
        InputStream inputStreamZzc = zzst.zzc(openContext);
        try {
            int i10 = 4096;
            if (this.zza) {
                if (inputStreamZzc instanceof zzsf) {
                    long length = ((zzsf) inputStreamZzc).zza().length();
                    if (length == 0) {
                        i10 = 512;
                    } else if (length < 4096) {
                        i10 = (int) length;
                    }
                }
                zzndVarZzb = zznd.zzb(zzacv.zzM(inputStreamZzc, i10), true);
                s.g(zzndVarZzb, "parseFrom(...)");
            } else {
                zzndVarZzb = zznd.zzb(zzacv.zzM(inputStreamZzc, 4096), false);
                s.g(zzndVarZzb, "parseFrom(...)");
            }
            b.a(inputStreamZzc, null);
            return zzndVarZzb;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamZzc, th2);
                throw th3;
            }
        }
    }
}
