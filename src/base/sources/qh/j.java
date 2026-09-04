package qh;

import android.graphics.Matrix;
import android.text.Layout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends i {
    private float A;
    private long B;
    private long C;
    private boolean D;
    private int E;
    private float F;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f50836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f50837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private og.a f50838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f50840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Layout.Alignment f50841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f50842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f50843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f50844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Matrix f50845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f50846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f50847y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f50848z;

    public /* synthetic */ j(String str, String str2, og.a aVar, int i10, float f10, Layout.Alignment alignment, float f11, float f12, float f13, Matrix matrix, int i11, int i12, float f14, float f15, long j10, long j11, boolean z10, int i13, float f16, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, aVar, i10, f10, alignment, f11, f12, f13, matrix, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : i11, (i14 & 2048) != 0 ? 0 : i12, f14, f15, (i14 & 16384) != 0 ? 0L : j10, (32768 & i14) != 0 ? 2000L : j11, (65536 & i14) != 0 ? false : z10, (131072 & i14) != 0 ? 0 : i13, (i14 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? 0.0f : f16);
    }

    public final void A(float f10) {
        this.f50840r = f10;
    }

    public final void B(og.a aVar) {
        s.h(aVar, "<set-?>");
        this.f50838p = aVar;
    }

    public void C(int i10) {
        this.f50847y = i10;
    }

    public final void D(float f10) {
        this.f50843u = f10;
    }

    public final void E(float f10) {
        this.f50844v = f10;
    }

    public final void F(float f10) {
        this.f50842t = f10;
    }

    public void G(String str) {
        s.h(str, "<set-?>");
        this.f50837o = str;
    }

    public void H(int i10) {
        this.f50846x = i10;
    }

    @Override // qh.i, qh.k
    public long b() {
        return this.C;
    }

    @Override // qh.i, qh.k
    public long c() {
        return this.B;
    }

    @Override // qh.k
    public String d() {
        return this.f50837o;
    }

    @Override // qh.k
    public void e(long j10) {
        this.C = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.c(this.f50836n, jVar.f50836n) && s.c(this.f50837o, jVar.f50837o) && s.c(this.f50838p, jVar.f50838p) && this.f50839q == jVar.f50839q && Float.compare(this.f50840r, jVar.f50840r) == 0 && this.f50841s == jVar.f50841s && Float.compare(this.f50842t, jVar.f50842t) == 0 && Float.compare(this.f50843u, jVar.f50843u) == 0 && Float.compare(this.f50844v, jVar.f50844v) == 0 && s.c(this.f50845w, jVar.f50845w) && this.f50846x == jVar.f50846x && this.f50847y == jVar.f50847y && Float.compare(this.f50848z, jVar.f50848z) == 0 && Float.compare(this.A, jVar.A) == 0 && this.B == jVar.B && this.C == jVar.C && this.D == jVar.D && this.E == jVar.E && Float.compare(this.F, jVar.F) == 0;
    }

    @Override // qh.k
    public void f(long j10) {
        this.B = j10;
    }

    @Override // qh.i
    public int g() {
        return this.f50847y;
    }

    @Override // qh.i, qh.k
    public String getId() {
        return this.f50836n;
    }

    @Override // qh.i
    public Matrix h() {
        return this.f50845w;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f50836n.hashCode() * 31) + this.f50837o.hashCode()) * 31) + this.f50838p.hashCode()) * 31) + Integer.hashCode(this.f50839q)) * 31) + Float.hashCode(this.f50840r)) * 31) + this.f50841s.hashCode()) * 31) + Float.hashCode(this.f50842t)) * 31) + Float.hashCode(this.f50843u)) * 31) + Float.hashCode(this.f50844v)) * 31;
        Matrix matrix = this.f50845w;
        return ((((((((((((((((((iHashCode + (matrix == null ? 0 : matrix.hashCode())) * 31) + Integer.hashCode(this.f50846x)) * 31) + Integer.hashCode(this.f50847y)) * 31) + Float.hashCode(this.f50848z)) * 31) + Float.hashCode(this.A)) * 31) + Long.hashCode(this.B)) * 31) + Long.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + Integer.hashCode(this.E)) * 31) + Float.hashCode(this.F);
    }

    @Override // qh.i
    public float i() {
        return this.A;
    }

    @Override // qh.i
    public float j() {
        return this.f50848z;
    }

    @Override // qh.i
    public int k() {
        return this.f50846x;
    }

    @Override // qh.i
    public void l(Matrix matrix) {
        this.f50845w = matrix;
    }

    @Override // qh.i
    public void m(float f10) {
        this.A = f10;
    }

    @Override // qh.i
    public void n(float f10) {
        this.f50848z = f10;
    }

    public final Layout.Alignment o() {
        return this.f50841s;
    }

    public final int p() {
        return this.f50839q;
    }

    public final float q() {
        return this.f50840r;
    }

    public final og.a r() {
        return this.f50838p;
    }

    public final float s() {
        return this.f50843u;
    }

    public final float t() {
        return this.f50844v;
    }

    public String toString() {
        return "TextItem(id=" + this.f50836n + ", text=" + this.f50837o + ", font=" + this.f50838p + ", color=" + this.f50839q + ", colorOpacity=" + this.f50840r + ", align=" + this.f50841s + ", size=" + this.f50842t + ", letterSpacing=" + this.f50843u + ", lineSpacingExtra=" + this.f50844v + ", matrix=" + this.f50845w + ", width=" + this.f50846x + ", height=" + this.f50847y + ", parentWidth=" + this.f50848z + ", parentHeight=" + this.A + ", startPosInPlaylist=" + this.B + ", durationInPlaylist=" + this.C + ", isCaption=" + this.D + ", strokeColor=" + this.E + ", strokeWidth=" + this.F + ')';
    }

    public final float u() {
        return this.f50842t;
    }

    public final int v() {
        return this.E;
    }

    public final float w() {
        return this.F;
    }

    public final boolean x() {
        return this.D;
    }

    public final void y(Layout.Alignment alignment) {
        s.h(alignment, "<set-?>");
        this.f50841s = alignment;
    }

    public final void z(int i10) {
        this.f50839q = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String id2, String text, og.a font, int i10, float f10, Layout.Alignment align, float f11, float f12, float f13, Matrix matrix, int i11, int i12, float f14, float f15, long j10, long j11, boolean z10, int i13, float f16) {
        super(id2, text, matrix, i11, i12, f14, f15, j10, j11);
        s.h(id2, "id");
        s.h(text, "text");
        s.h(font, "font");
        s.h(align, "align");
        this.f50836n = id2;
        this.f50837o = text;
        this.f50838p = font;
        this.f50839q = i10;
        this.f50840r = f10;
        this.f50841s = align;
        this.f50842t = f11;
        this.f50843u = f12;
        this.f50844v = f13;
        this.f50845w = matrix;
        this.f50846x = i11;
        this.f50847y = i12;
        this.f50848z = f14;
        this.A = f15;
        this.B = j10;
        this.C = j11;
        this.D = z10;
        this.E = i13;
        this.F = f16;
    }
}
