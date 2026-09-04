package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CustomScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23641b;

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23641b = false;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            return action == 2 && Math.abs(motionEvent.getY() - this.f23640a) > 50.0f && this.f23641b;
        }
        this.f23640a = motionEvent.getY();
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23640a = motionEvent.getY();
            return true;
        }
        if (action != 2) {
            return true;
        }
        scrollBy(0, (int) ((motionEvent.getY() - this.f23640a) * (-1.0f)));
        this.f23640a = motionEvent.getY();
        return true;
    }

    public void setScroll(boolean z10) {
        this.f23641b = z10;
    }
}
