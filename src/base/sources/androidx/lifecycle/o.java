package androidx.lifecycle;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.r f4451a = new androidx.collection.r(0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f4452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f4453c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Map.Entry, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f4454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f4455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f4456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a f4457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4458e;

        public a(Object obj, Object obj2) {
            this.f4454a = obj;
            this.f4455b = obj2;
        }

        public final a a() {
            return this.f4456c;
        }

        public final a b() {
            return this.f4457d;
        }

        public final boolean c() {
            return this.f4458e;
        }

        public final void d() {
            this.f4458e = true;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f4454a, aVar.f4454a) && kotlin.jvm.internal.s.c(this.f4455b, aVar.f4455b);
        }

        public final void f(a aVar) {
            this.f4456c = aVar;
        }

        public final void g(a aVar) {
            this.f4457d = aVar;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f4454a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f4455b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f4454a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f4455b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "Entry(key=" + this.f4454a + ", value=" + this.f4455b + ")";
        }
    }

    public final Map.Entry a(Object key) {
        kotlin.jvm.internal.s.h(key, "key");
        a aVar = (a) this.f4451a.b(key);
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final boolean b(Object key) {
        kotlin.jvm.internal.s.h(key, "key");
        return this.f4451a.a(key);
    }

    public final Map.Entry c() {
        a aVar = this.f4452b;
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final void d(Function1 action) {
        kotlin.jvm.internal.s.h(action, "action");
        for (a aVarB = this.f4453c; aVarB != null; aVarB = aVarB.b()) {
            if (!aVarB.c()) {
                action.invoke(aVarB);
            }
        }
    }

    public final void e(Function1 action) {
        kotlin.jvm.internal.s.h(action, "action");
        for (a aVarA = this.f4452b; aVarA != null; aVarA = aVarA.a()) {
            if (!aVarA.c()) {
                action.invoke(aVarA);
            }
        }
    }

    public final Map.Entry f() {
        a aVar = this.f4453c;
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final Map.Entry g() {
        return this.f4453c;
    }

    public final Object h(Object key, Object value) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        a aVar = (a) this.f4451a.b(key);
        if (aVar != null) {
            return aVar.getValue();
        }
        a aVar2 = new a(key, value);
        this.f4451a.p(key, aVar2);
        a aVar3 = this.f4453c;
        if (aVar3 == null) {
            this.f4452b = aVar2;
            this.f4453c = aVar2;
            return null;
        }
        if (aVar3 != null) {
            aVar3.f(aVar2);
        }
        aVar2.g(this.f4453c);
        this.f4453c = aVar2;
        return null;
    }

    public final Object i(Object key) {
        kotlin.jvm.internal.s.h(key, "key");
        a aVar = (a) this.f4451a.m(key);
        if (aVar == null) {
            return null;
        }
        if (aVar.b() == null) {
            this.f4452b = aVar.a();
        } else {
            a aVarB = aVar.b();
            if (aVarB != null) {
                aVarB.f(aVar.a());
            }
        }
        if (aVar.a() == null) {
            this.f4453c = aVar.b();
        } else {
            a aVarA = aVar.a();
            if (aVarA != null) {
                aVarA.g(aVar.b());
            }
        }
        aVar.d();
        return aVar.getValue();
    }

    public final int j() {
        return this.f4451a.d();
    }
}
