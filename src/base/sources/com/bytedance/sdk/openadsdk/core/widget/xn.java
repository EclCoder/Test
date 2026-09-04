package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn {
    private int dkl;
    private boolean dnm;
    private int dse;
    private float gjv;
    private final hnj hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f14305sk;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f14304hn = false;
    private boolean qor = false;
    private boolean aq = true;
    private boolean ojm = false;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final View.OnTouchListener f14306ta = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.xn.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (xn.this.hnj.as()) {
                return !xn.this.qor;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                xn xnVar = xn.this;
                xnVar.dnm = xnVar.hnj(motionEvent);
                xn.this.gjv = x10;
                xn.this.f14305sk = y10;
                xn.this.dkl = (int) x10;
                xn.this.dse = (int) y10;
                xn.this.aq = true;
                if (xn.this.hnj != null && xn.this.qor) {
                    xn.this.hnj.hnj(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - xn.this.dkl) > 20.0f || Math.abs(y10 - xn.this.dse) > 20.0f) {
                    xn.this.aq = false;
                }
                xn.this.aq = true;
                xn.this.ojm = false;
                xn.this.gjv = 0.0f;
                xn.this.f14305sk = 0.0f;
                xn.this.dkl = 0;
                if (xn.this.hnj != null) {
                    xn.this.hnj.hnj(view, xn.this.aq);
                }
                xn.this.dnm = false;
            } else if (action == 3) {
                xn.this.dnm = false;
            }
            return !xn.this.qor;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        boolean as();

        void hnj(View view, boolean z10);
    }

    public xn(hnj hnjVar) {
        this.hnj = hnjVar;
    }

    public void hnj(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f14306ta);
        }
    }

    public void hnj(boolean z10) {
        this.qor = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iQor = sq.qor(com.bytedance.sdk.openadsdk.core.oj.hnj().getApplicationContext());
        int iSk = sq.sk(com.bytedance.sdk.openadsdk.core.oj.hnj().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iQor;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iSk;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
