package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements View.OnTouchListener {
    private boolean aq;
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq dkl;
    private int dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12650hn;
    private float hnj;
    private boolean ojm;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12651sk;

    public qor(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar) {
        this(aqVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar;
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar2;
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar3;
        if (this.ojm) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = motionEvent.getX();
            this.f12650hn = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.gjv = motionEvent.getX();
                this.qor = motionEvent.getY();
                if (Math.abs(this.gjv - this.hnj) > 10.0f) {
                    this.f12651sk = true;
                }
                if (Math.abs(this.gjv - this.hnj) > 8.0f || Math.abs(this.qor - this.f12650hn) > 8.0f) {
                    this.aq = false;
                }
                int iHn = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), Math.abs(this.gjv - this.hnj));
                if (this.gjv > this.hnj && iHn > this.dse && (aqVar3 = this.dkl) != null) {
                    aqVar3.hnj();
                    this.ojm = true;
                }
            }
        } else {
            if (!this.f12651sk && !this.aq) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iHn2 = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), Math.abs(this.gjv - this.hnj));
            if (this.gjv > this.hnj && iHn2 > this.dse && (aqVar2 = this.dkl) != null) {
                aqVar2.hnj();
                this.ojm = true;
            }
            float fAbs = Math.abs(x10 - this.hnj);
            float fAbs2 = Math.abs(y10 - this.f12650hn);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (aqVar = this.dkl) != null) {
                aqVar.hn();
                this.ojm = true;
            }
        }
        return true;
    }

    public qor(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar, int i10) {
        this.dse = 5;
        this.aq = true;
        this.dkl = aqVar;
        if (i10 > 0) {
            this.dse = i10;
        }
    }
}
