package com.google.android.gms.internal.ads;

import fl.g0;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.s;
import z0.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgba implements d0 {
    public static final zzgba zza = new zzgba();
    private static final zzgax zzb;

    static {
        zzgax zzgaxVarZzd = zzgax.zzd();
        s.g(zzgaxVarZzd, "getDefaultInstance(...)");
        zzb = zzgaxVarZzd;
    }

    private zzgba() {
    }

    @Override // z0.d0
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // z0.d0
    public final Object readFrom(InputStream inputStream, kl.f fVar) {
        try {
            zzgax zzgaxVarZzc = zzgax.zzc(inputStream);
            s.e(zzgaxVarZzc);
            return zzgaxVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // z0.d0
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, kl.f fVar) {
        ((zzgax) obj).zzaO(outputStream);
        return g0.f38750a;
    }
}
