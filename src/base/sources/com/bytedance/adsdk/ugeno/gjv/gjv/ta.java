package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends qor implements com.bytedance.adsdk.ugeno.dse.ojm.hnj {
    private int bug;
    private int dnm;
    private int mjg;
    private Handler orl;

    public ta(Context context) {
        super(context);
        this.bug = 0;
        this.orl = new com.bytedance.adsdk.ugeno.dse.ojm(Looper.getMainLooper(), this);
        this.mjg = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        Map<String, String> map = this.f12244sk;
        if (map != null) {
            int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(map.get("loop"), 0);
            this.dnm = iHnj;
            if (iHnj <= 0) {
                this.mjg = -1;
            } else {
                this.mjg = iHnj;
            }
            this.bug = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("duration"), 0);
        }
        this.orl.sendEmptyMessageDelayed(1001, this.bug);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.dse.ojm.hnj
    public void hnj(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.mjg);
        this.hnj.hnj(this.f12243hn, this.dkl, this.qor.hn());
        int i12 = this.mjg + (-1);
        this.mjg = i12;
        if (i12 < 0 && (i11 = this.bug) != 0) {
            this.orl.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 > 0 && (i10 = this.bug) != 0) {
            this.orl.sendEmptyMessageDelayed(1001, i10);
        } else {
            this.orl.removeMessages(1001);
        }
    }
}
