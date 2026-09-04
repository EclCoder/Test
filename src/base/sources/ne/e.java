package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f47157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f47158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f47159c;

    public e(d performance, d crashlytics, double d10) {
        kotlin.jvm.internal.s.h(performance, "performance");
        kotlin.jvm.internal.s.h(crashlytics, "crashlytics");
        this.f47157a = performance;
        this.f47158b = crashlytics;
        this.f47159c = d10;
    }

    public final d a() {
        return this.f47158b;
    }

    public final d b() {
        return this.f47157a;
    }

    public final double c() {
        return this.f47159c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f47157a == eVar.f47157a && this.f47158b == eVar.f47158b && Double.compare(this.f47159c, eVar.f47159c) == 0;
    }

    public int hashCode() {
        return (((this.f47157a.hashCode() * 31) + this.f47158b.hashCode()) * 31) + Double.hashCode(this.f47159c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f47157a + ", crashlytics=" + this.f47158b + ", sessionSamplingRate=" + this.f47159c + ')';
    }
}
