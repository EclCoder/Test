package sc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements x, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final x f52357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile transient boolean f52358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        transient Object f52359c;

        a(x xVar) {
            this.f52357a = (x) p.o(xVar);
        }

        @Override // sc.x
        public Object get() {
            if (!this.f52358b) {
                synchronized (this) {
                    try {
                        if (!this.f52358b) {
                            Object obj = this.f52357a.get();
                            this.f52359c = obj;
                            this.f52358b = true;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return k.a(this.f52359c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f52358b) {
                obj = "<supplier that returned " + this.f52359c + ">";
            } else {
                obj = this.f52357a;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final x f52360c = new x() { // from class: sc.z
            @Override // sc.x
            public final Object get() {
                return y.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile x f52361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f52362b;

        b(x xVar) {
            this.f52361a = (x) p.o(xVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // sc.x
        public Object get() {
            x xVar = this.f52361a;
            x xVar2 = f52360c;
            if (xVar != xVar2) {
                synchronized (this) {
                    try {
                        if (this.f52361a != xVar2) {
                            Object obj = this.f52361a.get();
                            this.f52362b = obj;
                            this.f52361a = xVar2;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return k.a(this.f52362b);
        }

        public String toString() {
            Object obj = this.f52361a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f52360c) {
                obj = "<supplier that returned " + this.f52362b + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements x, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f52363a;

        c(Object obj) {
            this.f52363a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return l.a(this.f52363a, ((c) obj).f52363a);
            }
            return false;
        }

        @Override // sc.x
        public Object get() {
            return this.f52363a;
        }

        public int hashCode() {
            return l.b(this.f52363a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f52363a + ")";
        }
    }

    public static x a(x xVar) {
        if ((xVar instanceof b) || (xVar instanceof a)) {
            return xVar;
        }
        return xVar instanceof Serializable ? new a(xVar) : new b(xVar);
    }

    public static x b(Object obj) {
        return new c(obj);
    }
}
