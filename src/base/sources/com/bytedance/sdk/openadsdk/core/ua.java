package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ua implements com.bytedance.sdk.component.adexpress.sk.hn, com.bytedance.sdk.component.utils.xyo.hnj, com.bytedance.sdk.openadsdk.dnm.hn {
    private static final Map<String, Boolean> aq;
    private com.bytedance.sdk.openadsdk.core.ojm.fc apu;
    private com.bytedance.sdk.openadsdk.orl.hnj as;
    private String bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private boolean f14218cm;
    private String dkl;
    private WeakReference<View> dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.orl.sk f47do;
    private com.bytedance.sdk.openadsdk.core.widget.sk dse;
    private Context dzo;
    private JSONObject eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f14219fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.orl.dse f14220ff;
    private com.bytedance.sdk.openadsdk.orl.hn fvt;
    private WeakReference<com.bytedance.sdk.component.ojm.dkl> gjv;
    protected Map<String, Object> hnj;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.hnj jbd;
    private qor lu;
    private String mjg;
    private HashMap<String, dnm> nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private JSONObject f14223oj;
    private com.bytedance.sdk.openadsdk.dnm.qor ojm;
    private int orl;
    private String orp;
    private com.bytedance.sdk.openadsdk.core.mjg.gjv.hn pnz;
    private xyo pv;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f14225ta;
    private com.bytedance.sdk.openadsdk.core.qor.gjv tgn;
    private JSONObject tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private com.bytedance.sdk.component.hnj.fc f14226ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.gjv.gjv.sk f14227ul;
    private com.bytedance.sdk.openadsdk.core.model.as uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.orl.ta f14228vf;
    private com.bytedance.sdk.openadsdk.dnm.gjv wu;
    private boolean xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.dnm f14229xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private hnj f14230xo;
    private com.bytedance.sdk.openadsdk.orl.qor xyo;
    private boolean jip = true;
    private boolean hqh = true;
    private boolean pty = false;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private boolean f14221gm = false;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    boolean f14222hn = false;
    boolean qor = false;
    private boolean sq = false;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.component.utils.xyo f14224sk = new com.bytedance.sdk.component.utils.xyo(Looper.getMainLooper(), this);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hn {
        public JSONObject gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public String f14239hn;
        public String hnj;
        public String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        public int f14240sk;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface hnj {
        void hnj();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class qor implements Runnable {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final JSONObject f14241hn;
        private final com.bytedance.sdk.openadsdk.core.ojm.fc hnj;

        public qor(com.bytedance.sdk.openadsdk.core.ojm.fc fcVar, JSONObject jSONObject) {
            this.hnj = fcVar;
            this.f14241hn = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            ua.hn(this.hnj, this.f14241hn);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        aq = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public ua(Context context) {
        this.dzo = context;
    }

    private WebView apu() {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        WeakReference<com.bytedance.sdk.component.ojm.dkl> weakReference = this.gjv;
        if (weakReference == null || (dklVar = weakReference.get()) == null) {
            return null;
        }
        return dklVar.getWebView();
    }

    private Context as() {
        WeakReference<com.bytedance.sdk.component.ojm.dkl> weakReference = this.gjv;
        Activity activityHnj = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.hn.hnj(this.gjv.get());
        return activityHnj == null ? this.dzo : activityHnj;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m40do() {
        com.bytedance.sdk.openadsdk.orl.ta taVar = this.f14228vf;
        if (taVar == null) {
            return;
        }
        taVar.hnj();
    }

    private JSONObject eum() {
        try {
            View view = this.dnm.get();
            com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv.get();
            if (view != null && dklVar != null) {
                int[] iArrHn = com.bytedance.sdk.openadsdk.utils.sq.hn(view);
                int[] iArrHn2 = com.bytedance.sdk.openadsdk.utils.sq.hn((View) dklVar);
                if (iArrHn != null && iArrHn2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", com.bytedance.sdk.openadsdk.utils.sq.qor(oj.hnj(), iArrHn[0] - iArrHn2[0]));
                    jSONObject.put("y", com.bytedance.sdk.openadsdk.utils.sq.qor(oj.hnj(), iArrHn[1] - iArrHn2[1]));
                    jSONObject.put("w", com.bytedance.sdk.openadsdk.utils.sq.qor(oj.hnj(), view.getWidth()));
                    jSONObject.put("h", com.bytedance.sdk.openadsdk.utils.sq.qor(oj.hnj(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void fc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar;
        if (jSONObject == null || (skVar = this.f14227ul) == null) {
            return;
        }
        skVar.hn(jSONObject);
    }

    private boolean hqh() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.uua;
        if (asVar == null || asVar.ajq() == null || com.bytedance.sdk.openadsdk.core.model.hqh.hn(this.uua) || this.pty || this.uua.ajq().optInt("parent_type") != 2) {
            return false;
        }
        int iIz = this.uua.iz();
        if (iIz != 8 && iIz != 7) {
            return false;
        }
        this.pty = true;
        return true;
    }

    private void jip(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.orl.qor qorVar = this.xyo;
        if (qorVar == null || jSONObject == null) {
            return;
        }
        qorVar.hnj(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    private void mjg(JSONObject jSONObject) throws JSONException {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.hqh.ta(this.uua))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.hqh.ta(this.uua));
    }

    private void nyv() {
        if (this.ojm == null) {
            this.ojm = com.bytedance.sdk.openadsdk.dnm.hnj.hnj(this, this.uua);
        }
    }

    private boolean oj(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null && jSONObject != null) {
            double dQor = fcVar.qor();
            double dGjv = this.apu.gjv();
            int iSk = this.apu.sk();
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.TopLayoutHelper", "current:", Double.valueOf(dQor), "state", Integer.valueOf(iSk), "countdownTime", Double.valueOf(dGjv));
            try {
                jSONObject.put("currentTime", dQor / 1000.0d);
                if (dGjv > 0.0d) {
                    jSONObject.put("countDownTime", dGjv / 1000.0d);
                }
                jSONObject.put("state", iSk);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void orl(JSONObject jSONObject) throws JSONException {
        hnj(jSONObject, this.uua);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tgn() {
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            fcVar.hnj();
        }
    }

    private void tu() {
        com.bytedance.sdk.openadsdk.orl.ta taVar = this.f14228vf;
        if (taVar == null) {
            return;
        }
        taVar.hn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uua(JSONObject jSONObject) {
        if (this.apu == null || jSONObject == null) {
            return;
        }
        try {
            this.apu.hnj(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private JSONObject vf() {
        return hn(this.uua);
    }

    private static List<String> wu() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private void xn(JSONObject jSONObject) {
        int i10;
        double dOptDouble;
        double dOptDouble2;
        int i11;
        ua uaVar = this;
        if (uaVar.f14229xn == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = uaVar.f14227ul;
        if (skVar != null) {
            skVar.fc();
        }
        com.bytedance.sdk.component.adexpress.hn.mjg mjgVar = new com.bytedance.sdk.component.adexpress.hn.mjg();
        mjgVar.hnj(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    i11 = 101;
                    try {
                        double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                        double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                        if (uaVar.apu(jSONObjectOptJSONObject2)) {
                            mjgVar.hnj((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                            mjgVar.hn((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                            mjgVar.qor((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                            mjgVar.gjv((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                        }
                        mjgVar.qor(dOptDouble3);
                        mjgVar.gjv(dOptDouble4);
                        mjgVar.sk(dOptDouble5);
                        mjgVar.dkl(dOptDouble6);
                    } catch (Exception unused) {
                        uaVar = this;
                        i10 = 101;
                        mjgVar.hn(i10);
                        mjgVar.hnj(ojm.hnj(i10));
                        uaVar.f14229xn.hnj(mjgVar);
                    }
                } catch (Exception unused2) {
                    i10 = 101;
                    uaVar = this;
                    mjgVar.hn(i10);
                    mjgVar.hnj(ojm.hnj(i10));
                    uaVar.f14229xn.hnj(mjgVar);
                }
            } else {
                dOptDouble2 = dOptDouble2;
                i11 = 101;
            }
            try {
                String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ojm.hnj(i11));
                i10 = i11;
                try {
                    int iOptInt = jSONObject.optInt("code", i10);
                    mjgVar.hnj(zOptBoolean);
                    mjgVar.hnj(dOptDouble);
                    mjgVar.hn(dOptDouble2);
                    mjgVar.hnj(strOptString);
                    mjgVar.hn(iOptInt);
                    uaVar = this;
                    uaVar.f14229xn.hnj(mjgVar);
                } catch (Exception unused3) {
                    uaVar = this;
                    mjgVar.hn(i10);
                    mjgVar.hnj(ojm.hnj(i10));
                    uaVar.f14229xn.hnj(mjgVar);
                }
            } catch (Exception unused4) {
                uaVar = this;
                i10 = 101;
                mjgVar.hn(i10);
                mjgVar.hnj(ojm.hnj(i10));
                uaVar.f14229xn.hnj(mjgVar);
            }
        } catch (Exception unused5) {
        }
    }

    private void xyo() {
        if (this.dzo == null || TextUtils.isEmpty(oj.gjv().cm())) {
            return;
        }
        TTWebsiteActivity.hnj(this.dzo, this.uua, this.orp);
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            orl(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            hn(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void aq() {
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            fcVar.hn();
        }
    }

    public void bug() {
        com.bytedance.sdk.openadsdk.dnm.qor qorVar = this.ojm;
        if (qorVar != null) {
            qorVar.hnj();
        }
        qor qorVar2 = this.lu;
        if (qorVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.ua.hn(qorVar2);
            this.lu = null;
        }
        this.dzo = null;
        this.pnz = null;
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ua.3
                @Override // java.lang.Runnable
                public void run() {
                    ua.this.uua(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ua.4
                @Override // java.lang.Runnable
                public void run() {
                    ua.this.sk(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    public boolean dkl() {
        return this.f14222hn;
    }

    public void dnm() {
        hqh();
    }

    public void dse() {
        com.bytedance.sdk.openadsdk.orl.qor qorVar;
        if (this.f14218cm && (qorVar = this.xyo) != null) {
            qorVar.hnj();
            return;
        }
        Context context = this.dzo;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.as.hnj((Activity) context)) {
            ((Activity) this.dzo).finish();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            eum(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        oj(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.eum.toString();
        }
        try {
            JSONObject jSONObjectHnj = com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(this.eum, new JSONObject(str));
            return jSONObjectHnj == null ? this.eum.toString() : jSONObjectHnj.toString();
        } catch (Exception unused) {
            return this.eum.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public String getTemplateInfo() {
        hnj("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.eum;
            if (jSONObject != null) {
                jSONObject.put("setting", vf());
                com.bytedance.sdk.openadsdk.core.model.as asVar = this.uua;
                if (asVar != null && asVar.mdk() != null) {
                    this.eum.put("dynamic_configs", this.uua.mdk());
                }
                com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.uua;
                if (asVar2 != null) {
                    this.eum.put("extension", asVar2.tab());
                }
            }
            hnj("getTemplateInfo", false);
            return this.eum.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ua.6
            @Override // java.lang.Runnable
            public void run() {
                if (ua.this.jbd != null) {
                    ua.this.jbd.hnj();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            qor qorVar = this.lu;
            if (qorVar != null) {
                com.bytedance.sdk.openadsdk.utils.ua.hn(qorVar);
            }
            qor qorVar2 = new qor(this.apu, jSONObject);
            this.lu = qorVar2;
            com.bytedance.sdk.openadsdk.utils.ua.hnj(qorVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.AndroidObject", "");
        }
    }

    public boolean ojm() {
        return this.sq;
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            xn(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ua.5
            @Override // java.lang.Runnable
            public void run() {
                ua.this.tgn();
            }
        });
    }

    boolean ta() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.uua;
        return asVar != null && asVar.yo() == 1;
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.f14220ff == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.hn.mjg mjgVar = new com.bytedance.sdk.component.adexpress.hn.mjg();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (apu(jSONObjectOptJSONObject)) {
                    mjgVar.hnj((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft"));
                    mjgVar.hn((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                    mjgVar.qor((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                    mjgVar.gjv((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                }
                mjgVar.qor(dOptDouble);
                mjgVar.gjv(dOptDouble2);
                mjgVar.sk(dOptDouble3);
                mjgVar.dkl(dOptDouble4);
            }
            com.bytedance.sdk.openadsdk.orl.dse dseVar = this.f14220ff;
            if (dseVar != null) {
                dseVar.hnj(mjgVar);
            }
        } catch (Throwable unused) {
        }
    }

    private void ojm(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewApu = apu();
                    if (webViewApu != null) {
                        com.bytedance.sdk.component.utils.mjg.hnj(webViewApu, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    dse(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void wu(JSONObject jSONObject) {
        if (jSONObject == null || this.wu == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                this.wu.hnj(false, null);
            } else {
                this.wu.hnj(true, jSONArrayOptJSONArray);
            }
        } catch (Exception unused) {
            this.wu.hnj(false, null);
        }
    }

    public void dkl(String str) {
        this.orp = str;
    }

    public void dnm(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        xyo xyoVar = this.pv;
        if (xyoVar != null) {
            if (iOptInt == 1) {
                xyoVar.p_();
            } else if (iOptInt == 2) {
                xyoVar.q_();
            }
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.as gjv() {
        return this.uua;
    }

    public void orl() {
        hnj hnjVar = this.f14230xo;
        if (hnjVar != null) {
            hnjVar.hnj();
        }
    }

    public ua qor(String str) {
        this.f14225ta = str;
        return this;
    }

    public boolean sk() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.uua;
        return asVar != null && asVar.fzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aq(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return ta();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public JSONObject m39do(JSONObject jSONObject) {
        if (this.hnj != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.hnj.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor(e10.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    public void dkl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.as asVarHnj = com.bytedance.sdk.openadsdk.core.hn.hnj(jSONObject, null, null, null, 0);
        if (asVarHnj != null) {
            boolean zDse = com.bytedance.sdk.openadsdk.core.model.apu.dse(this.uua);
            hnj(asVarHnj, zDse ? com.bytedance.sdk.openadsdk.utils.orp.hn(this.orl) : this.orp, !zDse);
        }
    }

    public void fc() {
        xyo xyoVar = this.pv;
        if (xyoVar != null) {
            xyoVar.m_();
        }
    }

    public ua gjv(String str) {
        this.bug = str;
        return this;
    }

    public void jip() {
        xyo xyoVar = this.pv;
        if (xyoVar != null) {
            xyoVar.n_();
        }
    }

    public com.bytedance.sdk.openadsdk.core.mjg.gjv.hn mjg() {
        return this.pnz;
    }

    public void qor() {
        com.bytedance.sdk.component.hnj.fc fcVar = this.f14226ua;
        if (fcVar == null) {
            return;
        }
        fcVar.hnj();
        this.f14226ua = null;
    }

    public ua sk(String str) {
        this.mjg = str;
        return this;
    }

    public void ta(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.uua;
        if (asVar == null || (hnjVarGjv = asVar.gjv()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.as> listGjv = hnjVarGjv.gjv();
        if (iOptInt < 0 || iOptInt >= listGjv.size()) {
            return;
        }
        hnj(listGjv.get(iOptInt), this.orp, false);
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = this.pnz;
        if (hnVar != null) {
            hnVar.mkl();
        }
    }

    private boolean apu(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void as(JSONObject jSONObject) {
        WebView webViewApu;
        if (jSONObject == null || (webViewApu = apu()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.mjg.hnj(webViewApu, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    public void gjv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.hn.mjg mjgVar = new com.bytedance.sdk.component.adexpress.hn.mjg();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            mjgVar.qor(dOptDouble);
            mjgVar.gjv(dOptDouble2);
            mjgVar.sk(dOptDouble3);
            mjgVar.dkl(dOptDouble4);
        }
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            fcVar.hnj(iOptInt, mjgVar);
        }
    }

    public ua hn(String str) {
        this.dkl = str;
        return this;
    }

    public void sk(JSONObject jSONObject) {
        double d10;
        double d11;
        double dOptDouble;
        double d12;
        double d13;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.apu.hnj("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString("adId");
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d14 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d13 = dOptDouble6;
                d14 = dOptDouble2;
                d11 = dOptDouble3;
                d12 = dOptDouble5;
                d10 = dOptDouble4;
            } else {
                d10 = 0.0d;
                d11 = 0.0d;
                dOptDouble = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.jip jipVarHnj = new com.bytedance.sdk.openadsdk.core.model.jip.hnj().gjv((float) d14).qor((float) dOptDouble).hn((float) d11).hnj((float) d10).hn((long) d12).hnj((long) d13).hnj(strOptString2).hnj((SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj>) null).hnj(true).hn(iOptInt).hnj(jSONObjectOptJSONObject).hnj(jSONObject.optInt("clickAreaCategory", -1)).hn(jSONObjectOptJSONObject2).hnj();
            com.bytedance.sdk.component.adexpress.hn.dnm dnmVar = this.f14229xn;
            if (dnmVar != null) {
                dnmVar.hnj(null, iOptInt, jipVarHnj);
            }
            hnj(strOptString, iOptInt, jipVarHnj);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.hn.dnm dnmVar2 = this.f14229xn;
            if (dnmVar2 != null) {
                dnmVar2.hnj(null, -1, null);
            }
        }
    }

    public JSONObject uua() {
        JSONObject jSONObject = new JSONObject();
        try {
            xyo xyoVar = this.pv;
            if (xyoVar != null) {
                jSONObject.put("leftTime", xyoVar.o_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private void dse(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                hn hnVar = new hn();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        hnVar.hnj = jSONObjectOptJSONObject.optString("__msg_type", null);
                        hnVar.f14239hn = jSONObjectOptJSONObject.optString("__callback_id", null);
                        hnVar.qor = jSONObjectOptJSONObject.optString("func");
                        hnVar.gjv = jSONObjectOptJSONObject.optJSONObject("params");
                        hnVar.f14240sk = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(hnVar.hnj) && !TextUtils.isEmpty(hnVar.qor)) {
                    Message messageObtainMessage = this.f14224sk.obtainMessage(11);
                    messageObtainMessage.obj = hnVar;
                    this.f14224sk.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public com.bytedance.sdk.component.hnj.fc hn() {
        return this.f14226ua;
    }

    public JSONObject aq(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            try {
                jSONObject2.put("state", fcVar.hnj(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public ua hn(com.bytedance.sdk.component.ojm.dkl dklVar) {
        this.gjv = new WeakReference<>(dklVar);
        return this;
    }

    public void qor(JSONObject jSONObject) {
        xn.hnj(as(), this.dzo instanceof Activity, jSONObject, this.uua, this.orp, this.orl, apu(), this.dse);
    }

    public ua hn(int i10) {
        this.orl = i10;
        return this;
    }

    public static void hn(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = wu().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.qor.hnj());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.qor.sk());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.qor.hn());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.qor.qor());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.qor.gjv());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.qor.dkl());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.qor.hnj(oj.hnj()));
        if (DeviceUtils.hn(oj.hnj())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    public void bug(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.ua.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", ua.this.f14219fc);
                    } catch (Exception unused) {
                    }
                    new com.bytedance.sdk.openadsdk.gjv.hnj.C0242hnj(System.currentTimeMillis(), ua.this.uua).gjv(strOptString).hn(strOptString2).qor(strOptString3).hnj(ua.this.uua == null ? "" : ua.this.uua.ett()).hnj(ua.this.uua == null ? null : ua.this.uua.osq()).sk(String.valueOf(jOptLong)).dkl(String.valueOf(jOptLong2)).hnj(jSONObjectOptJSONObject).hnj((com.bytedance.sdk.openadsdk.gjv.hn.hnj) null);
                }
            }
        });
    }

    public ua hnj(com.bytedance.sdk.openadsdk.core.widget.hnj.hnj hnjVar) {
        this.jbd = hnjVar;
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        this.dse = skVar;
        return this;
    }

    public void oj() {
        xyo xyoVar = this.pv;
        if (xyoVar != null) {
            xyoVar.r_();
        }
    }

    public com.bytedance.sdk.openadsdk.orl.hn hnj() {
        return this.fvt;
    }

    private void eum(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.xn.hnj(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    private void qor(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            as(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.orl.hn hnVar) {
        this.fvt = hnVar;
    }

    public ua hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        WebView webView;
        if (dklVar != null && (webView = dklVar.getWebView()) != null) {
            try {
                this.f14226ua = com.bytedance.sdk.component.hnj.fc.hnj(webView).hnj(new com.bytedance.sdk.openadsdk.bug.hnj()).hnj("ToutiaoJSBridge").hnj(new com.bytedance.sdk.component.hnj.ta() { // from class: com.bytedance.sdk.openadsdk.core.ua.1
                    @Override // com.bytedance.sdk.component.hnj.ta
                    public <T> T hnj(String str, Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.hnj.ta
                    public <T> String hnj(T t10) {
                        return null;
                    }
                }).hnj(ta.hn().fc()).hn(true).hnj();
                if (com.bytedance.sdk.openadsdk.as.sk.dse()) {
                    com.bytedance.sdk.openadsdk.bug.hnj.aq.hnj(this.f14226ua, this);
                    com.bytedance.sdk.openadsdk.bug.hnj.ta.hnj(this.f14226ua, this);
                    com.bytedance.sdk.openadsdk.bug.hnj.apu.hnj(this.f14226ua, dklVar, this, this.uua);
                } else {
                    com.bytedance.sdk.openadsdk.bug.hnj.dse.hnj(this.f14226ua, this);
                    com.bytedance.sdk.openadsdk.bug.hnj.ojm.hnj(this.f14226ua, this);
                    com.bytedance.sdk.openadsdk.bug.hnj.xn.hnj(this.f14226ua, dklVar, this, this.uua);
                }
                com.bytedance.sdk.openadsdk.bug.hnj.hnj.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.hn.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.qor.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.dkl.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.dnm.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.fc.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.orl.hnj(this.f14226ua, dklVar);
                com.bytedance.sdk.openadsdk.bug.hnj.sk.hnj(this.f14226ua, this.eum);
                com.bytedance.sdk.openadsdk.bug.hnj.gjv.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.mjg.hnj(this.f14226ua, this, this.uua);
                com.bytedance.sdk.openadsdk.bug.hnj.jip.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.uua.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.bug.hnj(this.f14226ua, this);
                com.bytedance.sdk.openadsdk.bug.hnj.oj.hnj(this.f14226ua, this.uua);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public JSONObject ojm(JSONObject jSONObject) {
        List<com.bytedance.sdk.openadsdk.core.model.as> listKa;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = this.pnz;
            if (hnVar != null && (listKa = hnVar.ka()) != null) {
                for (int i10 = 0; i10 < listKa.size(); i10++) {
                    jSONArray.put(qor(listKa.get(i10)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void gjv(boolean z10) {
        this.f14218cm = z10;
    }

    public void qor(int i10) {
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            fcVar.hn(i10);
        }
    }

    public JSONObject dse(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            try {
                jSONObject2.put("state", fcVar.hn(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void qor(boolean z10) {
        this.xad = z10;
    }

    private JSONObject qor(com.bytedance.sdk.openadsdk.core.model.as asVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Saucuwx.ihyTLaIOFXAY, "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, asVar.pv());
        jSONObject2.put("req_id", asVar.jp());
        jSONObject2.put("ad_id", asVar.sp());
        jSONObject2.put("log_extra", asVar.ldn());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.dnm.hn().rq());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", asVar.xo());
        jSONObject.put("dynamic_creative", asVar.dlk());
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, asVar.kby());
        com.bytedance.sdk.openadsdk.core.model.as.hnj(asVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.as.hn(asVar, jSONObject);
        jSONObject.put("source", asVar.mw());
        jSONObject.put("button_text", asVar.bqc());
        com.bytedance.sdk.openadsdk.core.model.orl orlVarPdc = asVar.pdc();
        if (orlVarPdc != null) {
            jSONObject.put("deeplink_url", orlVarPdc.hnj());
        }
        jSONObject.put("app_name", asVar.sg());
        jSONObject.put("has_show", asVar.cm() ? 1 : 0);
        jSONObject.put("has_click", asVar.tl() ? 1 : 0);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(com.bytedance.sdk.openadsdk.core.ojm.fc fcVar, JSONObject jSONObject) {
        if (fcVar == null || jSONObject == null) {
            return;
        }
        try {
            fcVar.hnj(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), !jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public static JSONObject hn(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        int iAtw;
        boolean zUua;
        JSONObject jSONObject = new JSONObject();
        if (oj.gjv() != null) {
            if (asVar != null) {
                try {
                    iAtw = asVar.atw();
                } catch (Exception unused) {
                }
            } else {
                iAtw = 0;
            }
            int iIz = asVar != null ? asVar.iz() : 0;
            int iQlh = asVar != null ? asVar.qlh() : 0;
            int iKht = asVar != null ? asVar.kht() : 0;
            boolean zDkl = oj.gjv().dkl(String.valueOf(iAtw));
            boolean z10 = oj.gjv().orl(String.valueOf(iAtw)) == 1;
            if (iIz != 7 && iIz != 8) {
                zUua = oj.gjv().qor(String.valueOf(iAtw));
            } else {
                zUua = oj.gjv().uua(String.valueOf(iAtw));
            }
            jSONObject.put("voice_control", zUua);
            jSONObject.put("rv_skip_time", iQlh);
            jSONObject.put("fv_skip_show", zDkl);
            jSONObject.put("iv_skip_time", iKht);
            jSONObject.put("show_dislike", asVar != null && asVar.ij());
            jSONObject.put("video_adaptation", asVar != null ? asVar.krm() : 0);
            jSONObject.put("splash_image_count_down_time", oj.gjv().as(String.valueOf(iAtw)));
            if (asVar != null && asVar.mdk() != null) {
                jSONObject.put("dynamic_configs", asVar.mdk());
            }
            if (com.bytedance.sdk.openadsdk.core.model.apu.qor(asVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z10);
            }
            jSONObject.put("bar_render_platform", asVar.dzo() ? 1 : 0);
        }
        return jSONObject;
    }

    public void xn() {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = this.pnz;
        if (hnVar != null) {
            hnVar.nyv();
        }
    }

    public ua hnj(com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar) {
        this.f14227ul = skVar;
        return this;
    }

    public ua hnj(boolean z10) {
        this.f14221gm = z10;
        return this;
    }

    public ua hnj(View view) {
        this.dnm = new WeakReference<>(view);
        return this;
    }

    public ua hnj(int i10) {
        this.f14219fc = i10;
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        this.uua = asVar;
        if (asVar != null) {
            this.f14223oj = asVar.ajq();
        }
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.orl.qor qorVar) {
        this.xyo = qorVar;
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.orl.ta taVar) {
        this.f14228vf = taVar;
        return this;
    }

    public ua hnj(Map<String, Object> map) {
        this.hnj = map;
        return this;
    }

    public ua hnj(com.bytedance.sdk.component.adexpress.hn.dnm dnmVar) {
        this.f14229xn = dnmVar;
        return this;
    }

    public void hn(boolean z10) {
        this.f14222hn = z10;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.core.ojm.fc fcVar) {
        this.apu = fcVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            as(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public ua hnj(JSONObject jSONObject) {
        this.eum = jSONObject;
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.orl.hnj hnjVar) {
        this.as = hnjVar;
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.orl.sk skVar) {
        this.f47do = skVar;
        return this;
    }

    public ua hnj(com.bytedance.sdk.openadsdk.orl.dse dseVar) {
        this.f14220ff = dseVar;
        return this;
    }

    public static void hnj(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.as asVar) throws JSONException {
        String strSp = asVar.sp();
        if (!TextUtils.isEmpty(strSp)) {
            jSONObject.put(BidResponsedEx.KEY_CID, strSp);
        }
        String strLdn = asVar.ldn();
        if (!TextUtils.isEmpty(strLdn)) {
            jSONObject.put("log_extra", strLdn);
        }
        String strNl = asVar.nl();
        if (!TextUtils.isEmpty(strNl)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strNl);
        }
        jSONObject.put("dc", TextUtils.isEmpty(oj.gjv().pv()) ? oj.gjv().pv() : "TX");
        jSONObject.put("language", orl.hn());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.dnm.hn().rq());
    }

    public void hn(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    ojm(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.ua.10
                @Override // java.lang.Runnable
                public void run() {
                    long j10;
                    String strHnj;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    ua.this.orp = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (ua.this.aq(queryParameter3)) {
                        long j11 = 0;
                        try {
                            j10 = Long.parseLong(uri.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        } catch (Exception unused) {
                            j10 = 0;
                        }
                        try {
                            j11 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j12 = j11;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(ua.this.f14219fc));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(queryParameter3)) {
                            jSONObject = ua.this.m39do(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strHnj = ua.this.dkl;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strHnj = ua.this.hnj(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(ua.this.uua, queryParameter, strHnj, queryParameter3, j10, j12, jSONObject, com.bytedance.sdk.openadsdk.core.model.apu.dse(ua.this.uua));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x03bf A[PHI: r4
      0x03bf: PHI (r4v19 org.json.JSONObject) = (r4v14 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:239:0x040a, B:221:0x03bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: switch over string: strings are not added: [[cancel_download_app_ad]] */
    public JSONObject hnj(hn hnVar, int i10) throws JSONException {
        JSONObject jSONObjectEum;
        Context context;
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        if (!NotificationCompat.CATEGORY_CALL.equals(hnVar.hnj)) {
            return null;
        }
        if (ta.hn().fc()) {
            Log.d("TTAD.AndroidObject", "[JSB-REQ] version:" + i10 + " method:" + hnVar.qor);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = hnVar.qor;
        str.getClass();
        switch (str) {
            case "subscribe_app_ad":
                nyv();
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.orp, 0, (JSONObject) null);
                Context context2 = this.dzo;
                if (context2 != null) {
                    this.ojm.hnj(context2, hnVar.gjv, this.bug, this.orl, this.jip);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.orp, -1, (JSONObject) null);
                    break;
                }
                break;
            case "adInfo":
                orl(jSONObject2);
                break;
            case "pauseWebView":
                m40do();
                break;
            case "changeVideoState":
                uua(hnVar.gjv);
                break;
            case "openAdLandPageLinks":
                JSONObject jSONObject3 = hnVar.gjv;
                if (hnj(jSONObject3, jSONObject2)) {
                    qor(jSONObject3);
                    break;
                }
                break;
            case "webview_time_track":
                fc(hnVar.gjv);
                break;
            case "clickEvent":
                sk(hnVar.gjv);
                break;
            case "appInfo":
                hn(jSONObject2);
                break;
            case "getScreenSize":
                com.bytedance.sdk.openadsdk.orl.hnj hnjVar = this.as;
                if (hnjVar != null) {
                    int iHn = hnjVar.hn();
                    int iHnj = this.as.hnj();
                    jSONObject2.put("width", iHn);
                    jSONObject2.put("height", iHnj);
                    break;
                }
                break;
            case "openPrivacy":
                xyo();
                break;
            case "send_temai_product_ids":
                wu(hnVar.gjv);
                break;
            case "getTeMaiAds":
                jSONObjectEum = this.tu;
                if (jSONObjectEum != null) {
                    jSONObject2 = jSONObjectEum;
                    break;
                }
                break;
            case "download_app_ad":
                this.sq = true;
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.orp, 1, (JSONObject) null);
                com.bytedance.sdk.openadsdk.core.qor.gjv gjvVar = this.tgn;
                if (gjvVar != null) {
                    gjvVar.sk(this.hqh);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.dnm.qor qorVar = this.ojm;
                    if (qorVar != null && (context = this.dzo) != null) {
                        qorVar.hnj(context, hnVar.gjv, this.orp);
                        com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar2 = this.pnz;
                        if (hnVar2 != null) {
                            hnVar2.mkl();
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.uua, this.orp, -2, (JSONObject) null);
                    }
                    break;
                }
                break;
            case "close":
                dse();
                break;
            case "unsubscribe_app_ad":
                com.bytedance.sdk.openadsdk.dnm.qor qorVar2 = this.ojm;
                if (qorVar2 != null) {
                    qorVar2.hnj(hnVar.gjv);
                    break;
                }
                break;
            case "getCloseButtonInfo":
                jSONObjectEum = eum();
                if (jSONObjectEum != null) {
                    jSONObject2 = jSONObjectEum;
                    break;
                }
                break;
            case "isViewable":
                jSONObject2.put("viewStatus", this.f14221gm ? 1 : 0);
                break;
            case "getNativeSiteCustomData":
                com.bytedance.sdk.openadsdk.core.model.as asVar2 = this.uua;
                if (asVar2 != null && !TextUtils.isEmpty(asVar2.xw())) {
                    jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, this.uua.xw());
                    break;
                }
                break;
            case "sendReward":
                this.f14222hn = true;
                com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar3 = this.pnz;
                if (hnVar3 != null) {
                    hnVar3.ua();
                    break;
                }
                break;
            case "dynamicTrack":
                eum(hnVar.gjv);
                break;
            case "getTemplateInfo":
                JSONObject jSONObject4 = this.eum;
                if (jSONObject4 != null) {
                    jSONObject4.put("setting", vf());
                    com.bytedance.sdk.openadsdk.core.model.as asVar3 = this.uua;
                    if (asVar3 != null && asVar3.mdk() != null) {
                        this.eum.put("dynamic_configs", this.uua.mdk());
                    }
                    com.bytedance.sdk.openadsdk.core.model.as asVar4 = this.uua;
                    if (asVar4 != null) {
                        this.eum.put("extension", asVar4.tab());
                    }
                }
                jSONObject2 = this.eum;
                break;
            case "getCurrentVideoState":
                oj(jSONObject2);
                break;
            case "getVolume":
                AudioManager audioManager = (AudioManager) oj.hnj().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                jSONObject2.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case "pauseWebViewTimers":
                tu();
                break;
            case "muteVideo":
                hn(this.apu, hnVar.gjv);
                break;
            case "renderDidFinish":
                xn(hnVar.gjv);
                break;
            case "removeLoading":
                com.bytedance.sdk.openadsdk.orl.sk skVar = this.f47do;
                if (skVar != null) {
                    skVar.hnj();
                    break;
                }
                break;
            case "endcard_load":
                jip(hnVar.gjv);
                break;
            case "getNetworkData":
                hnj(hnVar, jSONObject2);
                break;
            case "playable_style":
                mjg(jSONObject2);
                break;
            case "sendLog":
                JSONObject jSONObject5 = hnVar.gjv;
                if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("extJson")) != null && jSONObject.has("category") && jSONObject.has("tag") && jSONObject.has("label")) {
                    String strOptString = jSONObject.optString("category");
                    String strOptString2 = jSONObject.optString("tag");
                    String strOptString3 = jSONObject.optString("label");
                    long jOptLong = jSONObject5.optLong(vHmGJpUTWNVV.IBZRnsIuadjdH);
                    long jOptLong2 = jSONObject5.optLong("extValue");
                    try {
                        jSONObject.putOpt("ua_policy", Integer.valueOf(this.f14219fc));
                        break;
                    } catch (Exception unused) {
                    }
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(strOptString3)) {
                        jSONObject = m39do(jSONObject);
                    }
                    if ("insight_log".equals(strOptString3) && (asVar = this.uua) != null && asVar.suj()) {
                        jSONObject.putOpt("page_visible", Integer.valueOf(this.uua.mg()));
                        jSONObject.putOpt("time_to_leave", Long.valueOf(this.uua.mxk() > 0 ? SystemClock.elapsedRealtime() - this.uua.mxk() : -1L));
                        jSONObject.putOpt("time_to_click", Long.valueOf(this.uua.yg() > 0 ? SystemClock.elapsedRealtime() - this.uua.yg() : -1L));
                    }
                    String strHnj = hnj(strOptString2, strOptString3);
                    boolean zDse = com.bytedance.sdk.openadsdk.core.model.apu.dse(this.uua);
                    hnj(jSONObject, zDse, strOptString3);
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.uua, strOptString, strHnj, strOptString3, jOptLong, jOptLong2, jSONObject, zDse);
                    break;
                }
                break;
            case "skipVideo":
                tgn();
                break;
            case "landscape_click":
                Context context3 = this.dzo;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) context3).mkl();
                    break;
                }
                break;
        }
        if (i10 == 1 && !TextUtils.isEmpty(hnVar.f14239hn)) {
            hn(hnVar.f14239hn, jSONObject2);
            if (ta.hn().fc()) {
                Log.d("TTAD.AndroidObject", "[JSB-RSP] version:" + i10 + " data=" + jSONObject2);
            }
        }
        return jSONObject2;
    }

    private void hnj(JSONObject jSONObject, boolean z10, String str) {
        com.bytedance.sdk.openadsdk.core.widget.sk skVar;
        if (z10) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) || (skVar = this.dse) == null) {
                    return;
                }
                skVar.hnj();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.hnj("TTAD.AndroidObject", "callAggClickListener faile", th2);
            }
        }
    }

    private boolean hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.oj.hnj(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.apu.hnj("TTAD.AndroidObject", "handleUrl, EX1->: ", e10);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.oj.hnj(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e11) {
                com.bytedance.sdk.component.utils.apu.hnj("TTAD.AndroidObject", "handleUrl, EX2->: ", e11);
            }
        }
        return true;
    }

    private void hnj(String str, boolean z10) {
        if (this.f14227ul == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.f14227ul.hnj(str);
        } else {
            this.f14227ul.hn(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sk.hn
    public void hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
            if (fcVar != null) {
                fcVar.hnj(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public void hnj(final hn hnVar, final JSONObject jSONObject) {
        if (hnVar == null) {
            return;
        }
        try {
            hnj(hnVar.gjv, new com.bytedance.sdk.openadsdk.orl.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ua.7
                @Override // com.bytedance.sdk.openadsdk.orl.gjv
                public void hnj(boolean z10, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                    if (!z10) {
                        ua.this.hn(hnVar.f14239hn, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", ua.hnj(hnjVar));
                        ua.this.hn(hnVar.f14239hn, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean hnj(String str, int i10, com.bytedance.sdk.openadsdk.core.model.jip jipVar) {
        HashMap<String, dnm> map;
        if (TextUtils.isEmpty(str) || (map = this.nyv) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public void hnj(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.orl.gjv gjvVar) {
        JSONObject jSONObjectOptJSONObject;
        if (gjvVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.orl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.orl.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ua.8
                @Override // com.bytedance.sdk.openadsdk.orl.gjv
                public void hnj(final boolean z10, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                    com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ua.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            gjvVar.hnj(z10, hnjVar);
                        }
                    });
                }
            };
            if (this.uua != null && !TextUtils.isEmpty(this.bug)) {
                int iIz = this.uua.iz();
                AdSlot adSlotAip = this.uua.aip();
                com.bytedance.sdk.openadsdk.core.model.xyo xyoVar = new com.bytedance.sdk.openadsdk.core.model.xyo();
                xyoVar.dkl = true;
                if (this.uua.zd() != null || this.uua.vk() != null) {
                    xyoVar.ojm = 2;
                }
                JSONObject jSONObject2 = this.f14223oj;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                xyoVar.dse = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (xyoVar.aq == null) {
                        xyoVar.aq = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            xyoVar.aq.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                oj.qor().hnj(adSlotAip, xyoVar, iIz, new wu() { // from class: com.bytedance.sdk.openadsdk.core.ua.9
                    @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
                    public void hnj(int i10, String str) {
                        gjvVar2.hnj(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
                    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                        ua.this.hnj(hnjVar, qorVar, gjvVar2);
                    }
                });
                return;
            }
            gjvVar2.hnj(false, null);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.AndroidObject", "get ads error", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar, com.bytedance.sdk.openadsdk.orl.gjv gjvVar) {
        if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.as asVar = hnjVar.gjv().get(0);
            if (asVar != null) {
                this.f14223oj = asVar.ajq();
            }
            gjvVar.hnj(true, hnjVar);
            return;
        }
        gjvVar.hnj(false, null);
        qorVar.hnj(-3);
        qorVar.qor(7);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
    }

    public static JSONArray hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.core.model.as asVarDkl;
        if (hnjVar == null || !hnjVar.sk() || (asVarDkl = hnjVar.dkl()) == null || TextUtils.isEmpty(asVarDkl.tm())) {
            return null;
        }
        try {
            return new JSONObject(asVarDkl.tm()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean hnj(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (aq.containsKey(uri.getHost())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String hnj(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.apu.dse(this.uua)) {
            return "show".equals(str2) ? com.bytedance.sdk.openadsdk.utils.orp.hnj(this.orl) : Lykgign.jJiCSJmm;
        }
        if (com.bytedance.sdk.openadsdk.core.model.hqh.sk(this.uua)) {
            return this.dkl;
        }
        if (this.xyo != null) {
            return com.bytedance.sdk.openadsdk.utils.orp.hnj(this.orl);
        }
        return this.f14229xn == null ? com.bytedance.sdk.openadsdk.utils.orp.hn(this.orl) : str;
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof hn) {
                try {
                    hnj((hn) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dnm.hn
    public void hnj(String str, JSONObject jSONObject) {
        qor(str, jSONObject);
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.qor.hnj(oj.hnj(), asVar, str, this.orl);
        hnjVar.hnj(com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(oj.hnj(), str));
        if (!z10) {
            hnjVar.hnj(false);
        }
        hnjVar.hnj((View) null);
    }

    public void hnj(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.ojm.fc fcVar = this.apu;
        if (fcVar != null) {
            fcVar.hnj(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = this.pnz;
        if (hnVar != null) {
            hnVar.hnj(str, jSONObject);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        this.pnz = hnVar;
    }

    public void hnj(xyo xyoVar) {
        this.pv = xyoVar;
    }

    public void hnj(hnj hnjVar) {
        this.f14230xo = hnjVar;
    }
}
