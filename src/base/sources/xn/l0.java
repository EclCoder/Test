package xn;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f56951h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f56952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f56957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f56958g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l0() {
        this.f56952a = new byte[8192];
        this.f56956e = true;
        this.f56955d = false;
    }

    public final void a() {
        int i10;
        l0 l0Var = this.f56958g;
        if (l0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.s.e(l0Var);
        if (l0Var.f56956e) {
            int i11 = this.f56954c - this.f56953b;
            l0 l0Var2 = this.f56958g;
            kotlin.jvm.internal.s.e(l0Var2);
            int i12 = 8192 - l0Var2.f56954c;
            l0 l0Var3 = this.f56958g;
            kotlin.jvm.internal.s.e(l0Var3);
            if (l0Var3.f56955d) {
                i10 = 0;
            } else {
                l0 l0Var4 = this.f56958g;
                kotlin.jvm.internal.s.e(l0Var4);
                i10 = l0Var4.f56953b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            l0 l0Var5 = this.f56958g;
            kotlin.jvm.internal.s.e(l0Var5);
            f(l0Var5, i11);
            b();
            m0.b(this);
        }
    }

    public final l0 b() {
        l0 l0Var = this.f56957f;
        if (l0Var == this) {
            l0Var = null;
        }
        l0 l0Var2 = this.f56958g;
        kotlin.jvm.internal.s.e(l0Var2);
        l0Var2.f56957f = this.f56957f;
        l0 l0Var3 = this.f56957f;
        kotlin.jvm.internal.s.e(l0Var3);
        l0Var3.f56958g = this.f56958g;
        this.f56957f = null;
        this.f56958g = null;
        return l0Var;
    }

    public final l0 c(l0 segment) {
        kotlin.jvm.internal.s.h(segment, "segment");
        segment.f56958g = this;
        segment.f56957f = this.f56957f;
        l0 l0Var = this.f56957f;
        kotlin.jvm.internal.s.e(l0Var);
        l0Var.f56958g = segment;
        this.f56957f = segment;
        return segment;
    }

    public final l0 d() {
        this.f56955d = true;
        return new l0(this.f56952a, this.f56953b, this.f56954c, true, false);
    }

    public final void f(l0 sink, int i10) {
        kotlin.jvm.internal.s.h(sink, "sink");
        if (!sink.f56956e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f56954c;
        if (i11 + i10 > 8192) {
            if (sink.f56955d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f56953b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f56952a;
            gl.j.l(bArr, bArr, 0, i12, i11, 2, null);
            sink.f56954c -= sink.f56953b;
            sink.f56953b = 0;
        }
        byte[] bArr2 = this.f56952a;
        byte[] bArr3 = sink.f56952a;
        int i13 = sink.f56954c;
        int i14 = this.f56953b;
        gl.j.f(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f56954c += i10;
        this.f56953b += i10;
    }

    public final l0 e(int i10) {
        l0 l0VarC;
        if (i10 <= 0 || i10 > this.f56954c - this.f56953b) {
            throw new IllegalArgumentException(XTkUEXuiK.vAnXnL);
        }
        if (i10 >= 1024) {
            l0VarC = d();
        } else {
            l0VarC = m0.c();
            byte[] bArr = this.f56952a;
            byte[] bArr2 = l0VarC.f56952a;
            int i11 = this.f56953b;
            gl.j.l(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        l0VarC.f56954c = l0VarC.f56953b + i10;
        this.f56953b += i10;
        l0 l0Var = this.f56958g;
        kotlin.jvm.internal.s.e(l0Var);
        l0Var.c(l0VarC);
        return l0VarC;
    }

    public l0(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.s.h(data, "data");
        this.f56952a = data;
        this.f56953b = i10;
        this.f56954c = i11;
        this.f56955d = z10;
        this.f56956e = z11;
    }
}
