package com.bytedance.sdk.openadsdk.core.ta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.Cdo;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.jip.hnj.sk;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private gjv f14213hn;
    private final AtomicInteger hnj = new AtomicInteger(0);
    private final Runnable qor = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ta.qor.3
        @Override // java.lang.Runnable
        public void run() {
            qor.this.hnj();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        if (!hn.hnj().dse()) {
            hnj(false);
            return;
        }
        int iIncrementAndGet = this.hnj.incrementAndGet();
        if (iIncrementAndGet > 3) {
            hnj(false);
        } else {
            fc.hn().removeCallbacks(this.qor);
            fc.hn().postDelayed(this.qor, iIncrementAndGet * 10000);
        }
    }

    private JSONObject qor() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.APP_ID, ta.hn().gjv());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void hnj(gjv gjvVar) {
        this.f14213hn = gjvVar;
    }

    public void hnj() {
        try {
            if (hn.hnj().dkl()) {
                hnj(true);
                return;
            }
            JSONObject jSONObjectQor = qor();
            com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
            final String strHnj = orp.hnj("/api/ad/union/sdk/register_status/", false, true);
            gjvVarHn.qor(strHnj);
            gjvVarHn.hn(Command.HTTP_HEADER_USER_AGENT, "");
            gjvVarHn.sk(hn(jSONObjectQor).toString());
            gjvVarHn.hnj(6);
            gjvVarHn.hn("register_stats");
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.qor.1
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn(Saucuwx.pkH);
                    hnjVar.dse(qor.this.hnj(oj.hnj()).toString());
                    return hnjVar;
                }
            });
            gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.ta.qor.2
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                    String strGjv = hnVar.gjv();
                    if (!hnVar.dkl() || TextUtils.isEmpty(strGjv)) {
                        qor.this.hn();
                        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.qor.2.2
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("register_status");
                                hnjVar.dse(qor.this.hnj(oj.hnj()).toString());
                                return hnjVar;
                            }
                        });
                        if (qorVar != null) {
                            wu.hnj(qorVar.sk());
                            sk.hnj("register_status", strHnj, hnVar.hnj(), hnVar.hn(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.qor.2.1
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("register_status");
                                hnjVar.dse(qor.this.hnj(oj.hnj()).toString());
                                return hnjVar;
                            }
                        });
                        wu.hn();
                        JSONObject jSONObject = new JSONObject(strGjv);
                        String strHnj2 = Cdo.hnj(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (TextUtils.isEmpty(strHnj2)) {
                            qor.this.hn();
                            return;
                        }
                        qor.this.hnj(qor.this.hnj(new JSONObject(strHnj2)));
                    } catch (Throwable unused) {
                        qor.this.hn();
                    }
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    qor.this.hn();
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.qor.2.3
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("register_status");
                            hnjVar.dse(qor.this.hnj(oj.hnj()).toString());
                            return hnjVar;
                        }
                    });
                    if (qorVar != null) {
                        wu.hnj(qorVar.sk());
                        sk.hnj("register_status", qorVar.sk(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            hn();
        }
    }

    private JSONObject hn(JSONObject jSONObject) {
        return Cdo.hnj(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10) {
        gjv gjvVar = this.f14213hn;
        if (gjvVar != null) {
            gjvVar.hnj(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(JSONObject jSONObject) {
        int iQor = hn.hnj().qor();
        if (jSONObject.has("app_reg")) {
            iQor = jSONObject.optInt("app_reg", -1);
            hn.hnj().hnj(iQor);
        }
        return iQor == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject hnj(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", com.bytedance.sdk.component.utils.oj.hnj(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
