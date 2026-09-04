package eb;

import android.graphics.Bitmap;
import bb.h;
import bb.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import ob.d0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f37660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d0 f37661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0564a f37662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Inflater f37663r;

    /* JADX INFO: renamed from: eb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0564a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f37664a = new d0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f37665b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f37668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f37670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f37671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f37672i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(d0 d0Var, int i10) {
            int iK;
            if (i10 < 4) {
                return;
            }
            d0Var.V(3);
            int i11 = i10 - 4;
            if ((d0Var.H() & 128) != 0) {
                if (i11 < 7 || (iK = d0Var.K()) < 4) {
                    return;
                }
                this.f37671h = d0Var.N();
                this.f37672i = d0Var.N();
                this.f37664a.Q(iK - 4);
                i11 = i10 - 11;
            }
            int iF = this.f37664a.f();
            int iG = this.f37664a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            d0Var.l(this.f37664a.e(), iF, iMin);
            this.f37664a.U(iF + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(d0 d0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f37667d = d0Var.N();
            this.f37668e = d0Var.N();
            d0Var.V(11);
            this.f37669f = d0Var.N();
            this.f37670g = d0Var.N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(d0 d0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            d0Var.V(2);
            Arrays.fill(this.f37665b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iH = d0Var.H();
                int iH2 = d0Var.H();
                int iH3 = d0Var.H();
                int iH4 = d0Var.H();
                double d10 = iH2;
                double d11 = iH3 - 128;
                double d12 = iH4 - 128;
                this.f37665b[iH] = (r0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (d0Var.H() << 24) | (r0.q((int) ((1.402d * d11) + d10), 0, 255) << 16) | r0.q((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f37666c = true;
        }

        public bb.b d() {
            int iH;
            if (this.f37667d == 0 || this.f37668e == 0 || this.f37671h == 0 || this.f37672i == 0 || this.f37664a.g() == 0 || this.f37664a.f() != this.f37664a.g() || !this.f37666c) {
                return null;
            }
            this.f37664a.U(0);
            int i10 = this.f37671h * this.f37672i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f37664a.H();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f37665b[iH2];
                } else {
                    int iH3 = this.f37664a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f37664a.H()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? 0 : this.f37665b[this.f37664a.H()]);
                    }
                }
                i11 = iH;
            }
            return new bb.b.C0112b().f(Bitmap.createBitmap(iArr, this.f37671h, this.f37672i, Bitmap.Config.ARGB_8888)).k(this.f37669f / this.f37667d).l(0).h(this.f37670g / this.f37668e, 0).i(0).n(this.f37671h / this.f37667d).g(this.f37672i / this.f37668e).a();
        }

        public void h() {
            this.f37667d = 0;
            this.f37668e = 0;
            this.f37669f = 0;
            this.f37670g = 0;
            this.f37671h = 0;
            this.f37672i = 0;
            this.f37664a.Q(0);
            this.f37666c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f37660o = new d0();
        this.f37661p = new d0();
        this.f37662q = new C0564a();
    }

    private void x(d0 d0Var) {
        if (d0Var.a() <= 0 || d0Var.j() != 120) {
            return;
        }
        if (this.f37663r == null) {
            this.f37663r = new Inflater();
        }
        if (r0.x0(d0Var, this.f37661p, this.f37663r)) {
            d0Var.S(this.f37661p.e(), this.f37661p.g());
        }
    }

    private static bb.b y(d0 d0Var, C0564a c0564a) {
        int iG = d0Var.g();
        int iH = d0Var.H();
        int iN = d0Var.N();
        int iF = d0Var.f() + iN;
        bb.b bVarD = null;
        if (iF > iG) {
            d0Var.U(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0564a.g(d0Var, iN);
                    break;
                case 21:
                    c0564a.e(d0Var, iN);
                    break;
                case 22:
                    c0564a.f(d0Var, iN);
                    break;
            }
        } else {
            bVarD = c0564a.d();
            c0564a.h();
        }
        d0Var.U(iF);
        return bVarD;
    }

    @Override // bb.h
    protected i v(byte[] bArr, int i10, boolean z10) {
        this.f37660o.S(bArr, i10);
        x(this.f37660o);
        this.f37662q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f37660o.a() >= 3) {
            bb.b bVarY = y(this.f37660o, this.f37662q);
            if (bVarY != null) {
                arrayList.add(bVarY);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
