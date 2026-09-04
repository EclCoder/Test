package be;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8849b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f8848a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f8849b = list;
    }

    @Override // be.q
    public List b() {
        return this.f8849b;
    }

    @Override // be.q
    public String c() {
        return this.f8848a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f8848a.equals(qVar.c()) && this.f8849b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8848a.hashCode() ^ 1000003) * 1000003) ^ this.f8849b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f8848a + ", usedDates=" + this.f8849b + "}";
    }
}
