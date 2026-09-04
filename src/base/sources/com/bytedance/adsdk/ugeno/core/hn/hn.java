package com.bytedance.adsdk.ugeno.core.hn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.core.ta;
import com.bytedance.adsdk.ugeno.dse.ojm;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements ojm.hnj {
    private Handler dkl = new ojm(Looper.getMainLooper(), this);
    private orl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private fc f12200hn;
    private int hnj;
    private Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.hn.qor f12201sk;

    public hn(Context context, orl orlVar, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.qor = context;
        this.gjv = orlVar;
        this.f12201sk = qorVar;
    }

    public void hnj(fc fcVar) {
        this.f12200hn = fcVar;
    }

    public void hnj() {
        orl orlVar = this.gjv;
        if (orlVar == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.qor.hn.hnj(orlVar.qor().optString("delay"), this.f12201sk.bug()));
            this.hnj = i10;
            this.dkl.sendEmptyMessageDelayed(1001, i10);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dse.ojm.hnj
    public void hnj(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectQor = this.gjv.qor();
        if (TextUtils.equals(jSONObjectQor.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectQor.optString("nodeId");
            com.bytedance.adsdk.ugeno.hn.qor qorVar = this.f12201sk;
            com.bytedance.adsdk.ugeno.hn.qor qorVarSk = qorVar.hn(qorVar).sk(strOptString);
            new ta(qorVarSk.dnm(), com.bytedance.adsdk.ugeno.core.hnj.hnj(jSONObjectQor.optJSONObject("animatorSet"), qorVarSk)).hnj();
        } else {
            fc fcVar = this.f12200hn;
            if (fcVar != null) {
                orl orlVar = this.gjv;
                com.bytedance.adsdk.ugeno.hn.qor qorVar2 = this.f12201sk;
                fcVar.hnj(orlVar, qorVar2, qorVar2);
            }
        }
        this.dkl.removeMessages(1001);
    }
}
