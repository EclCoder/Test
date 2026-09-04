package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgii extends zzgix {
    private final Context zza;

    zzgii(zzaxm zzaxmVar, zzght zzghtVar, Context context, zzgqh zzgqhVar) {
        super("oPdLdhb7u3yhL0H4stSlq4J5+zu0hSfWU/8UAjsk/lyj10+V9FvGXbYfhf9vKrdX", "5RX+K+L/30Yl3K6xXlprdD5z7VBWrJlQaCLdeoJJHfI=", zzaxmVar, zzghtVar, zzgqhVar.zza(Sdk$SDKError.b.INVALID_INDEX_URL_VALUE));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaxmVar) {
            try {
                zzaxmVar.zzO(((Integer) objArr[0]).intValue());
                int i10 = 1;
                zzaxmVar.zzd(((Integer) objArr[1]).intValue());
                zzaxmVar.zze(((Integer) objArr[2]).intValue());
                zzaxmVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzaxmVar.zzaf(3);
                } else {
                    zzaxmVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzaxmVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i10 = 2;
                    }
                    zzaxmVar.zzae(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
