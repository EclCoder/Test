package com.bytedance.sdk.openadsdk.core.ta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.Cdo;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.jip.hnj.sk;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private boolean qor;
    private final AtomicInteger hnj = new AtomicInteger(0);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private gjv f14211hn = null;
    private final Runnable gjv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ta.hnj.3
        @Override // java.lang.Runnable
        public void run() {
            hnj.this.hnj();
        }
    };

    public hnj(boolean z10) {
        this.qor = false;
        this.qor = z10;
    }

    private JSONObject qor() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tcstring", dnm.hn(oj.hnj()));
            jSONObject.put("tcf_gdpr", dnm.hnj(oj.hnj()));
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        if (!hn.hnj().ta()) {
            hnj(false);
            return;
        }
        int iIncrementAndGet = this.hnj.incrementAndGet();
        if (iIncrementAndGet > 3) {
            hnj(false);
        } else {
            fc.hn().removeCallbacks(this.gjv);
            fc.hn().postDelayed(this.gjv, iIncrementAndGet * 10000);
        }
    }

    public void hnj(gjv gjvVar) {
        this.f14211hn = gjvVar;
    }

    public void hnj() {
        try {
            if (!this.qor) {
                String strHn = dnm.hn(oj.hnj());
                int iHnj = dnm.hnj(oj.hnj());
                if (TextUtils.equals(strHn, dnm.gjv) && iHnj == dnm.f14178sk && hn.hnj().ojm()) {
                    hnj(true);
                    return;
                }
            }
            JSONObject jSONObjectQor = qor();
            com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
            final String strHnj = orp.hnj("/api/ad/union/sdk/compliance_status/", false, true);
            gjvVarHn.qor(strHnj);
            gjvVarHn.hn(Command.HTTP_HEADER_USER_AGENT, "");
            gjvVarHn.sk(hn(jSONObjectQor).toString());
            gjvVarHn.hnj(6);
            gjvVarHn.hn("compliance_stats");
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.hnj.1
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("compliance_status");
                    hnjVar.dse(hnj.this.hnj(oj.hnj()).toString());
                    return hnjVar;
                }
            });
            gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.ta.hnj.2
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                    String strGjv = hnVar.gjv();
                    if (!hnVar.dkl() || TextUtils.isEmpty(strGjv)) {
                        hnj.this.hn();
                        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.hnj.2.2
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("compliance_status");
                                hnjVar.dse(hnj.this.hnj(oj.hnj()).toString());
                                return hnjVar;
                            }
                        });
                        if (qorVar != null) {
                            wu.hnj(qorVar.sk());
                            sk.hnj("compliance_status", strHnj, hnVar.hnj(), hnVar.hn(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.hnj.2.1
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("compliance_status");
                                hnjVar.dse(hnj.this.hnj(oj.hnj()).toString());
                                return hnjVar;
                            }
                        });
                        wu.hn();
                        JSONObject jSONObject = new JSONObject(strGjv);
                        String strHnj2 = Cdo.hnj(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (TextUtils.isEmpty(strHnj2)) {
                            hnj.this.hn();
                            return;
                        }
                        if (!hnj.this.hnj(new JSONObject(strHnj2))) {
                            hnj.this.hnj(false);
                        } else if (!hnj.this.qor || TextUtils.isEmpty(dnm.hn().xo())) {
                            hnj.this.hnj(true);
                        } else {
                            hnj.this.hnj(false);
                        }
                    } catch (Throwable unused) {
                        hnj.this.hn();
                    }
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    hnj.this.hn();
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ta.hnj.2.3
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("compliance_status");
                            hnjVar.dse(hnj.this.hnj(oj.hnj()).toString());
                            return hnjVar;
                        }
                    });
                    if (qorVar != null) {
                        wu.hnj(qorVar.sk());
                        sk.hnj("compliance_status", qorVar.sk(), -1, iOException != null ? iOException.getMessage() : null, null, null);
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
        gjv gjvVar = this.f14211hn;
        if (gjvVar != null) {
            gjvVar.hnj(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(JSONObject jSONObject) {
        int iAq = hn.hnj().aq();
        if (jSONObject.has("user_compliance_status")) {
            iAq = jSONObject.optInt("user_compliance_status", -1);
            hn.hnj().hn(iAq);
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            hn.hnj().hnj(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            hn.hnj().hnj(jSONObject.optLong("allow_req_time", hn.hnj.longValue()));
        }
        return iAq == 1 || iAq == 2;
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
