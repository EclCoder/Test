package u7;

import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.j0;
import com.facebook.n0;
import com.facebook.o0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f54185a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f54186b;

    private b() {
    }

    public static final void b() {
        f54186b = true;
        if (h0.q()) {
            f54185a.e();
        }
    }

    public static final void c(Throwable th2) {
        if (!f54186b || d() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        s.g(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            s.g(className, "it.className");
            com.facebook.internal.s.b bVarD = com.facebook.internal.s.d(className);
            if (bVarD != com.facebook.internal.s.b.Unknown) {
                com.facebook.internal.s.c(bVarD);
                hashSet.add(bVarD.toString());
            }
        }
        if (!h0.q() || hashSet.isEmpty()) {
            return;
        }
        c.a.c(new JSONArray((Collection) hashSet)).g();
    }

    public static final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c instrumentData, o0 response) {
        JSONObject jSONObjectD;
        s.h(instrumentData, "$instrumentData");
        s.h(response, "response");
        try {
            if (response.b() == null && (jSONObjectD = response.d()) != null && jSONObjectD.getBoolean("success")) {
                instrumentData.a();
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (e1.b0()) {
            return;
        }
        File[] fileArrN = k.n();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrN) {
            final c cVarD = c.a.d(file);
            if (cVarD.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", cVarD.toString());
                    j0.c cVar = j0.f15486n;
                    kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{h0.n()}, 1));
                    s.g(str, "format(format, *args)");
                    arrayList.add(cVar.A(null, str, jSONObject, new j0.b() { // from class: u7.a
                        @Override // com.facebook.j0.b
                        public final void a(o0 o0Var2) {
                            b.f(cVarD, o0Var2);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new n0(arrayList).h();
    }
}
