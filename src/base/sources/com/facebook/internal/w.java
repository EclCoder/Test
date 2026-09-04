package com.facebook.internal;

import android.net.Uri;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w {
    public static final a H = new a(null);
    private final JSONArray A;
    private final String B;
    private final List C;
    private final List D;
    private final List E;
    private final List F;
    private final Long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumSet f15437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f15438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f15439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f15440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f15441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f15443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f15444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JSONArray f15445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f15446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f15447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f15448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f15449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f15450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f15451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONArray f15452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final JSONArray f15453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Map f15454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final JSONArray f15455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final JSONArray f15456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final JSONArray f15457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final JSONArray f15458z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String applicationId, String actionName, String featureName) {
            Map mapG;
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            kotlin.jvm.internal.s.h(actionName, "actionName");
            kotlin.jvm.internal.s.h(featureName, "featureName");
            if (actionName.length() == 0 || featureName.length() == 0) {
                return null;
            }
            w wVarF = a0.f(applicationId);
            Map map = (wVarF == null || (mapG = wVarF.g()) == null) ? null : (Map) mapG.get(actionName);
            if (map != null) {
                return (b) map.get(featureName);
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f15459e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f15461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f15462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f15463d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = -1;
                    int iOptInt = jSONArray.optInt(i10, -1);
                    if (iOptInt == -1) {
                        String versionString = jSONArray.optString(i10);
                        if (!e1.e0(versionString)) {
                            try {
                                kotlin.jvm.internal.s.g(versionString, "versionString");
                                i11 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e10) {
                                e1.k0("FacebookSDK", e10);
                            }
                            iOptInt = i11;
                        }
                    }
                    iArr[i10] = iOptInt;
                }
                return iArr;
            }

            public final b a(JSONObject dialogConfigJSON) {
                kotlin.jvm.internal.s.h(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (e1.e0(dialogNameWithFeature)) {
                    return null;
                }
                kotlin.jvm.internal.s.g(dialogNameWithFeature, "dialogNameWithFeature");
                List listF0 = bm.r.F0(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, null);
                if (listF0.size() != 2) {
                    return null;
                }
                String str = (String) gl.r.b0(listF0);
                String str2 = (String) gl.r.n0(listF0);
                if (e1.e0(str) || e1.e0(str2)) {
                    return null;
                }
                String strOptString = dialogConfigJSON.optString("url");
                return new b(str, str2, e1.e0(strOptString) ? null : Uri.parse(strOptString), b(dialogConfigJSON.optJSONArray("versions")), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.f15460a;
        }

        public final String b() {
            return this.f15461b;
        }

        public final int[] c() {
            return this.f15463d;
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f15460a = str;
            this.f15461b = str2;
            this.f15462c = uri;
            this.f15463d = iArr;
        }
    }

    public w(boolean z10, String nuxContent, boolean z11, int i10, EnumSet enumSet, Map dialogConfigurations, boolean z12, o errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map map, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, String str4, List list, List list2, List list3, List list4, Long l10) {
        kotlin.jvm.internal.s.h(nuxContent, "nuxContent");
        kotlin.jvm.internal.s.h(enumSet, UHbHibBvYxKnPE.xOXJMxPlROr);
        kotlin.jvm.internal.s.h(dialogConfigurations, "dialogConfigurations");
        kotlin.jvm.internal.s.h(errorClassification, "errorClassification");
        kotlin.jvm.internal.s.h(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        kotlin.jvm.internal.s.h(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        kotlin.jvm.internal.s.h(sdkUpdateMessage, "sdkUpdateMessage");
        this.f15433a = z10;
        this.f15434b = nuxContent;
        this.f15435c = z11;
        this.f15436d = i10;
        this.f15437e = enumSet;
        this.f15438f = dialogConfigurations;
        this.f15439g = z12;
        this.f15440h = errorClassification;
        this.f15441i = smartLoginBookmarkIconURL;
        this.f15442j = smartLoginMenuIconURL;
        this.f15443k = z13;
        this.f15444l = z14;
        this.f15445m = jSONArray;
        this.f15446n = sdkUpdateMessage;
        this.f15447o = z15;
        this.f15448p = z16;
        this.f15449q = str;
        this.f15450r = str2;
        this.f15451s = str3;
        this.f15452t = jSONArray2;
        this.f15453u = jSONArray3;
        this.f15454v = map;
        this.f15455w = jSONArray4;
        this.f15456x = jSONArray5;
        this.f15457y = jSONArray6;
        this.f15458z = jSONArray7;
        this.A = jSONArray8;
        this.B = str4;
        this.C = list;
        this.D = list2;
        this.E = list3;
        this.F = list4;
        this.G = l10;
    }

    public final String A() {
        return this.B;
    }

    public final boolean B() {
        return this.f15433a;
    }

    public final boolean a() {
        return this.f15439g;
    }

    public final JSONArray b() {
        return this.A;
    }

    public final JSONArray c() {
        return this.f15455w;
    }

    public final boolean d() {
        return this.f15444l;
    }

    public final List e() {
        return this.C;
    }

    public final Long f() {
        return this.G;
    }

    public final Map g() {
        return this.f15438f;
    }

    public final o h() {
        return this.f15440h;
    }

    public final JSONArray i() {
        return this.f15445m;
    }

    public final boolean j() {
        return this.f15443k;
    }

    public final JSONArray k() {
        return this.f15453u;
    }

    public final String l() {
        return this.f15434b;
    }

    public final boolean m() {
        return this.f15435c;
    }

    public final List n() {
        return this.E;
    }

    public final JSONArray o() {
        return this.f15452t;
    }

    public final List p() {
        return this.D;
    }

    public final String q() {
        return this.f15449q;
    }

    public final JSONArray r() {
        return this.f15456x;
    }

    public final String s() {
        return this.f15451s;
    }

    public final JSONArray t() {
        return this.f15458z;
    }

    public final String u() {
        return this.f15446n;
    }

    public final JSONArray v() {
        return this.f15457y;
    }

    public final int w() {
        return this.f15436d;
    }

    public final EnumSet x() {
        return this.f15437e;
    }

    public final String y() {
        return this.f15450r;
    }

    public final List z() {
        return this.F;
    }
}
