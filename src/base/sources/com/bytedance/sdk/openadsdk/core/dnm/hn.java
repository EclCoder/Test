package com.bytedance.sdk.openadsdk.core.dnm;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class hn {
    private static com.bytedance.sdk.openadsdk.core.dnm.hnj hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {
        private static final hn hnj = new hn();
    }

    public long dkl() {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            return hnjVar.dkl();
        }
        return 0L;
    }

    public int dse() {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            return hnjVar.dse();
        }
        return 1;
    }

    public String gjv() {
        String strGjv;
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        return (hnjVar == null || (strGjv = hnjVar.gjv()) == null) ? "" : strGjv;
    }

    public void hn(String str) {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar;
        if (TextUtils.isEmpty(str) || (hnjVar = hnj) == null) {
            return;
        }
        hnjVar.hn(str);
    }

    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar;
        if (TextUtils.isEmpty(str) || (hnjVar = hnj) == null) {
            return;
        }
        hnjVar.hnj(str);
    }

    public boolean qor() {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar == null) {
            return false;
        }
        return hnjVar.hn();
    }

    public String sk() {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        return hnjVar != null ? hnjVar.sk() : "";
    }

    private hn() {
        hnj = new com.bytedance.sdk.openadsdk.core.dnm.hnj();
    }

    public static hn hn() {
        return hnj.hnj;
    }

    public void hnj(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            hnjVar.hnj(map);
        }
    }

    public void hnj() {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            hnjVar.qor();
        }
    }

    public void hnj(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            hnjVar.hnj(str, map);
        }
    }

    public Map<String, String> hnj(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            return hnjVar.hnj(str, bArr);
        }
        return new HashMap();
    }

    public void hnj(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.dnm.hnj hnjVar = hnj;
        if (hnjVar != null) {
            hnjVar.hnj(motionEvent);
        }
    }
}
