package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f extends h0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45996b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f45997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45998b;

        b() {
        }

        @Override // md.h0.d.a
        public h0.d a() {
            List list = this.f45997a;
            if (list != null) {
                return new f(list, this.f45998b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // md.h0.d.a
        public h0.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f45997a = list;
            return this;
        }

        @Override // md.h0.d.a
        public h0.d.a c(String str) {
            this.f45998b = str;
            return this;
        }
    }

    @Override // md.h0.d
    public List b() {
        return this.f45995a;
    }

    @Override // md.h0.d
    public String c() {
        return this.f45996b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.d) {
            h0.d dVar = (h0.d) obj;
            if (this.f45995a.equals(dVar.b()) && ((str = this.f45996b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f45995a.hashCode() ^ 1000003) * 1000003;
        String str = this.f45996b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f45995a + ", orgId=" + this.f45996b + "}";
    }

    private f(List list, String str) {
        this.f45995a = list;
        this.f45996b = str;
    }
}
