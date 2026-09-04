package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgiq extends zzgix {
    private final Context zza;

    zzgiq(zzaxm zzaxmVar, zzght zzghtVar, Context context, zzgqh zzgqhVar) {
        super("3M3UhsCX904mgMNqBuNkdZnNfpzyG+gyZSwZ0bLvpAGWwKiqhbJpzMhUN7osaI5H", "IGzPM7qLPT4nT5FsUvAD7EHpaGrgx3eqTo88eWb+Mf4=", zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaxmVar) {
            zzaxmVar.zzc(((Long) objArr[0]).longValue());
            zzaxmVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}
