package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzadx implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    final Choreographer zza;
    final DisplayManager zzb;
    volatile long zzc = C.TIME_UNSET;
    volatile long zzd = C.TIME_UNSET;

    /* synthetic */ zzadx(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.zza = choreographer;
        this.zzb = displayManager;
    }

    void zza() {
        this.zzb.registerDisplayListener(this, zzfl.zzd(null));
    }

    void zzb() {
        throw null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
