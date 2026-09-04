package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgig extends zzgix {
    zzgig(zzaxm zzaxmVar, zzght zzghtVar, zzgqh zzgqhVar) {
        super("EX3s5CgykVWHs0pNTwHE120YyOO6kVwj6XxXcnDAUKRtpcEwHZ8iefuHYFjxhN+G", "iYfOB+UFjdSgOmvtOabB6aboS+drDofqdo6l56HlvdE=", zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        synchronized (zzaxmVar) {
            zzaxmVar.zza("E");
            zzaxmVar.zzB(0L);
            zzaxmVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzaxmVar) {
            zzaxmVar.zza((String) objArr[0]);
            zzaxmVar.zzB(((Long) objArr[1]).longValue());
            zzaxmVar.zzV((String) objArr[2]);
        }
    }
}
