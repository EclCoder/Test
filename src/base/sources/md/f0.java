package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f0 extends i0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f46003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f46004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f46005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f46006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f46007i;

    f0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f45999a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f46000b = str;
        this.f46001c = i11;
        this.f46002d = j10;
        this.f46003e = j11;
        this.f46004f = z10;
        this.f46005g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f46006h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f46007i = str3;
    }

    @Override // md.i0.b
    public int a() {
        return this.f45999a;
    }

    @Override // md.i0.b
    public int b() {
        return this.f46001c;
    }

    @Override // md.i0.b
    public long d() {
        return this.f46003e;
    }

    @Override // md.i0.b
    public boolean e() {
        return this.f46004f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0.b) {
            i0.b bVar = (i0.b) obj;
            if (this.f45999a == bVar.a() && this.f46000b.equals(bVar.g()) && this.f46001c == bVar.b() && this.f46002d == bVar.j() && this.f46003e == bVar.d() && this.f46004f == bVar.e() && this.f46005g == bVar.i() && this.f46006h.equals(bVar.f()) && this.f46007i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // md.i0.b
    public String f() {
        return this.f46006h;
    }

    @Override // md.i0.b
    public String g() {
        return this.f46000b;
    }

    @Override // md.i0.b
    public String h() {
        return this.f46007i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f45999a ^ 1000003) * 1000003) ^ this.f46000b.hashCode()) * 1000003) ^ this.f46001c) * 1000003;
        long j10 = this.f46002d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f46003e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f46004f ? 1231 : 1237)) * 1000003) ^ this.f46005g) * 1000003) ^ this.f46006h.hashCode()) * 1000003) ^ this.f46007i.hashCode();
    }

    @Override // md.i0.b
    public int i() {
        return this.f46005g;
    }

    @Override // md.i0.b
    public long j() {
        return this.f46002d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f45999a + ", model=" + this.f46000b + ", availableProcessors=" + this.f46001c + ", totalRam=" + this.f46002d + ", diskSpace=" + this.f46003e + ", isEmulator=" + this.f46004f + ", state=" + this.f46005g + ", manufacturer=" + this.f46006h + ", modelClass=" + this.f46007i + "}";
    }
}
