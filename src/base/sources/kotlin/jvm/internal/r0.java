package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements zl.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43605e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.d f43606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f43607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zl.l f43608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43609d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43610a;

        static {
            int[] iArr = new int[zl.n.values().length];
            try {
                iArr[zl.n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zl.n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zl.n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43610a = iArr;
        }
    }

    public r0(zl.d classifier, List arguments, zl.l lVar, int i10) {
        s.h(classifier, "classifier");
        s.h(arguments, "arguments");
        this.f43606a = classifier;
        this.f43607b = arguments;
        this.f43608c = lVar;
        this.f43609d = i10;
    }

    private final String c(zl.m mVar) {
        String strValueOf;
        if (mVar.b() == null) {
            return "*";
        }
        zl.l lVarA = mVar.a();
        r0 r0Var = lVarA instanceof r0 ? (r0) lVarA : null;
        if (r0Var == null || (strValueOf = r0Var.e(true)) == null) {
            strValueOf = String.valueOf(mVar.a());
        }
        int i10 = b.f43610a[mVar.b().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(r0 r0Var, zl.m it) {
        s.h(it, "it");
        return r0Var.c(it);
    }

    private final String m(Class cls) {
        if (s.c(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (s.c(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (s.c(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (s.c(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (s.c(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (s.c(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (s.c(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return s.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return s.c(i(), r0Var.i()) && s.c(g(), r0Var.g()) && s.c(this.f43608c, r0Var.f43608c) && this.f43609d == r0Var.f43609d;
    }

    @Override // zl.l
    public List g() {
        return this.f43607b;
    }

    @Override // zl.l
    public boolean h() {
        return (this.f43609d & 1) != 0;
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + g().hashCode()) * 31) + Integer.hashCode(this.f43609d);
    }

    @Override // zl.l
    public zl.d i() {
        return this.f43606a;
    }

    public final int n() {
        return this.f43609d;
    }

    public final zl.l o() {
        return this.f43608c;
    }

    public String toString() {
        return e(false) + " (Kotlin reflection is not available)";
    }

    private final String e(boolean z10) {
        zl.c cVar;
        String name;
        String strL0;
        zl.d dVarI = i();
        Class clsA = null;
        if (dVarI instanceof zl.c) {
            cVar = (zl.c) dVarI;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            clsA = sl.a.a(cVar);
        }
        if (clsA == null) {
            name = i().toString();
        } else if ((this.f43609d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = m(clsA);
        } else if (z10 && clsA.isPrimitive()) {
            zl.d dVarI2 = i();
            s.f(dVarI2, OGoz.TaQX);
            name = sl.a.b((zl.c) dVarI2).getName();
        } else {
            name = clsA.getName();
        }
        String str = "";
        if (g().isEmpty()) {
            strL0 = "";
        } else {
            strL0 = gl.r.l0(g(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r0.f(this.f43603a, (zl.m) obj);
                }
            }, 24, null);
        }
        if (h()) {
            str = "?";
        }
        String str2 = name + strL0 + str;
        zl.l lVar = this.f43608c;
        if (lVar instanceof r0) {
            String strE = ((r0) lVar).e(true);
            if (!s.c(strE, str2)) {
                if (s.c(strE, str2 + '?')) {
                    return str2 + '!';
                }
                return '(' + str2 + ".." + strE + ')';
            }
            return str2;
        }
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(zl.d classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        s.h(classifier, "classifier");
        s.h(arguments, "arguments");
    }
}
