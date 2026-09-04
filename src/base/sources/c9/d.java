package c9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f9645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a9.e f9646c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f9648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a9.e f9649c;

        b() {
        }

        @Override // c9.p.a
        public p a() {
            String str = "";
            if (this.f9647a == null) {
                str = " backendName";
            }
            if (this.f9649c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f9647a, this.f9648b, this.f9649c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c9.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f9647a = str;
            return this;
        }

        @Override // c9.p.a
        public p.a c(byte[] bArr) {
            this.f9648b = bArr;
            return this;
        }

        @Override // c9.p.a
        public p.a d(a9.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f9649c = eVar;
            return this;
        }
    }

    @Override // c9.p
    public String b() {
        return this.f9644a;
    }

    @Override // c9.p
    public byte[] c() {
        return this.f9645b;
    }

    @Override // c9.p
    public a9.e d() {
        return this.f9646c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f9644a.equals(pVar.b())) {
                if (Arrays.equals(this.f9645b, pVar instanceof d ? ((d) pVar).f9645b : pVar.c()) && this.f9646c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9644a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9645b)) * 1000003) ^ this.f9646c.hashCode();
    }

    private d(String str, byte[] bArr, a9.e eVar) {
        this.f9644a = str;
        this.f9645b = bArr;
        this.f9646c = eVar;
    }
}
