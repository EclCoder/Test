package lg;

import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gl.l0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44550b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg.a f44551a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public x(lg.a preferenceManager) {
        kotlin.jvm.internal.s.h(preferenceManager, "preferenceManager");
        this.f44551a = preferenceManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(String str, JSONObject it) {
        kotlin.jvm.internal.s.h(it, "it");
        return kotlin.jvm.internal.s.c(it.optString(TtmlNode.TAG_P), str);
    }

    private final List h() {
        String strH = this.f44551a.h(R.string.pref_silent_flagged_videos, null);
        if (strH == null) {
            return new ArrayList();
        }
        try {
            JSONArray jSONArray = new JSONArray(strH);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                kotlin.jvm.internal.s.g(jSONObject, "getJSONObject(...)");
                arrayList.add(jSONObject);
            }
            return arrayList;
        } catch (Exception e10) {
            wp.a.f(e10, "Corrupt silent-flag store, resetting", new Object[0]);
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(JSONObject it) {
        kotlin.jvm.internal.s.h(it, "it");
        return !new File(it.optString(TtmlNode.TAG_P)).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Collection collection, JSONObject it) {
        kotlin.jvm.internal.s.h(it, "it");
        return collection.contains(it.optString(TtmlNode.TAG_P));
    }

    private final void n(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        this.f44551a.m(R.string.pref_silent_flagged_videos, jSONArray.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(String str, JSONObject it) {
        kotlin.jvm.internal.s.h(it, "it");
        return kotlin.jvm.internal.s.c(it.optString(TtmlNode.TAG_P), str);
    }

    public final synchronized void e(final String str, String cause) {
        try {
            kotlin.jvm.internal.s.h(cause, "cause");
            if (str != null && str.length() != 0) {
                List listH = h();
                gl.r.F(listH, new Function1() { // from class: lg.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(x.f(str, (JSONObject) obj));
                    }
                });
                JSONObject jSONObjectPut = new JSONObject().put(TtmlNode.TAG_P, str).put("c", cause);
                kotlin.jvm.internal.s.e(jSONObjectPut);
                listH.add(0, jSONObjectPut);
                while (listH.size() > 20) {
                    listH.remove(listH.size() - 1);
                }
                n(listH);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized String g(String str) {
        Object next;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    Iterator it = h().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!kotlin.jvm.internal.s.c(((JSONObject) next).optString(TtmlNode.TAG_P), str));
                    JSONObject jSONObject = (JSONObject) next;
                    if (jSONObject == null) {
                        return null;
                    }
                    return jSONObject.optString("c", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    public final synchronized void i(String str, String str2) {
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0) {
                    List<JSONObject> listH = h();
                    boolean z10 = false;
                    for (JSONObject jSONObject : listH) {
                        if (kotlin.jvm.internal.s.c(jSONObject.optString(TtmlNode.TAG_P), str)) {
                            jSONObject.put(TtmlNode.TAG_P, str2);
                            z10 = true;
                        }
                    }
                    if (z10) {
                        n(listH);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void j() {
        List listH = h();
        if (gl.r.F(listH, new Function1() { // from class: lg.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.k((JSONObject) obj));
            }
        })) {
            n(listH);
        }
    }

    public final synchronized void l(final Collection paths) {
        kotlin.jvm.internal.s.h(paths, "paths");
        if (paths.isEmpty()) {
            return;
        }
        List listH = h();
        if (gl.r.F(listH, new Function1() { // from class: lg.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.m(paths, (JSONObject) obj));
            }
        })) {
            n(listH);
        }
    }

    public final synchronized Map o() {
        LinkedHashMap linkedHashMap;
        List<JSONObject> listH = h();
        linkedHashMap = new LinkedHashMap(yl.g.d(l0.e(gl.r.v(listH, 10)), 16));
        for (JSONObject jSONObject : listH) {
            fl.q qVarA = fl.w.a(jSONObject.optString(TtmlNode.TAG_P), jSONObject.optString("c", MBridgeConstans.DYNAMIC_VIEW_WX_APP));
            linkedHashMap.put(qVarA.h(), qVarA.i());
        }
        return linkedHashMap;
    }

    public final synchronized void p(final String str) {
        if (str != null) {
            if (str.length() != 0) {
                List listH = h();
                if (gl.r.F(listH, new Function1() { // from class: lg.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(x.q(str, (JSONObject) obj));
                    }
                })) {
                    n(listH);
                }
            }
        }
    }
}
