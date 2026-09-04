package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends qor implements com.bytedance.adsdk.ugeno.dse.ojm.hnj {
    private Handler bug;
    private int dnm;

    public bug(Context context) {
        super(context);
        this.dnm = 500;
        this.bug = new com.bytedance.adsdk.ugeno.dse.ojm(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bug.sendEmptyMessageDelayed(1101, this.dnm);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.bug.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.dse.ojm.hnj
    public void hnj(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.gjv.dnm dnmVar = this.hnj;
        if (dnmVar != null) {
            dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
        }
        Handler handler = this.bug;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
