package com.bytedance.sdk.openadsdk.dkl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.aq;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.jip.hnj.qor;
import com.bytedance.sdk.openadsdk.utils.gm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static volatile hn hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.uua.hnj> f14307hn = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.uua.hnj qor = null;
    private volatile boolean gjv = false;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private volatile HandlerThread f14308sk = null;
    private volatile Handler dkl = null;
    private String dse = "";
    private int aq = 0;
    private volatile long ojm = 0;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Runnable f14309ta = new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (hnj.hnj().sk()) {
                        Set<String> setKeySet = hn.this.f14307hn.keySet();
                        if (setKeySet.size() > hn.this.aq) {
                            hn.this.aq = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(hn.this.f14307hn.values());
                        Collections.sort(arrayList);
                        for (int i10 = 0; i10 < arrayList.size() && i10 < 5; i10++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.uua.hnj) arrayList.get(i10)).hn());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.uua.hnj hnjVar = (com.bytedance.sdk.openadsdk.uua.hnj) hn.this.f14307hn.get(str);
                                if (hnjVar != null) {
                                    JSONObject jSONObjectHnj = hnjVar.hnj(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectHnj);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e10) {
                            apu.qor(e10.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (hn.this.qor != null) {
                                jSONObject.put("common", hn.this.qor.hnj(jSONObject2));
                            }
                        } catch (JSONException e11) {
                            apu.qor(e11.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    apu.qor(th2.getMessage(), new Object[0]);
                }
                hn.this.dse = jSONObject.toString();
                hn hnVar = hn.this;
                hnVar.hnj(hnVar.f14309ta, hnj.hnj().gjv());
            } catch (OutOfMemoryError e12) {
                apu.qor(e12.getMessage(), new Object[0]);
            }
        }
    };

    private hn() {
    }

    private void sk() {
        if (this.gjv) {
            return;
        }
        this.gjv = true;
        hnj(this.f14309ta, hnj.hnj().gjv());
    }

    private void gjv() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.ojm > 10000) {
            gjv.hnj("track_feature_result", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.1
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public qor hnj() throws JSONException {
                    hn.this.ojm = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(hn.this.aq));
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("track_feature_result").hn(jSONObject.toString());
                }
            });
        }
    }

    private Handler qor() {
        if (this.f14308sk == null || !this.f14308sk.isAlive()) {
            synchronized (fc.class) {
                try {
                    if (this.f14308sk == null || !this.f14308sk.isAlive()) {
                        this.f14308sk = aq.hnj("pag_feature", -1);
                        this.dkl = new Handler(this.f14308sk.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (this.dkl == null) {
            synchronized (fc.class) {
                try {
                    if (this.dkl == null) {
                        this.dkl = new Handler(this.f14308sk.getLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.dkl;
    }

    public void hn() {
        try {
            if (hnj.hnj().qor()) {
                hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!hnj.hnj().sk()) {
                            if (hn.this.qor != null) {
                                hn.this.qor.hnj();
                            }
                        } else {
                            Iterator it = hn.this.f14307hn.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.uua.hnj hnjVar = (com.bytedance.sdk.openadsdk.uua.hnj) hn.this.f14307hn.get((String) it.next());
                                if (hnjVar != null) {
                                    hnjVar.hnj();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e10) {
            apu.qor(e10.getMessage(), new Object[0]);
        }
    }

    private void hnj(Runnable runnable) {
        if (gm.hnj || runnable == null) {
            return;
        }
        try {
            qor().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(Runnable runnable, long j10) {
        if (gm.hnj || runnable == null) {
            return;
        }
        try {
            qor().postDelayed(runnable, j10);
        } catch (Throwable unused) {
        }
    }

    public static hn hnj() {
        if (hnj == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.qor.class) {
                try {
                    if (hnj == null) {
                        hnj = new hn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hnj(JSONObject jSONObject) {
        if (hnj.hnj().qor()) {
            try {
                jSONObject.put("feature_data", this.dse);
                gjv();
            } catch (JSONException e10) {
                apu.qor(e10.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && hnj.hnj().qor()) {
                sk();
                if (hnj.hnj().sk()) {
                    com.bytedance.sdk.openadsdk.uua.hnj hnjVar = this.f14307hn.get(str2);
                    if (hnjVar == null) {
                        hnjVar = new com.bytedance.sdk.openadsdk.uua.hnj(str2);
                    }
                    hnjVar.hnj(str, str3);
                    this.f14307hn.put(str2, hnjVar);
                    return;
                }
                if (this.qor == null) {
                    this.qor = new com.bytedance.sdk.openadsdk.uua.hnj(str2);
                }
                this.qor.hnj(str, str3);
            }
        } catch (OutOfMemoryError e10) {
            apu.qor(e10.getMessage(), new Object[0]);
        }
    }

    public void hnj(final String str, final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !hnj.hnj().qor()) {
            return;
        }
        if (!"show".equals(str) && !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) && !"dislike".equals(str)) {
            if (hnj.hnj().oj()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        hn.this.hnj(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.2
            @Override // java.lang.Runnable
            public void run() {
                hn.this.hnj(str, str2, str3);
            }
        });
    }

    public void hnj(final String str, final as asVar) {
        if (!TextUtils.isEmpty(str) && hnj.hnj().qor() && as.sk(asVar)) {
            if (!hnj.hnj().oj() || asVar.xf() == 8 || asVar.xf() == 7 || asVar.xf() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strPv = asVar.pv();
                            String strJp = asVar.jp();
                            if (TextUtils.isEmpty(strPv)) {
                                return;
                            }
                            hn.this.hnj(str, strPv, strJp);
                        }
                    });
                }
            }
        }
    }

    public void hnj(final String str, final as asVar, final String str2) {
        if (TextUtils.isEmpty(str) || !hnj.hnj().qor()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dkl.hn.5
                @Override // java.lang.Runnable
                public void run() {
                    as asVar2 = asVar;
                    if (asVar2 == null || TextUtils.isEmpty(asVar2.pv())) {
                        return;
                    }
                    hn.this.hnj(str, asVar.pv(), asVar.jp() + str2);
                }
            });
        }
    }
}
