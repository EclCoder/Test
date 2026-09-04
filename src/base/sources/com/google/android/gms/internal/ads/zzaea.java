package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaea extends zzadx implements Choreographer$VsyncCallback {
    private final Handler zzf;

    /* synthetic */ zzaea(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfl.zzd(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.zzc = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j10 = C.TIME_UNSET;
        if (length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j10 = expectedPresentationTimeNanos;
            }
            this.zzd = j10;
        } else {
            this.zzd = C.TIME_UNSET;
        }
        this.zzf.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzaea zzaeaVar = this.zza;
                zzaeaVar.zza.postVsyncCallback(zzaeaVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = C.TIME_UNSET;
        this.zzd = C.TIME_UNSET;
    }
}
