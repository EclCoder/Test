package com.bytedance.sdk.openadsdk.gjv;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn implements com.bytedance.sdk.openadsdk.gjv.gjv.sk {
    private JSONArray aq;
    private JSONObject dkl;
    private JSONArray dse;
    private Boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f14480hn;
    private String hnj;
    private Boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Boolean f14481sk;

    public xn(int i10, String str, as asVar) {
        Boolean bool = Boolean.FALSE;
        this.qor = bool;
        this.gjv = bool;
        this.f14481sk = bool;
        this.hnj = str;
        this.f14480hn = asVar;
        this.dkl = new JSONObject();
        this.dse = new JSONArray();
        this.aq = new JSONArray();
        hnj(this.dkl, "webview_source", Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jip() {
        if (this.f14481sk.booleanValue()) {
            return true;
        }
        return this.gjv.booleanValue() && this.qor.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.qor
    public void aq() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.3
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "type", "native_enterBackground");
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dse, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hn
    public void bug() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.14
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                xn.this.hnj(jSONObject2, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis2));
                xn xnVar2 = xn.this;
                xnVar2.hnj(xnVar2.dkl, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.sk
    public void dnm() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.10
            @Override // java.lang.Runnable
            public void run() {
                if (xn.this.jip()) {
                    if (xn.this.dse != null && xn.this.dse.length() != 0) {
                        try {
                            xn.this.dkl.put("native_switchBackgroundAndForeground", xn.this.dse);
                        } catch (Exception unused) {
                        }
                    }
                    if (xn.this.aq != null && xn.this.aq.length() != 0) {
                        try {
                            xn.this.dkl.put("intercept_source", xn.this.aq);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", xn.this.dkl);
                    } catch (JSONException e10) {
                        apu.hnj("WebviewTimeTrack", "trySendTrackInfo json error", e10);
                    }
                    if (com.bytedance.sdk.openadsdk.core.ta.hn().fc() && xn.this.dkl != null) {
                        JSONObject unused3 = xn.this.dkl;
                    }
                    qor.hn(xn.this.f14480hn, xn.this.hnj, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.qor
    public void dse() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.gjv
    public void fc() {
        try {
            com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.17
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                    xn xnVar = xn.this;
                    xnVar.hnj(xnVar.dkl, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.gjv
    public void mjg() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.16
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.qor
    public void ojm() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.4
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "type", "native_enterForeground");
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dse, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hn
    public void orl() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.15
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.sk
    public void ta() {
        this.qor = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.qor
    public void dkl() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.31
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void dse(final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.24
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void gjv() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.28
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.gjv
    public void hn() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.12
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.qor
    public void qor() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.27
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void sk() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.29
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void dkl(final String str) {
        try {
            com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.21
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                    xn xnVar = xn.this;
                    xnVar.hnj(xnVar.dkl, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void gjv(final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.18
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hn(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, "start_ts", Long.valueOf(j10));
                xn.this.hnj(jSONObject, "end_ts", Long.valueOf(j11));
                xn.this.hnj(jSONObject, "intercept_type", Integer.valueOf(i10));
                xn.this.hnj(jSONObject, "type", "intercept_js");
                xn.this.hnj(jSONObject, "url", str);
                xn.this.hnj(jSONObject, "duration", Long.valueOf(j11 - j10));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.aq, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void qor(final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void sk(final String str) {
        try {
            com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.20
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                    xn xnVar = xn.this;
                    xnVar.hnj(xnVar.dkl, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hn(final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "jsb", str);
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void qor(final int i10, final String str) {
        try {
            com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.22
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                    xn.this.hnj(jSONObject, "code", Integer.valueOf(i10));
                    xn xnVar = xn.this;
                    xnVar.hnj(xnVar.dkl, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hn(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (xn.this.dkl == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    xn xnVar = xn.this;
                    xnVar.hnj(xnVar.dkl, next, jSONObject.opt(next));
                }
                xn.this.gjv = Boolean.TRUE;
                xn.this.dnm();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void hn(final int i10, final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.13
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "code", Integer.valueOf(i10));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.gjv
    public void hnj() {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn xnVar = xn.this;
                xnVar.hnj(jSONObject, "render_sequence", Integer.valueOf(xnVar.f14480hn.rq()));
                if (xn.this.f14480hn != null) {
                    if (xn.this.f14480hn.zd() != null) {
                        if (xn.this.f14480hn.zd().bug()) {
                            xn.this.hnj(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.sk.sk.hnj().gjv()));
                            xn.this.hnj(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.sk.sk.hnj().gjv()));
                        } else {
                            xn.this.hnj(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.sk.sk.hnj().qor()));
                            xn.this.hnj(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.sk.sk.hnj().qor()));
                        }
                    } else if (xn.this.f14480hn.vk() != null) {
                        xn.this.hnj(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.sk.sk.hnj().gjv()));
                        xn.this.hnj(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.sk.sk.hnj().gjv()));
                    }
                }
                xn xnVar2 = xn.this;
                xnVar2.hnj(xnVar2.dkl, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hn(final int i10) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.25
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "isWebViewCache", Integer.valueOf(i10));
                if (xn.this.f14480hn != null) {
                    if (xn.this.f14480hn.bgg()) {
                        xn.this.hnj(jSONObject, "engine_version", "v3");
                    } else {
                        xn.this.hnj(jSONObject, "engine_version", "v1");
                    }
                }
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "before_webview_request", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.gjv
    public void hnj(final int i10, final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.23
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "code", Integer.valueOf(i10));
                String str2 = str;
                if (str2 != null) {
                    xn.this.hnj(jSONObject, "reason", str2);
                }
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hn
    public void hnj(final int i10) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.26
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "backup_type", Integer.valueOf(i10));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hnj(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.30
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                xn.this.hnj(jSONObject2, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hnj(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, "start_ts", Long.valueOf(j10));
                xn.this.hnj(jSONObject, "end_ts", Long.valueOf(j11));
                xn.this.hnj(jSONObject, "intercept_type", Integer.valueOf(i10));
                xn.this.hnj(jSONObject, "type", "intercept_html");
                xn.this.hnj(jSONObject, "url", str);
                xn.this.hnj(jSONObject, "duration", Long.valueOf(j11 - j10));
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.aq, jSONObject);
            }
        });
    }

    protected xn() {
        this.hnj = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.qor = bool;
        this.gjv = bool;
        this.f14481sk = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.dkl
    public void hnj(final String str) {
        com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                xn.this.hnj(jSONObject, "jsb", str);
                xn xnVar = xn.this;
                xnVar.hnj(xnVar.dkl, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.sk
    public void hnj(boolean z10) {
        this.f14481sk = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(JSONObject jSONObject, String str, Object obj, boolean z10) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(JSONObject jSONObject, String str, Object obj) {
        hnj(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.gjv.hnj
    public void hnj(final String str, final boolean z10) {
        try {
            com.bytedance.sdk.component.utils.ojm.hnj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gjv.xn.19
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    xn.this.hnj(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(jCurrentTimeMillis));
                    xn.this.hnj(jSONObject, "isReuse", Integer.valueOf(z10 ? 1 : 0));
                    xn xnVar = xn.this;
                    xnVar.hnj(xnVar.dkl, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
