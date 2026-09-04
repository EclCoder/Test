package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.apu;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface sk {
    public static final hn<JSONObject> hnj = new hn<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sk.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public JSONObject hn(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                apu.hnj("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final hn<Set<String>> f14195hn = new hn<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sk.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public Set<String> hn(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
                return hashSet;
            } catch (Exception e10) {
                apu.hnj("ISettingsDataRepository", "", e10);
                return hashSet;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn<T> {
        T hn(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        hnj hnj(String str);

        hnj hnj(String str, float f10);

        hnj hnj(String str, int i10);

        hnj hnj(String str, long j10);

        hnj hnj(String str, String str2);

        hnj hnj(String str, boolean z10);

        void hnj();
    }

    void hnj(JSONObject jSONObject);
}
