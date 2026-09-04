package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f54021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o0 f54023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f54024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54025e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54032l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f54026f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f54027g = new w(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f54028h = new w(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f54029i = new w(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f54030j = new w(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f54031k = new w(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54033m = C.TIME_UNSET;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w1.u f54034n = new w1.u();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f54035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f54037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f54038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f54039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f54040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f54041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f54042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f54043i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f54044j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f54045k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f54046l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f54047m;

        public a(o0 o0Var) {
            this.f54035a = o0Var;
        }

        private static boolean c(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean d(int i10) {
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
        private void e(int i10) {
            long j10 = this.f54046l;
            if (j10 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f54047m;
            this.f54035a.e(j10, z10 ? 1 : 0, (int) (this.f54036b - this.f54045k), i10, null);
        }

        public void a(long j10) {
            this.f54047m = this.f54037c;
            e((int) (j10 - this.f54036b));
            this.f54045k = this.f54036b;
            this.f54036b = j10;
            e(0);
            this.f54043i = false;
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f54044j && this.f54041g) {
                this.f54047m = this.f54037c;
                this.f54044j = false;
            } else if (this.f54042h || this.f54041g) {
                if (z10 && this.f54043i) {
                    e(i10 + ((int) (j10 - this.f54036b)));
                }
                this.f54045k = this.f54036b;
                this.f54046l = this.f54039e;
                this.f54047m = this.f54037c;
                this.f54043i = true;
            }
        }

        public void f(byte[] bArr, int i10, int i11) {
            if (this.f54040f) {
                int i12 = this.f54038d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f54038d = i12 + (i11 - i10);
                } else {
                    this.f54041g = (bArr[i13] & 128) != 0;
                    this.f54040f = false;
                }
            }
        }

        public void g() {
            this.f54040f = false;
            this.f54041g = false;
            this.f54042h = false;
            this.f54043i = false;
            this.f54044j = false;
        }

        public void h(long j10, int i10, int i11, long j11, boolean z10) {
            this.f54041g = false;
            this.f54042h = false;
            this.f54039e = j11;
            this.f54038d = 0;
            this.f54036b = j10;
            if (!d(i11)) {
                if (this.f54043i && !this.f54044j) {
                    if (z10) {
                        e(i10);
                    }
                    this.f54043i = false;
                }
                if (c(i11)) {
                    this.f54042h = !this.f54044j;
                    this.f54044j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f54037c = z11;
            this.f54040f = z11 || i11 <= 9;
        }
    }

    public q(f0 f0Var) {
        this.f54021a = f0Var;
    }

    private void a() {
        w1.a.i(this.f54023c);
        w1.c0.h(this.f54024d);
    }

    private void f(long j10, int i10, int i11, long j11) {
        this.f54024d.b(j10, i10, this.f54025e);
        if (!this.f54025e) {
            this.f54027g.b(i11);
            this.f54028h.b(i11);
            this.f54029i.b(i11);
            if (this.f54027g.c() && this.f54028h.c() && this.f54029i.c()) {
                this.f54023c.b(h(this.f54022b, this.f54027g, this.f54028h, this.f54029i));
                this.f54025e = true;
            }
        }
        if (this.f54030j.b(i11)) {
            w wVar = this.f54030j;
            this.f54034n.R(this.f54030j.f54120d, x1.d.r(wVar.f54120d, wVar.f54121e));
            this.f54034n.U(5);
            this.f54021a.a(j11, this.f54034n);
        }
        if (this.f54031k.b(i11)) {
            w wVar2 = this.f54031k;
            this.f54034n.R(this.f54031k.f54120d, x1.d.r(wVar2.f54120d, wVar2.f54121e));
            this.f54034n.U(5);
            this.f54021a.a(j11, this.f54034n);
        }
    }

    private void g(byte[] bArr, int i10, int i11) {
        this.f54024d.f(bArr, i10, i11);
        if (!this.f54025e) {
            this.f54027g.a(bArr, i10, i11);
            this.f54028h.a(bArr, i10, i11);
            this.f54029i.a(bArr, i10, i11);
        }
        this.f54030j.a(bArr, i10, i11);
        this.f54031k.a(bArr, i10, i11);
    }

    private static t1.o h(String str, w wVar, w wVar2, w wVar3) {
        int i10 = wVar.f54121e;
        byte[] bArr = new byte[wVar2.f54121e + i10 + wVar3.f54121e];
        System.arraycopy(wVar.f54120d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f54120d, 0, bArr, wVar.f54121e, wVar2.f54121e);
        System.arraycopy(wVar3.f54120d, 0, bArr, wVar.f54121e + wVar2.f54121e, wVar3.f54121e);
        x1.d.a aVarH = x1.d.h(wVar2.f54120d, 3, wVar2.f54121e);
        return new t1.o.b().a0(str).o0(MimeTypes.VIDEO_H265).O(w1.e.c(aVarH.f56578a, aVarH.f56579b, aVarH.f56580c, aVarH.f56581d, aVarH.f56585h, aVarH.f56586i)).t0(aVarH.f56588k).Y(aVarH.f56589l).P(new t1.f.b().d(aVarH.f56592o).c(aVarH.f56593p).e(aVarH.f56594q).g(aVarH.f56583f + 8).b(aVarH.f56584g + 8).a()).k0(aVarH.f56590m).g0(aVarH.f56591n).b0(Collections.singletonList(bArr)).K();
    }

    private void i(long j10, int i10, int i11, long j11) {
        this.f54024d.h(j10, i10, i11, j11, this.f54025e);
        if (!this.f54025e) {
            this.f54027g.e(i11);
            this.f54028h.e(i11);
            this.f54029i.e(i11);
        }
        this.f54030j.e(i11);
        this.f54031k.e(i11);
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        a();
        while (uVar.a() > 0) {
            int iF = uVar.f();
            int iG = uVar.g();
            byte[] bArrE = uVar.e();
            this.f54032l += (long) uVar.a();
            this.f54023c.c(uVar, uVar.a());
            while (iF < iG) {
                int iC = x1.d.c(bArrE, iF, iG, this.f54026f);
                if (iC == iG) {
                    g(bArrE, iF, iG);
                    return;
                }
                int iE = x1.d.e(bArrE, iC);
                int i10 = iC - iF;
                if (i10 > 0) {
                    g(bArrE, iF, iC);
                }
                int i11 = iG - iC;
                long j10 = this.f54032l - ((long) i11);
                f(j10, i11, i10 < 0 ? -i10 : 0, this.f54033m);
                i(j10, i11, iE, this.f54033m);
                iF = iC + 3;
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f54033m = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f54022b = dVar.b();
        o0 o0VarTrack = rVar.track(dVar.c(), 2);
        this.f54023c = o0VarTrack;
        this.f54024d = new a(o0VarTrack);
        this.f54021a.b(rVar, dVar);
    }

    @Override // u3.m
    public void e(boolean z10) {
        a();
        if (z10) {
            this.f54024d.a(this.f54032l);
        }
    }

    @Override // u3.m
    public void seek() {
        this.f54032l = 0L;
        this.f54033m = C.TIME_UNSET;
        x1.d.a(this.f54026f);
        this.f54027g.d();
        this.f54028h.d();
        this.f54029i.d();
        this.f54030j.d();
        this.f54031k.d();
        a aVar = this.f54024d;
        if (aVar != null) {
            aVar.g();
        }
    }
}
