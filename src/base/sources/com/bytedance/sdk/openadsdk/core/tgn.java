package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.vungle.ads.internal.signals.b;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tgn {
    private static final AtomicInteger gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final AtomicInteger f14215hn;
    private static final AtomicInteger hnj;
    private static final AtomicInteger qor;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        hnj = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f14215hn = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        qor = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        gjv = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void hn() {
        final int i10 = hnj.get();
        final int i11 = f14215hn.get();
        final int i12 = qor.get();
        final int i13 = gjv.get();
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.tgn.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("crypt_v4_statistics").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj() {
        try {
            long jHnj = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "upload_time_key", 0L);
            if (jHnj <= 0 || System.currentTimeMillis() - jHnj < b.TWENTY_FOUR_HOURS_MILLIS) {
                if (jHnj <= 0 || jHnj > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            hn();
            synchronized (tgn.class) {
                hnj.set(0);
                f14215hn.set(0);
                qor.set(0);
                gjv.set(0);
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void hn(boolean z10) {
        try {
            if (z10) {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(hnj.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f14215hn.incrementAndGet()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void hnj(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.tgn.2
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("crypt_v4_fail").hn(jSONObject.toString());
            }
        });
    }

    public static synchronized void hnj(boolean z10) {
        try {
            if (z10) {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(qor.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(qor.incrementAndGet()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void hnj(JSONObject jSONObject) {
        hn(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
