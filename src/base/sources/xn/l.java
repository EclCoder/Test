package xn;

import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56947a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f56948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f56949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f56950d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        l wVar;
        try {
            Class.forName("java.nio.file.Files");
            wVar = new b0();
        } catch (ClassNotFoundException unused) {
            wVar = new w();
        }
        f56948b = wVar;
        h0.a aVar = h0.f56917b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.s.g(property, "getProperty(...)");
        f56949c = h0.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = yn.m.class.getClassLoader();
        kotlin.jvm.internal.s.g(classLoader, "getClassLoader(...)");
        f56950d = new yn.m(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ void k(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.j(h0Var, z10);
    }

    public final o0 a(h0 file) {
        kotlin.jvm.internal.s.h(file, "file");
        return c(file, false);
    }

    public abstract o0 c(h0 h0Var, boolean z10);

    public abstract j c0(h0 h0Var);

    public abstract void d(h0 h0Var, h0 h0Var2);

    public final o0 d0(h0 file) {
        kotlin.jvm.internal.s.h(file, "file");
        return g0(file, false);
    }

    public abstract o0 g0(h0 h0Var, boolean z10);

    public final void h(h0 dir) {
        kotlin.jvm.internal.s.h(dir, "dir");
        i(dir, false);
    }

    public final void i(h0 dir, boolean z10) {
        kotlin.jvm.internal.s.h(dir, "dir");
        yn.d.a(this, dir, z10);
    }

    public abstract q0 i0(h0 h0Var);

    public abstract void j(h0 h0Var, boolean z10);

    public final void l(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        m(path, false);
    }

    public abstract void m(h0 h0Var, boolean z10);

    public final boolean q(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        return yn.d.b(this, path);
    }

    public abstract List r(h0 h0Var);

    public final k s(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        return yn.d.c(this, path);
    }

    public abstract k t(h0 h0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
