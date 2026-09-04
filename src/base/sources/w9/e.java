package w9;

import java.util.Arrays;
import ob.r0;
import u9.a0;
import u9.b0;
import u9.l;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f55999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f56002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f56003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f56006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f56007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f56009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f56010l;

    public e(int i10, int i11, long j10, int i12, b0 b0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        ob.a.a(z10);
        this.f56002d = j10;
        this.f56003e = i12;
        this.f55999a = b0Var;
        this.f56000b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f56001c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f56009k = new long[512];
        this.f56010l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f56002d * ((long) i10)) / ((long) this.f56003e);
    }

    private a0 h(int i10) {
        return new a0(((long) this.f56010l[i10]) * g(), this.f56009k[i10]);
    }

    public void a() {
        this.f56006h++;
    }

    public void b(long j10) {
        if (this.f56008j == this.f56010l.length) {
            long[] jArr = this.f56009k;
            this.f56009k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f56010l;
            this.f56010l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f56009k;
        int i10 = this.f56008j;
        jArr2[i10] = j10;
        this.f56010l[i10] = this.f56007i;
        this.f56008j = i10 + 1;
    }

    public void c() {
        this.f56009k = Arrays.copyOf(this.f56009k, this.f56008j);
        this.f56010l = Arrays.copyOf(this.f56010l, this.f56008j);
    }

    public long f() {
        return e(this.f56006h);
    }

    public long g() {
        return e(1);
    }

    public z.a i(long j10) {
        int iG = (int) (j10 / g());
        int iH = r0.h(this.f56010l, iG, true, true);
        if (this.f56010l[iH] == iG) {
            return new z.a(h(iH));
        }
        a0 a0VarH = h(iH);
        int i10 = iH + 1;
        return i10 < this.f56009k.length ? new z.a(a0VarH, h(i10)) : new z.a(a0VarH);
    }

    public boolean j(int i10) {
        return this.f56000b == i10 || this.f56001c == i10;
    }

    public void k() {
        this.f56007i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f56010l, this.f56006h) >= 0;
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
    public boolean m(l lVar) {
        int i10 = this.f56005g;
        int iA = i10 - this.f55999a.a(lVar, i10, false);
        this.f56005g = iA;
        boolean z10 = iA == 0;
        if (z10) {
            if (this.f56004f > 0) {
                this.f55999a.f(f(), l() ? 1 : 0, this.f56004f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f56004f = i10;
        this.f56005g = i10;
    }

    public void o(long j10) {
        if (this.f56008j == 0) {
            this.f56006h = 0;
        } else {
            this.f56006h = this.f56010l[r0.i(this.f56009k, j10, true, true)];
        }
    }
}
