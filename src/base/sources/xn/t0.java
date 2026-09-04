package xn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f56991i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h0 f56992j = h0.a.e(h0.f56917b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0 f56993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f56994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f56995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f56996h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t0(h0 zipPath, l fileSystem, Map entries, String str) {
        kotlin.jvm.internal.s.h(zipPath, "zipPath");
        kotlin.jvm.internal.s.h(fileSystem, "fileSystem");
        kotlin.jvm.internal.s.h(entries, "entries");
        this.f56993e = zipPath;
        this.f56994f = fileSystem;
        this.f56995g = entries;
        this.f56996h = str;
    }

    private final h0 m0(h0 h0Var) {
        return f56992j.j(h0Var, true);
    }

    private final List p0(h0 h0Var, boolean z10) throws IOException {
        yn.o oVar = (yn.o) this.f56995g.get(m0(h0Var));
        if (oVar != null) {
            return gl.r.I0(oVar.c());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + h0Var);
    }

    @Override // xn.l
    public o0 c(h0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xn.l
    public j c0(h0 file) {
        kotlin.jvm.internal.s.h(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // xn.l
    public void d(h0 source, h0 target) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xn.l
    public o0 g0(h0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // xn.l
    public q0 i0(h0 file) throws FileNotFoundException {
        kotlin.jvm.internal.s.h(file, "file");
        yn.o oVar = (yn.o) this.f56995g.get(m0(file));
        if (oVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        j jVarC0 = this.f56994f.c0(this.f56993e);
        g th2 = null;
        try {
            g gVarC = c0.c(jVarC0.s(oVar.i()));
            if (jVarC0 != null) {
                try {
                    jVarC0.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = gVarC;
        } catch (Throwable th4) {
            th = th4;
            if (jVarC0 != null) {
                try {
                    jVarC0.close();
                } catch (Throwable th5) {
                    fl.e.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        yn.s.r(th2);
        return oVar.e() == 0 ? new yn.j(th2, oVar.j(), true) : new yn.j(new t(new yn.j(th2, oVar.d(), true), new Inflater(true)), oVar.j(), false);
    }

    @Override // xn.l
    public void j(h0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xn.l
    public void m(h0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xn.l
    public List r(h0 dir) throws IOException {
        kotlin.jvm.internal.s.h(dir, "dir");
        List listP0 = p0(dir, true);
        kotlin.jvm.internal.s.e(listP0);
        return listP0;
    }

    @Override // xn.l
    public k t(h0 path) throws Throwable {
        Throwable th2;
        Throwable th3;
        kotlin.jvm.internal.s.h(path, "path");
        yn.o oVarN = (yn.o) this.f56995g.get(m0(path));
        if (oVarN == null) {
            return null;
        }
        if (oVarN.i() != -1) {
            j jVarC0 = this.f56994f.c0(this.f56993e);
            try {
                g gVarC = c0.c(jVarC0.s(oVarN.i()));
                try {
                    oVarN = yn.s.n(gVarC, oVarN);
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    }
                    th3 = null;
                } catch (Throwable th5) {
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th6) {
                            fl.e.a(th5, th6);
                        }
                    }
                    th3 = th5;
                    oVarN = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (jVarC0 != null) {
                    try {
                        jVarC0.close();
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                th2 = null;
            } catch (Throwable th8) {
                if (jVarC0 != null) {
                    try {
                        jVarC0.close();
                    } catch (Throwable th9) {
                        fl.e.a(th8, th9);
                    }
                }
                th2 = th8;
                oVarN = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return new k(!oVarN.k(), oVarN.k(), null, oVarN.k() ? null : Long.valueOf(oVarN.j()), oVarN.f(), oVarN.h(), oVarN.g(), null, 128, null);
    }
}
