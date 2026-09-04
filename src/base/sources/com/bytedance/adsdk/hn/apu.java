package com.bytedance.adsdk.hn;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f11901hn;
    private final Map<String, String> hnj;

    public final String hn(String str, String str2) {
        if (this.f11901hn && this.hnj.containsKey(str2)) {
            return this.hnj.get(str2);
        }
        String strHnj = hnj(str, str2);
        if (this.f11901hn) {
            this.hnj.put(str2, strHnj);
        }
        return strHnj;
    }

    public String hnj(String str) {
        return str;
    }

    public String hnj(String str, String str2) {
        return hnj(str2);
    }
}
