package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgik extends zzgix {
    private final zzgdf zza;

    zzgik(zzaxm zzaxmVar, zzght zzghtVar, zzgdf zzgdfVar, zzgqh zzgqhVar) {
        super("de6gUXOvTKpdGE5e57jp8swLYylxAp36VAePPwAMuyFk31nrvwJ6wnCTxnWSrTp+", "XwiXIeWI3naOC54KqLF8O0lcVu19tfx8ftfv+yyfX8s=", zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE));
        this.zza = zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzd());
        objArr.getClass();
        synchronized (zzaxmVar) {
            zzaxmVar.zzb((String) objArr[0]);
            zzaxmVar.zzaa((String) objArr[1]);
        }
    }
}
