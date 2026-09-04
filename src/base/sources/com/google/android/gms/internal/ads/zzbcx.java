package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcx extends zzbdf {
    private final StackTraceElement[] zzh;

    public zzbcx(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzbbsVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzaxmVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbbj zzbbjVar = new zzbbj((String) this.zze.invoke(null, stackTraceElementArr));
            zzaxm zzaxmVar = this.zzd;
            synchronized (zzaxmVar) {
                try {
                    zzaxmVar.zzC(zzbbjVar.zza.longValue());
                    if (zzbbjVar.zzb.booleanValue()) {
                        zzaxmVar.zzag(true != zzbbjVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzaxmVar.zzag(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
