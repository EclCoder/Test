package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    public boolean dkl;
    public boolean gjv;
    public String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public boolean f14176sk;
    public static final dkl hnj = new dkl(null);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static String f14175hn = "";

    public dkl(String str) {
        this.qor = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.gjv = true;
        this.f14176sk = true;
        this.dkl = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.qor = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
            this.gjv = arrayList.contains("load_finish");
            this.dkl = arrayList.contains("load_fail");
            this.f14176sk = arrayList.contains(TrackLoadSettingsAtom.TYPE);
        } catch (Exception unused) {
        }
    }
}
