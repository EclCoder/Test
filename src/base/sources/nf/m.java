package nf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f47607c;

    public m(String text, long j10, long j11) {
        kotlin.jvm.internal.s.h(text, "text");
        this.f47605a = text;
        this.f47606b = j10;
        this.f47607c = j11;
    }

    public static /* synthetic */ m b(m mVar, String str, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mVar.f47605a;
        }
        if ((i10 & 2) != 0) {
            j10 = mVar.f47606b;
        }
        if ((i10 & 4) != 0) {
            j11 = mVar.f47607c;
        }
        return mVar.a(str, j10, j11);
    }

    public final m a(String text, long j10, long j11) {
        kotlin.jvm.internal.s.h(text, "text");
        return new m(text, j10, j11);
    }

    public final long c() {
        return this.f47607c;
    }

    public final long d() {
        return this.f47606b;
    }

    public final String e() {
        return this.f47605a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.s.c(this.f47605a, mVar.f47605a) && this.f47606b == mVar.f47606b && this.f47607c == mVar.f47607c;
    }

    public int hashCode() {
        return (((this.f47605a.hashCode() * 31) + Long.hashCode(this.f47606b)) * 31) + Long.hashCode(this.f47607c);
    }

    public String toString() {
        return "CaptionCard(text=" + this.f47605a + ", startMs=" + this.f47606b + ", endMs=" + this.f47607c + ')';
    }
}
