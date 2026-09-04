package yn;

import fl.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xn.c0;
import xn.h0;
import xn.o0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m extends xn.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f58125h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final h0 f58126i = h0.a.e(h0.f56917b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f58127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xn.l f58128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fl.k f58129g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(h0 h0Var) {
            return !bm.r.y(h0Var.e(), ".class", true);
        }

        public final h0 b() {
            return m.f58126i;
        }

        public final h0 d(h0 h0Var, h0 base) {
            kotlin.jvm.internal.s.h(h0Var, "<this>");
            kotlin.jvm.internal.s.h(base, "base");
            return b().i(bm.r.H(bm.r.y0(h0Var.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    public m(ClassLoader classLoader, boolean z10, xn.l systemFileSystem) {
        kotlin.jvm.internal.s.h(classLoader, "classLoader");
        kotlin.jvm.internal.s.h(systemFileSystem, "systemFileSystem");
        this.f58127e = classLoader;
        this.f58128f = systemFileSystem;
        this.f58129g = fl.l.b(new tl.a() { // from class: yn.k
            @Override // tl.a
            public final Object invoke() {
                return m.T0(this.f58124a);
            }
        });
        if (z10) {
            N0().size();
        }
    }

    private final h0 K0(h0 h0Var) {
        return f58126i.j(h0Var, true);
    }

    private final List N0() {
        return (List) this.f58129g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T0(m mVar) {
        return mVar.U0(mVar.f58127e);
    }

    private final List U0(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        kotlin.jvm.internal.s.g(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        kotlin.jvm.internal.s.g(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = list.get(i11);
            i11++;
            URL url = (URL) obj;
            kotlin.jvm.internal.s.e(url);
            fl.q qVarV0 = V0(url);
            if (qVarV0 != null) {
                arrayList.add(qVarV0);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        kotlin.jvm.internal.s.g(resources2, "getResources(...)");
        ArrayList list2 = Collections.list(resources2);
        kotlin.jvm.internal.s.g(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        int size2 = list2.size();
        while (i10 < size2) {
            Object obj2 = list2.get(i10);
            i10++;
            URL url2 = (URL) obj2;
            kotlin.jvm.internal.s.e(url2);
            fl.q qVarW0 = W0(url2);
            if (qVarW0 != null) {
                arrayList2.add(qVarW0);
            }
        }
        return gl.r.s0(arrayList, arrayList2);
    }

    private final fl.q V0(URL url) {
        if (kotlin.jvm.internal.s.c(url.getProtocol(), "file")) {
            return w.a(this.f58128f, h0.a.d(h0.f56917b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final fl.q W0(URL url) {
        int iL0;
        String string = url.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        if (!bm.r.N(string, "jar:file:", false, 2, null) || (iL0 = bm.r.l0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        h0.a aVar = h0.f56917b;
        String strSubstring = string.substring(4, iL0);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return w.a(s.h(h0.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), this.f58128f, new Function1() { // from class: yn.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.X0((o) obj));
            }
        }), f58126i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X0(o entry) {
        kotlin.jvm.internal.s.h(entry, "entry");
        return f58125h.c(entry.b());
    }

    private final String Y0(h0 h0Var) {
        return K0(h0Var).h(f58126i).toString();
    }

    @Override // xn.l
    public o0 c(h0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // xn.l
    public xn.j c0(h0 file) throws FileNotFoundException {
        kotlin.jvm.internal.s.h(file, "file");
        if (!f58125h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strY0 = Y0(file);
        for (fl.q qVar : N0()) {
            try {
                return ((xn.l) qVar.d()).c0(((h0) qVar.g()).i(strY0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // xn.l
    public void d(h0 source, h0 target) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // xn.l
    public o0 g0(h0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // xn.l
    public q0 i0(h0 file) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        if (!f58125h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        h0 h0Var = f58126i;
        URL resource = this.f58127e.getResource(h0.k(h0Var, file, false, 2, null).h(h0Var).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        kotlin.jvm.internal.s.g(inputStream, "getInputStream(...)");
        return c0.i(inputStream);
    }

    @Override // xn.l
    public void j(h0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // xn.l
    public void m(h0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // xn.l
    public List r(h0 dir) throws FileNotFoundException {
        kotlin.jvm.internal.s.h(dir, "dir");
        String strY0 = Y0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (fl.q qVar : N0()) {
            xn.l lVar = (xn.l) qVar.d();
            h0 h0Var = (h0) qVar.g();
            try {
                List listR = lVar.r(h0Var.i(strY0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listR) {
                    if (f58125h.c((h0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(f58125h.d((h0) obj2, h0Var));
                }
                gl.r.z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return gl.r.I0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // xn.l
    public xn.k t(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        if (!f58125h.c(path)) {
            return null;
        }
        String strY0 = Y0(path);
        for (fl.q qVar : N0()) {
            xn.k kVarT = ((xn.l) qVar.d()).t(((h0) qVar.g()).i(strY0));
            if (kVarT != null) {
                return kVarT;
            }
        }
        return null;
    }

    public /* synthetic */ m(ClassLoader classLoader, boolean z10, xn.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? xn.l.f56948b : lVar);
    }
}
