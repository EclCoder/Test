package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfzw implements Closeable {
    public static zzgai zza() {
        return new zzgai();
    }

    public static zzgai zzb(zzgub<Integer> zzgubVar, zzgub<Integer> zzgubVar2, zzfzy zzfzyVar) {
        return new zzgai(zzgubVar, zzgubVar2, zzfzyVar);
    }

    public static zzgai zzc(final int i10, zzfzy zzfzyVar) {
        return new zzgai(new zzgub() { // from class: com.google.android.gms.internal.ads.zzfzv
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        }, zzfzu.zza, zzfzyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
