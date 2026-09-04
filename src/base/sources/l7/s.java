package l7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.p0;
import com.facebook.appevents.q0;
import com.facebook.h0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f44036d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f44033a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f44034b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f44035c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f44037e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44038a;

        static {
            int[] iArr = new int[u.a.values().length];
            try {
                iArr[u.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.a.f44049c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.a.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.a.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44038a = iArr;
        }
    }

    private s() {
    }

    public static final void a() {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            if (!n7.k.g()) {
                r.i();
            } else {
                f44037e.set(true);
                h();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    private final u.a b() {
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                Context contextM = h0.m();
                ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                kotlin.jvm.internal.s.g(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return u.a.NONE;
                }
                List listF0 = bm.r.F0(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return u.a.V5_V7;
                }
                g("GPBL." + string);
                Integer numQ = bm.r.q((String) listF0.get(0));
                if (numQ == null) {
                    return u.a.V5_V7;
                }
                int iIntValue = numQ.intValue();
                if (iIntValue == 1) {
                    return u.a.f44049c;
                }
                return iIntValue < 5 ? u.a.V2_V4 : u.a.V5_V7;
            } catch (Exception unused) {
                return u.a.V5_V7;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static /* synthetic */ String d(s sVar, Bundle bundle, p0 p0Var, Bundle bundle2, p0 p0Var2, boolean z10, boolean z11, int i10, Object obj) {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return sVar.c(bundle, p0Var, bundle2, p0Var2, z10, (i10 & 32) != 0 ? false : z11);
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final String e() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f44036d;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final synchronized Bundle f(List list, long j10, boolean z10, List list2) {
        Bundle bundle;
        ?? r10;
        ?? ValueOf;
        ?? D;
        boolean z11;
        List purchases = list;
        List purchaseParameters = list2;
        synchronized (s.class) {
            Bundle bundle2 = null;
            if (x7.a.c(s.class)) {
                return null;
            }
            try {
                kotlin.jvm.internal.s.h(purchases, "purchases");
                kotlin.jvm.internal.s.h(purchaseParameters, "purchaseParameters");
                if (purchaseParameters.isEmpty()) {
                    return null;
                }
                if (purchases.size() != purchaseParameters.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = purchases.size();
                ?? bundle3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    l7.a aVar = (l7.a) purchases.get(i10);
                    fl.q qVar = (fl.q) purchaseParameters.get(i10);
                    Bundle bundle4 = (Bundle) qVar.d();
                    p0 p0Var = (p0) qVar.g();
                    bundle = bundle2;
                    try {
                        int i11 = i10;
                        l7.a aVar2 = new l7.a(aVar.c(), new BigDecimal(String.valueOf(aVar.a())).setScale(2, RoundingMode.HALF_UP).doubleValue(), aVar.b());
                        List<fl.q> list3 = z10 ? (List) f44034b.get(aVar2) : (List) f44035c.get(aVar2);
                        List list4 = list3;
                        if (list4 == null || list4.isEmpty()) {
                            r10 = bundle;
                            ValueOf = r10;
                            D = ValueOf;
                            z11 = false;
                        } else {
                            r10 = bundle;
                            ValueOf = r10;
                            D = ValueOf;
                            z11 = false;
                            for (fl.q qVar2 : list3) {
                                long jLongValue = ((Number) qVar2.h()).longValue();
                                fl.q qVar3 = (fl.q) qVar2.i();
                                Bundle bundle5 = (Bundle) qVar3.d();
                                p0 p0Var2 = (p0) qVar3.g();
                                if (Math.abs(j10 - jLongValue) <= p.f44021a.e() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    s sVar = f44033a;
                                    D = d(sVar, bundle4, p0Var, bundle5, p0Var2, !z10, false, 32, null);
                                    String strC = sVar.c(bundle4, p0Var, bundle5, p0Var2, !z10, true);
                                    r10 = r10;
                                    if (strC != null) {
                                        r10 = strC;
                                    }
                                    if (D != 0) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new fl.q(aVar2, Long.valueOf(jLongValue)));
                                        z11 = true;
                                    }
                                }
                            }
                        }
                        if (r10 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_test_dedup_result", "1");
                            bundle3.putString("fb_iap_test_dedup_key_used", r10);
                        }
                        if (z11) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / ((long) 1000) : 0L));
                            bundle3.putString("fb_iap_actual_dedup_result", "1");
                            bundle3.putString("fb_iap_actual_dedup_key_used", D);
                        }
                        if (z10 && !z11) {
                            ConcurrentHashMap concurrentHashMap = f44035c;
                            if (concurrentHashMap.get(aVar2) == null) {
                                concurrentHashMap.put(aVar2, new ArrayList());
                            }
                            List list5 = (List) concurrentHashMap.get(aVar2);
                            if (list5 != null) {
                                list5.add(new fl.q(Long.valueOf(j10), new fl.q(bundle4, p0Var)));
                            }
                        } else if (!z10 && !z11) {
                            ConcurrentHashMap concurrentHashMap2 = f44034b;
                            if (concurrentHashMap2.get(aVar2) == null) {
                                concurrentHashMap2.put(aVar2, new ArrayList());
                            }
                            List list6 = (List) concurrentHashMap2.get(aVar2);
                            if (list6 != null) {
                                list6.add(new fl.q(Long.valueOf(j10), new fl.q(bundle4, p0Var)));
                            }
                        }
                        i10 = i11 + 1;
                        purchases = list;
                        purchaseParameters = list2;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                bundle = bundle2;
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    fl.q qVar4 = (fl.q) obj;
                    List list7 = z10 ? (List) f44034b.get(qVar4.h()) : (List) f44035c.get(qVar4.h());
                    if (list7 != null) {
                        Iterator it = list7.iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            int i14 = i13 + 1;
                            if (((Number) ((fl.q) it.next()).h()).longValue() == ((Number) qVar4.i()).longValue()) {
                                list7.remove(i13);
                                break;
                            }
                            i13 = i14;
                        }
                        if (z10) {
                            if (list7.isEmpty()) {
                                f44034b.remove(qVar4.h());
                            } else {
                                f44034b.put(qVar4.h(), list7);
                            }
                        } else if (list7.isEmpty()) {
                            f44035c.remove(qVar4.h());
                        } else {
                            f44035c.put(qVar4.h(), list7);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
            x7.a.b(th, s.class);
            return bundle;
        }
    }

    private static final void g(String str) {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            f44036d = str;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    public static final void h() {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            if (f44037e.get()) {
                u.a aVarB = f44033a.b();
                int i10 = a.f44038a[aVarB.ordinal()];
                if (i10 == 2) {
                    b.g(u.a.f44049c);
                    return;
                }
                if (i10 != 3) {
                    if (i10 == 4 && com.facebook.internal.s.g(com.facebook.internal.s.b.IapLoggingLib5To7)) {
                        h.e(h0.m(), aVarB);
                        return;
                    }
                    return;
                }
                if (com.facebook.internal.s.g(com.facebook.internal.s.b.IapLoggingLib2)) {
                    h.e(h0.m(), aVarB);
                } else {
                    b.g(u.a.V2_V4);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    public final String c(Bundle bundle, p0 p0Var, Bundle bundle2, p0 p0Var2, boolean z10, boolean z11) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            List<fl.q> listF = z11 ? p.f44021a.f(z10) : p.f44021a.d(z10);
            if (listF == null) {
                return null;
            }
            for (fl.q qVar : listF) {
                Object objC = p0.f14972b.c(q0.IAPParameters, (String) qVar.h(), bundle, p0Var);
                String str = objC instanceof String ? (String) objC : null;
                if (str != null && str.length() != 0) {
                    for (String str2 : (List) qVar.i()) {
                        Object objC2 = p0.f14972b.c(q0.IAPParameters, str2, bundle2, p0Var2);
                        String str3 = objC2 instanceof String ? (String) objC2 : null;
                        if (str3 != null && str3.length() != 0 && kotlin.jvm.internal.s.c(str3, str)) {
                            return z10 ? (String) qVar.h() : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }
}
