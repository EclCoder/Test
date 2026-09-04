package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements View.OnTouchListener {
    private boolean aq;
    private float dkl;
    private boolean dnm;
    private float dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12641hn;
    private float hnj;
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq ojm;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12642sk = true;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12643ta;

    public gjv(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar, int i10, boolean z10) {
        this.ojm = aqVar;
        this.f12643ta = i10;
        this.dnm = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar;
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar2;
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = motionEvent.getX();
            this.f12641hn = motionEvent.getY();
            this.dkl = motionEvent.getY();
            this.f12642sk = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.dse = y10;
                if (Math.abs(y10 - this.dkl) > 10.0f) {
                    this.aq = true;
                }
                this.gjv = motionEvent.getX();
                this.qor = motionEvent.getY();
                if (Math.abs(this.gjv - this.hnj) > 8.0f || Math.abs(this.qor - this.f12641hn) > 8.0f) {
                    this.f12642sk = false;
                }
            }
        } else {
            if (!this.aq && !this.f12642sk) {
                return false;
            }
            if (this.dnm || (aqVar3 = this.ojm) == null) {
                int iHn = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), Math.abs(this.dse - this.dkl));
                if (this.dse - this.dkl < 0.0f && iHn > this.f12643ta && (aqVar2 = this.ojm) != null) {
                    aqVar2.hnj();
                } else if (this.f12642sk && (aqVar = this.ojm) != null) {
                    aqVar.hnj();
                }
            } else {
                aqVar3.hnj();
            }
        }
        return true;
    }
}
