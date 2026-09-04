package com.bytedance.adsdk.ugeno.core.hn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.dse.ojm;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements ojm.hnj {
    private com.bytedance.adsdk.ugeno.hn.qor dkl;
    private Handler dse = new ojm(Looper.getMainLooper(), this);
    private Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12198hn;
    private boolean hnj;
    private fc qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private orl f12199sk;

    public dkl(Context context, orl orlVar, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.gjv = context;
        this.f12199sk = orlVar;
        this.dkl = qorVar;
    }

    public void hnj(fc fcVar) {
        this.qor = fcVar;
    }

    public void hnj() {
        orl orlVar = this.f12199sk;
        if (orlVar == null) {
            return;
        }
        JSONObject jSONObjectQor = orlVar.qor();
        try {
            this.f12198hn = Integer.parseInt(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectQor.optString("interval", "8000"), this.dkl.bug()));
            this.hnj = jSONObjectQor.optBoolean("repeat");
            this.dse.sendEmptyMessageDelayed(1001, this.f12198hn);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dse.ojm.hnj
    public void hnj(Message message) {
        if (message.what != 1001) {
            return;
        }
        fc fcVar = this.qor;
        if (fcVar != null) {
            orl orlVar = this.f12199sk;
            com.bytedance.adsdk.ugeno.hn.qor qorVar = this.dkl;
            fcVar.hnj(orlVar, qorVar, qorVar);
        }
        if (this.hnj) {
            this.dse.sendEmptyMessageDelayed(1001, this.f12198hn);
        } else {
            this.dse.removeMessages(1001);
        }
    }
}
