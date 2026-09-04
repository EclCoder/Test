package com.bytedance.sdk.component.hnj;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class dse {
    private ta hnj;

    private dse(ta taVar) {
        this.hnj = taVar;
    }

    static dse hnj(ta taVar) {
        return new dse(taVar);
    }

    <T> T hnj(String str, Type type) {
        hnj(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.hnj.hnj(str, type);
    }

    <T> String hnj(T t10) {
        String string;
        if (t10 == null) {
            return "{}";
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.hnj.hnj(t10);
        } else {
            string = t10.toString();
        }
        hnj(string);
        return string;
    }

    private static void hnj(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        aq.hnj(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
