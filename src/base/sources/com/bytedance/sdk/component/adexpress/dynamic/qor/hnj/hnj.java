package com.bytedance.sdk.component.adexpress.dynamic.qor.hnj;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements View.OnTouchListener {
    private static int qor = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.qor.aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12646hn;
    private float hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12647sk;
    private RectF dkl = new RectF();
    private long dse = 0;
    private final int aq = 200;
    private final int ojm = 3;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private SoftReference<ViewGroup> f12648ta = new SoftReference<>(null);

    public hnj(com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar, int i10, final ViewGroup viewGroup) {
        this.f12647sk = qor;
        this.gjv = aqVar;
        if (i10 > 0) {
            this.f12647sk = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.f12648ta = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dkl = hnj(this.f12648ta.get());
            this.hnj = motionEvent.getRawX();
            this.f12646hn = motionEvent.getRawY();
            this.dse = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.dkl;
            if (rectF != null && !rectF.contains(this.hnj, this.f12646hn)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.hnj);
            float fAbs2 = Math.abs(rawY - this.f12646hn);
            int i10 = this.f12647sk;
            if (fAbs >= i10 && fAbs2 >= i10) {
                com.bytedance.sdk.component.adexpress.dynamic.qor.aq aqVar2 = this.gjv;
                if (aqVar2 != null) {
                    aqVar2.hnj();
                }
            } else if ((System.currentTimeMillis() - this.dse < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (aqVar = this.gjv) != null) {
                aqVar.hnj();
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
