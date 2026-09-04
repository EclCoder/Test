package d7;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.facebook.internal.e1;
import com.facebook.internal.r0;
import fl.g0;
import fl.q;
import fl.w;
import gl.l0;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f36284a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f36285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f36286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f36287d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        OPTIONS(dOIDCKnIR.vkc),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0547a f36288b = new C0547a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36293a;

        /* JADX INFO: renamed from: d7.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0547a {
            public /* synthetic */ C0547a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String rawValue) {
                s.h(rawValue, "rawValue");
                for (a aVar : a.values()) {
                    if (s.c(aVar.g(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0547a() {
            }
        }

        a(String str) {
            this.f36293a = str;
        }

        public final String g() {
            return this.f36293a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k f36294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f36295b;

        public b(k kVar, i field) {
            s.h(field, "field");
            this.f36294a = kVar;
            this.f36295b = field;
        }

        public final i a() {
            return this.f36295b;
        }

        public final k b() {
            return this.f36294a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f36294a == bVar.f36294a && this.f36295b == bVar.f36295b;
        }

        public int hashCode() {
            k kVar = this.f36294a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f36295b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f36294a + ", field=" + this.f36295b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k f36296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f36297b;

        public c(k section, l lVar) {
            s.h(section, "section");
            this.f36296a = section;
            this.f36297b = lVar;
        }

        public final l a() {
            return this.f36297b;
        }

        public final k b() {
            return this.f36296a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f36296a == cVar.f36296a && this.f36297b == cVar.f36297b;
        }

        public int hashCode() {
            int iHashCode = this.f36296a.hashCode() * 31;
            l lVar = this.f36297b;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f36296a + ", field=" + this.f36297b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36298a = new a(null);

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String rawValue) {
                s.h(rawValue, "rawValue");
                if (s.c(rawValue, d7.b.EXT_INFO.g())) {
                    return d.ARRAY;
                }
                if (s.c(rawValue, d7.b.URL_SCHEMES.g())) {
                    return d.ARRAY;
                }
                if (s.c(rawValue, m.CONTENT_IDS.g())) {
                    return d.ARRAY;
                }
                if (s.c(rawValue, m.CONTENTS.g())) {
                    return d.ARRAY;
                }
                if (s.c(rawValue, a.OPTIONS.g())) {
                    return d.ARRAY;
                }
                if (s.c(rawValue, d7.b.ADV_TE.g())) {
                    return d.BOOL;
                }
                if (s.c(rawValue, d7.b.APP_TE.g())) {
                    return d.BOOL;
                }
                if (s.c(rawValue, m.EVENT_TIME.g())) {
                    return d.INT;
                }
                return null;
            }

            private a() {
            }
        }
    }

    /* JADX INFO: renamed from: d7.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class C0548e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f36305c;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36303a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f36304b = iArr2;
            int[] iArr3 = new int[d7.a.values().length];
            try {
                iArr3[d7.a.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[d7.a.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f36305c = iArr3;
        }
    }

    static {
        d7.b bVar = d7.b.ANON_ID;
        k kVar = k.USER_DATA;
        q qVarA = w.a(bVar, new c(kVar, l.ANON_ID));
        q qVarA2 = w.a(d7.b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID));
        q qVarA3 = w.a(d7.b.ADVERTISER_ID, new c(kVar, l.MAD_ID));
        q qVarA4 = w.a(d7.b.PAGE_ID, new c(kVar, l.PAGE_ID));
        q qVarA5 = w.a(d7.b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID));
        d7.b bVar2 = d7.b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f36285b = l0.l(qVarA, qVarA2, qVarA3, qVarA4, qVarA5, w.a(bVar2, new c(kVar2, l.ADV_TE)), w.a(d7.b.APP_TE, new c(kVar2, l.APP_TE)), w.a(d7.b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), w.a(d7.b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), w.a(d7.b.EXT_INFO, new c(kVar2, l.EXT_INFO)), w.a(d7.b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), w.a(d7.b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), w.a(d7.b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), w.a(d7.b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), w.a(d7.b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), w.a(d7.b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), w.a(d7.b.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP, new c(kVar2, l.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP)), w.a(d7.b.USER_DATA, new c(kVar, null)));
        q qVarA6 = w.a(m.EVENT_TIME, new b(null, i.EVENT_TIME));
        q qVarA7 = w.a(m.EVENT_NAME, new b(null, i.EVENT_NAME));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f36286c = l0.l(qVarA6, qVarA7, w.a(mVar, new b(kVar3, i.VALUE_TO_SUM)), w.a(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), w.a(m.CONTENTS, new b(kVar3, i.CONTENTS)), w.a(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), w.a(m.CURRENCY, new b(kVar3, i.CURRENCY)), w.a(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), w.a(m.LEVEL, new b(kVar3, i.LEVEL)), w.a(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), w.a(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), w.a(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), w.a(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), w.a(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), w.a(m.SUCCESS, new b(kVar3, i.SUCCESS)), w.a(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), w.a(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f36287d = l0.l(w.a("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), w.a("fb_mobile_activate_app", j.ACTIVATED_APP), w.a("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), w.a("fb_mobile_add_to_cart", j.ADDED_TO_CART), w.a("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), w.a("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), w.a("fb_mobile_content_view", j.VIEWED_CONTENT), w.a("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), w.a("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), w.a("fb_mobile_purchase", j.PURCHASED), w.a("fb_mobile_rate", j.RATED), w.a("fb_mobile_search", j.SEARCHED), w.a("fb_mobile_spent_credits", j.SPENT_CREDITS), w.a("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));
    }

    private e() {
    }

    private final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.g(), n.MOBILE_APP_INSTALL.g());
        linkedHashMap.put(i.EVENT_TIME.g(), obj);
        return r.e(linkedHashMap);
    }

    private final d7.a f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(n.EVENT.g());
        d7.a.C0546a c0546a = d7.a.f36255a;
        s.f(obj, "null cannot be cast to non-null type kotlin.String");
        d7.a aVarA = c0546a.a((String) obj);
        if (aVarA != d7.a.OTHER) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                d7.b bVarA = d7.b.f36260b.a(str);
                if (bVarA != null) {
                    f36284a.g(map2, map3, bVarA, value);
                } else {
                    boolean zC = s.c(str, k.CUSTOM_EVENTS.g());
                    boolean z10 = value instanceof String;
                    if (aVarA == d7.a.CUSTOM && zC && z10) {
                        s.f(value, "null cannot be cast to non-null type kotlin.String");
                        ArrayList arrayListK = k((String) value);
                        if (arrayListK != null) {
                            arrayList.addAll(arrayListK);
                        }
                    } else if (a.f36288b.a(str) != null) {
                        map4.put(str, value);
                    }
                }
            }
        }
        return aVarA;
    }

    private final void h(Map map, d7.b bVar, Object obj) {
        l lVarA;
        String strG;
        c cVar = (c) f36285b.get(bVar);
        if (cVar == null || (lVarA = cVar.a()) == null || (strG = lVarA.g()) == null) {
            return;
        }
        map.put(strG, obj);
    }

    private final void i(Map map, d7.b bVar, Object obj) {
        l lVarA;
        String strG;
        if (bVar == d7.b.USER_DATA) {
            try {
                s.f(obj, "null cannot be cast to non-null type kotlin.String");
                map.putAll(e1.o(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = (c) f36285b.get(bVar);
        if (cVar == null || (lVarA = cVar.a()) == null || (strG = lVarA.g()) == null) {
            return;
        }
        map.put(strG, obj);
    }

    private final String j(String str) {
        String strG;
        Map map = f36287d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = (j) map.get(str);
        return (jVar == null || (strG = jVar.g()) == null) ? "" : strG;
    }

    public static final ArrayList k(String appEvents) {
        s.h(appEvents, "appEvents");
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = e1.n(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(e1.o(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    m mVarA = m.f36380b.a(str);
                    b bVar = (b) f36286c.get(mVarA);
                    if (mVarA != null && bVar != null) {
                        k kVarB = bVar.b();
                        if (kVarB == null) {
                            try {
                                String strG = bVar.a().g();
                                if (mVarA == m.EVENT_NAME && ((String) map.get(str)) != null) {
                                    e eVar = f36284a;
                                    Object obj2 = map.get(str);
                                    s.f(obj2, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(strG, eVar.j((String) obj2));
                                } else if (mVarA == m.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj3 = map.get(str);
                                    s.f(obj3, "null cannot be cast to non-null type kotlin.Any");
                                    Object objL = l(str, obj3);
                                    s.f(objL, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(strG, objL);
                                }
                            } catch (ClassCastException e10) {
                                r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", fl.e.b(e10));
                            }
                        } else if (kVarB == k.CUSTOM_DATA) {
                            String strG2 = bVar.a().g();
                            Object obj4 = map.get(str);
                            s.f(obj4, "null cannot be cast to non-null type kotlin.Any");
                            Object objL2 = l(str, obj4);
                            s.f(objL2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(strG2, objL2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.g(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    public static final Object l(String field, Object value) {
        s.h(field, "field");
        s.h(value, "value");
        d dVarA = d.f36298a.a(field);
        String str = value instanceof String ? (String) value : null;
        if (dVarA == null || str == null) {
            return value;
        }
        int i10 = C0548e.f36303a[dVarA.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return bm.r.q(value.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer numQ = bm.r.q(str.toString());
            if (numQ != null) {
                return Boolean.valueOf(numQ.intValue() != 0);
            }
            return null;
        }
        try {
            List<??> listN = e1.n(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? N : listN) {
                try {
                    try {
                        N = e1.o(new JSONObject((String) N));
                    } catch (JSONException unused) {
                        N = e1.n(new JSONArray((String) N));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(N);
            }
            return arrayList;
        } catch (JSONException e10) {
            r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return g0.f38750a;
        }
    }

    public final List a(d7.a eventType, Map userData, Map appData, Map restOfData, List customEvents, Object obj) {
        s.h(eventType, "eventType");
        s.h(userData, "userData");
        s.h(appData, "appData");
        s.h(restOfData, "restOfData");
        s.h(customEvents, "customEvents");
        Map mapD = d(userData, appData, restOfData);
        int i10 = C0548e.f36305c[eventType.ordinal()];
        if (i10 == 1) {
            return c(mapD, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return b(mapD, customEvents);
    }

    public final Map d(Map userData, Map appData, Map restOfData) {
        s.h(userData, "userData");
        s.h(appData, "appData");
        s.h(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.g(), n.APP.g());
        linkedHashMap.put(k.USER_DATA.g(), userData);
        linkedHashMap.put(k.APP_DATA.g(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List e(Map parameters) {
        s.h(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        d7.a aVarF = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (aVarF == d7.a.OTHER) {
            return null;
        }
        return a(aVarF, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.g()));
    }

    public final void g(Map userData, Map appData, d7.b field, Object value) {
        k kVarB;
        s.h(userData, "userData");
        s.h(appData, "appData");
        s.h(field, "field");
        s.h(value, "value");
        c cVar = (c) f36285b.get(field);
        if (cVar == null || (kVarB = cVar.b()) == null) {
            return;
        }
        int i10 = C0548e.f36304b[kVarB.ordinal()];
        if (i10 == 1) {
            h(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            i(userData, field, value);
        }
    }
}
