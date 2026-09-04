package q2;

import java.util.Arrays;
import o2.j0;
import o2.k0;
import o2.o0;
import o2.q;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o0 f50325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f50328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f50335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f50336l;

    public e(int i10, int i11, long j10, int i12, o0 o0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        w1.a.a(z10);
        this.f50328d = j10;
        this.f50329e = i12;
        this.f50325a = o0Var;
        this.f50326b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f50327c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f50335k = new long[512];
        this.f50336l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f50328d * ((long) i10)) / ((long) this.f50329e);
    }

    private k0 h(int i10) {
        return new k0(((long) this.f50336l[i10]) * g(), this.f50335k[i10]);
    }

    public void a() {
        this.f50332h++;
    }

    public void b(long j10) {
        if (this.f50334j == this.f50336l.length) {
            long[] jArr = this.f50335k;
            this.f50335k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f50336l;
            this.f50336l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f50335k;
        int i10 = this.f50334j;
        jArr2[i10] = j10;
        this.f50336l[i10] = this.f50333i;
        this.f50334j = i10 + 1;
    }

    public void c() {
        this.f50335k = Arrays.copyOf(this.f50335k, this.f50334j);
        this.f50336l = Arrays.copyOf(this.f50336l, this.f50334j);
    }

    public long f() {
        return e(this.f50332h);
    }

    public long g() {
        return e(1);
    }

    public j0.a i(long j10) {
        int iG = (int) (j10 / g());
        int iF = c0.f(this.f50336l, iG, true, true);
        if (this.f50336l[iF] == iG) {
            return new j0.a(h(iF));
        }
        k0 k0VarH = h(iF);
        int i10 = iF + 1;
        return i10 < this.f50335k.length ? new j0.a(k0VarH, h(i10)) : new j0.a(k0VarH);
    }

    public boolean j(int i10) {
        return this.f50326b == i10 || this.f50327c == i10;
    }

    public void k() {
        this.f50333i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f50336l, this.f50332h) >= 0;
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
    public boolean m(q qVar) {
        int i10 = this.f50331g;
        int iA = i10 - this.f50325a.a(qVar, i10, false);
        this.f50331g = iA;
        boolean z10 = iA == 0;
        if (z10) {
            if (this.f50330f > 0) {
                this.f50325a.e(f(), l() ? 1 : 0, this.f50330f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f50330f = i10;
        this.f50331g = i10;
    }

    public void o(long j10) {
        if (this.f50334j == 0) {
            this.f50332h = 0;
        } else {
            this.f50332h = this.f50336l[c0.g(this.f50335k, j10, true, true)];
        }
    }
}
