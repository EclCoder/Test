package a2;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f92e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f93f;

    public c(String str, long j10, long j11, long j12, File file) {
        this.f88a = str;
        this.f89b = j10;
        this.f90c = j11;
        this.f91d = file != null;
        this.f92e = file;
        this.f93f = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        if (!this.f88a.equals(cVar.f88a)) {
            return this.f88a.compareTo(cVar.f88a);
        }
        long j10 = this.f89b - cVar.f89b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f91d;
    }

    public boolean c() {
        return this.f90c == -1;
    }

    public String toString() {
        return "[" + this.f89b + ", " + this.f90c + "]";
    }
}
