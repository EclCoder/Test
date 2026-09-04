package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<String> f13993hn;
    private String hnj;

    public ta(String str) {
        this.hnj = "";
        this.f13993hn = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : hnj(str);
        try {
            this.hnj = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.f13993hn = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f13993hn.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("AutoTestModel", e10.getMessage());
        }
    }

    public List<String> hn() {
        return this.f13993hn;
    }

    public String hnj() {
        return this.hnj;
    }

    private static final HashMap<String, Object> hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
