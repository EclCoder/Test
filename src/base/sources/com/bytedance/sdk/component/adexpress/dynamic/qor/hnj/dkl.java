package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements View.OnTouchListener {
    private static int qor = 10;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12635hn;
    private float hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq f12636sk;

    public dkl(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar) {
        this.f12636sk = aqVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = motionEvent.getX();
            this.f12635hn = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.hnj) >= qor || Math.abs(y10 - this.f12635hn) >= qor) {
                    this.gjv = true;
                }
            } else if (action == 3) {
                this.gjv = false;
            }
        } else {
            if (this.gjv) {
                this.gjv = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.hnj) >= qor || Math.abs(y11 - this.f12635hn) >= qor) {
                this.gjv = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar = this.f12636sk;
                if (aqVar != null) {
                    aqVar.hnj();
                }
            }
        }
        return true;
    }
}
