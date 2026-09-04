package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends qor {
    private float bug;
    private float dnm;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f12246fc;
    private AtomicBoolean jip;
    private int mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private String f12247oj;
    private int orl;
    private int uua;

    public sk(Context context) {
        super(context);
        this.orl = 0;
        this.mjg = Integer.MAX_VALUE;
        this.f12246fc = Integer.MAX_VALUE;
        this.jip = new AtomicBoolean(true);
        this.uua = 0;
        this.f12247oj = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.f12244sk;
        if (map != null) {
            this.f12247oj = TextUtils.isEmpty(map.get("direction")) ? "all" : this.f12244sk.get("direction");
            this.orl = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("distance"), 0);
            if (this.mjg == Integer.MAX_VALUE) {
                this.mjg = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.f12246fc == Integer.MAX_VALUE) {
                this.f12246fc = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.uua = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.mjg + ", mEffectiveDuration: " + this.f12246fc + ", inEffectiveDuation: " + this.jip.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        hnj();
        return hnj(this.f12243hn, motionEvent);
    }

    private void hnj() {
        if (this.f12246fc == Integer.MAX_VALUE || this.f12243hn == null || System.currentTimeMillis() - this.f12243hn.tu() < this.f12246fc) {
            return;
        }
        this.jip.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    private boolean hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dnm = motionEvent.getX();
            this.bug = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.orl == 0 && this.hnj != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return hnj(qorVar, x10, y10);
            }
            int iHn = com.bytedance.adsdk.ugeno.dse.aq.hn(this.f12245ta, x10 - this.dnm);
            int iHn2 = com.bytedance.adsdk.ugeno.dse.aq.hn(this.f12245ta, y10 - this.bug);
            String str = this.f12247oj;
            switch (str.hashCode()) {
                case 3739:
                    if (!str.equals("up")) {
                        iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                    } else {
                        iHn = -iHn2;
                    }
                    break;
                case 96673:
                    str.equals("all");
                    iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                    break;
                case 3089570:
                    if (!str.equals("down")) {
                        iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                    } else {
                        iHn = iHn2;
                    }
                    break;
                case 3317767:
                    if (!str.equals(TtmlNode.LEFT)) {
                        iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                    } else {
                        iHn = -iHn;
                    }
                    break;
                case 108511772:
                    if (!str.equals(TtmlNode.RIGHT)) {
                        iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                    }
                    break;
                default:
                    iHn = (int) Math.abs(Math.sqrt(Math.pow(iHn, 2.0d) + Math.pow(iHn2, 2.0d)));
                    break;
            }
            if (iHn >= this.orl) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                if (this.hnj != null) {
                    this.dnm = 0.0f;
                    this.bug = 0.0f;
                    return hnj(qorVar, x10, y10);
                }
            } else {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
        }
        return true;
    }

    private boolean hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, float f10, float f11) {
        if (this.mjg <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.jip.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.uua == 1 && !hnj(qorVar.dnm(), f10, f11)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.hnj.hnj(qorVar, this.dkl, this.qor.hn());
        int i10 = this.mjg;
        if (i10 != Integer.MAX_VALUE) {
            this.mjg = i10 - 1;
        }
        return true;
    }

    private boolean hnj(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
