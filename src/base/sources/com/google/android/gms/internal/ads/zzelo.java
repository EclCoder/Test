package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelo {
    private h4.a zza;
    private final Context zzb;

    zzelo(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            h4.a aVarA = h4.a.a(this.zzb);
            this.zza = aVarA;
            return aVarA == null ? zzhbw.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : aVarA.b();
        } catch (Exception e10) {
            return zzhbw.zzc(e10);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            h4.a aVar = this.zza;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e10) {
            return zzhbw.zzc(e10);
        }
    }
}
