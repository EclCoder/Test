package com.bytedance.sdk.openadsdk.core.dnm;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.mbridge.msdk.MBridgeConstans;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private volatile boolean f13699hn;
    private PglSSManager hnj;
    private volatile boolean qor = true;
    private volatile boolean gjv = false;

    public hnj() {
        hnj();
    }

    private boolean aq() {
        if (!this.f13699hn && this.qor) {
            hnj();
        }
        return this.f13699hn;
    }

    private void ojm() {
        if (this.hnj == null) {
            this.hnj = PglSSManager.getInstance();
        }
    }

    private Class ta() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
            try {
                this.qor = true;
                return cls;
            } catch (Throwable unused) {
                this.qor = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
    }

    public long dkl() {
        if (!aq()) {
            return 0L;
        }
        ojm();
        PglSSManager pglSSManager = this.hnj;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public int dse() {
        if (this.qor) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public String gjv() {
        if (!aq()) {
            return "";
        }
        ojm();
        PglSSManager pglSSManager = this.hnj;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public boolean hn() {
        return this.f13699hn;
    }

    public void qor() {
        if (aq()) {
            ojm();
            if (this.hnj != null) {
                fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dnm.hnj.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, oj.gjv().wu());
                            hnj.this.hnj.setCustomInfo(map);
                        } catch (Throwable th2) {
                            apu.qor("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String sk() {
        if (!aq()) {
            return "";
        }
        ojm();
        PglSSManager pglSSManager = this.hnj;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public void hn(String str) {
        if (aq()) {
            ojm();
            PglSSManager pglSSManager = this.hnj;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public synchronized void hnj() {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return;
        }
        if (!this.f13699hn) {
            try {
                Context contextHnj = oj.hnj();
                String strGjv = ta.hn().gjv();
                if (TextUtils.isEmpty(strGjv)) {
                    strGjv = ta.hnj(MBridgeConstans.APP_ID, Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strGjv)) {
                    return;
                }
                String strHnj = orl.hnj(contextHnj);
                String strHn = com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn();
                PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strGjv).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                String strHn2 = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strHn2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strHn2);
                }
                Set<String> setVk = dnm.hn().vk();
                if (setVk != null && !setVk.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setVk);
                }
                String strOj = orp.oj();
                if (!TextUtils.isEmpty(strOj)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strOj);
                }
                map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, dnm.hn().mw());
                String strHnj2 = sk.hnj(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                if (!TextUtils.isEmpty(strHnj2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strHnj2);
                }
                pglSSConfigBuild.setCustomInfo(map);
                pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.dnm.hnj.1
                    @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                    public void reportSoftDecData(final String str, final String str2) {
                        gjv.hnj(str, false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.dnm.hnj.1.1
                            @Override // com.bytedance.sdk.openadsdk.jip.hn
                            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(str).hn(str2);
                            }
                        });
                    }
                });
                PglSSManager.init(contextHnj, pglSSConfigBuild, null, null, strHnj, strHn);
                ojm();
                this.f13699hn = true;
            } catch (Throwable unused) {
                ta();
                this.f13699hn = false;
            }
            try {
                if (this.qor) {
                    qor(PglSSManager.getLoadError());
                }
            } catch (Throwable th2) {
                apu.qor("mssdk", th2.getMessage());
            }
        }
    }

    private void qor(final String str) {
        if (this.gjv || TextUtils.isEmpty(str)) {
            return;
        }
        oj.sk().hnj(new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.dnm.hnj.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("secsdk_init_error").hn(str);
            }
        }, false);
        this.gjv = true;
    }

    public void hnj(String str) {
        if (aq()) {
            ojm();
            PglSSManager pglSSManager = this.hnj;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void hnj(final Map<String, Object> map) {
        if (aq()) {
            ojm();
            if (this.hnj != null) {
                fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dnm.hnj.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            hnj.this.hnj.setCustomInfo(map);
                        } catch (Throwable th2) {
                            apu.qor("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void hnj(String str, Map<String, Object> map) {
        if (aq()) {
            ojm();
            PglSSManager pglSSManager = this.hnj;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void hnj(MotionEvent motionEvent) {
        if (hn()) {
            ojm();
            PglSSManager pglSSManager = this.hnj;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> hnj(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!aq() || (featureHash = this.hnj.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
