package com.bytedance.sdk.openadsdk.core.bug.ojm;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.core.dnm;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.jip;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.bytedance.sdk.openadsdk.core.bug.dse.gjv;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements fc, jip {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private bug f13689hn;
    private Context hnj;
    private qor qor;

    public hnj(Context context) {
        this.hnj = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, gjv gjvVar) {
        this.f13689hn = new bug(this.hnj);
        hnj();
        this.f13689hn.hnj((fc) this);
        this.f13689hn.hnj((jip) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (gjvVar != null) {
                gjvVar.hnj(Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            qor<View> qorVarHnj = this.f13689hn.hnj(jSONObject, jSONObject2, jSONObject3);
            this.qor = qorVarHnj;
            if (qorVarHnj != null) {
                gjvVar.hnj(qorVarHnj);
            } else if (gjvVar != null) {
                gjvVar.hnj(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (gjvVar != null) {
                gjvVar.hnj(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (gjvVar != null) {
                gjvVar.hnj(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (gjvVar != null) {
                gjvVar.hnj(138, "ugen render error");
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc
    public void hnj(orl orlVar, fc.hn hnVar, fc.hnj hnjVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.jip
    public void hnj(qor qorVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc
    public void hnj(qor qorVar, String str, dkl.hnj hnjVar) {
    }

    public void hnj(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final gjv gjvVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hn(jSONObject, jSONObject2, jSONObject3, gjvVar);
        } else {
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.ojm.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.hn(jSONObject, jSONObject2, jSONObject3, gjvVar);
                }
            });
        }
    }

    private void hnj() {
        dnm dnmVar = new dnm();
        dnmVar.hnj(this.hnj);
        this.f13689hn.hnj("page", dnmVar);
    }
}
