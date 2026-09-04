package i5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f41013b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f41012a.equals(dVar.f41012a)) {
            return false;
        }
        Long l10 = this.f41013b;
        Long l11 = dVar.f41013b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        return l11 == null;
    }

    public int hashCode() {
        int iHashCode = this.f41012a.hashCode() * 31;
        Long l10 = this.f41013b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f41012a = str;
        this.f41013b = Long.valueOf(j10);
    }
}
