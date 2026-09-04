package com.facebook.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15331g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static o f15332h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f15335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15338f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final o c() {
            return new o(null, gl.l0.j(fl.w.a(2, null), fl.w.a(4, null), fl.w.a(9, null), fl.w.a(17, null), fl.w.a(341, null)), gl.l0.j(fl.w.a(102, null), fl.w.a(190, null), fl.w.a(412, null)), null, null, null);
        }

        private final Map d(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i11);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }

        public final o a(JSONArray jSONArray) {
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map mapD = null;
            Map mapD2 = null;
            Map mapD3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (bm.r.A(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD = d(jSONObjectOptJSONObject);
                    } else if (bm.r.A(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD2 = d(jSONObjectOptJSONObject);
                    } else if (bm.r.A(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD3 = d(jSONObjectOptJSONObject);
                    }
                }
            }
            return new o(mapD, mapD2, mapD3, strOptString2, strOptString3, strOptString4);
        }

        public final synchronized o b() {
            o oVar;
            try {
                if (o.f15332h == null) {
                    o.f15332h = c();
                }
                oVar = o.f15332h;
                kotlin.jvm.internal.s.f(oVar, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            } catch (Throwable th2) {
                throw th2;
            }
            return oVar;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15339a;

        static {
            int[] iArr = new int[com.facebook.x.a.values().length];
            try {
                iArr[com.facebook.x.a.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.x.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.facebook.x.a.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15339a = iArr;
        }
    }

    public o(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f15333a = map;
        this.f15334b = map2;
        this.f15335c = map3;
        this.f15336d = str;
        this.f15337e = str2;
        this.f15338f = str3;
    }

    public final com.facebook.x.a c(int i10, int i11, boolean z10) {
        Set set;
        Set set2;
        Set set3;
        if (z10) {
            return com.facebook.x.a.TRANSIENT;
        }
        Map map = this.f15333a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = (Set) this.f15333a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return com.facebook.x.a.OTHER;
        }
        Map map2 = this.f15335c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = (Set) this.f15335c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return com.facebook.x.a.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f15334b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = (Set) this.f15334b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? com.facebook.x.a.TRANSIENT : com.facebook.x.a.OTHER;
    }

    public final String d(com.facebook.x.a aVar) {
        int i10 = aVar == null ? -1 : b.f15339a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f15336d;
        }
        if (i10 == 2) {
            return this.f15338f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f15337e;
    }
}
