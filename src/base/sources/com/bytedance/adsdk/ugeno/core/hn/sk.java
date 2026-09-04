package com.bytedance.adsdk.ugeno.core.hn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import f8.Ygx.FuoITeVPeXAj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class sk {
    private orl aq;
    private boolean bug;
    private boolean dnm;
    private orl dse;
    private String ojm;
    private hnj orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Context f12208ta;
    private float hnj = Float.MIN_VALUE;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12206hn = Float.MIN_VALUE;
    private int qor = 0;
    private int gjv = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12207sk = Integer.MAX_VALUE;
    private AtomicBoolean dkl = new AtomicBoolean(true);

    public sk(Context context, orl orlVar, boolean z10, boolean z11) {
        this.f12208ta = context;
        this.dse = orlVar;
        this.dnm = z10;
        this.bug = z11;
        qor();
    }

    public void hn() {
        this.hnj = Float.MIN_VALUE;
        this.f12206hn = Float.MIN_VALUE;
    }

    private void qor() {
        if (this.bug) {
            this.orl = new hnj();
        }
        orl orlVar = this.dse;
        if (orlVar == null) {
            return;
        }
        this.qor = orlVar.qor().optInt("slideThreshold");
        this.ojm = this.dse.qor().optString(FuoITeVPeXAj.mFlkiIKrqQOfq);
        this.gjv = this.dse.qor().optInt("frequency", Integer.MAX_VALUE);
        this.f12207sk = this.dse.qor().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.gjv + ", mEffectiveDuration: " + this.f12207sk + ", inEffectiveDuation: " + this.dkl.get());
    }

    public void hnj() {
        if (this.f12207sk == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.hn.sk.1
            @Override // java.lang.Runnable
            public void run() {
                sk.this.dkl.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.f12207sk);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    public boolean hnj(fc fcVar, com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent, boolean z10) {
        float x10;
        float y10;
        int iHn;
        int iHn2;
        hnj hnjVar = this.orl;
        if (hnjVar != null) {
            if (hnjVar.hnj(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.orl.hnj(qorVar, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = motionEvent.getX();
            this.f12206hn = motionEvent.getY();
        } else if (action == 1) {
            x10 = motionEvent.getX();
            y10 = motionEvent.getY();
            if (!this.dnm && Math.abs(x10 - this.hnj) <= 10.0f && Math.abs(y10 - this.f12206hn) <= 10.0f && fcVar != null) {
                hn();
                fcVar.hnj(this.aq, qorVar, qorVar);
                return true;
            }
            if (this.qor != 0 && fcVar != null) {
                hn();
                hnj(fcVar, this.dse, qorVar);
                return true;
            }
            iHn = aq.hn(this.f12208ta, x10 - this.hnj);
            iHn2 = aq.hn(this.f12208ta, y10 - this.f12206hn);
            if (TextUtils.equals(this.ojm, "up")) {
                iHn = -iHn2;
            } else if (!TextUtils.equals(this.ojm, "down")) {
                iHn = iHn2;
            } else if (TextUtils.equals(this.ojm, TtmlNode.LEFT)) {
                iHn = -iHn;
            } else if (!TextUtils.equals(this.ojm, TtmlNode.RIGHT)) {
                iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
            }
            if (iHn >= this.qor) {
                Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                if (fcVar != null) {
                    hn();
                    hnj(fcVar, this.dse, qorVar);
                    return true;
                }
                hn();
            } else {
                hn();
                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                hnj(qorVar);
                return false;
            }
        } else if (action == 3) {
            if (this.hnj != Float.MIN_VALUE && this.f12206hn != Float.MIN_VALUE) {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, processed as UP event");
                x10 = motionEvent.getX();
                y10 = motionEvent.getY();
                if (!this.dnm) {
                }
                if (this.qor != 0) {
                }
                iHn = aq.hn(this.f12208ta, x10 - this.hnj);
                iHn2 = aq.hn(this.f12208ta, y10 - this.f12206hn);
                if (TextUtils.equals(this.ojm, "up")) {
                    iHn = -iHn2;
                } else if (!TextUtils.equals(this.ojm, "down")) {
                    iHn = iHn2;
                } else if (TextUtils.equals(this.ojm, TtmlNode.LEFT)) {
                    iHn = -iHn;
                } else if (!TextUtils.equals(this.ojm, TtmlNode.RIGHT)) {
                    iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                }
                if (iHn >= this.qor) {
                    Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                    if (fcVar != null) {
                        hn();
                        hnj(fcVar, this.dse, qorVar);
                        return true;
                    }
                    hn();
                } else {
                    hn();
                    Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                    hnj(qorVar);
                    return false;
                }
            } else {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, don't handle");
                return false;
            }
        }
        return true;
    }

    public sk(Context context, orl orlVar, orl orlVar2, boolean z10, boolean z11) {
        this.f12208ta = context;
        this.dse = orlVar;
        this.aq = orlVar2;
        this.dnm = z10;
        this.bug = z11;
        qor();
    }

    private void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (this.orl != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.orl.hnj(qorVar);
        }
    }

    private void hnj(fc fcVar, orl orlVar, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (this.gjv <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            hnj(qorVar);
        } else {
            if (!this.dkl.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                hnj(qorVar);
                return;
            }
            fcVar.hnj(orlVar, qorVar, qorVar);
            int i10 = this.gjv;
            if (i10 != Integer.MAX_VALUE) {
                this.gjv = i10 - 1;
            }
        }
    }
}
