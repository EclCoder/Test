package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq implements View.OnTouchListener {
    private float dkl;
    private float dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f12633hn;
    private final com.bytedance.sdk.component.adexpress.dynamic.qor.aq hnj;
    private final int qor = 10;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12634sk;

    public aq(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar, boolean z10) {
        this.hnj = aqVar;
        this.f12633hn = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar;
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.gjv = motionEvent.getX();
            this.f12634sk = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.f12634sk);
        } else if (action == 1) {
            this.dkl = motionEvent.getX();
            this.dse = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.dse);
            if (this.f12633hn || (aqVar2 = this.hnj) == null) {
                float f10 = this.dkl - this.gjv;
                float f11 = this.dse - this.f12634sk;
                if (com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), Math.abs((float) Math.sqrt((f10 * f10) + (f11 * f11)))) > 10.0f && (aqVar = this.hnj) != null) {
                    aqVar.hnj();
                }
            } else {
                aqVar2.hnj();
            }
        }
        return true;
    }
}
