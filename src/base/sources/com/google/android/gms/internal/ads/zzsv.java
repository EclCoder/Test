package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzsv extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzsx zza;

    zzsv(zzsx zzsxVar) {
        Objects.requireNonNull(zzsxVar);
        this.zza = zzsxVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        zzef zzefVarZzu = this.zza.zza.zzu();
        zzefVarZzu.zze(-1, zzsu.zza);
        zzefVarZzu.zzf();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzef zzefVarZzu = this.zza.zza.zzu();
        zzefVarZzu.zze(-1, zzss.zza);
        zzefVarZzu.zzf();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzef zzefVarZzu = this.zza.zza.zzu();
        zzefVarZzu.zze(-1, zzst.zza);
        zzefVarZzu.zzf();
    }
}
