package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f37564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u9.b0 f37566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f37567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37568e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37575l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f37569f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f37570g = new u(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f37571h = new u(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f37572i = new u(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f37573j = new u(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f37574k = new u(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37576m = C.TIME_UNSET;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ob.d0 f37577n = new ob.d0();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u9.b0 f37578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f37579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f37582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f37583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f37584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f37585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f37586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f37587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f37588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f37589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f37590m;

        public a(u9.b0 b0Var) {
            this.f37578a = b0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
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
            long j10 = this.f37589l;
            if (j10 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f37590m;
            this.f37578a.f(j10, z10 ? 1 : 0, (int) (this.f37579b - this.f37588k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f37587j && this.f37584g) {
                this.f37590m = this.f37580c;
                this.f37587j = false;
            } else if (this.f37585h || this.f37584g) {
                if (z10 && this.f37586i) {
                    d(i10 + ((int) (j10 - this.f37579b)));
                }
                this.f37588k = this.f37579b;
                this.f37589l = this.f37582e;
                this.f37590m = this.f37580c;
                this.f37586i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f37583f) {
                int i12 = this.f37581d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f37581d = i12 + (i11 - i10);
                } else {
                    this.f37584g = (bArr[i13] & 128) != 0;
                    this.f37583f = false;
                }
            }
        }

        public void f() {
            this.f37583f = false;
            this.f37584g = false;
            this.f37585h = false;
            this.f37586i = false;
            this.f37587j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f37584g = false;
            this.f37585h = false;
            this.f37582e = j11;
            this.f37581d = 0;
            this.f37579b = j10;
            if (!c(i11)) {
                if (this.f37586i && !this.f37587j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f37586i = false;
                }
                if (b(i11)) {
                    this.f37585h = !this.f37587j;
                    this.f37587j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f37580c = z11;
            this.f37583f = z11 || i11 <= 9;
        }
    }

    public q(d0 d0Var) {
        this.f37564a = d0Var;
    }

    private void a() {
        ob.a.i(this.f37566c);
        r0.j(this.f37567d);
    }

    private void e(long j10, int i10, int i11, long j11) {
        this.f37567d.a(j10, i10, this.f37568e);
        if (!this.f37568e) {
            this.f37570g.b(i11);
            this.f37571h.b(i11);
            this.f37572i.b(i11);
            if (this.f37570g.c() && this.f37571h.c() && this.f37572i.c()) {
                this.f37566c.e(g(this.f37565b, this.f37570g, this.f37571h, this.f37572i));
                this.f37568e = true;
            }
        }
        if (this.f37573j.b(i11)) {
            u uVar = this.f37573j;
            this.f37577n.S(this.f37573j.f37633d, ob.z.q(uVar.f37633d, uVar.f37634e));
            this.f37577n.V(5);
            this.f37564a.a(j11, this.f37577n);
        }
        if (this.f37574k.b(i11)) {
            u uVar2 = this.f37574k;
            this.f37577n.S(this.f37574k.f37633d, ob.z.q(uVar2.f37633d, uVar2.f37634e));
            this.f37577n.V(5);
            this.f37564a.a(j11, this.f37577n);
        }
    }

    private void f(byte[] bArr, int i10, int i11) {
        this.f37567d.e(bArr, i10, i11);
        if (!this.f37568e) {
            this.f37570g.a(bArr, i10, i11);
            this.f37571h.a(bArr, i10, i11);
            this.f37572i.a(bArr, i10, i11);
        }
        this.f37573j.a(bArr, i10, i11);
        this.f37574k.a(bArr, i10, i11);
    }

    private static v0 g(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f37634e;
        byte[] bArr = new byte[uVar2.f37634e + i10 + uVar3.f37634e];
        System.arraycopy(uVar.f37633d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f37633d, 0, bArr, uVar.f37634e, uVar2.f37634e);
        System.arraycopy(uVar3.f37633d, 0, bArr, uVar.f37634e + uVar2.f37634e, uVar3.f37634e);
        ob.z.a aVarH = ob.z.h(uVar2.f37633d, 3, uVar2.f37634e);
        return new v0.b().U(str).g0(MimeTypes.VIDEO_H265).K(ob.e.c(aVarH.f48471a, aVarH.f48472b, aVarH.f48473c, aVarH.f48474d, aVarH.f48478h, aVarH.f48479i)).n0(aVarH.f48481k).S(aVarH.f48482l).c0(aVarH.f48483m).V(Collections.singletonList(bArr)).G();
    }

    private void h(long j10, int i10, int i11, long j11) {
        this.f37567d.g(j10, i10, i11, j11, this.f37568e);
        if (!this.f37568e) {
            this.f37570g.e(i11);
            this.f37571h.e(i11);
            this.f37572i.e(i11);
        }
        this.f37573j.e(i11);
        this.f37574k.e(i11);
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        a();
        while (d0Var.a() > 0) {
            int iF = d0Var.f();
            int iG = d0Var.g();
            byte[] bArrE = d0Var.e();
            this.f37575l += (long) d0Var.a();
            this.f37566c.c(d0Var, d0Var.a());
            while (iF < iG) {
                int iC = ob.z.c(bArrE, iF, iG, this.f37569f);
                if (iC == iG) {
                    f(bArrE, iF, iG);
                    return;
                }
                int iE = ob.z.e(bArrE, iC);
                int i10 = iC - iF;
                if (i10 > 0) {
                    f(bArrE, iF, iC);
                }
                int i11 = iG - iC;
                long j10 = this.f37575l - ((long) i11);
                e(j10, i11, i10 < 0 ? -i10 : 0, this.f37576m);
                h(j10, i11, iE, this.f37576m);
                iF = iC + 3;
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37576m = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37565b = dVar.b();
        u9.b0 b0VarTrack = mVar.track(dVar.c(), 2);
        this.f37566c = b0VarTrack;
        this.f37567d = new a(b0VarTrack);
        this.f37564a.b(mVar, dVar);
    }

    @Override // ea.m
    public void seek() {
        this.f37575l = 0L;
        this.f37576m = C.TIME_UNSET;
        ob.z.a(this.f37569f);
        this.f37570g.d();
        this.f37571h.d();
        this.f37572i.d();
        this.f37573j.d();
        this.f37574k.d();
        a aVar = this.f37567d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
