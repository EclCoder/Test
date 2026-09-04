package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqw implements GestureDetector.OnGestureListener {
    private final zzdpo zza;
    private final zzdqo zzb;

    zzdqw(zzdpo zzdpoVar, zzdqo zzdqoVar) {
        this.zza = zzdpoVar;
        this.zzb = zzdqoVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int y10;
        try {
            zzdpo zzdpoVar = this.zza;
            if (zzdpoVar != null) {
                int i10 = -1;
                if (Math.abs(f10) > Math.abs(f11)) {
                    if (f10 > 0.0f) {
                        y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                        i10 = 1;
                    } else if (f10 < 0.0f) {
                        y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                        i10 = 2;
                    } else {
                        y10 = 0;
                    }
                } else if (f11 > 0.0f) {
                    y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                    i10 = 8;
                } else if (f11 < 0.0f) {
                    y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                    i10 = 4;
                } else {
                    y10 = 0;
                }
                if (i10 == zzdpoVar.zzG()) {
                    zzdpoVar.zzE(this.zzb.zzq(), y10);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
