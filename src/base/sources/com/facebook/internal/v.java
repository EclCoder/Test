package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f15415a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f15416b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f15417c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f15418d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Long f15419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile t7.b f15420f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a();
    }

    private v() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", com.facebook.h0.F());
        bundle.putString("fields", "gatekeepers");
        com.facebook.j0.c cVar = com.facebook.j0.f15486n;
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        kotlin.jvm.internal.s.g(str2, "format(format, *args)");
        com.facebook.j0 j0VarX = cVar.x(null, str2, null);
        j0VarX.G(bundle);
        JSONObject jSONObjectD = j0VarX.k().d();
        return jSONObjectD == null ? new JSONObject() : jSONObjectD;
    }

    public static final boolean d(String name, String str, boolean z10) {
        Boolean bool;
        kotlin.jvm.internal.s.h(name, "name");
        Map mapF = f15415a.f(str);
        return (mapF.containsKey(name) && (bool = (Boolean) mapF.get(name)) != null) ? bool.booleanValue() : z10;
    }

    private final synchronized JSONObject e(String str) {
        return (JSONObject) f15418d.get(str);
    }

    private final boolean g(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    public static final synchronized void i(a aVar) {
        if (aVar != null) {
            try {
                f15417c.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final String strN = com.facebook.h0.n();
        v vVar = f15415a;
        if (vVar.g(f15419e) && vVar.e(strN) != null) {
            vVar.l();
            return;
        }
        final Context contextM = com.facebook.h0.m();
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strN}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        if (contextM == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextM.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!e1.e0(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e1.k0("FacebookSDK", e10);
            }
            if (jSONObject != null) {
                k(strN, jSONObject);
            }
        }
        Executor executorV = com.facebook.h0.v();
        if (executorV == null) {
            return;
        }
        if (f15416b.compareAndSet(false, true)) {
            executorV.execute(new Runnable() { // from class: com.facebook.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    v.j(strN, contextM, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String applicationId, Context context, String gateKeepersKey) {
        kotlin.jvm.internal.s.h(applicationId, "$applicationId");
        kotlin.jvm.internal.s.h(context, "$context");
        kotlin.jvm.internal.s.h(gateKeepersKey, "$gateKeepersKey");
        v vVar = f15415a;
        JSONObject jSONObjectC = vVar.c(applicationId);
        if (jSONObjectC.length() != 0) {
            k(applicationId, jSONObjectC);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, jSONObjectC.toString()).apply();
            f15419e = Long.valueOf(System.currentTimeMillis());
        }
        vVar.l();
        f15416b.set(false);
    }

    public static final synchronized JSONObject k(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        try {
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            JSONObject jSONObjectE = f15415a.e(applicationId);
            jSONObject2 = jSONObjectE != null ? new JSONObject(jSONObjectE.toString()) : new JSONObject();
            JSONObject jSONObjectOptJSONObject = (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA)) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                } catch (JSONException e10) {
                    e1.k0("FacebookSDK", e10);
                }
            }
            f15415a.o(applicationId, jSONObject2);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject2;
    }

    private final void l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f15417c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVar = (a) concurrentLinkedQueue.poll();
            if (aVar != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.m(aVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(a aVar) {
        aVar.a();
    }

    public static final JSONObject n(String applicationId, boolean z10) {
        JSONObject jSONObjectE;
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        if (!z10 && (jSONObjectE = f15415a.e(applicationId)) != null) {
            return jSONObjectE;
        }
        JSONObject jSONObjectC = f15415a.c(applicationId);
        Context contextM = com.facebook.h0.m();
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        contextM.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectC.toString()).apply();
        return k(applicationId, jSONObjectC);
    }

    private final synchronized void o(String str, JSONObject jSONObject) {
        f15418d.put(str, jSONObject);
    }

    public final Map f(String str) {
        h();
        if (str == null || e(str) == null) {
            return new HashMap();
        }
        t7.b bVar = f15420f;
        List<t7.a> listA = bVar != null ? bVar.a(str) : null;
        if (listA != null) {
            HashMap map = new HashMap();
            for (t7.a aVar : listA) {
                map.put(aVar.a(), Boolean.valueOf(aVar.b()));
            }
            return map;
        }
        HashMap map2 = new HashMap();
        JSONObject jSONObjectE = e(str);
        if (jSONObjectE == null) {
            jSONObjectE = new JSONObject();
        }
        Iterator<String> itKeys = jSONObjectE.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            kotlin.jvm.internal.s.g(key, "key");
            map2.put(key, Boolean.valueOf(jSONObjectE.optBoolean(key)));
        }
        t7.b bVar2 = f15420f;
        if (bVar2 == null) {
            bVar2 = new t7.b();
        }
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            arrayList.add(new t7.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
        }
        bVar2.b(str, arrayList);
        f15420f = bVar2;
        return map2;
    }

    public final void h() {
        i(null);
    }
}
