package fl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static void a(Throwable th2, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.s.h(th2, "<this>");
        kotlin.jvm.internal.s.h(exception, "exception");
        if (th2 != exception) {
            nl.b.f47820a.a(th2, exception);
        }
    }

    public static String b(Throwable th2) {
        kotlin.jvm.internal.s.h(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }
}
