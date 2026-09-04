package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a0 extends h0.f.d.AbstractC0708f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45919a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.AbstractC0708f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f45920a;

        b() {
        }

        @Override // md.h0.f.d.AbstractC0708f.a
        public h0.f.d.AbstractC0708f a() {
            List list = this.f45920a;
            if (list != null) {
                return new a0(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // md.h0.f.d.AbstractC0708f.a
        public h0.f.d.AbstractC0708f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f45920a = list;
            return this;
        }
    }

    @Override // md.h0.f.d.AbstractC0708f
    public List b() {
        return this.f45919a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.AbstractC0708f) {
            return this.f45919a.equals(((h0.f.d.AbstractC0708f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f45919a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f45919a + "}";
    }

    private a0(List list) {
        this.f45919a = list;
    }
}
