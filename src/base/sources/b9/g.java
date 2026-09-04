package b9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f8584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f8585b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f8586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f8587b;

        b() {
        }

        @Override // b9.q.a
        public q a() {
            return new g(this.f8586a, this.f8587b);
        }

        @Override // b9.q.a
        public q.a b(byte[] bArr) {
            this.f8586a = bArr;
            return this;
        }

        @Override // b9.q.a
        public q.a c(byte[] bArr) {
            this.f8587b = bArr;
            return this;
        }
    }

    @Override // b9.q
    public byte[] b() {
        return this.f8584a;
    }

    @Override // b9.q
    public byte[] c() {
        return this.f8585b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z10 = qVar instanceof g;
            if (Arrays.equals(this.f8584a, z10 ? ((g) qVar).f8584a : qVar.b())) {
                if (Arrays.equals(this.f8585b, z10 ? ((g) qVar).f8585b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f8584a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8585b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f8584a) + ", encryptedBlob=" + Arrays.toString(this.f8585b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f8584a = bArr;
        this.f8585b = bArr2;
    }
}
