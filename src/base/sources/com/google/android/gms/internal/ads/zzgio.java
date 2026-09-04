package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgio extends zzgix {
    private final Map zza;

    zzgio(zzaxm zzaxmVar, zzght zzghtVar, Map map, zzgqh zzgqhVar) {
        super("G2/bixlyGCE81T8XD1821hdaWkYSafkSwXLAJIGuuGqYRgIdSuokiuQCkAmmYtmy", "cUq8+LlkvVToJpkHwW06ohwTjEjO/Tpp50dyOy2nlqU=", zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzaxmVar) {
            try {
                zzaxmVar.zzf(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    zzaxmVar.zzW(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    zzaxmVar.zzX(jLongValue2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
