package jd;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f42324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f42325h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f42327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f42328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sd.d f42329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rd.j f42330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gd.i f42331f = gd.i.f39126a;

    static {
        HashMap map = new HashMap();
        f42324g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f42325h = String.format(Locale.US, "Crashlytics Android SDK/%s", "20.1.0");
    }

    public i0(Context context, r0 r0Var, a aVar, sd.d dVar, rd.j jVar) {
        this.f42326a = context;
        this.f42327b = r0Var;
        this.f42328c = aVar;
        this.f42329d = dVar;
        this.f42330e = jVar;
    }

    private md.h0.f.d.a.c A(md.h0.a aVar) {
        return this.f42331f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private md.h0.a a(md.h0.a aVar) {
        List listUnmodifiableList;
        if (!this.f42330e.b().f51284b.f51293c || this.f42328c.f42243c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f42328c.f42243c) {
                arrayList.add(md.h0.a.AbstractC0693a.a().d(fVar.c()).b(fVar.a()).c(fVar.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return md.h0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private md.h0.b b() {
        return md.h0.b().l("20.1.0").h(this.f42328c.f42241a).i(this.f42327b.a().c()).g(this.f42327b.a().e()).f(this.f42327b.a().d()).d(this.f42328c.f42246f).e(this.f42328c.f42247g).k(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f42324g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private md.h0.f.d.a.b.AbstractC0697a h() {
        return md.h0.f.d.a.b.AbstractC0697a.a().b(0L).d(0L).c(this.f42328c.f42245e).e(this.f42328c.f42242b).a();
    }

    private List i() {
        return Collections.singletonList(h());
    }

    private md.h0.f.d.a j(int i10, md.h0.a aVar) {
        return md.h0.f.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private md.h0.f.d.a k(int i10, sd.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        md.h0.f.d.a.c cVarE = this.f42331f.e(this.f42326a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return md.h0.f.d.a.a().c(boolValueOf).d(cVarE).b(this.f42331f.d(this.f42326a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private md.h0.f.d.c l(int i10) {
        e eVarA = e.a(this.f42326a);
        Float fB = eVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = eVarA.c();
        boolean zN = i.n(this.f42326a);
        return md.h0.f.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(i.b(this.f42326a) - i.a(this.f42326a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private md.h0.f.d.a.b.c m(sd.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private md.h0.f.d.a.b.c n(sd.e eVar, int i10, int i11, int i12) {
        String str = eVar.f52370b;
        String str2 = eVar.f52369a;
        StackTraceElement[] stackTraceElementArr = eVar.f52371c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        sd.e eVar2 = eVar.f52372d;
        if (i12 >= i11) {
            sd.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f52372d;
                i13++;
            }
        }
        md.h0.f.d.a.b.c.AbstractC0700a abstractC0700aD = md.h0.f.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC0700aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC0700aD.a();
    }

    private md.h0.f.d.a.b o(md.h0.a aVar) {
        return md.h0.f.d.a.b.a().b(aVar).f(w()).c(i()).a();
    }

    private md.h0.f.d.a.b p(sd.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return md.h0.f.d.a.b.a().g(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).f(w()).c(i()).a();
    }

    private md.h0.f.d.a.b.e.AbstractC0704b q(StackTraceElement stackTraceElement, md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a abstractC0705a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0705a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, md.h0.f.d.a.b.e.AbstractC0704b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private md.h0.f.a s() {
        return md.h0.f.a.a().e(this.f42327b.f()).g(this.f42328c.f42246f).d(this.f42328c.f42247g).f(this.f42327b.a().c()).b(this.f42328c.f42248h.d()).c(this.f42328c.f42248h.e()).a();
    }

    private md.h0.f t(String str, long j10) {
        return md.h0.f.a().m(j10).j(str).h(f42325h).b(s()).l(v()).e(u()).i(3).a();
    }

    private md.h0.f.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = i.b(this.f42326a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zX = i.x();
        int iL = i.l();
        String str = Build.MANUFACTURER;
        return md.h0.f.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(str).g(Build.PRODUCT).a();
    }

    private md.h0.f.e v() {
        return md.h0.f.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.y()).a();
    }

    private md.h0.f.d.a.b.AbstractC0701d w() {
        return md.h0.f.d.a.b.AbstractC0701d.a().d(MBridgeConstans.ENDCARD_URL_TYPE_PL).c(MBridgeConstans.ENDCARD_URL_TYPE_PL).b(0L).a();
    }

    private md.h0.f.d.a.b.e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private md.h0.f.d.a.b.e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return md.h0.f.d.a.b.e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List z(sd.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f52371c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f42329d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public md.h0.f.d c(md.h0.a aVar) {
        int i10 = this.f42326a.getResources().getConfiguration().orientation;
        return md.h0.f.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public md.h0.f.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f42326a.getResources().getConfiguration().orientation;
        return md.h0.f.d.a().g(str).f(j10).b(k(i12, sd.e.a(th2, this.f42329d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public md.h0 e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
