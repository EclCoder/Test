package kf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43251c;

    public f(String text, int i10, int i11) {
        kotlin.jvm.internal.s.h(text, "text");
        this.f43249a = text;
        this.f43250b = i10;
        this.f43251c = i11;
    }

    public final int a() {
        return this.f43250b;
    }

    public final String b() {
        return this.f43249a;
    }

    public final int c() {
        return this.f43251c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.s.c(this.f43249a, fVar.f43249a) && this.f43250b == fVar.f43250b && this.f43251c == fVar.f43251c;
    }

    public int hashCode() {
        return (((this.f43249a.hashCode() * 31) + Integer.hashCode(this.f43250b)) * 31) + Integer.hashCode(this.f43251c);
    }

    public String toString() {
        return "Badge(text=" + this.f43249a + ", bgColorRes=" + this.f43250b + ", textColorRes=" + this.f43251c + ')';
    }
}
