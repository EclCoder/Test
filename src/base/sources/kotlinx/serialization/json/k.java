package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import tm.r0;
import um.d1;
import um.g1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final rm.f f43682a = r0.a("kotlinx.serialization.json.JsonUnquotedLiteral", qm.a.J(o0.f43602a));

    public static final g0 a(Boolean bool) {
        return bool == null ? a0.INSTANCE : new w(bool, false, null, 4, null);
    }

    public static final g0 b(Number number) {
        return number == null ? a0.INSTANCE : new w(number, false, null, 4, null);
    }

    public static final g0 c(String str) {
        return str == null ? a0.INSTANCE : new w(str, true, null, 4, null);
    }

    private static final Void d(i iVar, String str) {
        throw new IllegalArgumentException("Element " + l0.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(g0 g0Var) {
        kotlin.jvm.internal.s.h(g0Var, "<this>");
        return g1.d(g0Var.a());
    }

    public static final String f(g0 g0Var) {
        kotlin.jvm.internal.s.h(g0Var, "<this>");
        if (g0Var instanceof a0) {
            return null;
        }
        return g0Var.a();
    }

    public static final double g(g0 g0Var) {
        kotlin.jvm.internal.s.h(g0Var, "<this>");
        return Double.parseDouble(g0Var.a());
    }

    public static final float h(g0 g0Var) {
        kotlin.jvm.internal.s.h(g0Var, "<this>");
        return Float.parseFloat(g0Var.a());
    }

    public static final int i(g0 g0Var) {
        kotlin.jvm.internal.s.h(g0Var, "<this>");
        try {
            long jM = new d1(g0Var.a()).m();
            if (-2147483648L <= jM && jM <= 2147483647L) {
                return (int) jM;
            }
            throw new NumberFormatException(g0Var.a() + " is not an Int");
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final d0 j(i iVar) {
        kotlin.jvm.internal.s.h(iVar, "<this>");
        d0 d0Var = iVar instanceof d0 ? (d0) iVar : null;
        if (d0Var != null) {
            return d0Var;
        }
        d(iVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final g0 k(i iVar) {
        kotlin.jvm.internal.s.h(iVar, "<this>");
        g0 g0Var = iVar instanceof g0 ? (g0) iVar : null;
        if (g0Var != null) {
            return g0Var;
        }
        d(iVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final rm.f l() {
        return f43682a;
    }

    public static final long m(g0 g0Var) {
        kotlin.jvm.internal.s.h(g0Var, "<this>");
        try {
            return new d1(g0Var.a()).m();
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }
}
