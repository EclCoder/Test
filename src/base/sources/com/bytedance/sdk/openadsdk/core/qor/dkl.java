package com.bytedance.sdk.openadsdk.core.qor;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.oj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static int f14152ta = 8;
    public float hnj = -1.0f;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public float f14154hn = -1.0f;
    public float qor = -1.0f;
    public float gjv = -1.0f;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public long f14156sk = -1;
    public long dkl = -1;
    public int dse = -1;
    public int aq = BackupConstant.UNFINISHED_FAIL_CODE;
    public int ojm = -1;
    public boolean dnm = true;
    public SparseArray<qor.hnj> bug = new SparseArray<>();
    private float orl = 0.0f;
    private float mjg = 0.0f;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private float f14153fc = 0.0f;
    private float jip = 0.0f;
    private long uua = 0;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private int f14155oj = 0;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private int f14157xn = 0;

    static {
        if (oj.hnj() != null) {
            f14152ta = oj.hn();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public void hnj(MotionEvent motionEvent) {
        int i10;
        this.aq = motionEvent.getDeviceId();
        int i11 = 0;
        this.dse = motionEvent.getToolType(0);
        this.ojm = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i12 = 1;
        if (actionMasked != 0) {
            i10 = 3;
            if (actionMasked == 1) {
                this.qor = motionEvent.getRawX();
                this.gjv = motionEvent.getRawY();
                this.dkl = System.currentTimeMillis();
                if (Math.abs(this.qor - this.f14155oj) >= f14152ta || Math.abs(this.gjv - this.f14157xn) >= f14152ta) {
                    this.dnm = false;
                }
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
            } else {
                this.f14153fc += Math.abs(motionEvent.getX() - this.orl);
                this.jip += Math.abs(motionEvent.getY() - this.mjg);
                this.orl = motionEvent.getX();
                this.mjg = motionEvent.getY();
                if (System.currentTimeMillis() - this.uua > 200) {
                    float f10 = this.f14153fc;
                    int i13 = f14152ta;
                    if (f10 <= i13 && this.jip <= i13) {
                        i12 = 2;
                    }
                } else {
                    i12 = 2;
                }
                this.qor = motionEvent.getRawX();
                this.gjv = motionEvent.getRawY();
                if (Math.abs(this.qor - this.f14155oj) >= f14152ta || Math.abs(this.gjv - this.f14157xn) >= f14152ta) {
                    this.dnm = false;
                }
                i10 = i12;
            }
            this.bug.put(motionEvent.getActionMasked(), new qor.hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.f14155oj = (int) motionEvent.getRawX();
        this.f14157xn = (int) motionEvent.getRawY();
        this.hnj = motionEvent.getRawX();
        this.f14154hn = motionEvent.getRawY();
        this.f14156sk = System.currentTimeMillis();
        this.dse = motionEvent.getToolType(0);
        this.aq = motionEvent.getDeviceId();
        this.ojm = motionEvent.getSource();
        this.f14153fc = 0.0f;
        this.jip = 0.0f;
        this.uua = System.currentTimeMillis();
        this.dnm = true;
        this.orl = motionEvent.getX();
        this.mjg = motionEvent.getY();
        i10 = i11;
        this.bug.put(motionEvent.getActionMasked(), new qor.hnj(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
