package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgim extends zzgix {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzgim(zzaxm zzaxmVar, zzght zzghtVar, zzgqh zzgqhVar) {
        super("F5pwKdQUkBR2T28FTRLzecwttaHUl7VLDmgba7+ac24MPIR3NLD5sQMDLkLV832D", "Zvn3l46JDaJW0+pj8K/1DTe7U1wFUhv/KBF/UwuPk/A=", zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l10 = (Long) method.invoke("", null);
                        if (l10 == null) {
                            throw null;
                        }
                        zza = l10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (zzaxmVar) {
            try {
                if (zza != null) {
                    zzaxmVar.zzm(zza.longValue());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
