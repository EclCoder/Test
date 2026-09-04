package tm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g2 implements rm.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f53486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f53489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List[] f53490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f53491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f53492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f53493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fl.k f53494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fl.k f53495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final fl.k f53496l;

    public g2(String serialName, l0 l0Var, int i10) {
        kotlin.jvm.internal.s.h(serialName, "serialName");
        this.f53485a = serialName;
        this.f53486b = l0Var;
        this.f53487c = i10;
        this.f53488d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f53489e = strArr;
        int i12 = this.f53487c;
        this.f53490f = new List[i12];
        this.f53492h = new boolean[i12];
        this.f53493i = gl.l0.h();
        fl.o oVar = fl.o.PUBLICATION;
        this.f53494j = fl.l.a(oVar, new tl.a() { // from class: tm.d2
            @Override // tl.a
            public final Object invoke() {
                return g2.s(this.f53462a);
            }
        });
        this.f53495k = fl.l.a(oVar, new tl.a() { // from class: tm.e2
            @Override // tl.a
            public final Object invoke() {
                return g2.x(this.f53469a);
            }
        });
        this.f53496l = fl.l.a(oVar, new tl.a() { // from class: tm.f2
            @Override // tl.a
            public final Object invoke() {
                return Integer.valueOf(g2.o(this.f53476a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(g2 g2Var) {
        return h2.a(g2Var, g2Var.u());
    }

    public static /* synthetic */ void q(g2 g2Var, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        g2Var.p(str, z10);
    }

    private final Map r() {
        HashMap map = new HashMap();
        int length = this.f53489e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f53489e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pm.d[] s(g2 g2Var) {
        pm.d[] dVarArrChildSerializers;
        l0 l0Var = g2Var.f53486b;
        return (l0Var == null || (dVarArrChildSerializers = l0Var.childSerializers()) == null) ? i2.f53515a : dVarArrChildSerializers;
    }

    private final pm.d[] t() {
        return (pm.d[]) this.f53494j.getValue();
    }

    private final int v() {
        return ((Number) this.f53496l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence w(g2 g2Var, int i10) {
        return g2Var.f(i10) + ": " + g2Var.h(i10).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f[] x(g2 g2Var) {
        ArrayList arrayList;
        pm.d[] dVarArrTypeParametersSerializers;
        l0 l0Var = g2Var.f53486b;
        if (l0Var == null || (dVarArrTypeParametersSerializers = l0Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(dVarArrTypeParametersSerializers.length);
            for (pm.d dVar : dVarArrTypeParametersSerializers) {
                arrayList.add(dVar.getDescriptor());
            }
        }
        return a2.b(arrayList);
    }

    @Override // tm.n
    public Set a() {
        return this.f53493i.keySet();
    }

    @Override // rm.f
    public boolean b() {
        return rm.f.a.c(this);
    }

    @Override // rm.f
    public int c(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        Integer num = (Integer) this.f53493i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // rm.f
    public rm.m d() {
        return rm.n.a.f51421a;
    }

    @Override // rm.f
    public final int e() {
        return this.f53487c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        rm.f fVar = (rm.f) obj;
        if (!kotlin.jvm.internal.s.c(i(), fVar.i()) || !Arrays.equals(u(), ((g2) obj).u()) || e() != fVar.e()) {
            return false;
        }
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!kotlin.jvm.internal.s.c(h(i10).i(), fVar.h(i10).i()) || !kotlin.jvm.internal.s.c(h(i10).d(), fVar.h(i10).d())) {
                return false;
            }
        }
        return true;
    }

    @Override // rm.f
    public String f(int i10) {
        return this.f53489e[i10];
    }

    @Override // rm.f
    public List g(int i10) {
        List list = this.f53490f[i10];
        return list == null ? gl.r.l() : list;
    }

    @Override // rm.f
    public List getAnnotations() {
        List list = this.f53491g;
        return list == null ? gl.r.l() : list;
    }

    @Override // rm.f
    public rm.f h(int i10) {
        return t()[i10].getDescriptor();
    }

    public int hashCode() {
        return v();
    }

    @Override // rm.f
    public String i() {
        return this.f53485a;
    }

    @Override // rm.f
    public boolean isInline() {
        return rm.f.a.b(this);
    }

    @Override // rm.f
    public boolean j(int i10) {
        return this.f53492h[i10];
    }

    public final void p(String name, boolean z10) {
        kotlin.jvm.internal.s.h(name, "name");
        String[] strArr = this.f53489e;
        int i10 = this.f53488d + 1;
        this.f53488d = i10;
        strArr[i10] = name;
        this.f53492h[i10] = z10;
        this.f53490f[i10] = null;
        if (i10 == this.f53487c - 1) {
            this.f53493i = r();
        }
    }

    public String toString() {
        return gl.r.l0(yl.g.m(0, this.f53487c), ", ", i() + '(', ")", 0, null, new Function1() { // from class: tm.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g2.w(this.f53452a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public final rm.f[] u() {
        return (rm.f[]) this.f53495k.getValue();
    }

    public /* synthetic */ g2(String str, l0 l0Var, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : l0Var, i10);
    }
}
