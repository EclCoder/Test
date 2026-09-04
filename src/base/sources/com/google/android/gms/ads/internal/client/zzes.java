package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzes extends zzdj {
    private zzes() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListenerZzA = zzeu.zzb().zzA();
        if (onAdInspectorClosedListenerZzA != null) {
            onAdInspectorClosedListenerZzA.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }

    /* synthetic */ zzes(byte[] bArr) {
    }
}
