package ea;

import android.util.SparseArray;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f37515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37517c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f37521g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u9.b0 f37524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f37525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37526l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37528n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f37522h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f37518d = new u(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f37519e = new u(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f37520f = new u(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37527m = C.TIME_UNSET;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ob.d0 f37529o = new ob.d0();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u9.b0 f37530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f37531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f37532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray f37533d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray f37534e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ob.e0 f37535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f37536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f37537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f37538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f37539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f37540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f37541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f37542m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f37543n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f37544o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f37545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f37546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f37547r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f37548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f37549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ob.z.c f37550c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f37551d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f37552e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f37553f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f37554g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f37555h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f37556i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f37557j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f37558k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f37559l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f37560m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f37561n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f37562o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f37563p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f37548a) {
                    return false;
                }
                if (!aVar.f37548a) {
                    return true;
                }
                ob.z.c cVar = (ob.z.c) ob.a.i(this.f37550c);
                ob.z.c cVar2 = (ob.z.c) ob.a.i(aVar.f37550c);
                return (this.f37553f == aVar.f37553f && this.f37554g == aVar.f37554g && this.f37555h == aVar.f37555h && (!this.f37556i || !aVar.f37556i || this.f37557j == aVar.f37557j) && (((i10 = this.f37551d) == (i11 = aVar.f37551d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f48501l) != 0 || cVar2.f48501l != 0 || (this.f37560m == aVar.f37560m && this.f37561n == aVar.f37561n)) && ((i12 != 1 || cVar2.f48501l != 1 || (this.f37562o == aVar.f37562o && this.f37563p == aVar.f37563p)) && (z10 = this.f37558k) == aVar.f37558k && (!z10 || this.f37559l == aVar.f37559l))))) ? false : true;
            }

            public void b() {
                this.f37549b = false;
                this.f37548a = false;
            }

            public boolean d() {
                if (!this.f37549b) {
                    return false;
                }
                int i10 = this.f37552e;
                return i10 == 7 || i10 == 2;
            }

            public void e(ob.z.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f37550c = cVar;
                this.f37551d = i10;
                this.f37552e = i11;
                this.f37553f = i12;
                this.f37554g = i13;
                this.f37555h = z10;
                this.f37556i = z11;
                this.f37557j = z12;
                this.f37558k = z13;
                this.f37559l = i14;
                this.f37560m = i15;
                this.f37561n = i16;
                this.f37562o = i17;
                this.f37563p = i18;
                this.f37548a = true;
                this.f37549b = true;
            }

            public void f(int i10) {
                this.f37552e = i10;
                this.f37549b = true;
            }
        }

        public b(u9.b0 b0Var, boolean z10, boolean z11) {
            this.f37530a = b0Var;
            this.f37531b = z10;
            this.f37532c = z11;
            this.f37542m = new a();
            this.f37543n = new a();
            byte[] bArr = new byte[128];
            this.f37536g = bArr;
            this.f37535f = new ob.e0(bArr, 0, 0);
            g();
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
        private void d(int i10) {
            long j10 = this.f37546q;
            if (j10 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f37547r;
            this.f37530a.f(j10, z10 ? 1 : 0, (int) (this.f37539j - this.f37545p), i10, null);
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
            if (this.f37540k) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.f37536g;
                int length = bArr2.length;
                int i16 = this.f37537h;
                if (length < i16 + i15) {
                    this.f37536g = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i10, this.f37536g, this.f37537h, i15);
                int i17 = this.f37537h + i15;
                this.f37537h = i17;
                this.f37535f.i(this.f37536g, 0, i17);
                if (this.f37535f.b(8)) {
                    this.f37535f.k();
                    int iE2 = this.f37535f.e(2);
                    this.f37535f.l(5);
                    if (this.f37535f.c()) {
                        this.f37535f.h();
                        if (this.f37535f.c()) {
                            int iH2 = this.f37535f.h();
                            if (!this.f37532c) {
                                this.f37540k = false;
                                this.f37543n.f(iH2);
                                return;
                            }
                            if (this.f37535f.c()) {
                                int iH3 = this.f37535f.h();
                                if (this.f37534e.indexOfKey(iH3) < 0) {
                                    this.f37540k = false;
                                    return;
                                }
                                ob.z.b bVar = (ob.z.b) this.f37534e.get(iH3);
                                ob.z.c cVar = (ob.z.c) this.f37533d.get(bVar.f48488b);
                                if (cVar.f48498i) {
                                    if (!this.f37535f.b(2)) {
                                        return;
                                    } else {
                                        this.f37535f.l(2);
                                    }
                                }
                                if (this.f37535f.b(cVar.f48500k)) {
                                    int iE3 = this.f37535f.e(cVar.f48500k);
                                    if (!cVar.f48499j) {
                                        if (this.f37535f.b(1)) {
                                            boolean zD2 = this.f37535f.d();
                                            if (!zD2) {
                                                z10 = zD2;
                                                z11 = false;
                                            } else {
                                                if (!this.f37535f.b(1)) {
                                                    return;
                                                }
                                                z10 = zD2;
                                                z11 = true;
                                                zD = this.f37535f.d();
                                            }
                                            if (this.f37538i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iH = 0;
                                            } else if (!this.f37535f.c()) {
                                                return;
                                            } else {
                                                iH = this.f37535f.h();
                                            }
                                            i12 = cVar.f48501l;
                                            if (i12 != 0) {
                                                if (this.f37535f.b(cVar.f48502m)) {
                                                    iE = this.f37535f.e(cVar.f48502m);
                                                    if (bVar.f48489c || z10) {
                                                        i13 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f37535f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f37535f.g();
                                                        i13 = iE;
                                                        i14 = 0;
                                                    }
                                                    iG2 = i14;
                                                    this.f37543n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                                    this.f37540k = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || cVar.f48503n) {
                                                i13 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f37535f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f37535f.g();
                                                if (!bVar.f48489c || z10) {
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f37535f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f37535f.g();
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.f37543n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f37540k = false;
                                            i14 = iG;
                                            iG2 = i14;
                                            this.f37543n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f37540k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zD = z11;
                                    if (this.f37538i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iH = 0;
                                    } else if (!this.f37535f.c()) {
                                        return;
                                    } else {
                                        iH = this.f37535f.h();
                                    }
                                    i12 = cVar.f48501l;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f37535f.b(cVar.f48502m)) {
                                            return;
                                        }
                                        iE = this.f37535f.e(cVar.f48502m);
                                        if (bVar.f48489c) {
                                        }
                                        i13 = iE;
                                        iG = 0;
                                    }
                                    i14 = iG;
                                    iG2 = i14;
                                    this.f37543n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                    this.f37540k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f37538i == 9 || (this.f37532c && this.f37543n.c(this.f37542m))) {
                if (z10 && this.f37544o) {
                    d(i10 + ((int) (j10 - this.f37539j)));
                }
                this.f37545p = this.f37539j;
                this.f37546q = this.f37541l;
                this.f37547r = false;
                this.f37544o = true;
            }
            if (this.f37531b) {
                z11 = this.f37543n.d();
            }
            boolean z13 = this.f37547r;
            int i11 = this.f37538i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f37547r = z14;
            return z14;
        }

        public boolean c() {
            return this.f37532c;
        }

        public void e(ob.z.b bVar) {
            this.f37534e.append(bVar.f48487a, bVar);
        }

        public void f(ob.z.c cVar) {
            this.f37533d.append(cVar.f48493d, cVar);
        }

        public void g() {
            this.f37540k = false;
            this.f37544o = false;
            this.f37543n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f37538i = i10;
            this.f37541l = j11;
            this.f37539j = j10;
            if (!this.f37531b || i10 != 1) {
                if (!this.f37532c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f37542m;
            this.f37542m = this.f37543n;
            this.f37543n = aVar;
            aVar.b();
            this.f37537h = 0;
            this.f37540k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f37515a = d0Var;
        this.f37516b = z10;
        this.f37517c = z11;
    }

    private void a() {
        ob.a.i(this.f37524j);
        r0.j(this.f37525k);
    }

    private void e(long j10, int i10, int i11, long j11) {
        if (!this.f37526l || this.f37525k.c()) {
            this.f37518d.b(i11);
            this.f37519e.b(i11);
            if (this.f37526l) {
                if (this.f37518d.c()) {
                    u uVar = this.f37518d;
                    this.f37525k.f(ob.z.l(uVar.f37633d, 3, uVar.f37634e));
                    this.f37518d.d();
                } else if (this.f37519e.c()) {
                    u uVar2 = this.f37519e;
                    this.f37525k.e(ob.z.j(uVar2.f37633d, 3, uVar2.f37634e));
                    this.f37519e.d();
                }
            } else if (this.f37518d.c() && this.f37519e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar3 = this.f37518d;
                arrayList.add(Arrays.copyOf(uVar3.f37633d, uVar3.f37634e));
                u uVar4 = this.f37519e;
                arrayList.add(Arrays.copyOf(uVar4.f37633d, uVar4.f37634e));
                u uVar5 = this.f37518d;
                ob.z.c cVarL = ob.z.l(uVar5.f37633d, 3, uVar5.f37634e);
                u uVar6 = this.f37519e;
                ob.z.b bVarJ = ob.z.j(uVar6.f37633d, 3, uVar6.f37634e);
                this.f37524j.e(new v0.b().U(this.f37523i).g0(MimeTypes.VIDEO_H264).K(ob.e.a(cVarL.f48490a, cVarL.f48491b, cVarL.f48492c)).n0(cVarL.f48495f).S(cVarL.f48496g).c0(cVarL.f48497h).V(arrayList).G());
                this.f37526l = true;
                this.f37525k.f(cVarL);
                this.f37525k.e(bVarJ);
                this.f37518d.d();
                this.f37519e.d();
            }
        }
        if (this.f37520f.b(i11)) {
            u uVar7 = this.f37520f;
            this.f37529o.S(this.f37520f.f37633d, ob.z.q(uVar7.f37633d, uVar7.f37634e));
            this.f37529o.U(4);
            this.f37515a.a(j11, this.f37529o);
        }
        if (this.f37525k.b(j10, i10, this.f37526l, this.f37528n)) {
            this.f37528n = false;
        }
    }

    private void f(byte[] bArr, int i10, int i11) {
        if (!this.f37526l || this.f37525k.c()) {
            this.f37518d.a(bArr, i10, i11);
            this.f37519e.a(bArr, i10, i11);
        }
        this.f37520f.a(bArr, i10, i11);
        this.f37525k.a(bArr, i10, i11);
    }

    private void g(long j10, int i10, long j11) {
        if (!this.f37526l || this.f37525k.c()) {
            this.f37518d.e(i10);
            this.f37519e.e(i10);
        }
        this.f37520f.e(i10);
        this.f37525k.h(j10, i10, j11);
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        a();
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f37521g += (long) d0Var.a();
        this.f37524j.c(d0Var, d0Var.a());
        while (true) {
            int iC = ob.z.c(bArrE, iF, iG, this.f37522h);
            if (iC == iG) {
                f(bArrE, iF, iG);
                return;
            }
            int iF2 = ob.z.f(bArrE, iC);
            int i10 = iC - iF;
            if (i10 > 0) {
                f(bArrE, iF, iC);
            }
            int i11 = iG - iC;
            long j10 = this.f37521g - ((long) i11);
            e(j10, i11, i10 < 0 ? -i10 : 0, this.f37527m);
            g(j10, iF2, this.f37527m);
            iF = iC + 3;
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37527m = j10;
        }
        this.f37528n |= (i10 & 2) != 0;
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37523i = dVar.b();
        u9.b0 b0VarTrack = mVar.track(dVar.c(), 2);
        this.f37524j = b0VarTrack;
        this.f37525k = new b(b0VarTrack, this.f37516b, this.f37517c);
        this.f37515a.b(mVar, dVar);
    }

    @Override // ea.m
    public void seek() {
        this.f37521g = 0L;
        this.f37528n = false;
        this.f37527m = C.TIME_UNSET;
        ob.z.a(this.f37522h);
        this.f37518d.d();
        this.f37519e.d();
        this.f37520f.d();
        b bVar = this.f37525k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
