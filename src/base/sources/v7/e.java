package v7;

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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.k;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f55205a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f55206b = new AtomicBoolean(false);

    private e() {
    }

    public static final synchronized void c() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            if (f55206b.getAndSet(true)) {
                return;
            }
            if (h0.q()) {
                d();
            }
            b.d();
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final void d() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            if (e1.b0()) {
                return;
            }
            File[] fileArrL = k.l();
            ArrayList arrayList = new ArrayList(fileArrL.length);
            for (File file : fileArrL) {
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
            final List listZ0 = r.z0(arrayList2, new Comparator() { // from class: v7.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return e.e((u7.c) obj2, (u7.c) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it = g.m(0, Math.min(listZ0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listZ0.get(((j0) it).nextInt()));
            }
            k.s("anr_reports", jSONArray, new com.facebook.j0.b() { // from class: v7.d
                @Override // com.facebook.j0.b
                public final void a(o0 o0Var) {
                    e.f(listZ0, o0Var);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(u7.c cVar, u7.c o10) {
        if (x7.a.c(e.class)) {
            return 0;
        }
        try {
            s.g(o10, "o2");
            return cVar.b(o10);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List validReports, o0 response) {
        JSONObject jSONObjectD;
        if (x7.a.c(e.class)) {
            return;
        }
        try {
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
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }
}
