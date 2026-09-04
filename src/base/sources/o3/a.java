package o3;

import android.graphics.Bitmap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import l3.e;
import l3.r;
import w1.c0;
import w1.h;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f48186a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f48187b = new u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0742a f48188c = new C0742a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f48189d;

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0742a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f48190a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f48191b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f48194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f48195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f48196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f48197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f48198i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(u uVar, int i10) {
            int iJ;
            if (i10 < 4) {
                return;
            }
            uVar.U(3);
            int i11 = i10 - 4;
            if ((uVar.G() & 128) != 0) {
                if (i11 < 7 || (iJ = uVar.J()) < 4) {
                    return;
                }
                this.f48197h = uVar.M();
                this.f48198i = uVar.M();
                this.f48190a.P(iJ - 4);
                i11 = i10 - 11;
            }
            int iF = this.f48190a.f();
            int iG = this.f48190a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            uVar.l(this.f48190a.e(), iF, iMin);
            this.f48190a.T(iF + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(u uVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f48193d = uVar.M();
            this.f48194e = uVar.M();
            uVar.U(11);
            this.f48195f = uVar.M();
            this.f48196g = uVar.M();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(u uVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            uVar.U(2);
            Arrays.fill(this.f48191b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iG = uVar.G();
                int iG2 = uVar.G();
                int iG3 = uVar.G();
                int iG4 = uVar.G();
                double d10 = iG2;
                double d11 = iG3 - 128;
                double d12 = iG4 - 128;
                this.f48191b[iG] = (c0.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (uVar.G() << 24) | (c0.o((int) ((1.402d * d11) + d10), 0, 255) << 16) | c0.o((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f48192c = true;
        }

        public v1.a d() {
            int iG;
            if (this.f48193d == 0 || this.f48194e == 0 || this.f48197h == 0 || this.f48198i == 0 || this.f48190a.g() == 0 || this.f48190a.f() != this.f48190a.g() || !this.f48192c) {
                return null;
            }
            this.f48190a.T(0);
            int i10 = this.f48197h * this.f48198i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iG2 = this.f48190a.G();
                if (iG2 != 0) {
                    iG = i11 + 1;
                    iArr[i11] = this.f48191b[iG2];
                } else {
                    int iG3 = this.f48190a.G();
                    if (iG3 != 0) {
                        iG = ((iG3 & 64) == 0 ? iG3 & 63 : ((iG3 & 63) << 8) | this.f48190a.G()) + i11;
                        Arrays.fill(iArr, i11, iG, (iG3 & 128) == 0 ? this.f48191b[0] : this.f48191b[this.f48190a.G()]);
                    }
                }
                i11 = iG;
            }
            return new v1.a.b().f(Bitmap.createBitmap(iArr, this.f48197h, this.f48198i, Bitmap.Config.ARGB_8888)).k(this.f48195f / this.f48193d).l(0).h(this.f48196g / this.f48194e, 0).i(0).n(this.f48197h / this.f48193d).g(this.f48198i / this.f48194e).a();
        }

        public void h() {
            this.f48193d = 0;
            this.f48194e = 0;
            this.f48195f = 0;
            this.f48196g = 0;
            this.f48197h = 0;
            this.f48198i = 0;
            this.f48190a.P(0);
            this.f48192c = false;
        }
    }

    private void d(u uVar) {
        if (uVar.a() <= 0 || uVar.j() != 120) {
            return;
        }
        if (this.f48189d == null) {
            this.f48189d = new Inflater();
        }
        if (c0.r0(uVar, this.f48187b, this.f48189d)) {
            uVar.R(this.f48187b.e(), this.f48187b.g());
        }
    }

    private static v1.a e(u uVar, C0742a c0742a) {
        int iG = uVar.g();
        int iG2 = uVar.G();
        int iM = uVar.M();
        int iF = uVar.f() + iM;
        v1.a aVarD = null;
        if (iF > iG) {
            uVar.T(iG);
            return null;
        }
        if (iG2 != 128) {
            switch (iG2) {
                case 20:
                    c0742a.g(uVar, iM);
                    break;
                case 21:
                    c0742a.e(uVar, iM);
                    break;
                case 22:
                    c0742a.f(uVar, iM);
                    break;
            }
        } else {
            aVarD = c0742a.d();
            c0742a.h();
        }
        uVar.T(iF);
        return aVarD;
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, h hVar) {
        this.f48186a.R(bArr, i11 + i10);
        this.f48186a.T(i10);
        d(this.f48186a);
        this.f48188c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f48186a.a() >= 3) {
            v1.a aVarE = e(this.f48186a, this.f48188c);
            if (aVarE != null) {
                arrayList.add(aVarE);
            }
        }
        hVar.accept(new e(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // l3.r
    public int c() {
        return 2;
    }
}
