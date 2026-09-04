package kk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f43519a = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f43520b = c(q.class.getClassLoader());

    public static lk.b a() {
        return f43520b.a();
    }

    public static t b() {
        return f43520b.b();
    }

    static q c(ClassLoader classLoader) {
        try {
            return (q) jk.a.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), q.class);
        } catch (ClassNotFoundException e10) {
            f43519a.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e10);
            try {
                return (q) jk.a.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), q.class);
            } catch (ClassNotFoundException e11) {
                f43519a.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e11);
                return q.c();
            }
        }
    }
}
