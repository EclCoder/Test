package w7;

import android.util.Log;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.o0;
import gl.j0;
import gl.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.k;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55948b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f55949c = c.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f55950d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f55951a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d() {
            if (e1.b0()) {
                return;
            }
            File[] fileArrP = k.p();
            ArrayList arrayList = new ArrayList(fileArrP.length);
            for (File file : fileArrP) {
                arrayList.add(u7.c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((u7.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listZ0 = r.z0(arrayList2, new Comparator() { // from class: w7.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return c.a.e((u7.c) obj2, (u7.c) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it = g.m(0, Math.min(listZ0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listZ0.get(((j0) it).nextInt()));
            }
            k.s("crash_reports", jSONArray, new com.facebook.j0.b() { // from class: w7.b
                @Override // com.facebook.j0.b
                public final void a(o0 o0Var) {
                    c.a.f(listZ0, o0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(u7.c cVar, u7.c o10) {
            s.g(o10, "o2");
            return cVar.b(o10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List validReports, o0 response) {
            JSONObject jSONObjectD;
            s.h(validReports, "$validReports");
            s.h(response, "response");
            try {
                if (response.b() == null && (jSONObjectD = response.d()) != null && jSONObjectD.getBoolean("success")) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((u7.c) it.next()).a();
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final synchronized void c() {
            try {
                if (h0.q()) {
                    d();
                }
                if (c.f55950d != null) {
                    Log.w(c.f55949c, "Already enabled!");
                } else {
                    c.f55950d = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(c.f55950d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        s.h(t10, "t");
        s.h(e10, "e");
        if (k.j(e10)) {
            u7.b.c(e10);
            u7.c.a.b(e10, u7.c.EnumC0815c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f55951a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f55951a = uncaughtExceptionHandler;
    }
}
