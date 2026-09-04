package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static long f14711hn;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.as> hnj;
    private static boolean qor;

    private static void hn(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.as> weakReference = hnj;
        if (weakReference == null || j10 <= 0 || (asVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, asVar.sk(), "store_duration", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.utils.sk.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        hnj = null;
        qor = false;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        com.bytedance.sdk.openadsdk.core.model.dkl dklVarZyh = asVar.zyh();
        if (dklVarZyh == null || TextUtils.isEmpty(dklVarZyh.hnj())) {
            return;
        }
        hnj = new WeakReference<>(asVar);
    }

    public static boolean qor() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.as> weakReference = hnj;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        qor = true;
        return true;
    }

    public static void hnj(long j10) {
        hn(j10);
    }

    public static void hn() {
        if (hnj == null || qor) {
            return;
        }
        f14711hn = SystemClock.elapsedRealtime();
    }

    public static void hnj() {
        if (hnj == null || qor) {
            return;
        }
        if (f14711hn > 0) {
            hn(SystemClock.elapsedRealtime() - f14711hn);
        }
        hnj = null;
        f14711hn = 0L;
    }
}
