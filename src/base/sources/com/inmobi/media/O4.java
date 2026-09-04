package com.inmobi.media;

import android.content.Context;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.inmobi.media.O4;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O4 f25393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fl.k f25394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinkedList f25395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static LinkedList f25396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static byte[] f25397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f25398f;

    static {
        O4 o10 = new O4();
        f25393a = o10;
        f25394b = fl.l.b(new tl.a() { // from class: yh.u2
            @Override // tl.a
            public final Object invoke() {
                return O4.b();
            }
        });
        LinkedList linkedList = new LinkedList();
        f25395c = linkedList;
        Object objClone = linkedList.clone();
        kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f25396d = (LinkedList) objClone;
        L4 l10 = new L4();
        I4 i10 = new I4();
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        C3136m4 c3136m5 = AbstractC2878c4.f26300a;
        f25397e = AbstractC2854b6.a(((SignalsConfig) c3136m5.a(SignalsConfig.class)).getKA());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(P4.f25453j);
        arrayList.removeAll(skipFields);
        f25398f = gl.r.l0(arrayList, ",", null, null, 0, null, null, 62, null);
        Context context = Xi.f26021a;
        if (context != null) {
            kotlin.jvm.internal.s.g("O4", "TAG");
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            La laA = Ka.a(context, "c_data_store");
            Context context2 = Xi.f26021a;
            int i11 = 1;
            if (context2 != null) {
                La laA2 = Ka.a(context2, "c_data_store");
                kotlin.jvm.internal.s.h("akv", "key");
                i11 = laA2.f25198a.getInt("akv", 1);
            }
            kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
            if (((SignalsConfig) c3136m5.a(SignalsConfig.class)).getVAK() != i11) {
                kotlin.jvm.internal.s.g("O4", "TAG");
                kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
                laA.a("akv", ((SignalsConfig) c3136m5.a(SignalsConfig.class)).getVAK(), false);
                o10.f();
            }
        }
        AbstractC2878c4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, i10);
        AbstractC2878c4.a("signals", l10);
    }

    public static final G4 b() {
        return new G4(AbstractC3193o9.b());
    }

    public static AdConfig c() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
    }

    public static String d() {
        kotlin.jvm.internal.s.g("O4", "TAG");
        if (f25398f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        LinkedList linkedList = f25396d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C2828a6) obj).f26170b >= jCurrentTimeMillis) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            jSONArray.put(bm.r.V0(((C2828a6) obj2).f26169a).toString());
        }
        String string = jSONArray.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public static boolean e() {
        boolean z10;
        AdConfig.ContextualDataConfig contextualData;
        Context context = Xi.f26021a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            La laA = Ka.a(context, "c_data_store");
            kotlin.jvm.internal.s.h("isEnabled", "key");
            z10 = laA.f25198a.getBoolean("isEnabled", true);
        } else {
            z10 = true;
        }
        if (!z10) {
            kotlin.jvm.internal.s.g("O4", "TAG");
            return false;
        }
        AdConfig adConfigC = c();
        boolean z11 = ((adConfigC == null || (contextualData = adConfigC.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        kotlin.jvm.internal.s.g("O4", "TAG");
        return z11;
    }

    public final void a(boolean z10) {
        Context context = Xi.f26021a;
        if (context != null) {
            kotlin.jvm.internal.s.g("O4", "TAG");
            if (z10 != e()) {
                kotlin.jvm.internal.s.g("O4", "TAG");
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La.a(Ka.a(context, "c_data_store"), "isEnabled", z10);
                if (z10) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            kotlin.jvm.internal.s.g("O4", "TAG");
            em.j.b(null, new K4(null), 1, null);
            LinkedList linkedList = new LinkedList();
            f25395c = linkedList;
            Object objClone = linkedList.clone();
            kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            f25396d = (LinkedList) objClone;
            fl.g0 g0Var = fl.g0.f38750a;
        }
    }

    public static final void a() {
        kotlin.jvm.internal.s.g("O4", "TAG");
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        a(jCurrentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object objClone = f25395c.clone();
        kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f25396d = (LinkedList) objClone;
        em.j.b(null, new N4(jCurrentTimeMillis, null), 1, null);
    }

    public static void a(long j10, int i10) {
        kotlin.jvm.internal.s.g("O4", "TAG");
        for (int size = f25395c.size(); size > i10; size--) {
            f25395c.remove();
        }
        kotlin.jvm.internal.s.g("O4", "TAG");
        Iterator it = f25395c.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.s.g(next, mDXVAtwcaFMHJ.BRmqgcIILE);
            if (((C2828a6) next).f26170b >= j10) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
