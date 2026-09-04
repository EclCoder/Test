package y7;

import bm.o;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.j0;
import gl.r;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f57450a = new e();

    private e() {
    }

    public static final void d() {
        if (h0.q()) {
            h();
        }
    }

    public static final File[] e() {
        File fileF = k.f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: y7.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return e.f(file, str);
            }
        });
        s.g(fileArrListFiles, "reportDir.listFiles { _,…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(File file, String name) {
        s.g(name, "name");
        o0 o0Var = o0.f43602a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        s.g(str, "format(format, *args)");
        return new o(str).h(name);
    }

    public static final void g(String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (e1.b0()) {
            return;
        }
        File[] fileArrE = e();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrE) {
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        r.y(arrayList, new Comparator() { // from class: y7.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.i((a) obj, (a) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < arrayList.size() && i10 < 1000; i10++) {
            jSONArray.put(arrayList.get(i10));
        }
        k.s("error_reports", jSONArray, new j0.b() { // from class: y7.c
            @Override // com.facebook.j0.b
            public final void a(com.facebook.o0 o0Var) {
                e.j(arrayList, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(a aVar, a o10) {
        s.g(o10, "o2");
        return aVar.b(o10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ArrayList validReports, com.facebook.o0 response) {
        JSONObject jSONObjectD;
        s.h(validReports, "$validReports");
        s.h(response, "response");
        try {
            if (response.b() == null && (jSONObjectD = response.d()) != null && jSONObjectD.getBoolean("success")) {
                int size = validReports.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = validReports.get(i10);
                    i10++;
                    ((a) obj).a();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
