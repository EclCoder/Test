package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12652hn;
    private float hnj;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12653sk;

    public sk(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar, int i10) {
        this.gjv = aqVar;
        this.f12653sk = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f12652hn = y10;
                if (Math.abs(y10 - this.hnj) > 10.0f) {
                    this.qor = true;
                }
            }
        } else {
            if (!this.qor) {
                return false;
            }
            int iHn = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), Math.abs(this.f12652hn - this.hnj));
            if (this.f12652hn - this.hnj < 0.0f && iHn > this.f12653sk && (aqVar = this.gjv) != null) {
                aqVar.hnj();
                this.hnj = 0.0f;
                this.f12652hn = 0.0f;
                this.qor = false;
            }
        }
        return true;
    }
}
