package com.bytedance.sdk.openadsdk.eum.hnj.hn;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.jip.hn;
import com.bytedance.sdk.openadsdk.jip.hnj.gjv;
import com.bytedance.sdk.openadsdk.jip.qor;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static volatile hnj aq;
    private volatile Boolean hnj = null;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private AtomicLong f14336hn = new AtomicLong(0);
    private int qor = 0;
    private String gjv = "";

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final CountDownLatch f14337sk = new CountDownLatch(1);
    private volatile boolean dkl = false;
    private String dse = "";

    private hnj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qor() {
        if (this.hnj == null) {
            synchronized (this) {
                try {
                    if (this.hnj == null) {
                        this.hnj = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= qor.hn("gid_status", 100));
                        if (this.hnj.booleanValue()) {
                            try {
                                this.dse = tgn.hnj();
                            } catch (Throwable unused) {
                                this.dse = "default";
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.hnj.booleanValue();
    }

    public String hn() {
        if (oj.gjv().zd() != 1) {
            return this.gjv;
        }
        if (ua.dkl()) {
            return this.gjv;
        }
        if (!this.dkl) {
            try {
                this.f14337sk.await(4L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            } finally {
                this.dkl = true;
                this.f14337sk.countDown();
            }
        }
        return this.gjv;
    }

    public static hnj hnj() {
        if (aq == null) {
            synchronized (hnj.class) {
                try {
                    if (aq == null) {
                        aq = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return aq;
    }

    public void hnj(boolean z10) {
        if (this.qor == 1 || !TextUtils.isEmpty(this.gjv)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z10 || this.f14336hn.get() <= jElapsedRealtime) {
            this.f14336hn.set(jElapsedRealtime + 300000);
            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.qor] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? IsLimitAdTrackingEnabled;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(oj.hnj());
                        if (advertisingIdInfo != null) {
                            IsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (IsLimitAdTrackingEnabled != 0) {
                                hnj.this.qor = 1;
                                hnj.this.hnj(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            }
                            if (IsLimitAdTrackingEnabled == 0) {
                                String id2 = advertisingIdInfo.getId();
                                String str = hnj.this.gjv;
                                if (TextUtils.isEmpty(id2)) {
                                    hnj.this.hnj(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                } else {
                                    hnj.this.gjv = id2;
                                    hnj.this.hnj(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                if (!str.equals(id2)) {
                                    orl.hnj();
                                }
                            }
                        } else {
                            IsLimitAdTrackingEnabled = -1;
                        }
                        if (IsLimitAdTrackingEnabled != -1) {
                            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("limit_ad_track", IsLimitAdTrackingEnabled);
                        }
                    } catch (Throwable th2) {
                        try {
                            hnj.this.qor = 2;
                            hnj.this.hnj(3, th2, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            apu.qor("AdvertisingIdHelper", th2.getMessage());
                        } finally {
                            hnj.this.dkl = true;
                            hnj.this.f14337sk.countDown();
                            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(hnj.this.gjv);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String hn(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.toString());
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                sb2.append("\n\tat ");
                sb2.append(stackTraceElement.toString());
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("gaid", hn());
        } catch (JSONException unused) {
        }
    }

    public void hnj(boolean z10, long j10) {
        hnj(z10, 0, "", null, j10);
    }

    public void hnj(int i10, String str, long j10) {
        hnj(false, i10, str, null, j10);
    }

    public void hnj(int i10, Throwable th2, long j10) {
        hnj(false, i10, "", th2, j10);
    }

    public void hnj(final boolean z10, final int i10, final String str, final Throwable th2, final long j10) {
        if ((this.hnj == null || this.hnj.booleanValue()) && oj.hnj() != null) {
            oj.sk().hnj(new hn() { // from class: com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.2
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    if (!hnj.this.qor()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("session_id", hnj.this.dse);
                    jSONObject.put("is_success", z10);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? hnj.hn(th2) : str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("has_setting", dnm.hn().jo() > 0);
                    return gjv.hn().hnj("gid_status").hn(jSONObject.toString());
                }
            }, false);
        }
    }
}
