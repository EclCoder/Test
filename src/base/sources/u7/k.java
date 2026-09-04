package u7;

import bm.o;
import bm.r;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f54206a = new k();

    private k() {
    }

    public static final boolean d(String str) {
        File fileF = f();
        if (fileF == null || str == null) {
            return false;
        }
        return new File(fileF, str).delete();
    }

    public static final String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
    }

    public static final File f() {
        File file = new File(h0.m().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        s.h(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        s.g(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            s.g(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement element) {
        s.h(element, "element");
        String className = element.getClassName();
        s.g(className, "element.className");
        if (r.N(className, "com.facebook", false, 2, null)) {
            return true;
        }
        String className2 = element.getClassName();
        s.g(className2, "element.className");
        return r.N(className2, "com.meta", false, 2, null);
    }

    public static final boolean j(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            s.g(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                s.g(element, "element");
                if (i(element)) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                s.g(element, "element");
                if (i(element)) {
                    String className = element.getClassName();
                    s.g(className, "element.className");
                    if (!r.N(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = element.getClassName();
                        s.g(className2, "element.className");
                        if (!r.N(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    s.g(methodName, "element.methodName");
                    if (r.N(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        s.g(methodName2, "element.methodName");
                        if (r.N(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            s.g(methodName3, "element.methodName");
                            if (!r.N(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] l() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: u7.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.m(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(File file, String name) {
        s.g(name, "name");
        o0 o0Var = o0.f43602a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        s.g(str, "format(format, *args)");
        return new o(str).h(name);
    }

    public static final File[] n() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: u7.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.o(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(File file, String name) {
        s.g(name, "name");
        o0 o0Var = o0.f43602a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        s.g(str, "format(format, *args)");
        return new o(str).h(name);
    }

    public static final File[] p() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: u7.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.q(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(File file, String name) {
        s.g(name, "name");
        o0 o0Var = o0.f43602a;
        String str = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        s.g(str, "format(format, *args)");
        return new o(str).h(name);
    }

    public static final JSONObject r(String str, boolean z10) {
        File fileF = f();
        if (fileF != null && str != null) {
            try {
                return new JSONObject(e1.v0(new FileInputStream(new File(fileF, str))));
            } catch (Exception unused) {
                if (z10) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void s(String str, JSONArray reports, j0.b bVar) {
        s.h(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject jSONObjectD = e1.D();
            if (jSONObjectD != null) {
                Iterator<String> itKeys = jSONObjectD.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectD.get(next));
                }
            }
            j0.c cVar = j0.f15486n;
            o0 o0Var = o0.f43602a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{h0.n()}, 1));
            s.g(str2, "format(format, *args)");
            cVar.A(null, str2, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void t(String str, String str2) {
        File fileF = f();
        if (fileF == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileF, str));
            byte[] bytes = str2.getBytes(bm.d.f9079b);
            s.g(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
