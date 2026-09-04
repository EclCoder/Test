package c7;

import bm.r;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9578d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f9579e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9582c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    String k10 = jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_AD_K);
                    String v10 = jSONObjectOptJSONObject.optString("v");
                    s.g(k10, "k");
                    if (k10.length() != 0) {
                        Set setA = d.a();
                        s.g(key, "key");
                        List listF0 = r.F0(k10, new String[]{","}, false, 0, 6, null);
                        s.g(v10, "v");
                        setA.add(new d(key, listF0, v10, null));
                    }
                }
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet(d.a());
        }

        public final void d(String rulesFromServer) {
            s.h(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (x7.a.c(d.class)) {
            return null;
        }
        try {
            return f9579e;
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return null;
        }
    }

    public final List b() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f9582c);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final String c() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f9580a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final String d() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f9581b;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private d(String str, List list, String str2) {
        this.f9580a = str;
        this.f9581b = str2;
        this.f9582c = list;
    }
}
