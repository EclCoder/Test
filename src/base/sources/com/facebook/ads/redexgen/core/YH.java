package com.facebook.ads.redexgen.core;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class YH extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ YI A02;
    public final /* synthetic */ YJ A03;

    public YH(YJ yj2, YI yi2, int i10, int i11) {
        this.A03 = yj2;
        this.A02 = yi2;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y10 = motionEvent2.getY() - motionEvent.getY();
        float diffX = motionEvent2.getX() - motionEvent.getX();
        float diffY = Math.abs(y10);
        if (diffY > Math.abs(diffX) && y10 > this.A00) {
            float diffY2 = Math.abs(f11);
            if (diffY2 > this.A01) {
                this.A02.AG8();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A02.AFx();
        return true;
    }
}
