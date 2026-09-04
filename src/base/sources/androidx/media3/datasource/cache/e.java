package androidx.media3.datasource.cache;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet f4819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f4820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a2.f f4821e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4823b;

        public a(long j10, long j11) {
            this.f4822a = j10;
            this.f4823b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f4823b;
            if (j12 == -1) {
                return j10 >= this.f4822a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f4822a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f4822a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f4823b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public e(int i10, String str) {
        this(i10, str, a2.f.f96c);
    }

    public void a(i iVar) {
        this.f4819c.add(iVar);
    }

    public boolean b(a2.e eVar) {
        a2.f fVar = this.f4821e;
        a2.f fVarE = fVar.e(eVar);
        this.f4821e = fVarE;
        return !fVarE.equals(fVar);
    }

    public long c(long j10, long j11) {
        w1.a.a(j10 >= 0);
        w1.a.a(j11 >= 0);
        i iVarE = e(j10, j11);
        if (iVarE.b()) {
            return -Math.min(iVarE.c() ? Long.MAX_VALUE : iVarE.f90c, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long jMax = iVarE.f89b + iVarE.f90c;
        if (jMax < j13) {
            for (i iVar : this.f4819c.tailSet(iVarE, false)) {
                long j14 = iVar.f89b;
                if (j14 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j14 + iVar.f90c);
                if (jMax >= j13) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public a2.f d() {
        return this.f4821e;
    }

    public i e(long j10, long j11) {
        i iVarH = i.h(this.f4818b, j10);
        i iVar = (i) this.f4819c.floor(iVarH);
        if (iVar != null && iVar.f89b + iVar.f90c > j10) {
            return iVar;
        }
        i iVar2 = (i) this.f4819c.ceiling(iVarH);
        if (iVar2 != null) {
            long j12 = iVar2.f89b - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return i.g(this.f4818b, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f4817a == eVar.f4817a && this.f4818b.equals(eVar.f4818b) && this.f4819c.equals(eVar.f4819c) && this.f4821e.equals(eVar.f4821e)) {
                return true;
            }
        }
        return false;
    }

    public TreeSet f() {
        return this.f4819c;
    }

    public boolean g() {
        return this.f4819c.isEmpty();
    }

    public boolean h(long j10, long j11) {
        for (int i10 = 0; i10 < this.f4820d.size(); i10++) {
            if (((a) this.f4820d.get(i10)).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4817a * 31) + this.f4818b.hashCode()) * 31) + this.f4821e.hashCode();
    }

    public boolean i() {
        return this.f4820d.isEmpty();
    }

    public boolean j(long j10, long j11) {
        for (int i10 = 0; i10 < this.f4820d.size(); i10++) {
            if (((a) this.f4820d.get(i10)).b(j10, j11)) {
                return false;
            }
        }
        this.f4820d.add(new a(j10, j11));
        return true;
    }

    public boolean k(a2.c cVar) {
        if (!this.f4819c.remove(cVar)) {
            return false;
        }
        File file = cVar.f92e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public i l(i iVar, long j10, boolean z10) {
        long j11;
        w1.a.g(this.f4819c.remove(iVar));
        File file = (File) w1.a.e(iVar.f92e);
        if (z10) {
            j11 = j10;
            File fileI = i.i((File) w1.a.e(file.getParentFile()), this.f4817a, iVar.f89b, j11);
            if (file.renameTo(fileI)) {
                file = fileI;
            } else {
                n.h("CachedContent", "Failed to rename " + file + " to " + fileI);
            }
        } else {
            j11 = j10;
        }
        i iVarD = iVar.d(file, j11);
        this.f4819c.add(iVarD);
        return iVarD;
    }

    public void m(long j10) {
        for (int i10 = 0; i10 < this.f4820d.size(); i10++) {
            if (((a) this.f4820d.get(i10)).f4822a == j10) {
                this.f4820d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public e(int i10, String str, a2.f fVar) {
        this.f4817a = i10;
        this.f4818b = str;
        this.f4821e = fVar;
        this.f4819c = new TreeSet();
        this.f4820d = new ArrayList();
    }
}
