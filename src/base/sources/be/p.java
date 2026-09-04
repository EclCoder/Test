package be;

import android.content.Context;
import android.os.Build;
import fl.g0;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d1.f.a f8866b = d1.i.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d1.f.a f8867c = d1.i.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d1.f.a f8868d = d1.i.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td.c f8869a;

    public p(Context context, String str) {
        this.f8869a = new td.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ g0 a(long j10, d1.c cVar) {
        cVar.i(f8866b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ g0 b(p pVar, String str, String str2, d1.f.a aVar, d1.c cVar) {
        pVar.getClass();
        d1.f.a aVar2 = f8868d;
        if (((String) td.d.a(cVar, aVar2, "")).equals(str)) {
            d1.f.a aVarH = pVar.h(cVar, str);
            if (aVarH == null || aVarH.a().equals(str2)) {
                return null;
            }
            pVar.l(cVar, aVar, str);
            return null;
        }
        d1.f.a aVar3 = f8867c;
        long jLongValue = ((Long) td.d.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = pVar.d(cVar);
        }
        HashSet hashSet = new HashSet((Collection) td.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ g0 c(p pVar, d1.c cVar) {
        pVar.getClass();
        long j10 = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                d1.f.a aVar = (d1.f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strG = pVar.g(System.currentTimeMillis());
                if (set.contains(strG)) {
                    cVar.i(aVar, l.a(new Object[]{strG}));
                    j10++;
                } else {
                    cVar.h(aVar);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f8867c);
            return null;
        }
        cVar.i(f8867c, Long.valueOf(j10));
        return null;
    }

    private synchronized long d(d1.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) td.d.a(cVar, f8867c, 0L)).longValue();
            String strA = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = ((d1.f.a) entry.getKey()).a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.i(d1.i.h(strA), hashSet2);
            j10 = jLongValue - 1;
            cVar.i(f8867c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    private synchronized String g(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized d1.f.a h(d1.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return d1.i.h(((d1.f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void i(d1.c cVar, String str) {
        try {
            d1.f.a aVarH = h(cVar, str);
            if (aVarH == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) td.d.a(cVar, aVarH, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(aVarH);
            } else {
                cVar.i(aVarH, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void l(d1.c cVar, d1.f.a aVar, String str) {
        i(cVar, str);
        HashSet hashSet = new HashSet((Collection) td.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void e() {
        this.f8869a.g(new Function1() { // from class: be.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.c(this.f8864a, (d1.c) obj);
            }
        });
    }

    synchronized List f() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strG = g(System.currentTimeMillis());
            for (Map.Entry entry : this.f8869a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strG);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(q.a(((d1.f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            k(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized void j(long j10, final String str) {
        final String strG = g(j10);
        final d1.f.a aVarH = d1.i.h(str);
        this.f8869a.g(new Function1() { // from class: be.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.b(this.f8860a, strG, str, aVarH, (d1.c) obj);
            }
        });
    }

    synchronized void k(final long j10) {
        this.f8869a.g(new Function1() { // from class: be.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.a(j10, (d1.c) obj);
            }
        });
    }
}
