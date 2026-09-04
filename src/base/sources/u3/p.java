package u3;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f53971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f53972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53973c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53977g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f53979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o0 f53980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f53981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53982l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53984n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f53978h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f53974d = new w(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f53975e = new w(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f53976f = new w(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53983m = C.TIME_UNSET;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w1.u f53985o = new w1.u();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f53986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f53987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f53988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray f53989d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray f53990e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final x1.e f53991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f53992g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f53993h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f53994i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f53995j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f53996k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f53997l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f53998m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f53999n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f54000o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f54001p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f54002q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f54003r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f54004s;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f54005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f54006b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private x1.d.c f54007c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f54008d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f54009e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f54010f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f54011g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f54012h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f54013i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f54014j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f54015k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f54016l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f54017m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f54018n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f54019o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f54020p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f54005a) {
                    return false;
                }
                if (!aVar.f54005a) {
                    return true;
                }
                x1.d.c cVar = (x1.d.c) w1.a.i(this.f54007c);
                x1.d.c cVar2 = (x1.d.c) w1.a.i(aVar.f54007c);
                return (this.f54010f == aVar.f54010f && this.f54011g == aVar.f54011g && this.f54012h == aVar.f54012h && (!this.f54013i || !aVar.f54013i || this.f54014j == aVar.f54014j) && (((i10 = this.f54008d) == (i11 = aVar.f54008d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f56611n) != 0 || cVar2.f56611n != 0 || (this.f54017m == aVar.f54017m && this.f54018n == aVar.f54018n)) && ((i12 != 1 || cVar2.f56611n != 1 || (this.f54019o == aVar.f54019o && this.f54020p == aVar.f54020p)) && (z10 = this.f54015k) == aVar.f54015k && (!z10 || this.f54016l == aVar.f54016l))))) ? false : true;
            }

            public void b() {
                this.f54006b = false;
                this.f54005a = false;
            }

            public boolean d() {
                if (!this.f54006b) {
                    return false;
                }
                int i10 = this.f54009e;
                return i10 == 7 || i10 == 2;
            }

            public void e(x1.d.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f54007c = cVar;
                this.f54008d = i10;
                this.f54009e = i11;
                this.f54010f = i12;
                this.f54011g = i13;
                this.f54012h = z10;
                this.f54013i = z11;
                this.f54014j = z12;
                this.f54015k = z13;
                this.f54016l = i14;
                this.f54017m = i15;
                this.f54018n = i16;
                this.f54019o = i17;
                this.f54020p = i18;
                this.f54005a = true;
                this.f54006b = true;
            }

            public void f(int i10) {
                this.f54009e = i10;
                this.f54006b = true;
            }
        }

        public b(o0 o0Var, boolean z10, boolean z11) {
            this.f53986a = o0Var;
            this.f53987b = z10;
            this.f53988c = z11;
            this.f53998m = new a();
            this.f53999n = new a();
            byte[] bArr = new byte[128];
            this.f53992g = bArr;
            this.f53991f = new x1.e(bArr, 0, 0);
            h();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void e(int i10) {
            long j10 = this.f54002q;
            if (j10 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f54003r;
            this.f53986a.e(j10, z10 ? 1 : 0, (int) (this.f53995j - this.f54001p), i10, null);
        }

        private void i() {
            boolean zD = this.f53987b ? this.f53999n.d() : this.f54004s;
            boolean z10 = this.f54003r;
            int i10 = this.f53994i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f54003r = z10 | z11;
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0109  */
        /* JADX WARN: Code duplicated, block: B:54:0x010c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0110  */
        /* JADX WARN: Code duplicated, block: B:59:0x011a  */
        /* JADX WARN: Code duplicated, block: B:60:0x0123  */
        /* JADX WARN: Code duplicated, block: B:63:0x0129  */
        /* JADX WARN: Code duplicated, block: B:66:0x0134  */
        /* JADX WARN: Code duplicated, block: B:76:0x0161  */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zD;
            boolean z12;
            int iH;
            int i12;
            int i13;
            int iG;
            int i14;
            int iG2;
            int iE;
            if (this.f53996k) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.f53992g;
                int length = bArr2.length;
                int i16 = this.f53993h;
                if (length < i16 + i15) {
                    this.f53992g = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i10, this.f53992g, this.f53993h, i15);
                int i17 = this.f53993h + i15;
                this.f53993h = i17;
                this.f53991f.i(this.f53992g, 0, i17);
                if (this.f53991f.b(8)) {
                    this.f53991f.k();
                    int iE2 = this.f53991f.e(2);
                    this.f53991f.l(5);
                    if (this.f53991f.c()) {
                        this.f53991f.h();
                        if (this.f53991f.c()) {
                            int iH2 = this.f53991f.h();
                            if (!this.f53988c) {
                                this.f53996k = false;
                                this.f53999n.f(iH2);
                                return;
                            }
                            if (this.f53991f.c()) {
                                int iH3 = this.f53991f.h();
                                if (this.f53990e.indexOfKey(iH3) < 0) {
                                    this.f53996k = false;
                                    return;
                                }
                                x1.d.b bVar = (x1.d.b) this.f53990e.get(iH3);
                                x1.d.c cVar = (x1.d.c) this.f53989d.get(bVar.f56596b);
                                if (cVar.f56608k) {
                                    if (!this.f53991f.b(2)) {
                                        return;
                                    } else {
                                        this.f53991f.l(2);
                                    }
                                }
                                if (this.f53991f.b(cVar.f56610m)) {
                                    int iE3 = this.f53991f.e(cVar.f56610m);
                                    if (!cVar.f56609l) {
                                        if (this.f53991f.b(1)) {
                                            boolean zD2 = this.f53991f.d();
                                            if (!zD2) {
                                                z10 = zD2;
                                                z11 = false;
                                            } else {
                                                if (!this.f53991f.b(1)) {
                                                    return;
                                                }
                                                z10 = zD2;
                                                z11 = true;
                                                zD = this.f53991f.d();
                                            }
                                            if (this.f53994i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iH = 0;
                                            } else if (!this.f53991f.c()) {
                                                return;
                                            } else {
                                                iH = this.f53991f.h();
                                            }
                                            i12 = cVar.f56611n;
                                            if (i12 != 0) {
                                                if (this.f53991f.b(cVar.f56612o)) {
                                                    iE = this.f53991f.e(cVar.f56612o);
                                                    if (bVar.f56597c || z10) {
                                                        i13 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f53991f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f53991f.g();
                                                        i13 = iE;
                                                        i14 = 0;
                                                    }
                                                    iG2 = i14;
                                                    this.f53999n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                                    this.f53996k = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || cVar.f56613p) {
                                                i13 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f53991f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f53991f.g();
                                                if (!bVar.f56597c || z10) {
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f53991f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f53991f.g();
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.f53999n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f53996k = false;
                                            i14 = iG;
                                            iG2 = i14;
                                            this.f53999n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f53996k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zD = z11;
                                    if (this.f53994i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iH = 0;
                                    } else if (!this.f53991f.c()) {
                                        return;
                                    } else {
                                        iH = this.f53991f.h();
                                    }
                                    i12 = cVar.f56611n;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f53991f.b(cVar.f56612o)) {
                                            return;
                                        }
                                        iE = this.f53991f.e(cVar.f56612o);
                                        if (bVar.f56597c) {
                                        }
                                        i13 = iE;
                                        iG = 0;
                                    }
                                    i14 = iG;
                                    iG2 = i14;
                                    this.f53999n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                    this.f53996k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public void b(long j10) {
            i();
            this.f53995j = j10;
            e(0);
            this.f54000o = false;
        }

        public boolean c(long j10, int i10, boolean z10) {
            if (this.f53994i == 9 || (this.f53988c && this.f53999n.c(this.f53998m))) {
                if (z10 && this.f54000o) {
                    e(i10 + ((int) (j10 - this.f53995j)));
                }
                this.f54001p = this.f53995j;
                this.f54002q = this.f53997l;
                this.f54003r = false;
                this.f54000o = true;
            }
            i();
            return this.f54003r;
        }

        public boolean d() {
            return this.f53988c;
        }

        public void f(x1.d.b bVar) {
            this.f53990e.append(bVar.f56595a, bVar);
        }

        public void g(x1.d.c cVar) {
            this.f53989d.append(cVar.f56601d, cVar);
        }

        public void h() {
            this.f53996k = false;
            this.f54000o = false;
            this.f53999n.b();
        }

        public void j(long j10, int i10, long j11, boolean z10) {
            this.f53994i = i10;
            this.f53997l = j11;
            this.f53995j = j10;
            this.f54004s = z10;
            if (!this.f53987b || i10 != 1) {
                if (!this.f53988c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f53998m;
            this.f53998m = this.f53999n;
            this.f53999n = aVar;
            aVar.b();
            this.f53993h = 0;
            this.f53996k = true;
        }
    }

    public p(f0 f0Var, boolean z10, boolean z11) {
        this.f53971a = f0Var;
        this.f53972b = z10;
        this.f53973c = z11;
    }

    private void a() {
        w1.a.i(this.f53980j);
        w1.c0.h(this.f53981k);
    }

    private void f(long j10, int i10, int i11, long j11) {
        if (!this.f53982l || this.f53981k.d()) {
            this.f53974d.b(i11);
            this.f53975e.b(i11);
            if (this.f53982l) {
                if (this.f53974d.c()) {
                    w wVar = this.f53974d;
                    this.f53981k.g(x1.d.l(wVar.f54120d, 3, wVar.f54121e));
                    this.f53974d.d();
                } else if (this.f53975e.c()) {
                    w wVar2 = this.f53975e;
                    this.f53981k.f(x1.d.j(wVar2.f54120d, 3, wVar2.f54121e));
                    this.f53975e.d();
                }
            } else if (this.f53974d.c() && this.f53975e.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f53974d;
                arrayList.add(Arrays.copyOf(wVar3.f54120d, wVar3.f54121e));
                w wVar4 = this.f53975e;
                arrayList.add(Arrays.copyOf(wVar4.f54120d, wVar4.f54121e));
                w wVar5 = this.f53974d;
                x1.d.c cVarL = x1.d.l(wVar5.f54120d, 3, wVar5.f54121e);
                w wVar6 = this.f53975e;
                x1.d.b bVarJ = x1.d.j(wVar6.f54120d, 3, wVar6.f54121e);
                this.f53980j.b(new t1.o.b().a0(this.f53979i).o0(MimeTypes.VIDEO_H264).O(w1.e.a(cVarL.f56598a, cVarL.f56599b, cVarL.f56600c)).t0(cVarL.f56603f).Y(cVarL.f56604g).P(new t1.f.b().d(cVarL.f56614q).c(cVarL.f56615r).e(cVarL.f56616s).g(cVarL.f56606i + 8).b(cVarL.f56607j + 8).a()).k0(cVarL.f56605h).b0(arrayList).g0(cVarL.f56617t).K());
                this.f53982l = true;
                this.f53981k.g(cVarL);
                this.f53981k.f(bVarJ);
                this.f53974d.d();
                this.f53975e.d();
            }
        }
        if (this.f53976f.b(i11)) {
            w wVar7 = this.f53976f;
            this.f53985o.R(this.f53976f.f54120d, x1.d.r(wVar7.f54120d, wVar7.f54121e));
            this.f53985o.T(4);
            this.f53971a.a(j11, this.f53985o);
        }
        if (this.f53981k.c(j10, i10, this.f53982l)) {
            this.f53984n = false;
        }
    }

    private void g(byte[] bArr, int i10, int i11) {
        if (!this.f53982l || this.f53981k.d()) {
            this.f53974d.a(bArr, i10, i11);
            this.f53975e.a(bArr, i10, i11);
        }
        this.f53976f.a(bArr, i10, i11);
        this.f53981k.a(bArr, i10, i11);
    }

    private void h(long j10, int i10, long j11) {
        if (!this.f53982l || this.f53981k.d()) {
            this.f53974d.e(i10);
            this.f53975e.e(i10);
        }
        this.f53976f.e(i10);
        this.f53981k.j(j10, i10, j11, this.f53984n);
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        a();
        int iF = uVar.f();
        int iG = uVar.g();
        byte[] bArrE = uVar.e();
        this.f53977g += (long) uVar.a();
        this.f53980j.c(uVar, uVar.a());
        while (true) {
            int iC = x1.d.c(bArrE, iF, iG, this.f53978h);
            if (iC == iG) {
                g(bArrE, iF, iG);
                return;
            }
            int iF2 = x1.d.f(bArrE, iC);
            int i10 = iC - iF;
            if (i10 > 0) {
                g(bArrE, iF, iC);
            }
            int i11 = iG - iC;
            long j10 = this.f53977g - ((long) i11);
            f(j10, i11, i10 < 0 ? -i10 : 0, this.f53983m);
            h(j10, iF2, this.f53983m);
            iF = iC + 3;
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53983m = j10;
        this.f53984n |= (i10 & 2) != 0;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53979i = dVar.b();
        o0 o0VarTrack = rVar.track(dVar.c(), 2);
        this.f53980j = o0VarTrack;
        this.f53981k = new b(o0VarTrack, this.f53972b, this.f53973c);
        this.f53971a.b(rVar, dVar);
    }

    @Override // u3.m
    public void e(boolean z10) {
        a();
        if (z10) {
            this.f53981k.b(this.f53977g);
        }
    }

    @Override // u3.m
    public void seek() {
        this.f53977g = 0L;
        this.f53984n = false;
        this.f53983m = C.TIME_UNSET;
        x1.d.a(this.f53978h);
        this.f53974d.d();
        this.f53975e.d();
        this.f53976f.d();
        b bVar = this.f53981k;
        if (bVar != null) {
            bVar.h();
        }
    }
}
