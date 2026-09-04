package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbce extends zzbdf {
    public zzbce(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", zzaxmVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws InvocationTargetException {
        zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzaf(3);
        try {
            int i10 = 1;
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i10 = 2;
            }
            zzaxmVar.zzaf(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
