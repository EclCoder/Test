package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private JSONObject f12613hn;
    private HashMap<String, Object> hnj = new HashMap<>();

    public qor(JSONObject jSONObject) {
        this.f12613hn = jSONObject;
    }

    public boolean hn(String str) {
        return this.hnj.containsKey(str);
    }

    public Object hnj(String str) {
        if (this.hnj.containsKey(str)) {
            return this.hnj.get(str);
        }
        return null;
    }

    public void hnj() {
        Iterator<String> itKeys = this.f12613hn.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.f12613hn.opt(next);
            int i10 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i10 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.hnj.put(next + "." + i10 + "." + next2, objOpt2);
                                }
                            }
                            i10++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i11 = 0; i11 < ((JSONArray) objOpt3).length(); i11++) {
                                    this.hnj.put(next + "." + next3 + "." + i11, ((JSONArray) objOpt3).opt(i11));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.hnj.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                hnj(next, next3, objOpt3);
                            } else {
                                this.hnj.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.hnj.put(next + "." + next5, objOpt5);
                }
            } else {
                this.hnj.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.hnj.put(next, objOpt);
                }
            }
        }
    }

    private void hnj(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i10 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i10 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.hnj.put(str + "." + str2 + "." + next + "." + i10 + "." + next2, objOpt2);
                        }
                        i10++;
                    }
                }
            } else {
                this.hnj.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
