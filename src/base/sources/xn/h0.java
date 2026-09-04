package xn;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f56917b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f56918c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f56919a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h0 d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ h0 e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ h0 f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final h0 a(File file, boolean z10) {
            kotlin.jvm.internal.s.h(file, "<this>");
            String string = file.toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return b(string, z10);
        }

        public final h0 b(String str, boolean z10) {
            kotlin.jvm.internal.s.h(str, "<this>");
            return yn.e.k(str, z10);
        }

        public final h0 c(Path path, boolean z10) {
            kotlin.jvm.internal.s.h(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.s.g(separator, "separator");
        f56918c = separator;
    }

    public h0(h bytes) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        this.f56919a = bytes;
    }

    public static /* synthetic */ h0 k(h0 h0Var, h0 h0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h0Var.j(h0Var2, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h0 other) {
        kotlin.jvm.internal.s.h(other, "other");
        return b().compareTo(other.b());
    }

    public final h b() {
        return this.f56919a;
    }

    public final h0 c() {
        int iO = yn.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new h0(b().G(0, iO));
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        int iO = yn.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < b().D() && b().j(iO) == 92) {
            iO++;
        }
        int iD = b().D();
        int i10 = iO;
        while (iO < iD) {
            if (b().j(iO) == 47 || b().j(iO) == 92) {
                arrayList.add(b().G(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < b().D()) {
            arrayList.add(b().G(i10, b().D()));
        }
        return arrayList;
    }

    public final String e() {
        return f().K();
    }

    public boolean equals(Object obj) {
        return (obj instanceof h0) && kotlin.jvm.internal.s.c(((h0) obj).b(), b());
    }

    public final h f() {
        int iL = yn.e.l(this);
        if (iL != -1) {
            return h.H(b(), iL + 1, 0, 2, null);
        }
        return (m() == null || b().D() != 2) ? b() : h.f56913e;
    }

    public final h0 g() {
        if (kotlin.jvm.internal.s.c(b(), yn.e.f58106d) || kotlin.jvm.internal.s.c(b(), yn.e.f58103a) || kotlin.jvm.internal.s.c(b(), yn.e.f58104b) || yn.e.n(this)) {
            return null;
        }
        int iL = yn.e.l(this);
        if (iL == 2 && m() != null) {
            if (b().D() == 3) {
                return null;
            }
            return new h0(h.H(b(), 0, 3, 1, null));
        }
        if (iL == 1 && b().E(yn.e.f58104b)) {
            return null;
        }
        if (iL != -1 || m() == null) {
            if (iL == -1) {
                return new h0(yn.e.f58106d);
            }
            return iL == 0 ? new h0(h.H(b(), 0, 1, 1, null)) : new h0(h.H(b(), 0, iL, 1, null));
        }
        if (b().D() == 2) {
            return null;
        }
        return new h0(h.H(b(), 0, 2, 1, null));
    }

    public final h0 h(h0 other) {
        kotlin.jvm.internal.s.h(other, "other");
        if (!kotlin.jvm.internal.s.c(c(), other.c())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listD = d();
        List listD2 = other.d();
        int iMin = Math.min(listD.size(), listD2.size());
        int i10 = 0;
        while (i10 < iMin && kotlin.jvm.internal.s.c(listD.get(i10), listD2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && b().D() == other.b().D()) {
            return a.e(f56917b, ".", false, 1, null);
        }
        if (listD2.subList(i10, listD2.size()).indexOf(yn.e.f58107e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.s.c(other.b(), yn.e.f58106d)) {
            return this;
        }
        e eVar = new e();
        h hVarM = yn.e.m(other);
        if (hVarM == null && (hVarM = yn.e.m(this)) == null) {
            hVarM = yn.e.s(f56918c);
        }
        int size = listD2.size();
        for (int i11 = i10; i11 < size; i11++) {
            eVar.k0(yn.e.f58107e);
            eVar.k0(hVarM);
        }
        int size2 = listD.size();
        while (i10 < size2) {
            eVar.k0((h) listD.get(i10));
            eVar.k0(hVarM);
            i10++;
        }
        return yn.e.q(eVar, false);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final h0 i(String child) {
        kotlin.jvm.internal.s.h(child, "child");
        return yn.e.j(this, yn.e.q(new e().N(child), false), false);
    }

    public final boolean isAbsolute() {
        return yn.e.o(this) != -1;
    }

    public final h0 j(h0 child, boolean z10) {
        kotlin.jvm.internal.s.h(child, "child");
        return yn.e.j(this, child, z10);
    }

    public final Path l() {
        Path path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.s.g(path, "get(...)");
        return path;
    }

    public final Character m() {
        if (h.r(b(), yn.e.f58103a, 0, 2, null) != -1 || b().D() < 2 || b().j(1) != 58) {
            return null;
        }
        char cJ = (char) b().j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return b().K();
    }
}
