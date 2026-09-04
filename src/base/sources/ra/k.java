package ra;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51203e;

    public k(Object obj) {
        this(obj, -1L);
    }

    public k a(Object obj) {
        return this.f51199a.equals(obj) ? this : new k(obj, this.f51200b, this.f51201c, this.f51202d, this.f51203e);
    }

    public boolean b() {
        return this.f51200b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f51199a.equals(kVar.f51199a) && this.f51200b == kVar.f51200b && this.f51201c == kVar.f51201c && this.f51202d == kVar.f51202d && this.f51203e == kVar.f51203e;
    }

    public int hashCode() {
        return ((((((((527 + this.f51199a.hashCode()) * 31) + this.f51200b) * 31) + this.f51201c) * 31) + ((int) this.f51202d)) * 31) + this.f51203e;
    }

    public k(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public k(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public k(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    protected k(k kVar) {
        this.f51199a = kVar.f51199a;
        this.f51200b = kVar.f51200b;
        this.f51201c = kVar.f51201c;
        this.f51202d = kVar.f51202d;
        this.f51203e = kVar.f51203e;
    }

    private k(Object obj, int i10, int i11, long j10, int i12) {
        this.f51199a = obj;
        this.f51200b = i10;
        this.f51201c = i11;
        this.f51202d = j10;
        this.f51203e = i12;
    }
}
