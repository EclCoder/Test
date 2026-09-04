package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class as {
    private static hn hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj(String str, boolean z10, hnj hnjVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class hnj {
        public final String hn() {
            try {
                return hnj().toString();
            } catch (Exception unused) {
                return "";
            }
        }

        abstract JSONObject hnj();
    }

    public static void hnj(hn hnVar) {
        hnj = hnVar;
    }

    public static void hnj(String str, hnj hnjVar) {
        hn hnVar = hnj;
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(str, false, hnjVar);
    }
}
