package com.bytedance.adsdk.ugeno.core.hn;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public String hnj = "GesThrough_";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<MotionEvent> f12202hn = new ArrayList();
    private Set<String> qor = Collections.synchronizedSet(new HashSet());

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent) {
        if (qorVar == null || motionEvent == null || this.f12202hn == null) {
            return;
        }
        hnj(qorVar.dnm(), qorVar.ul(), motionEvent);
    }

    public void hnj(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.f12202hn == null) {
            return;
        }
        this.hnj = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.f12202hn.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i10, i11);
        this.f12202hn.add(motionEventObtain);
    }

    public boolean hnj(MotionEvent motionEvent) {
        if (motionEvent == null || this.qor == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.qor.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (this.f12202hn.isEmpty() || this.qor == null || qorVar == null || qorVar.dnm() == null || qorVar.dnm().getRootView() == null) {
            return;
        }
        hnj(qorVar.dnm());
    }

    public void hnj(View view) {
        if (this.f12202hn.isEmpty() || this.qor == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.hnj, "Re-dispatch motionEvents.size(): " + this.f12202hn.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.hn.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : hnj.this.f12202hn) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        hnj.this.qor.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                hnj.this.f12202hn.clear();
            }
        }, 300L);
    }
}
