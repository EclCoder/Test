package com.bytedance.sdk.component.ojm;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends qor {
    private float aq;
    private View.OnTouchListener dkl;
    private long dse = -1;
    private final Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f12926hn;
    private final View.OnTouchListener hnj;
    private float ojm;
    private final long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final dkl f12927sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f12928ta;

    public gjv(Context context, View.OnTouchListener onTouchListener, int i10, long j10, dkl dklVar) {
        this.gjv = context;
        this.hnj = onTouchListener;
        this.f12926hn = i10;
        this.qor = j10;
        this.f12927sk = dklVar;
    }

    private boolean hnj(long j10) {
        long j11 = this.dse;
        if (j11 == -1) {
            this.dse = j10;
            return false;
        }
        int i10 = this.f12926hn;
        if (i10 == 1) {
            if (j10 - j11 <= this.qor) {
                return true;
            }
            this.dse = j10;
            return false;
        }
        if (i10 == 2) {
            if (j10 - j11 <= this.qor) {
                this.dse = j10;
                return true;
            }
            this.dse = j10;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        gjv gjvVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            gjvVar = this;
            gjvVar.aq = x10;
            gjvVar.ojm = y10;
        } else if (action != 1) {
            gjvVar = this;
        } else {
            gjvVar = this;
            if (gjvVar.hnj(x10, y10, this.aq, this.ojm, this.gjv)) {
                if (hnj(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    hnj(1, x10, y10);
                } else {
                    hnj(0, x10, y10);
                }
            }
        }
        View.OnTouchListener onTouchListener = gjvVar.hnj;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = gjvVar.dkl;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void hnj(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f12926hn);
            jSONObject.put("lp_click_interval", this.qor);
        } catch (Throwable th2) {
            apu.hnj("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hn() != null) {
            com.bytedance.sdk.component.ojm.hnj.hn hnVarHn = com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hn();
            dkl dklVar = this.f12927sk;
            hnVarHn.hnj(dklVar != null ? dklVar.getMaterialMeta() : null, this.f12928ta, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void hnj(String str) {
        this.f12928ta = str;
    }

    @Override // com.bytedance.sdk.component.ojm.qor
    public void hnj(View.OnTouchListener onTouchListener) {
        this.dkl = onTouchListener;
    }
}
