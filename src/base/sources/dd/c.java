package dd;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f36627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f36628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f36631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f36632g;

    public static b c(a0 a0Var) {
        return new b(a0Var, new a0[0]);
    }

    public static b d(a0 a0Var, a0... a0VarArr) {
        return new b(a0Var, a0VarArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static c l(final Object obj, Class cls) {
        return m(cls).e(new g() { // from class: dd.a
            @Override // dd.g
            public final Object a(d dVar) {
                return c.b(obj, dVar);
            }
        }).c();
    }

    public static b m(Class cls) {
        return e(cls).f();
    }

    public static c q(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).e(new g() { // from class: dd.b
            @Override // dd.g
            public final Object a(d dVar) {
                return c.a(obj, dVar);
            }
        }).c();
    }

    public Set g() {
        return this.f36628c;
    }

    public g h() {
        return this.f36631f;
    }

    public String i() {
        return this.f36626a;
    }

    public Set j() {
        return this.f36627b;
    }

    public Set k() {
        return this.f36632g;
    }

    public boolean n() {
        return this.f36629d == 1;
    }

    public boolean o() {
        return this.f36629d == 2;
    }

    public boolean p() {
        return this.f36630e == 0;
    }

    public c r(g gVar) {
        return new c(this.f36626a, this.f36627b, this.f36628c, this.f36629d, this.f36630e, gVar, this.f36632g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f36627b.toArray()) + ">{" + this.f36629d + ", type=" + this.f36630e + ", deps=" + Arrays.toString(this.f36628c.toArray()) + "}";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f36634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f36635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f36636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g f36638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f36639g;

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            this.f36637e = 1;
            return this;
        }

        private b h(int i10) {
            z.d(this.f36636d == 0, "Instantiation type has already been set.");
            this.f36636d = i10;
            return this;
        }

        private void i(a0 a0Var) {
            z.a(!this.f36634b.contains(a0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            z.c(qVar, "Null dependency");
            i(qVar.c());
            this.f36635c.add(qVar);
            return this;
        }

        public c c() {
            z.d(this.f36638f != null, "Missing required property: factory.");
            return new c(this.f36633a, new HashSet(this.f36634b), new HashSet(this.f36635c), this.f36636d, this.f36637e, this.f36638f, this.f36639g);
        }

        public b d() {
            return h(2);
        }

        public b e(g gVar) {
            this.f36638f = (g) z.c(gVar, "Null factory");
            return this;
        }

        public b g(String str) {
            this.f36633a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f36633a = null;
            HashSet hashSet = new HashSet();
            this.f36634b = hashSet;
            this.f36635c = new HashSet();
            this.f36636d = 0;
            this.f36637e = 0;
            this.f36639g = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(a0.b(cls));
            for (Class cls2 : clsArr) {
                z.c(cls2, "Null interface");
                this.f36634b.add(a0.b(cls2));
            }
        }

        private b(a0 a0Var, a0... a0VarArr) {
            this.f36633a = null;
            HashSet hashSet = new HashSet();
            this.f36634b = hashSet;
            this.f36635c = new HashSet();
            this.f36636d = 0;
            this.f36637e = 0;
            this.f36639g = new HashSet();
            z.c(a0Var, "Null interface");
            hashSet.add(a0Var);
            for (a0 a0Var2 : a0VarArr) {
                z.c(a0Var2, "Null interface");
            }
            Collections.addAll(this.f36634b, a0VarArr);
        }
    }

    private c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f36626a = str;
        this.f36627b = Collections.unmodifiableSet(set);
        this.f36628c = Collections.unmodifiableSet(set2);
        this.f36629d = i10;
        this.f36630e = i11;
        this.f36631f = gVar;
        this.f36632g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, d dVar) {
        return obj;
    }
}
