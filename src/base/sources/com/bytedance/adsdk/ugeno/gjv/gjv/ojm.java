package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.gjv.orl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends qor {
    private float bug;
    private float dnm;
    private orl mjg;
    private boolean orl;

    public ojm(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        orl orlVar = this.mjg;
        return orlVar != null ? orlVar.hnj(this.f12243hn, motionEvent, this.hnj, this) : hnj(this.f12243hn, motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    public boolean hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent) {
        float rawX;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dnm = motionEvent.getRawX();
            this.bug = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.orl) {
                this.orl = false;
                this.dnm = 0.0f;
                this.bug = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.dnm) >= 15.0f && Math.abs(rawY - this.bug) < 15.0f) {
                Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
                com.bytedance.adsdk.ugeno.gjv.dnm dnmVar = this.hnj;
                if (dnmVar != null) {
                    dnmVar.hnj(qorVar, this.dkl, this.qor.hn());
                    this.dnm = 0.0f;
                    this.bug = 0.0f;
                    return true;
                }
            } else {
                this.orl = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.dnm) >= 15.0f || Math.abs(rawY2 - this.bug) >= 15.0f) {
                this.orl = true;
            }
        } else if (action == 3) {
            this.orl = false;
            if (this.orl) {
                this.orl = false;
                this.dnm = 0.0f;
                this.bug = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            if (Math.abs(rawX - this.dnm) >= 15.0f) {
            }
            this.orl = false;
            Log.d("GesThrough_UGTapEvent", "Non-tap event");
            return false;
        }
        return true;
    }

    public void hnj(orl orlVar) {
        this.mjg = orlVar;
    }
}
