package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k extends i6.a implements Cloneable {
    protected static final i6.f O = (i6.f) ((i6.f) ((i6.f) new i6.f().h(t5.a.f53132c)).Y(h.LOW)).h0(true);
    private final Context A;
    private final l B;
    private final Class C;
    private final c D;
    private final e E;
    private m F;
    private Object G;
    private List H;
    private k I;
    private k J;
    private Float K;
    private boolean L = true;
    private boolean M;
    private boolean N;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11195b;

        static {
            int[] iArr = new int[h.values().length];
            f11195b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11195b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11195b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11195b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f11194a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11194a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11194a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11194a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11194a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11194a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11194a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11194a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected k(c cVar, l lVar, Class cls, Context context) {
        this.D = cVar;
        this.B = lVar;
        this.C = cls;
        this.A = context;
        this.F = lVar.q(cls);
        this.E = cVar.k();
        w0(lVar.o());
        b(lVar.p());
    }

    private boolean B0(i6.a aVar, i6.c cVar) {
        return !aVar.H() && cVar.d();
    }

    private k H0(Object obj) {
        if (F()) {
            return clone().H0(obj);
        }
        this.G = obj;
        this.M = true;
        return (k) d0();
    }

    private k I0(Uri uri, k kVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? kVar : q0(kVar);
    }

    private i6.c J0(Object obj, j6.i iVar, i6.e eVar, i6.a aVar, i6.d dVar, m mVar, h hVar, int i10, int i11, Executor executor) {
        Context context = this.A;
        e eVar2 = this.E;
        return i6.h.y(context, eVar2, obj, this.G, this.C, aVar, i10, i11, hVar, iVar, eVar, this.H, dVar, eVar2.f(), mVar.c(), executor);
    }

    private k q0(k kVar) {
        return (k) ((k) kVar.i0(this.A.getTheme())).f0(l6.a.c(this.A));
    }

    private i6.c r0(j6.i iVar, i6.e eVar, i6.a aVar, Executor executor) {
        return s0(new Object(), iVar, eVar, null, this.F, aVar.x(), aVar.u(), aVar.t(), aVar, executor);
    }

    private i6.c s0(Object obj, j6.i iVar, i6.e eVar, i6.d dVar, m mVar, h hVar, int i10, int i11, i6.a aVar, Executor executor) {
        i6.b bVar;
        i6.d dVar2;
        if (this.J != null) {
            bVar = new i6.b(obj, dVar);
            dVar2 = bVar;
        } else {
            bVar = null;
            dVar2 = dVar;
        }
        i6.c cVarT0 = t0(obj, iVar, eVar, dVar2, mVar, hVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return cVarT0;
        }
        int iU = this.J.u();
        int iT = this.J.t();
        if (m6.l.t(i10, i11) && !this.J.P()) {
            iU = aVar.u();
            iT = aVar.t();
        }
        k kVar = this.J;
        i6.b bVar2 = bVar;
        bVar2.o(cVarT0, kVar.s0(obj, iVar, eVar, bVar2, kVar.F, kVar.x(), iU, iT, this.J, executor));
        return bVar2;
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
    private i6.c t0(Object obj, j6.i iVar, i6.e eVar, i6.d dVar, m mVar, h hVar, int i10, int i11, i6.a aVar, Executor executor) {
        k kVar = this.I;
        if (kVar == null) {
            if (this.K == null) {
                return J0(obj, iVar, eVar, aVar, dVar, mVar, hVar, i10, i11, executor);
            }
            i6.i iVar2 = new i6.i(obj, dVar);
            iVar2.n(J0(obj, iVar, eVar, aVar, iVar2, mVar, hVar, i10, i11, executor), J0(obj, iVar, eVar, aVar.clone().g0(this.K.floatValue()), iVar2, mVar, v0(hVar), i10, i11, executor));
            return iVar2;
        }
        if (this.N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m mVar2 = kVar.L ? mVar : kVar.F;
        h hVarX = kVar.I() ? this.I.x() : v0(hVar);
        int iU = this.I.u();
        int iT = this.I.t();
        if (m6.l.t(i10, i11) && !this.I.P()) {
            iU = aVar.u();
            iT = aVar.t();
        }
        i6.i iVar3 = new i6.i(obj, dVar);
        i6.c cVarJ0 = J0(obj, iVar, eVar, aVar, iVar3, mVar, hVar, i10, i11, executor);
        this.N = true;
        k kVar2 = this.I;
        i6.c cVarS0 = kVar2.s0(obj, iVar, eVar, iVar3, mVar2, hVarX, iU, iT, kVar2, executor);
        this.N = false;
        iVar3.n(cVarJ0, cVarS0);
        return iVar3;
    }

    private h v0(h hVar) {
        int i10 = a.f11195b[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + x());
    }

    private void w0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0((i6.e) it.next());
        }
    }

    private j6.i y0(j6.i iVar, i6.e eVar, i6.a aVar, Executor executor) {
        m6.k.e(iVar);
        if (!this.M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        i6.c cVarR0 = r0(iVar, eVar, aVar, executor);
        i6.c cVarD = iVar.d();
        if (cVarR0.h(cVarD) && !B0(aVar, cVarD)) {
            if (!((i6.c) m6.k.e(cVarD)).isRunning()) {
                cVarD.j();
            }
            return iVar;
        }
        this.B.m(iVar);
        iVar.f(cVarR0);
        this.B.z(iVar, cVarR0);
        return iVar;
    }

    public j6.j A0(ImageView imageView) {
        i6.a aVarR;
        m6.l.a();
        m6.k.e(imageView);
        if (!O() && M() && imageView.getScaleType() != null) {
            switch (a.f11194a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarR = clone().R();
                    break;
                case 2:
                    aVarR = clone().S();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarR = clone().T();
                    break;
                case 6:
                    aVarR = clone().S();
                    break;
                default:
                    aVarR = this;
                    break;
            }
        } else {
            aVarR = this;
        }
        return (j6.j) y0(this.E.a(imageView, this.C), null, aVarR, m6.e.b());
    }

    public k C0(i6.e eVar) {
        if (F()) {
            return clone().C0(eVar);
        }
        this.H = null;
        return o0(eVar);
    }

    public k D0(Uri uri) {
        return I0(uri, H0(uri));
    }

    public k E0(Integer num) {
        return q0(H0(num));
    }

    public k F0(Object obj) {
        return H0(obj);
    }

    public k G0(String str) {
        return H0(str);
    }

    @Override // i6.a
    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (super.equals(kVar) && Objects.equals(this.C, kVar.C) && this.F.equals(kVar.F) && Objects.equals(this.G, kVar.G) && Objects.equals(this.H, kVar.H) && Objects.equals(this.I, kVar.I) && Objects.equals(this.J, kVar.J) && Objects.equals(this.K, kVar.K) && this.L == kVar.L && this.M == kVar.M) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.a
    public int hashCode() {
        return m6.l.p(this.M, m6.l.p(this.L, m6.l.o(this.K, m6.l.o(this.J, m6.l.o(this.I, m6.l.o(this.H, m6.l.o(this.G, m6.l.o(this.F, m6.l.o(this.C, super.hashCode())))))))));
    }

    public k o0(i6.e eVar) {
        if (F()) {
            return clone().o0(eVar);
        }
        if (eVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(eVar);
        }
        return (k) d0();
    }

    @Override // i6.a
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public k b(i6.a aVar) {
        m6.k.e(aVar);
        return (k) super.b(aVar);
    }

    @Override // i6.a
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public k clone() {
        k kVar = (k) super.clone();
        kVar.F = kVar.F.clone();
        if (kVar.H != null) {
            kVar.H = new ArrayList(kVar.H);
        }
        k kVar2 = kVar.I;
        if (kVar2 != null) {
            kVar.I = kVar2.clone();
        }
        k kVar3 = kVar.J;
        if (kVar3 != null) {
            kVar.J = kVar3.clone();
        }
        return kVar;
    }

    public j6.i x0(j6.i iVar) {
        return z0(iVar, null, m6.e.b());
    }

    public j6.i z0(j6.i iVar, i6.e eVar, Executor executor) {
        return y0(iVar, eVar, this, executor);
    }
}
