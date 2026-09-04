package y3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g1 extends d1 implements Iterable, ul.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f57218i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b4.a0 f57219h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d1 c(d1 it) {
            kotlin.jvm.internal.s.h(it, "it");
            if (!(it instanceof g1)) {
                return null;
            }
            g1 g1Var = (g1) it;
            return g1Var.J(g1Var.P());
        }

        public final am.g b(g1 g1Var) {
            kotlin.jvm.internal.s.h(g1Var, "<this>");
            return am.j.g(g1Var, new Function1() { // from class: y3.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g1.a.c((d1) obj);
                }
            });
        }

        public final d1 d(g1 g1Var) {
            kotlin.jvm.internal.s.h(g1Var, "<this>");
            return (d1) am.j.x(b(g1Var));
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(z1 navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.s.h(navGraphNavigator, "navGraphNavigator");
        this.f57219h = new b4.a0(this);
    }

    private final void S(int i10) {
        this.f57219h.r(i10);
    }

    @Override // y3.d1
    public void B(Context context, AttributeSet attrs) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(attrs, "attrs");
        super.B(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, z3.a.f58608v);
        kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        S(typedArrayObtainAttributes.getResourceId(z3.a.f58609w, 0));
        this.f57219h.q(d1.f57171f.d(new b4.h(context), this.f57219h.j()));
        fl.g0 g0Var = fl.g0.f38750a;
        typedArrayObtainAttributes.recycle();
    }

    public final void I(d1 node) {
        kotlin.jvm.internal.s.h(node, "node");
        this.f57219h.a(node);
    }

    public final d1 J(int i10) {
        return this.f57219h.b(i10);
    }

    public final d1 K(String str) {
        return this.f57219h.c(str);
    }

    public final d1 L(String route, boolean z10) {
        kotlin.jvm.internal.s.h(route, "route");
        return this.f57219h.d(route, z10);
    }

    public final d1 M(int i10, d1 d1Var, boolean z10, d1 d1Var2) {
        return this.f57219h.e(i10, d1Var, z10, d1Var2);
    }

    public final androidx.collection.v N() {
        return this.f57219h.h();
    }

    public final String O() {
        return this.f57219h.i();
    }

    public final int P() {
        return this.f57219h.l();
    }

    public final String Q() {
        return this.f57219h.m();
    }

    public final d1.b R(b1 navDeepLinkRequest, boolean z10, boolean z11, d1 lastVisited) {
        kotlin.jvm.internal.s.h(navDeepLinkRequest, "navDeepLinkRequest");
        kotlin.jvm.internal.s.h(lastVisited, "lastVisited");
        return this.f57219h.p(super.z(navDeepLinkRequest), navDeepLinkRequest, z10, z11, lastVisited);
    }

    @Override // y3.d1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g1) && super.equals(obj)) {
            g1 g1Var = (g1) obj;
            if (N().o() == g1Var.N().o() && P() == g1Var.P()) {
                for (d1 d1Var : am.j.e(androidx.collection.x.b(N()))) {
                    if (!kotlin.jvm.internal.s.c(d1Var, g1Var.N().f(d1Var.p()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // y3.d1
    public int hashCode() {
        int iP = P();
        androidx.collection.v vVarN = N();
        int iO = vVarN.o();
        for (int i10 = 0; i10 < iO; i10++) {
            iP = (((iP * 31) + vVarN.k(i10)) * 31) + ((d1) vVarN.p(i10)).hashCode();
        }
        return iP;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f57219h.n();
    }

    @Override // y3.d1
    public String o() {
        return this.f57219h.g(super.o());
    }

    @Override // y3.d1
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        d1 d1VarK = K(Q());
        if (d1VarK == null) {
            d1VarK = J(P());
        }
        sb2.append(" startDestination=");
        if (d1VarK != null) {
            sb2.append("{");
            sb2.append(d1VarK.toString());
            sb2.append("}");
        } else if (Q() != null) {
            sb2.append(Q());
        } else if (this.f57219h.k() != null) {
            sb2.append(this.f57219h.k());
        } else {
            sb2.append("0x" + Integer.toHexString(this.f57219h.j()));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    @Override // y3.d1
    public d1.b z(b1 navDeepLinkRequest) {
        kotlin.jvm.internal.s.h(navDeepLinkRequest, "navDeepLinkRequest");
        return this.f57219h.o(super.z(navDeepLinkRequest), navDeepLinkRequest);
    }
}
