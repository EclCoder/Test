package an;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gl.r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e f476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bn.d f479n;

    public b(int i10, int i11, float f10, float f11, float f12, List size, List colors, List shapes, long j10, boolean z10, e position, int i12, f rotation, bn.d emitter) {
        s.h(size, "size");
        s.h(colors, "colors");
        s.h(shapes, "shapes");
        s.h(position, "position");
        s.h(rotation, "rotation");
        s.h(emitter, "emitter");
        this.f466a = i10;
        this.f467b = i11;
        this.f468c = f10;
        this.f469d = f11;
        this.f470e = f12;
        this.f471f = size;
        this.f472g = colors;
        this.f473h = shapes;
        this.f474i = j10;
        this.f475j = z10;
        this.f476k = position;
        this.f477l = i12;
        this.f478m = rotation;
        this.f479n = emitter;
    }

    public final b a(int i10, int i11, float f10, float f11, float f12, List size, List colors, List shapes, long j10, boolean z10, e position, int i12, f rotation, bn.d emitter) {
        s.h(size, "size");
        s.h(colors, "colors");
        s.h(shapes, "shapes");
        s.h(position, "position");
        s.h(rotation, "rotation");
        s.h(emitter, "emitter");
        return new b(i10, i11, f10, f11, f12, size, colors, shapes, j10, z10, position, i12, rotation, emitter);
    }

    public final int c() {
        return this.f466a;
    }

    public final List d() {
        return this.f472g;
    }

    public final float e() {
        return this.f470e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f466a == bVar.f466a && this.f467b == bVar.f467b && Float.compare(this.f468c, bVar.f468c) == 0 && Float.compare(this.f469d, bVar.f469d) == 0 && Float.compare(this.f470e, bVar.f470e) == 0 && s.c(this.f471f, bVar.f471f) && s.c(this.f472g, bVar.f472g) && s.c(this.f473h, bVar.f473h) && this.f474i == bVar.f474i && this.f475j == bVar.f475j && s.c(this.f476k, bVar.f476k) && this.f477l == bVar.f477l && s.c(this.f478m, bVar.f478m) && s.c(this.f479n, bVar.f479n);
    }

    public final int f() {
        return this.f477l;
    }

    public final bn.d g() {
        return this.f479n;
    }

    public final boolean h() {
        return this.f475j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.f466a) * 31) + Integer.hashCode(this.f467b)) * 31) + Float.hashCode(this.f468c)) * 31) + Float.hashCode(this.f469d)) * 31) + Float.hashCode(this.f470e)) * 31) + this.f471f.hashCode()) * 31) + this.f472g.hashCode()) * 31) + this.f473h.hashCode()) * 31) + Long.hashCode(this.f474i)) * 31;
        boolean z10 = this.f475j;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((((((iHashCode + r10) * 31) + this.f476k.hashCode()) * 31) + Integer.hashCode(this.f477l)) * 31) + this.f478m.hashCode()) * 31) + this.f479n.hashCode();
    }

    public final float i() {
        return this.f469d;
    }

    public final e j() {
        return this.f476k;
    }

    public final f k() {
        return this.f478m;
    }

    public final List l() {
        return this.f473h;
    }

    public final List m() {
        return this.f471f;
    }

    public final float n() {
        return this.f468c;
    }

    public final int o() {
        return this.f467b;
    }

    public final long p() {
        return this.f474i;
    }

    public String toString() {
        return "Party(angle=" + this.f466a + ", spread=" + this.f467b + ", speed=" + this.f468c + ", maxSpeed=" + this.f469d + ", damping=" + this.f470e + ", size=" + this.f471f + ", colors=" + this.f472g + ", shapes=" + this.f473h + ", timeToLive=" + this.f474i + ", fadeOutEnabled=" + this.f475j + ", position=" + this.f476k + ", delay=" + this.f477l + ", rotation=" + this.f478m + ", emitter=" + this.f479n + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(int i10, int i11, float f10, float f11, float f12, List list, List list2, List list3, long j10, boolean z10, e eVar, int i12, f fVar, bn.d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        List listO;
        int i14 = (i13 & 1) != 0 ? 0 : i10;
        int i15 = (i13 & 2) != 0 ? 360 : i11;
        float f13 = (i13 & 4) != 0 ? 30.0f : f10;
        float f14 = (i13 & 8) != 0 ? 0.0f : f11;
        float f15 = (i13 & 16) != 0 ? 0.9f : f12;
        if ((i13 & 32) != 0) {
            cn.d.a aVar = cn.d.f10145d;
            listO = r.o(aVar.c(), aVar.b(), aVar.a());
        } else {
            listO = list;
        }
        this(i14, i15, f13, f14, f15, listO, (i13 & 64) != 0 ? r.o(16572810, 16740973, 16003181, 11832815) : list2, (i13 & 128) != 0 ? r.o(cn.c.b.f10144a, cn.c.a.f10142a) : list3, (i13 & 256) != 0 ? 2000L : j10, (i13 & 512) != 0 ? true : z10, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? new e.c(0.5d, 0.5d) : eVar, (i13 & 2048) != 0 ? 0 : i12, (i13 & 4096) != 0 ? new f(false, 0.0f, 0.0f, 0.0f, 0.0f, 31, null) : fVar, dVar);
    }
}
