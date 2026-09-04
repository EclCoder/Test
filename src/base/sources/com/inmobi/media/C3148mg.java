package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3148mg implements InterfaceC3174ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3070jg f26997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3485zi f26998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27000d;

    public C3148mg(InterfaceC3070jg interfaceC3070jg, C3485zi c3485zi) {
        this.f26997a = interfaceC3070jg;
        this.f26998b = c3485zi;
        String id2 = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(id2, "toString(...)");
        this.f26999c = id2;
        this.f27000d = new AtomicBoolean(false);
        J8 j10 = C2890cg.f26334b;
        if (j10 != null) {
            kotlin.jvm.internal.s.h(id2, "id");
            kotlin.jvm.internal.s.h(this, "listener");
            j10.f27339b.put(id2, new WeakReference(this));
            Iterator it = j10.f27339b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.s.g(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C3318t5 c3318t5 = C2890cg.f26335c;
        if (c3318t5 != null) {
            kotlin.jvm.internal.s.h(id2, "id");
            kotlin.jvm.internal.s.h(this, "listener");
            c3318t5.f27339b.put(id2, new WeakReference(this));
            Iterator it2 = c3318t5.f27339b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                kotlin.jvm.internal.s.g(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        C3122lg c3122lg;
        Iterator it;
        if (dVar instanceof C3122lg) {
            c3122lg = (C3122lg) dVar;
            int i10 = c3122lg.f26949d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3122lg.f26949d = i10 - Integer.MIN_VALUE;
            } else {
                c3122lg = new C3122lg(this, dVar);
            }
        } else {
            c3122lg = new C3122lg(this, dVar);
        }
        Object obj = c3122lg.f26947b;
        Object objF = ll.b.f();
        int i11 = c3122lg.f26949d;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                it = a(str).iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c3122lg.f26946a;
                fl.s.b(obj);
            }
            while (it.hasNext()) {
                Zf zf2 = (Zf) it.next();
                b(zf2.f26145e);
                c3122lg.f26946a = it;
                c3122lg.f26949d = 1;
                if (a(zf2, c3122lg) == objF) {
                    return objF;
                }
            }
        } catch (NoClassDefFoundError e10) {
            a(this, (short) 2245);
            e10.getMessage();
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
        } catch (JSONException e11) {
            a(this, (short) 2243);
            InterfaceC3070jg interfaceC3070jg = this.f26997a;
            if (interfaceC3070jg != null) {
                EnumC2906d6[] enumC2906d6Arr = EnumC2906d6.f26393a;
                ((C3124li) interfaceC3070jg).a("", -104, "Ping JSON is invalid", System.currentTimeMillis(), 0);
            }
            e11.getMessage();
        } catch (Exception e12) {
            a(this, (short) 2244);
            e12.getMessage();
            fl.k kVar2 = W9.f25935a;
            AbstractC3219p9.a(e12);
        }
        return fl.g0.f38750a;
    }

    public final void b(String priority) {
        C3485zi c3485zi = this.f26998b;
        if (c3485zi != null) {
            kotlin.jvm.internal.s.h(priority, "priority");
            Map mapA = c3485zi.a();
            mapA.put("trigger", priority);
            AbstractC3277rg.a("PingStarted", mapA);
        }
    }

    public static Object a(Zf zf2, C3122lg c3122lg) {
        Objects.toString(zf2);
        if (kotlin.jvm.internal.s.c(zf2.f26145e, "high")) {
            J8 j10 = C2890cg.f26334b;
            if (j10 != null) {
                Object objB = j10.b(zf2, c3122lg);
                if (objB != ll.b.f()) {
                    objB = fl.g0.f38750a;
                }
                return objB == ll.b.f() ? objB : fl.g0.f38750a;
            }
        } else {
            C3318t5 c3318t5 = C2890cg.f26335c;
            if (c3318t5 != null) {
                Object objA = c3318t5.a(zf2, c3122lg);
                if (objA != ll.b.f()) {
                    objA = fl.g0.f38750a;
                }
                return objA == ll.b.f() ? objA : fl.g0.f38750a;
            }
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC3070jg interfaceC3070jg = this.f26997a;
            if (interfaceC3070jg != null) {
                EnumC2906d6[] enumC2906d6Arr = EnumC2906d6.f26393a;
                ((C3124li) interfaceC3070jg).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return gl.r.l();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            Object zf2 = null;
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString != null && !bm.r.h0(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (a(strOptString, strOptString2)) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                linkedHashMap.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                            }
                        }
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                        String strOptString3 = jSONObjectOptJSONObject.optString("priority", "normal");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                        kotlin.jvm.internal.s.e(strOptString2);
                        String str2 = strOptString3 == null ? "normal" : strOptString3;
                        String str3 = this.f26999c;
                        C3485zi c3485zi = this.f26998b;
                        zf2 = new Zf(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, c3485zi != null ? c3485zi.f28023a : null);
                    }
                } else {
                    kotlin.jvm.internal.s.e(strOptString);
                    a(this, (short) 2255);
                    InterfaceC3070jg interfaceC3070jg2 = this.f26997a;
                    if (interfaceC3070jg2 != null) {
                        EnumC2906d6[] enumC2906d6Arr2 = EnumC2906d6.f26393a;
                        ((C3124li) interfaceC3070jg2).a(strOptString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
            if (zf2 != null) {
                arrayList.add(zf2);
            }
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !bm.r.h0(str2)) {
            try {
                URI uri = new URI(str2);
                if ((kotlin.jvm.internal.s.c(uri.getScheme(), "http") || kotlin.jvm.internal.s.c(uri.getScheme(), "https")) && (host = uri.getHost()) != null && !bm.r.h0(host)) {
                    return true;
                }
            } catch (Exception unused) {
            }
            a(this, (short) 2256);
            InterfaceC3070jg interfaceC3070jg = this.f26997a;
            if (interfaceC3070jg != null) {
                EnumC2906d6[] enumC2906d6Arr = EnumC2906d6.f26393a;
                ((C3124li) interfaceC3070jg).a(str, -102, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        InterfaceC3070jg interfaceC3070jg2 = this.f26997a;
        if (interfaceC3070jg2 != null) {
            EnumC2906d6[] enumC2906d6Arr2 = EnumC2906d6.f26393a;
            ((C3124li) interfaceC3070jg2).a(str, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(Zf ping, int i10, long j10) {
        InterfaceC3070jg interfaceC3070jg;
        kotlin.jvm.internal.s.h(ping, "ping");
        if (this.f27000d.get()) {
            return;
        }
        String str = ping.f26141a;
        if (kotlin.jvm.internal.s.c("high", ping.f26145e) && ping.f26146f && (interfaceC3070jg = this.f26997a) != null) {
            ((C3124li) interfaceC3070jg).a(ping.f26142b, i10, null, j10, ping.f26147g);
        }
        String priority = ping.f26145e;
        long jCurrentTimeMillis = System.currentTimeMillis() - ping.f26149i;
        C3485zi c3485zi = this.f26998b;
        if (c3485zi != null) {
            kotlin.jvm.internal.s.h(priority, "priority");
            Map mapA = c3485zi.a();
            mapA.put("trigger", priority);
            mapA.put("latency", Long.valueOf(jCurrentTimeMillis));
            AbstractC3277rg.a("PingSuccess", mapA);
        }
    }

    public final void a(Zf ping, int i10, String str, int i11, long j10) {
        InterfaceC3070jg interfaceC3070jg;
        kotlin.jvm.internal.s.h(ping, "ping");
        if (this.f27000d.get()) {
            return;
        }
        String str2 = ping.f26141a;
        if (kotlin.jvm.internal.s.c("high", ping.f26145e) && ping.f26146f && ping.f26147g < 1 && (interfaceC3070jg = this.f26997a) != null) {
            ((C3124li) interfaceC3070jg).a(ping.f26142b, i10, str, j10, ping.f26147g);
        }
        String priority = ping.f26145e;
        C3485zi c3485zi = this.f26998b;
        if (c3485zi != null) {
            if (priority == null) {
                priority = "unknown";
            }
            kotlin.jvm.internal.s.h(priority, "priority");
            Map mapA = c3485zi.a();
            mapA.put("errorCode", (short) 2247);
            mapA.put("trigger", priority);
            mapA.put("retryCount", String.valueOf(i11));
            AbstractC3277rg.a("PingFailed", mapA);
        }
    }

    public static void a(C3148mg c3148mg, short s10) {
        C3485zi c3485zi = c3148mg.f26998b;
        if (c3485zi != null) {
            kotlin.jvm.internal.s.h("unknown", "priority");
            Map mapA = c3485zi.a();
            mapA.put("errorCode", Short.valueOf(s10));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3277rg.a("PingFailed", mapA);
        }
    }
}
