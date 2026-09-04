package m7;

import android.os.Bundle;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.w;
import gl.r;
import gl.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f45321a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f45322b = s0.h("fb_content_ids", "fb_content_id");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f45323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile b f45324d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pattern f45326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Pattern f45327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Pattern f45328d;

        public a(int i10, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            this.f45325a = i10;
            this.f45326b = pattern;
            this.f45327c = pattern2;
            this.f45328d = pattern3;
        }

        public final Pattern a() {
            return this.f45327c;
        }

        public final Pattern b() {
            return this.f45326b;
        }

        public final int c() {
            return this.f45325a;
        }

        public final Pattern d() {
            return this.f45328d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f45325a == aVar.f45325a && s.c(this.f45326b, aVar.f45326b) && s.c(this.f45327c, aVar.f45327c) && s.c(this.f45328d, aVar.f45328d);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f45325a) * 31;
            Pattern pattern = this.f45326b;
            int iHashCode2 = (iHashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
            Pattern pattern2 = this.f45327c;
            int iHashCode3 = (iHashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
            Pattern pattern3 = this.f45328d;
            return iHashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
        }

        public String toString() {
            return "CompiledRule(place=" + this.f45325a + ", keyRegex=" + this.f45326b + ", keyNegativeRegex=" + this.f45327c + ", valueRegex=" + this.f45328d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f45329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f45330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f45331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f45332d;

        public b(List rules, Set standardParams, Set set, boolean z10) {
            s.h(rules, "rules");
            s.h(standardParams, "standardParams");
            this.f45329a = rules;
            this.f45330b = standardParams;
            this.f45331c = set;
            this.f45332d = z10;
        }

        public final Set a() {
            return this.f45331c;
        }

        public final List b() {
            return this.f45329a;
        }

        public final Set c() {
            return this.f45330b;
        }

        public final boolean d() {
            return this.f45332d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.c(this.f45329a, bVar.f45329a) && s.c(this.f45330b, bVar.f45330b) && s.c(this.f45331c, bVar.f45331c) && this.f45332d == bVar.f45332d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iHashCode = ((this.f45329a.hashCode() * 31) + this.f45330b.hashCode()) * 31;
            Set set = this.f45331c;
            int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
            boolean z10 = this.f45332d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode2 + r10;
        }

        public String toString() {
            return "VVPConfig(rules=" + this.f45329a + ", standardParams=" + this.f45330b + ", inScopeEventNames=" + this.f45331c + ", isShadowEnabled=" + this.f45332d + ')';
        }
    }

    private i() {
    }

    public static final void b() {
        if (x7.a.c(i.class)) {
            return;
        }
        try {
            f45323c = true;
            f45321a.c();
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
        }
    }

    private final Pattern d(JSONObject jSONObject, String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                String raw = jSONObject.optString(str, "");
                s.g(raw, "raw");
                if (raw.length() == 0) {
                    return null;
                }
                try {
                    return Pattern.compile(raw, 2);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final Set f(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (!jSONObject.has("inScopeEventNames") || jSONObject.isNull("inScopeEventNames") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("inScopeEventNames")) == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String s10 = jSONArrayOptJSONArray.optString(i10, "");
                s.g(s10, "s");
                if (s10.length() > 0) {
                    hashSet.add(s10);
                }
            }
            return hashSet;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final List g(JSONObject jSONObject) {
        a aVarA;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rules");
            if (jSONArrayOptJSONArray == null) {
                return r.l();
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (aVarA = a(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(aVarA);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final Set h(JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("standardParams");
            if (jSONObjectOptJSONObject == null) {
                return s0.d();
            }
            HashSet hashSet = new HashSet();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final void i(String eventName, Bundle bundle) {
        b bVar;
        Matcher matcher;
        String string;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (x7.a.c(i.class)) {
            return;
        }
        try {
            s.h(eventName, "eventName");
            if (f45323c && bundle != null && !bundle.isEmpty() && (bVar = f45324d) != null) {
                Set setA = bVar.a();
                if (setA == null || setA.isEmpty() || setA.contains(eventName)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    boolean z10 = false;
                    for (a aVar : bVar.b()) {
                        int iC = aVar.c();
                        if (iC == 1) {
                            Set<String> setKeySet = bundle.keySet();
                            s.g(setKeySet, "parameters.keySet()");
                            for (String str : r.I0(setKeySet)) {
                                Object obj = bundle.get(str);
                                if (obj != null && (string = obj.toString()) != null) {
                                    Pattern patternB = aVar.b();
                                    boolean zFind = (patternB == null || (matcher4 = patternB.matcher(str)) == null) ? true : matcher4.find();
                                    Pattern patternA = aVar.a();
                                    boolean z11 = zFind && !((patternA == null || (matcher3 = patternA.matcher(str)) == null) ? false : matcher3.find());
                                    Pattern patternD = aVar.d();
                                    boolean zFind2 = (patternD == null || (matcher2 = patternD.matcher(string)) == null) ? true : matcher2.find();
                                    if (z11 && zFind2) {
                                        linkedHashSet.add(str);
                                        z10 = true;
                                    }
                                }
                            }
                        } else if (iC == 3 && aVar.b() != null && aVar.b().matcher(eventName).find()) {
                            Pattern patternA2 = aVar.a();
                            if (!((patternA2 == null || (matcher = patternA2.matcher(eventName)) == null) ? false : matcher.find())) {
                                linkedHashSet2.add("1");
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        if (!bVar.d() && !bVar.c().isEmpty()) {
                            Set<String> setKeySet2 = bundle.keySet();
                            s.g(setKeySet2, "parameters.keySet()");
                            for (String str2 : r.I0(setKeySet2)) {
                                if (!bVar.c().contains(str2)) {
                                    if (f45322b.contains(str2)) {
                                        bundle.putString(str2, "_removed_");
                                    } else {
                                        bundle.remove(str2);
                                    }
                                }
                            }
                            f45321a.j(bundle);
                        }
                        bundle.putString("vvp", "1");
                        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put("vp_rp", new JSONArray((Collection) r.I0(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put("vp_rp_ev", new JSONArray((Collection) r.I0(linkedHashSet2)));
                        }
                        bundle.putString("vvp_md", jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
        }
    }

    public final a a(JSONObject ruleObj) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(ruleObj, "ruleObj");
            int iOptInt = ruleObj.optInt("place", -1);
            if (iOptInt != 1 && iOptInt != 3) {
                return null;
            }
            Pattern patternD = d(ruleObj, "keyRegex");
            Pattern patternD2 = d(ruleObj, "keyNegativeRegex");
            Pattern patternD3 = d(ruleObj, "valueRegex");
            if (patternD == null && patternD3 == null) {
                return null;
            }
            return new a(iOptInt, patternD, patternD2, patternD3);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final void c() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            b bVarE = null;
            String strA = wVarV != null ? wVarV.A() : null;
            if (strA != null && strA.length() != 0) {
                bVarE = e(strA);
            }
            f45324d = bVarE;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final b e(String jsonStr) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(jsonStr, "jsonStr");
            try {
                JSONObject jSONObject = new JSONObject(jsonStr);
                if (!jSONObject.optBoolean("enabled", false)) {
                    return null;
                }
                List listG = g(jSONObject);
                if (listG.isEmpty()) {
                    return null;
                }
                return new b(listG, h(jSONObject), f(jSONObject), jSONObject.optBoolean("isShadowEnabled", true));
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final void j(Bundle parameters) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(parameters, "parameters");
            String string = parameters.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("id")) {
                        jSONObjectOptJSONObject.put("id", "_removed_");
                        z10 = true;
                    }
                }
                if (z10) {
                    parameters.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
