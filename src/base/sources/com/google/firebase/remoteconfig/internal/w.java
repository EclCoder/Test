package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f22406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f22407b = Collections.synchronizedMap(new HashMap());

    public w(ce.b bVar) {
        this.f22406a = bVar;
    }

    public void a(String str, g gVar) {
        JSONObject jSONObjectOptJSONObject;
        bd.a aVar = (bd.a) this.f22406a.get();
        if (aVar == null) {
            return;
        }
        JSONObject jSONObjectJ = gVar.j();
        if (jSONObjectJ.length() < 1) {
            return;
        }
        JSONObject jSONObjectH = gVar.h();
        if (jSONObjectH.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectJ.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f22407b) {
                try {
                    if (strOptString.equals(this.f22407b.get(str))) {
                        return;
                    }
                    this.f22407b.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectH.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    aVar.b("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    aVar.b("fp", "_fpc", bundle2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
