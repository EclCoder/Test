package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14915f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashSet f14916g = new HashSet();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f14917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f14918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14921e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String identifier) {
            boolean zContains;
            kotlin.jvm.internal.s.h(identifier, "identifier");
            if (identifier.length() == 0 || identifier.length() > 40) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
                kotlin.jvm.internal.s.g(str, "format(locale, format, *args)");
                throw new FacebookException(str);
            }
            synchronized (d.f14916g) {
                zContains = d.f14916g.contains(identifier);
                fl.g0 g0Var = fl.g0.f38750a;
            }
            if (zContains) {
                return;
            }
            if (new bm.o("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").h(identifier)) {
                synchronized (d.f14916g) {
                    d.f14916g.add(identifier);
                }
            } else {
                kotlin.jvm.internal.o0 o0Var2 = kotlin.jvm.internal.o0.f43602a;
                String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1));
                kotlin.jvm.internal.s.g(str2, "format(format, *args)");
                throw new FacebookException(str2);
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f14922e = new a(null);
        private static final long serialVersionUID = 20160803001L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f14924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f14925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f14926d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String jsonString, String operationalJsonString, boolean z10, boolean z11) {
            kotlin.jvm.internal.s.h(jsonString, "jsonString");
            kotlin.jvm.internal.s.h(operationalJsonString, "operationalJsonString");
            this.f14923a = jsonString;
            this.f14924b = operationalJsonString;
            this.f14925c = z10;
            this.f14926d = z11;
        }

        private final Object readResolve() {
            return new d(this.f14923a, this.f14924b, this.f14925c, this.f14926d, null);
        }
    }

    public /* synthetic */ d(String str, String str2, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, z11);
    }

    private final JSONObject i(String str, String str2, Double d10, Bundle bundle, UUID uuid) throws JSONException {
        f14915f.a(str2);
        JSONObject jSONObject = new JSONObject();
        String strE = q7.a.e(str2);
        if (kotlin.jvm.internal.s.c(strE, str2)) {
            strE = m7.f.d(str2);
        }
        jSONObject.put("_eventName", strE);
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map mapO = o(this, bundle, false, 2, null);
            for (String str3 : mapO.keySet()) {
                jSONObject.put(str3, mapO.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f14920d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f14919c) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
        com.facebook.r0 r0Var = com.facebook.r0.APP_EVENTS;
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "eventObject.toString()");
        aVar.c(r0Var, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Map n(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f14915f;
            kotlin.jvm.internal.s.g(key, "key");
            aVar.a(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                kotlin.jvm.internal.s.g(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            map.put(key, obj.toString());
        }
        if (!z10) {
            m7.c.c(map);
            q7.a.f(kotlin.jvm.internal.p0.d(map), this.f14921e);
            g7.a.c(kotlin.jvm.internal.p0.d(map), this.f14921e);
        }
        return map;
    }

    static /* synthetic */ Map o(d dVar, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return dVar.n(bundle, z10);
    }

    private final Object writeReplace() {
        String string = this.f14917a.toString();
        kotlin.jvm.internal.s.g(string, "jsonObject.toString()");
        String string2 = this.f14918b.toString();
        kotlin.jvm.internal.s.g(string2, "operationalJsonObject.toString()");
        return new b(string, string2, this.f14919c, this.f14920d);
    }

    public final boolean g() {
        return this.f14919c;
    }

    public final JSONObject h() {
        return this.f14917a;
    }

    public final JSONObject j() {
        return this.f14917a;
    }

    public final String k() {
        return this.f14921e;
    }

    public final JSONObject l() {
        return this.f14918b;
    }

    public final boolean m() {
        return this.f14919c;
    }

    public String toString() {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f14917a.optString("_eventName"), Boolean.valueOf(this.f14919c), this.f14917a.toString()}, 3));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        return str;
    }

    public d(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, p0 p0Var) {
        JSONObject jSONObjectE;
        kotlin.jvm.internal.s.h(contextName, "contextName");
        kotlin.jvm.internal.s.h(eventName, "eventName");
        this.f14919c = z10;
        this.f14920d = z11;
        this.f14921e = eventName;
        this.f14918b = (p0Var == null || (jSONObjectE = p0Var.e()) == null) ? new JSONObject() : jSONObjectE;
        this.f14917a = i(contextName, eventName, d10, bundle, uuid);
    }

    private d(String str, String str2, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject(str);
        this.f14917a = jSONObject;
        this.f14918b = new JSONObject(str2);
        this.f14919c = z10;
        String strOptString = jSONObject.optString("_eventName");
        kotlin.jvm.internal.s.g(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f14921e = strOptString;
        this.f14920d = z11;
    }
}
