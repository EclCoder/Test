package ld;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f44314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f44315f;

    @Override // ld.j
    public String c() {
        return this.f44312c;
    }

    @Override // ld.j
    public String d() {
        return this.f44313d;
    }

    @Override // ld.j
    public String e() {
        return this.f44311b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f44311b.equals(jVar.e()) && this.f44312c.equals(jVar.c()) && this.f44313d.equals(jVar.d()) && this.f44314e.equals(jVar.g()) && this.f44315f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // ld.j
    public long f() {
        return this.f44315f;
    }

    @Override // ld.j
    public String g() {
        return this.f44314e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f44311b.hashCode() ^ 1000003) * 1000003) ^ this.f44312c.hashCode()) * 1000003) ^ this.f44313d.hashCode()) * 1000003) ^ this.f44314e.hashCode()) * 1000003;
        long j10 = this.f44315f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f44311b + ", parameterKey=" + this.f44312c + ", parameterValue=" + this.f44313d + ", variantId=" + this.f44314e + ", templateVersion=" + this.f44315f + "}";
    }

    b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f44311b = str;
            if (str2 != null) {
                this.f44312c = str2;
                if (str3 != null) {
                    this.f44313d = str3;
                    if (str4 != null) {
                        this.f44314e = str4;
                        this.f44315f = j10;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException(PAFNPq.fhgGR);
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }
}
