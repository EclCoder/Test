package com.bytedance.sdk.openadsdk.core.bug.gjv;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.jip;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.bytedance.sdk.openadsdk.core.bug.dse.gjv;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements fc, jip {
    private jip gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private qor<View> f13620hn;
    private final Context hnj;
    private InterfaceC0208hnj qor;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bug.gjv.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface InterfaceC0208hnj {
        void hnj(orl orlVar);
    }

    public hnj(Context context) {
        this.hnj = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(JSONObject jSONObject, JSONObject jSONObject2, gjv gjvVar) {
        try {
            bug bugVar = new bug(this.hnj);
            qor<View> qorVarHnj = bugVar.hnj(jSONObject);
            this.f13620hn = qorVarHnj;
            if (qorVarHnj == null) {
                if (gjvVar != null) {
                    gjvVar.hnj(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, "ugen render fail");
                    return;
                }
                return;
            }
            View viewDnm = qorVarHnj.dnm();
            if (viewDnm != null) {
                viewDnm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bug.gjv.hnj.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            bugVar.hnj((fc) this);
            bugVar.hnj((jip) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.orl.hn());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            bugVar.hn(jSONObject2);
            if (gjvVar != null) {
                gjvVar.hnj(this.f13620hn);
            }
        } catch (Exception e10) {
            if (gjvVar != null) {
                gjvVar.hnj(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, "ugen render fail exception is" + e10.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc
    public void hnj(qor qorVar, String str, dkl.hnj hnjVar) {
    }

    public void hnj(final JSONObject jSONObject, final JSONObject jSONObject2, final gjv gjvVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hn(jSONObject, jSONObject2, gjvVar);
        } else {
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.gjv.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.hn(jSONObject, jSONObject2, gjvVar);
                }
            });
        }
    }

    public void hnj(InterfaceC0208hnj interfaceC0208hnj) {
        this.qor = interfaceC0208hnj;
    }

    public void hnj(jip jipVar) {
        this.gjv = jipVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.fc
    public void hnj(orl orlVar, fc.hn hnVar, fc.hnj hnjVar) {
        InterfaceC0208hnj interfaceC0208hnj;
        if (orlVar == null) {
            return;
        }
        if ((orlVar.hn() == 1 || orlVar.hn() == 4) && (interfaceC0208hnj = this.qor) != null) {
            interfaceC0208hnj.hnj(orlVar);
        }
        if (hnVar == null || orlVar.gjv() == null) {
            return;
        }
        hnVar.hnj(orlVar.gjv());
    }

    @Override // com.bytedance.adsdk.ugeno.core.jip
    public void hnj(qor qorVar, MotionEvent motionEvent) {
        jip jipVar = this.gjv;
        if (jipVar != null) {
            jipVar.hnj(qorVar, motionEvent);
        }
    }
}
