package com.bytedance.sdk.openadsdk.ta;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn<T> implements jip<T> {
    private final as gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f14612hn;
    private final long hnj = SystemClock.elapsedRealtime();
    private final jip<T> qor;

    public hn(final as asVar, String str, jip<T> jipVar) {
        this.qor = jipVar;
        this.gjv = asVar;
        this.f14612hn = str;
        com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.ta.hn.1
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar.hn("load_img");
                as asVar2 = asVar;
                if (asVar2 != null) {
                    hnjVar.qor(asVar2.pty("-1"));
                    hnjVar.gjv(orp.qor(asVar.xf()));
                }
                hnjVar.hnj(BuildConfig.VERSION_NAME);
                return hnjVar;
            }
        });
    }

    @Override // com.bytedance.sdk.component.sk.jip
    public void hnj(dnm<T> dnmVar) {
        jip<T> jipVar = this.qor;
        if (jipVar != null) {
            jipVar.hnj(dnmVar);
        }
        if (this.gjv != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.hnj;
            final int iDse = dnmVar.dse() / UserVerificationMethods.USER_VERIFY_ALL;
            final int i10 = dnmVar.dkl() ? 1 : 0;
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("load_image_success", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.ta.hn.2
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", hn.this.f14612hn);
                    jSONObject.put("preload_size", iDse);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", hn.this.gjv.qri());
                    jSONObject.put("use_new_img", 1);
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("load_image_success").hnj(hn.this.gjv.xf()).hn(jSONObject.toString());
                }
            });
            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.ta.hn.3
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("load_img");
                    if (hn.this.gjv != null) {
                        hnjVar.qor(hn.this.gjv.pty("-1"));
                        hnjVar.gjv(orp.qor(hn.this.gjv.xf()));
                    }
                    hnjVar.hnj(BuildConfig.VERSION_NAME);
                    return hnjVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.sk.jip
    public void hnj(final int i10, final String str, final Throwable th2) {
        jip<T> jipVar = this.qor;
        if (jipVar != null) {
            jipVar.hnj(i10, str, th2);
        }
        as asVar = this.gjv;
        if (asVar != null) {
            if (!TextUtils.isEmpty(orp.hnj(asVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.hnj;
                com.bytedance.sdk.openadsdk.jip.gjv.hnj("load_image_error", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.ta.hn.4
                    @Override // com.bytedance.sdk.openadsdk.jip.hn
                    public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", hn.this.f14612hn);
                        jSONObject.put("error_code", i10);
                        Throwable th3 = th2;
                        if (th3 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th3);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", hn.this.gjv.qri());
                        jSONObject.put("use_new_img", 1);
                        return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("load_image_error").hnj(hn.this.gjv.xf()).hn(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.ta.hn.5
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("load_img");
                    if (hn.this.gjv != null) {
                        hnjVar.qor(hn.this.gjv.pty("-1"));
                        hnjVar.gjv(orp.qor(hn.this.gjv.xf()));
                    }
                    hnjVar.hnj(BuildConfig.VERSION_NAME);
                    return hnjVar;
                }
            });
        }
    }
}
