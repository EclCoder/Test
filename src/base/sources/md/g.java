package md;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g extends h0.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f46009b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f46011b;

        b() {
        }

        @Override // md.h0.d.b.a
        public h0.d.b a() {
            byte[] bArr;
            String str = this.f46010a;
            if (str != null && (bArr = this.f46011b) != null) {
                return new g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46010a == null) {
                sb2.append(" filename");
            }
            if (this.f46011b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.d.b.a
        public h0.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f46011b = bArr;
            return this;
        }

        @Override // md.h0.d.b.a
        public h0.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f46010a = str;
            return this;
        }
    }

    @Override // md.h0.d.b
    public byte[] b() {
        return this.f46009b;
    }

    @Override // md.h0.d.b
    public String c() {
        return this.f46008a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.d.b) {
            h0.d.b bVar = (h0.d.b) obj;
            if (this.f46008a.equals(bVar.c())) {
                if (Arrays.equals(this.f46009b, bVar instanceof g ? ((g) bVar).f46009b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f46008a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46009b);
    }

    public String toString() {
        return "File{filename=" + this.f46008a + ", contents=" + Arrays.toString(this.f46009b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f46008a = str;
        this.f46009b = bArr;
    }
}
