package of;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f48572d;

    public h(String text, long j10, long j11, float f10) {
        s.h(text, "text");
        this.f48569a = text;
        this.f48570b = j10;
        this.f48571c = j11;
        this.f48572d = f10;
    }

    public final long a() {
        return this.f48571c;
    }

    public final long b() {
        return this.f48570b;
    }

    public final String c() {
        return this.f48569a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.c(this.f48569a, hVar.f48569a) && this.f48570b == hVar.f48570b && this.f48571c == hVar.f48571c && Float.compare(this.f48572d, hVar.f48572d) == 0;
    }

    public int hashCode() {
        return (((((this.f48569a.hashCode() * 31) + Long.hashCode(this.f48570b)) * 31) + Long.hashCode(this.f48571c)) * 31) + Float.hashCode(this.f48572d);
    }

    public String toString() {
        return "TranscribedWord(text=" + this.f48569a + ", startMs=" + this.f48570b + ", endMs=" + this.f48571c + ", confidence=" + this.f48572d + ')';
    }
}
