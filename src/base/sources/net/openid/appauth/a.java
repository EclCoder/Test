package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static Set a(String... strArr) {
        return (strArr == null || strArr.length == 0) ? Collections.EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    public static Map b(Map map, Set set) {
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            wm.d.f(str, "additional parameter keys cannot be null");
            wm.d.f(str2, "additional parameter values cannot be null");
            wm.d.b(!set.contains(str), "Parameter %s is directly supported via the authorization request builder, use the builder method instead", str);
            linkedHashMap.put(str, str2);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static Map c(Uri uri, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    public static Map d(JSONObject jSONObject, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!set.contains(next)) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        return linkedHashMap;
    }
}
