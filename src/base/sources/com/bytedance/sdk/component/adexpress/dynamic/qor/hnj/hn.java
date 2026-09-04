package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.qor.ojm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq dkl;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12644hn;
    private float hnj;
    private long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private ojm f12645sk;

    public hn(ojm ojmVar, com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar) {
        this.f12645sk = ojmVar;
        this.dkl = aqVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qor = System.currentTimeMillis();
            this.hnj = motionEvent.getX();
            this.f12644hn = motionEvent.getY();
            this.f12645sk.sk();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.hnj) >= com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), 10.0f) || Math.abs(y10 - this.f12644hn) >= com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), 10.0f)) {
                    this.gjv = true;
                    this.f12645sk.dkl();
                }
            }
        } else {
            if (this.gjv) {
                return false;
            }
            if (System.currentTimeMillis() - this.qor >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar = this.dkl;
                if (aqVar != null) {
                    aqVar.hnj();
                }
            } else {
                this.f12645sk.dkl();
            }
        }
        return true;
    }
}
