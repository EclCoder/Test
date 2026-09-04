package md;

import java.util.List;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class t extends h0.f.d.a.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f46146c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.b.e.AbstractC0703a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f46149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f46150d;

        b() {
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0703a
        public h0.f.d.a.b.e a() {
            String str;
            List list;
            if (this.f46150d == 1 && (str = this.f46147a) != null && (list = this.f46149c) != null) {
                return new t(str, this.f46148b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46147a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f46150d) == 0) {
                sb2.append(" importance");
            }
            if (this.f46149c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0703a
        public h0.f.d.a.b.e.AbstractC0703a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f46149c = list;
            return this;
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0703a
        public h0.f.d.a.b.e.AbstractC0703a c(int i10) {
            this.f46148b = i10;
            this.f46150d = (byte) (this.f46150d | 1);
            return this;
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0703a
        public h0.f.d.a.b.e.AbstractC0703a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f46147a = str;
            return this;
        }
    }

    @Override // md.h0.f.d.a.b.e
    public List b() {
        return this.f46146c;
    }

    @Override // md.h0.f.d.a.b.e
    public int c() {
        return this.f46145b;
    }

    @Override // md.h0.f.d.a.b.e
    public String d() {
        return this.f46144a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.b.e) {
            h0.f.d.a.b.e eVar = (h0.f.d.a.b.e) obj;
            if (this.f46144a.equals(eVar.d()) && this.f46145b == eVar.c() && this.f46146c.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f46144a.hashCode() ^ 1000003) * 1000003) ^ this.f46145b) * 1000003) ^ this.f46146c.hashCode();
    }

    private t(String str, int i10, List list) {
        this.f46144a = str;
        this.f46145b = i10;
        this.f46146c = list;
    }

    public String toString() {
        return "Thread{name=" + this.f46144a + UoyZyZEcGYBpIg.RDhj + this.f46145b + ", frames=" + this.f46146c + "}";
    }
}
