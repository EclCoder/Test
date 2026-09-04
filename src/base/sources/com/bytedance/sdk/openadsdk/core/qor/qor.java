package com.bytedance.sdk.openadsdk.core.qor;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.oj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor implements View.OnClickListener, View.OnTouchListener {
    protected static int hqh = 8;
    protected View pty;
    protected float apu = -1.0f;
    protected float eum = -1.0f;
    protected float wu = -1.0f;
    protected float as = -1.0f;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected long f44do = -1;
    protected long tu = -1;
    protected int tgn = -1;
    protected int xyo = BackupConstant.UNFINISHED_FAIL_CODE;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    protected int f14172vf = -1;
    protected boolean nyv = true;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    public SparseArray<hnj> f14169gm = new SparseArray<>();
    private float hnj = 0.0f;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f14170hn = 0.0f;
    private float qor = 0.0f;
    private float gjv = 0.0f;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14171sk = 0;
    private int dkl = 0;
    private int dse = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public double f14173hn;
        public int hnj;
        public double qor;

        public hnj(int i10, double d10, double d11, long j10) {
            this.hnj = i10;
            this.f14173hn = d10;
            this.qor = d11;
            this.gjv = j10;
        }
    }

    static {
        if (oj.hnj() != null) {
            hqh = oj.hn();
        }
    }

    private boolean hnj(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (hn.qor(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (hnj(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dkl() {
        return this.nyv;
    }

    protected abstract void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<hnj> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.dse.hnj()) {
            hnj(view, this.apu, this.eum, this.wu, this.as, this.f14169gm, this.nyv);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.xyo = motionEvent.getDeviceId();
        this.tgn = motionEvent.getToolType(0);
        this.f14172vf = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 1;
        if (actionMasked != 0) {
            int i11 = 3;
            if (actionMasked == 1) {
                this.wu = motionEvent.getRawX();
                this.as = motionEvent.getRawY();
                this.tu = System.currentTimeMillis();
                if (Math.abs(this.wu - this.dkl) >= hqh || Math.abs(this.as - this.dse) >= hqh) {
                    this.nyv = false;
                }
                Point point = new Point((int) this.wu, (int) this.as);
                if (view != null && !hn.qor(view) && hnj((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
            } else {
                this.qor += Math.abs(motionEvent.getX() - this.hnj);
                this.gjv += Math.abs(motionEvent.getY() - this.f14170hn);
                this.hnj = motionEvent.getX();
                this.f14170hn = motionEvent.getY();
                if (System.currentTimeMillis() - this.f14171sk > 200) {
                    float f10 = this.qor;
                    int i12 = hqh;
                    if (f10 <= i12 && this.gjv <= i12) {
                        i10 = 2;
                    }
                } else {
                    i10 = 2;
                }
                this.wu = motionEvent.getRawX();
                this.as = motionEvent.getRawY();
                if (Math.abs(this.wu - this.dkl) >= hqh || Math.abs(this.as - this.dse) >= hqh) {
                    this.nyv = false;
                }
            }
            i10 = i11;
        } else {
            this.dkl = (int) motionEvent.getRawX();
            this.dse = (int) motionEvent.getRawY();
            this.apu = motionEvent.getRawX();
            this.eum = motionEvent.getRawY();
            this.f44do = System.currentTimeMillis();
            this.tgn = motionEvent.getToolType(0);
            this.xyo = motionEvent.getDeviceId();
            this.f14172vf = motionEvent.getSource();
            this.qor = 0.0f;
            this.gjv = 0.0f;
            this.f14171sk = System.currentTimeMillis();
            this.nyv = true;
            this.pty = view;
            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(motionEvent);
            this.hnj = motionEvent.getX();
            this.f14170hn = motionEvent.getY();
            i10 = 0;
        }
        this.f14169gm.put(motionEvent.getActionMasked(), new hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }
}
