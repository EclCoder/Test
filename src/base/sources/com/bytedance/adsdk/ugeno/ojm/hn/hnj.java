package com.bytedance.adsdk.ugeno.ojm.hn;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.gjv;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends FrameLayout {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Map<Integer, orl> f12372hn;
    private gjv hnj;

    public hnj(Context context) {
        super(context);
    }

    public void hnj(gjv gjvVar) {
        this.hnj = gjvVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, orl> map = this.f12372hn;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.dkl();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        gjv gjvVar2 = this.hnj;
        if (gjvVar2 != null) {
            gjvVar2.hnj(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            super.onMeasure(iArrHnj[0], iArrHnj[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        gjv gjvVar2 = this.hnj;
        if (gjvVar2 != null) {
            gjvVar2.sk();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setEventMap(Map<Integer, orl> map) {
        this.f12372hn = map;
    }
}
