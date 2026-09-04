package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends qor implements com.bytedance.adsdk.ugeno.dse.ojm.hnj {
    private boolean bug;
    private int dnm;
    private Handler orl;

    public dnm(Context context) {
        super(context);
        this.dnm = 500;
        this.orl = new com.bytedance.adsdk.ugeno.dse.ojm(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.dnm = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("delay"), 500);
        return hnj(this.f12243hn, motionEvent);
    }

    private boolean hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.gjv.dnm dnmVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.orl.sendEmptyMessageDelayed(1102, this.dnm);
        } else {
            if (action == 1) {
                if (this.bug && (dnmVar = this.hnj) != null) {
                    dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
                    this.bug = false;
                    Handler handler = this.orl;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.orl;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.bug = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.orl;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.bug = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.dse.ojm.hnj
    public void hnj(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.bug = true;
        Handler handler = this.orl;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
