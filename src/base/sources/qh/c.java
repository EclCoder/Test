package qh;

import android.graphics.Matrix;
import android.net.Uri;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f50804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f50805o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f50806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f50807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f50808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Matrix f50809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f50812v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f50813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f50814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f50815y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f50816z;

    public /* synthetic */ c(String str, String str2, Uri uri, String str3, boolean z10, Matrix matrix, int i10, int i11, float f10, float f11, float f12, long j10, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, uri, str3, z10, matrix, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? 0 : i11, (i12 & 256) != 0 ? 1.0f : f10, f11, f12, j10, j11);
    }

    @Override // qh.i, qh.k
    public long b() {
        return this.f50816z;
    }

    @Override // qh.i, qh.k
    public long c() {
        return this.f50815y;
    }

    @Override // qh.k
    public String d() {
        return this.f50805o;
    }

    @Override // qh.k
    public void e(long j10) {
        this.f50816z = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.c(this.f50804n, cVar.f50804n) && s.c(this.f50805o, cVar.f50805o) && s.c(this.f50806p, cVar.f50806p) && s.c(this.f50807q, cVar.f50807q) && this.f50808r == cVar.f50808r && s.c(this.f50809s, cVar.f50809s) && this.f50810t == cVar.f50810t && this.f50811u == cVar.f50811u && Float.compare(this.f50812v, cVar.f50812v) == 0 && Float.compare(this.f50813w, cVar.f50813w) == 0 && Float.compare(this.f50814x, cVar.f50814x) == 0 && this.f50815y == cVar.f50815y && this.f50816z == cVar.f50816z;
    }

    @Override // qh.k
    public void f(long j10) {
        this.f50815y = j10;
    }

    @Override // qh.i
    public int g() {
        return this.f50811u;
    }

    @Override // qh.i, qh.k
    public String getId() {
        return this.f50804n;
    }

    @Override // qh.i
    public Matrix h() {
        return this.f50809s;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f50804n.hashCode() * 31) + this.f50805o.hashCode()) * 31) + this.f50806p.hashCode()) * 31) + this.f50807q.hashCode()) * 31) + Boolean.hashCode(this.f50808r)) * 31;
        Matrix matrix = this.f50809s;
        return ((((((((((((((iHashCode + (matrix == null ? 0 : matrix.hashCode())) * 31) + Integer.hashCode(this.f50810t)) * 31) + Integer.hashCode(this.f50811u)) * 31) + Float.hashCode(this.f50812v)) * 31) + Float.hashCode(this.f50813w)) * 31) + Float.hashCode(this.f50814x)) * 31) + Long.hashCode(this.f50815y)) * 31) + Long.hashCode(this.f50816z);
    }

    @Override // qh.i
    public float i() {
        return this.f50814x;
    }

    @Override // qh.i
    public float j() {
        return this.f50813w;
    }

    @Override // qh.i
    public int k() {
        return this.f50810t;
    }

    @Override // qh.i
    public void l(Matrix matrix) {
        this.f50809s = matrix;
    }

    @Override // qh.i
    public void m(float f10) {
        this.f50814x = f10;
    }

    @Override // qh.i
    public void n(float f10) {
        this.f50813w = f10;
    }

    public final boolean o() {
        return this.f50808r;
    }

    public final String p() {
        return this.f50807q;
    }

    public final float q() {
        return this.f50812v;
    }

    public final Uri r() {
        return this.f50806p;
    }

    public void s(int i10) {
        this.f50811u = i10;
    }

    public final void t(boolean z10) {
        this.f50808r = z10;
    }

    public String toString() {
        return "DrawableItem(id=" + this.f50804n + ", text=" + this.f50805o + ", uri=" + this.f50806p + ", path=" + this.f50807q + ", inAsset=" + this.f50808r + ", matrix=" + this.f50809s + ", width=" + this.f50810t + ", height=" + this.f50811u + ", preScale=" + this.f50812v + ", parentWidth=" + this.f50813w + ", parentHeight=" + this.f50814x + ", startPosInPlaylist=" + this.f50815y + ", durationInPlaylist=" + this.f50816z + ')';
    }

    public final void u(String str) {
        s.h(str, "<set-?>");
        this.f50807q = str;
    }

    public final void v(float f10) {
        this.f50812v = f10;
    }

    public void w(String str) {
        s.h(str, "<set-?>");
        this.f50805o = str;
    }

    public final void x(Uri uri) {
        s.h(uri, "<set-?>");
        this.f50806p = uri;
    }

    public void y(int i10) {
        this.f50810t = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String id2, String text, Uri uri, String path, boolean z10, Matrix matrix, int i10, int i11, float f10, float f11, float f12, long j10, long j11) {
        super(id2, text, matrix, i10, i11, f11, f12, j10, j11);
        s.h(id2, "id");
        s.h(text, "text");
        s.h(uri, "uri");
        s.h(path, "path");
        this.f50804n = id2;
        this.f50805o = text;
        this.f50806p = uri;
        this.f50807q = path;
        this.f50808r = z10;
        this.f50809s = matrix;
        this.f50810t = i10;
        this.f50811u = i11;
        this.f50812v = f10;
        this.f50813w = f11;
        this.f50814x = f12;
        this.f50815y = j10;
        this.f50816z = j11;
    }
}
