package j9;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m9.a f42121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f42122b;

    b(m9.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f42121a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f42122b = map;
    }

    @Override // j9.f
    m9.a e() {
        return this.f42121a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f42121a.equals(fVar.e()) && this.f42122b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // j9.f
    Map h() {
        return this.f42122b;
    }

    public int hashCode() {
        return ((this.f42121a.hashCode() ^ 1000003) * 1000003) ^ this.f42122b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f42121a + ", values=" + this.f42122b + "}";
    }
}
