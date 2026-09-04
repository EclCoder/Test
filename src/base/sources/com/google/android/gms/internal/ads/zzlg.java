package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzlg {
    final /* synthetic */ zzlh zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    /* synthetic */ zzlg(zzlh zzlhVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzlhVar);
        this.zza = zzlhVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i10) {
                zzlh zzlhVar2 = this.zza.zza;
                if (zzlhVar2.zzae()) {
                    return;
                }
                zzlhVar2.zzT(1, 19, Integer.valueOf(i10));
            }
        };
        this.zzc = intConsumer;
        final zzdz zzdzVarZzd = zzlhVar.zzX().zzd(zzlhVar.zzW(), null);
        Objects.requireNonNull(zzdzVarZzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzlf
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzdzVarZzd.zzm(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
