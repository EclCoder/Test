package y3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f57171f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f57172g = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4.z f57174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g1 f57175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f57176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.collection.v f57177e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d1 b(d1 it) {
            kotlin.jvm.internal.s.h(it, "it");
            return it.w();
        }

        public final String c(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String d(b4.h context, int i10) {
            kotlin.jvm.internal.s.h(context, "context");
            return i10 <= 16777215 ? String.valueOf(i10) : context.c(i10);
        }

        public final am.g e(d1 d1Var) {
            kotlin.jvm.internal.s.h(d1Var, "<this>");
            return am.j.g(d1Var, new Function1() { // from class: y3.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d1.a.b((d1) obj);
                }
            });
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1 f57178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f57179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f57180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f57181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f57182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f57183f;

        public b(d1 destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            kotlin.jvm.internal.s.h(destination, "destination");
            this.f57178a = destination;
            this.f57179b = bundle;
            this.f57180c = z10;
            this.f57181d = i10;
            this.f57182e = z11;
            this.f57183f = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            kotlin.jvm.internal.s.h(other, "other");
            boolean z10 = this.f57180c;
            if (z10 && !other.f57180c) {
                return 1;
            }
            if (!z10 && other.f57180c) {
                return -1;
            }
            int i10 = this.f57181d - other.f57181d;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f57179b;
            if (bundle != null && other.f57179b == null) {
                return 1;
            }
            if (bundle == null && other.f57179b != null) {
                return -1;
            }
            if (bundle != null) {
                int iX = n4.c.x(n4.c.a(bundle));
                Bundle bundle2 = other.f57179b;
                kotlin.jvm.internal.s.e(bundle2);
                int iX2 = iX - n4.c.x(n4.c.a(bundle2));
                if (iX2 > 0) {
                    return 1;
                }
                if (iX2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f57182e;
            if (z11 && !other.f57182e) {
                return 1;
            }
            if (z11 || !other.f57182e) {
                return this.f57183f - other.f57183f;
            }
            return -1;
        }

        public final d1 b() {
            return this.f57178a;
        }

        public final Bundle c() {
            return this.f57179b;
        }

        public final boolean d(Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || (bundle2 = this.f57179b) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            kotlin.jvm.internal.s.g(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundleA = n4.c.a(bundle);
                kotlin.jvm.internal.s.e(str);
                if (!n4.c.b(bundleA, str)) {
                    return false;
                }
                v vVar = (v) this.f57178a.m().get(str);
                p1 p1VarA = vVar != null ? vVar.a() : null;
                Object objA = p1VarA != null ? p1VarA.a(this.f57179b, str) : null;
                Object objA2 = p1VarA != null ? p1VarA.a(bundle, str) : null;
                if (p1VarA != null && !p1VarA.j(objA, objA2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public d1(String navigatorName) {
        kotlin.jvm.internal.s.h(navigatorName, "navigatorName");
        this.f57173a = navigatorName;
        this.f57174b = new b4.z(this);
        this.f57177e = new androidx.collection.v(0, 1, null);
    }

    private final void E(String str) {
        this.f57174b.v(str);
    }

    public static /* synthetic */ int[] g(d1 d1Var, d1 d1Var2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            d1Var2 = null;
        }
        return d1Var.f(d1Var2);
    }

    private final List n() {
        return this.f57174b.l();
    }

    private final String r() {
        return this.f57174b.n();
    }

    public final b A(String route) {
        kotlin.jvm.internal.s.h(route, "route");
        return this.f57174b.t(route);
    }

    public void B(Context context, AttributeSet attrs) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, z3.a.f58610x);
        kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        G(typedArrayObtainAttributes.getString(z3.a.A));
        int i10 = z3.a.f58612z;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            D(typedArrayObtainAttributes.getResourceId(i10, 0));
            E(f57171f.d(new b4.h(context), p()));
        }
        this.f57176d = typedArrayObtainAttributes.getText(z3.a.f58611y);
        fl.g0 g0Var = fl.g0.f38750a;
        typedArrayObtainAttributes.recycle();
    }

    public final void C(int i10, u action) {
        kotlin.jvm.internal.s.h(action, "action");
        if (H()) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f57177e.l(i10, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void D(int i10) {
        this.f57174b.u(i10);
    }

    public final void F(g1 g1Var) {
        this.f57175c = g1Var;
    }

    public final void G(String str) {
        this.f57174b.w(str);
    }

    public boolean H() {
        return true;
    }

    public final void a(String argumentName, v argument) {
        kotlin.jvm.internal.s.h(argumentName, "argumentName");
        kotlin.jvm.internal.s.h(argument, "argument");
        this.f57174b.g(argumentName, argument);
    }

    public final void b(x0 navDeepLink) {
        kotlin.jvm.internal.s.h(navDeepLink, "navDeepLink");
        this.f57174b.i(navDeepLink);
    }

    public final Bundle d(Bundle bundle) {
        return this.f57174b.j(bundle);
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof d1)) {
            d1 d1Var = (d1) obj;
            boolean zC = kotlin.jvm.internal.s.c(n(), d1Var.n());
            if (this.f57177e.o() != d1Var.f57177e.o()) {
                z10 = false;
                break;
            }
            Iterator it = am.j.e(androidx.collection.x.a(this.f57177e)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!kotlin.jvm.internal.s.c(this.f57177e.f(iIntValue), d1Var.f57177e.f(iIntValue))) {
                    z10 = false;
                    break;
                }
            }
            if (m().size() != d1Var.m().size()) {
                z11 = false;
                break;
            }
            Iterator it2 = gl.l0.w(m()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!d1Var.m().containsKey(entry.getKey()) || !kotlin.jvm.internal.s.c(d1Var.m().get(entry.getKey()), entry.getValue())) {
                    z11 = false;
                    break;
                }
            }
            if (p() == d1Var.p() && kotlin.jvm.internal.s.c(x(), d1Var.x()) && zC && z10 && z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public final int[] f(d1 d1Var) {
        gl.i iVar = new gl.i();
        d1 d1Var2 = this;
        while (true) {
            kotlin.jvm.internal.s.e(d1Var2);
            g1 g1Var = d1Var2.f57175c;
            if ((d1Var != null ? d1Var.f57175c : null) != null) {
                g1 g1Var2 = d1Var.f57175c;
                kotlin.jvm.internal.s.e(g1Var2);
                if (g1Var2.J(d1Var2.p()) != d1Var2) {
                    if (g1Var != null || g1Var.P() != d1Var2.p()) {
                        iVar.addFirst(d1Var2);
                    }
                    if (!kotlin.jvm.internal.s.c(g1Var, d1Var) || g1Var == null) {
                        break;
                    }
                    d1Var2 = g1Var;
                } else {
                    iVar.addFirst(d1Var2);
                    break;
                }
            } else {
                if (g1Var != null) {
                    iVar.addFirst(d1Var2);
                } else {
                    iVar.addFirst(d1Var2);
                }
                if (!kotlin.jvm.internal.s.c(g1Var, d1Var)) {
                    break;
                }
                d1Var2 = g1Var;
            }
        }
        List listI0 = gl.r.I0(iVar);
        ArrayList arrayList = new ArrayList(gl.r.v(listI0, 10));
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((d1) it.next()).p()));
        }
        return gl.r.H0(arrayList);
    }

    public int hashCode() {
        int iP = p() * 31;
        String strX = x();
        int iHashCode = iP + (strX != null ? strX.hashCode() : 0);
        for (x0 x0Var : n()) {
            int i10 = iHashCode * 31;
            String strG = x0Var.G();
            int iHashCode2 = (i10 + (strG != null ? strG.hashCode() : 0)) * 31;
            String strP = x0Var.p();
            int iHashCode3 = (iHashCode2 + (strP != null ? strP.hashCode() : 0)) * 31;
            String strB = x0Var.B();
            iHashCode = iHashCode3 + (strB != null ? strB.hashCode() : 0);
        }
        Iterator itB = androidx.collection.x.b(this.f57177e);
        while (itB.hasNext()) {
            u uVar = (u) itB.next();
            int iB = ((iHashCode * 31) + uVar.b()) * 31;
            m1 m1VarC = uVar.c();
            iHashCode = iB + (m1VarC != null ? m1VarC.hashCode() : 0);
            Bundle bundleA = uVar.a();
            if (bundleA != null) {
                iHashCode = (iHashCode * 31) + n4.c.d(n4.c.a(bundleA));
            }
        }
        for (String str : m().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str.hashCode()) * 31;
            Object obj = m().get(str);
            iHashCode = iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final u k(int i10) {
        u uVar = this.f57177e.g() ? null : (u) this.f57177e.f(i10);
        if (uVar != null) {
            return uVar;
        }
        g1 g1Var = this.f57175c;
        if (g1Var != null) {
            return g1Var.k(i10);
        }
        return null;
    }

    public final Map m() {
        return gl.l0.t(this.f57174b.k());
    }

    public String o() {
        String strR = r();
        return strR == null ? String.valueOf(p()) : strR;
    }

    public final int p() {
        return this.f57174b.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        if (r() == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(p()));
        } else {
            sb2.append(r());
        }
        sb2.append(")");
        String strX = x();
        if (strX != null && !bm.r.h0(strX)) {
            sb2.append(" route=");
            sb2.append(x());
        }
        if (this.f57176d != null) {
            sb2.append(" label=");
            sb2.append(this.f57176d);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public final CharSequence u() {
        return this.f57176d;
    }

    public final String v() {
        return this.f57173a;
    }

    public final g1 w() {
        return this.f57175c;
    }

    public final String x() {
        return this.f57174b.o();
    }

    public final boolean y(String route, Bundle bundle) {
        kotlin.jvm.internal.s.h(route, "route");
        return this.f57174b.r(route, bundle);
    }

    public b z(b1 navDeepLinkRequest) {
        kotlin.jvm.internal.s.h(navDeepLinkRequest, "navDeepLinkRequest");
        return this.f57174b.s(navDeepLinkRequest);
    }

    public final String h(Context context, Bundle bundle) {
        Map mapH;
        String strValueOf;
        kotlin.jvm.internal.s.h(context, "context");
        CharSequence charSequence = this.f57176d;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        if (bundle == null || (mapH = n4.c.y(n4.c.a(bundle))) == null) {
            mapH = gl.l0.h();
        }
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null || !mapH.containsKey(strGroup)) {
                throw new IllegalArgumentException((IAoPeRfJn.ygbbc + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
            }
            matcher.appendReplacement(stringBuffer, "");
            v vVar = (v) m().get(strGroup);
            p1 p1VarA = vVar != null ? vVar.a() : null;
            p1 p1Var = p1.f57272e;
            if (kotlin.jvm.internal.s.c(p1VarA, p1Var)) {
                kotlin.jvm.internal.s.e(bundle);
                Object objA = p1Var.a(bundle, strGroup);
                kotlin.jvm.internal.s.f(objA, NpmRNZ.zryonmmprlJjR);
                strValueOf = context.getString(((Integer) objA).intValue());
            } else {
                kotlin.jvm.internal.s.e(p1VarA);
                kotlin.jvm.internal.s.e(bundle);
                strValueOf = String.valueOf(p1VarA.a(bundle, strGroup));
            }
            kotlin.jvm.internal.s.e(strValueOf);
            stringBuffer.append(strValueOf);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d1(z1 navigator) {
        this(a2.f57154b.a(navigator.getClass()));
        kotlin.jvm.internal.s.h(navigator, "navigator");
    }
}
