package d9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f36457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f36458b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f36459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f36460b;

        b() {
        }

        @Override // d9.f.a
        public f a() {
            String str = "";
            if (this.f36459a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f36459a, this.f36460b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d9.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f36459a = iterable;
            return this;
        }

        @Override // d9.f.a
        public f.a c(byte[] bArr) {
            this.f36460b = bArr;
            return this;
        }
    }

    @Override // d9.f
    public Iterable b() {
        return this.f36457a;
    }

    @Override // d9.f
    public byte[] c() {
        return this.f36458b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f36457a.equals(fVar.b())) {
                if (Arrays.equals(this.f36458b, fVar instanceof a ? ((a) fVar).f36458b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f36457a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f36458b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f36457a + ", extras=" + Arrays.toString(this.f36458b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f36457a = iterable;
        this.f36458b = bArr;
    }
}
