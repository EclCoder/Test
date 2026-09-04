package rm;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import fl.w;
import gl.g0;
import gl.l0;
import gl.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tm.a2;
import tm.h2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements f, tm.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f51402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f51404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f51405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f51406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f[] f51407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List[] f51408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f51409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f51410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f[] f51411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final fl.k f51412l;

    public i(String serialName, m kind, int i10, List typeParameters, a builder) {
        s.h(serialName, "serialName");
        s.h(kind, "kind");
        s.h(typeParameters, "typeParameters");
        s.h(builder, "builder");
        this.f51401a = serialName;
        this.f51402b = kind;
        this.f51403c = i10;
        this.f51404d = builder.c();
        this.f51405e = r.G0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f51406f = strArr;
        this.f51407g = a2.b(builder.e());
        this.f51408h = (List[]) builder.d().toArray(new List[0]);
        this.f51409i = r.C0(builder.g());
        Iterable<g0> iterableF0 = gl.j.F0(strArr);
        ArrayList arrayList = new ArrayList(r.v(iterableF0, 10));
        for (g0 g0Var : iterableF0) {
            arrayList.add(w.a(g0Var.b(), Integer.valueOf(g0Var.a())));
        }
        this.f51410j = l0.r(arrayList);
        this.f51411k = a2.b(typeParameters);
        this.f51412l = fl.l.b(new tl.a() { // from class: rm.g
            @Override // tl.a
            public final Object invoke() {
                return Integer.valueOf(i.m(this.f51399a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(i iVar) {
        return h2.a(iVar, iVar.f51411k);
    }

    private final int n() {
        return ((Number) this.f51412l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(i iVar, int i10) {
        return iVar.f(i10) + ": " + iVar.h(i10).i();
    }

    @Override // tm.n
    public Set a() {
        return this.f51405e;
    }

    @Override // rm.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // rm.f
    public int c(String name) {
        s.h(name, "name");
        Integer num = (Integer) this.f51410j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // rm.f
    public m d() {
        return this.f51402b;
    }

    @Override // rm.f
    public int e() {
        return this.f51403c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        f fVar = (f) obj;
        if (!s.c(i(), fVar.i()) || !Arrays.equals(this.f51411k, ((i) obj).f51411k) || e() != fVar.e()) {
            return false;
        }
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!s.c(h(i10).i(), fVar.h(i10).i()) || !s.c(h(i10).d(), fVar.h(i10).d())) {
                return false;
            }
        }
        return true;
    }

    @Override // rm.f
    public String f(int i10) {
        return this.f51406f[i10];
    }

    @Override // rm.f
    public List g(int i10) {
        return this.f51408h[i10];
    }

    @Override // rm.f
    public List getAnnotations() {
        return this.f51404d;
    }

    @Override // rm.f
    public f h(int i10) {
        return this.f51407g[i10];
    }

    public int hashCode() {
        return n();
    }

    @Override // rm.f
    public String i() {
        return this.f51401a;
    }

    @Override // rm.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // rm.f
    public boolean j(int i10) {
        return this.f51409i[i10];
    }

    public String toString() {
        return r.l0(yl.g.m(0, e()), obFGmWgqyy.EYE, i() + '(', ")", 0, null, new Function1() { // from class: rm.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.o(this.f51400a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
