package lk;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class a extends c.AbstractC0679c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f44635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f44636b;

    a(Map map, Map map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.f44635a = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.f44636b = map2;
    }

    @Override // lk.c.AbstractC0679c
    public Map b() {
        return this.f44636b;
    }

    @Override // lk.c.AbstractC0679c
    public Map c() {
        return this.f44635a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.AbstractC0679c) {
            c.AbstractC0679c abstractC0679c = (c.AbstractC0679c) obj;
            if (this.f44635a.equals(abstractC0679c.c()) && this.f44636b.equals(abstractC0679c.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f44635a.hashCode() ^ 1000003) * 1000003) ^ this.f44636b.hashCode();
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.f44635a + ", numbersOfErrorSampledSpans=" + this.f44636b + "}";
    }
}
