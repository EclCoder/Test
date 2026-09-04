package kk;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f43512b = b((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f43513a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte f43514a;

        public s a() {
            return s.b(this.f43514a);
        }

        public b b(boolean z10) {
            if (z10) {
                this.f43514a = (byte) (this.f43514a | 1);
                return this;
            }
            this.f43514a = (byte) (this.f43514a & (-2));
            return this;
        }

        private b(byte b10) {
            this.f43514a = b10;
        }
    }

    private s(byte b10) {
        this.f43513a = b10;
    }

    public static b a() {
        return new b((byte) 0);
    }

    public static s b(byte b10) {
        return new s(b10);
    }

    private boolean c(int i10) {
        return (i10 & this.f43513a) != 0;
    }

    public boolean d() {
        return c(1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof s) && this.f43513a == ((s) obj).f43513a;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.f43513a});
    }

    public String toString() {
        return "TraceOptions{sampled=" + d() + "}";
    }
}
