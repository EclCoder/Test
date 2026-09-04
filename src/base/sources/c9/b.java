package c9;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f9615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f9616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f9620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f9622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f9623j;

    /* JADX INFO: renamed from: c9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0131b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f9625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f9626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f9627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f9628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f9629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f9630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f9631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f9632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f9633j;

        C0131b() {
        }

        @Override // c9.i.a
        public i d() {
            String str = "";
            if (this.f9624a == null) {
                str = " transportName";
            }
            if (this.f9626c == null) {
                str = str + " encodedPayload";
            }
            if (this.f9627d == null) {
                str = str + " eventMillis";
            }
            if (this.f9628e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f9629f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f9624a, this.f9625b, this.f9626c, this.f9627d.longValue(), this.f9628e.longValue(), this.f9629f, this.f9630g, this.f9631h, this.f9632i, this.f9633j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c9.i.a
        protected Map e() {
            Map map = this.f9629f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // c9.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f9629f = map;
            return this;
        }

        @Override // c9.i.a
        public i.a g(Integer num) {
            this.f9625b = num;
            return this;
        }

        @Override // c9.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f9626c = hVar;
            return this;
        }

        @Override // c9.i.a
        public i.a i(long j10) {
            this.f9627d = Long.valueOf(j10);
            return this;
        }

        @Override // c9.i.a
        public i.a j(byte[] bArr) {
            this.f9632i = bArr;
            return this;
        }

        @Override // c9.i.a
        public i.a k(byte[] bArr) {
            this.f9633j = bArr;
            return this;
        }

        @Override // c9.i.a
        public i.a l(Integer num) {
            this.f9630g = num;
            return this;
        }

        @Override // c9.i.a
        public i.a m(String str) {
            this.f9631h = str;
            return this;
        }

        @Override // c9.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f9624a = str;
            return this;
        }

        @Override // c9.i.a
        public i.a o(long j10) {
            this.f9628e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // c9.i
    protected Map c() {
        return this.f9619f;
    }

    @Override // c9.i
    public Integer d() {
        return this.f9615b;
    }

    @Override // c9.i
    public h e() {
        return this.f9616c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f9614a.equals(iVar.n()) && ((num = this.f9615b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f9616c.equals(iVar.e()) && this.f9617d == iVar.f() && this.f9618e == iVar.o() && this.f9619f.equals(iVar.c()) && ((num2 = this.f9620g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f9621h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z10 = iVar instanceof b;
                if (Arrays.equals(this.f9622i, z10 ? ((b) iVar).f9622i : iVar.g())) {
                    if (Arrays.equals(this.f9623j, z10 ? ((b) iVar).f9623j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // c9.i
    public long f() {
        return this.f9617d;
    }

    @Override // c9.i
    public byte[] g() {
        return this.f9622i;
    }

    @Override // c9.i
    public byte[] h() {
        return this.f9623j;
    }

    public int hashCode() {
        int iHashCode = (this.f9614a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f9615b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f9616c.hashCode()) * 1000003;
        long j10 = this.f9617d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f9618e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f9619f.hashCode()) * 1000003;
        Integer num2 = this.f9620g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f9621h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f9622i)) * 1000003) ^ Arrays.hashCode(this.f9623j);
    }

    @Override // c9.i
    public Integer l() {
        return this.f9620g;
    }

    @Override // c9.i
    public String m() {
        return this.f9621h;
    }

    @Override // c9.i
    public String n() {
        return this.f9614a;
    }

    @Override // c9.i
    public long o() {
        return this.f9618e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f9614a + ", code=" + this.f9615b + ", encodedPayload=" + this.f9616c + ", eventMillis=" + this.f9617d + ", uptimeMillis=" + this.f9618e + ", autoMetadata=" + this.f9619f + ", productId=" + this.f9620g + ", pseudonymousId=" + this.f9621h + ", experimentIdsClear=" + Arrays.toString(this.f9622i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f9623j) + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f9614a = str;
        this.f9615b = num;
        this.f9616c = hVar;
        this.f9617d = j10;
        this.f9618e = j11;
        this.f9619f = map;
        this.f9620g = num2;
        this.f9621h = str2;
        this.f9622i = bArr;
        this.f9623j = bArr2;
    }
}
