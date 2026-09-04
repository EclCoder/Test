package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements View.OnTouchListener {
    private static int qor = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12637hn;
    private float hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12638sk;
    private RectF dkl = new RectF();
    private long dse = 0;
    private final int aq = 200;
    private final int ojm = 3;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private SoftReference<View> f12639ta = new SoftReference<>(null);

    public dse(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar, int i10, final ViewGroup viewGroup) {
        this.f12638sk = qor;
        this.gjv = aqVar;
        if (i10 > 0) {
            this.f12638sk = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.dse.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    dse.this.f12639ta = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar;
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dkl = hnj(this.f12639ta.get());
            this.hnj = motionEvent.getRawX();
            this.f12637hn = motionEvent.getRawY();
            this.dse = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.dkl;
            if (rectF != null && !rectF.contains(this.hnj, this.f12637hn)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.hnj);
            float fAbs2 = Math.abs(rawY - this.f12637hn);
            int iHn = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), Math.abs(rawX - this.hnj));
            int i10 = qor;
            if (fAbs < i10 || fAbs2 < i10) {
                if ((System.currentTimeMillis() - this.dse < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (aqVar = this.gjv) != null) {
                    aqVar.hnj();
                }
            } else if (rawX > this.hnj && iHn > this.f12638sk && (aqVar2 = this.gjv) != null) {
                aqVar2.hnj();
            }
        }
        return true;
    }

    private RectF hnj(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], i10 + view.getWidth(), iArr[1] + view.getHeight());
    }
}
