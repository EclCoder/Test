package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f0 implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0 f3513b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f3514a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements m0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public l0 messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3515a;

        static {
            int[] iArr = new int[x0.values().length];
            f3515a = iArr;
            try {
                iArr[x0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m0[] f3516a;

        c(m0... m0VarArr) {
            this.f3516a = m0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public boolean isSupported(Class cls) {
            for (m0 m0Var : this.f3516a) {
                if (m0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public l0 messageInfoFor(Class cls) {
            for (m0 m0Var : this.f3516a) {
                if (m0Var.isSupported(cls)) {
                    return m0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public f0() {
        this(b());
    }

    private static boolean a(l0 l0Var) {
        return b.f3515a[l0Var.getSyntax().ordinal()] != 1;
    }

    private static m0 b() {
        return new c(u.a(), c());
    }

    private static m0 c() {
        if (y0.f3776d) {
            return f3513b;
        }
        try {
            return (m0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f3513b;
        }
    }

    private static c1 d(Class cls, l0 l0Var) {
        if (e(cls)) {
            return q0.G(cls, l0Var, u0.b(), d0.b(), e1.K(), a(l0Var) ? q.b() : null, k0.b());
        }
        s0 s0VarA = u0.a();
        o oVarA = null;
        b0 b0VarA = d0.a();
        i1 i1VarJ = e1.J();
        if (a(l0Var)) {
            oVarA = q.a();
        }
        return q0.G(cls, l0Var, s0VarA, b0VarA, i1VarJ, oVarA, k0.a());
    }

    private static boolean e(Class cls) {
        return y0.f3776d || v.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public c1 createSchema(Class cls) {
        e1.G(cls);
        l0 l0VarMessageInfoFor = this.f3514a.messageInfoFor(cls);
        if (l0VarMessageInfoFor.isMessageSetWireFormat()) {
            return e(cls) ? r0.e(e1.K(), q.b(), l0VarMessageInfoFor.getDefaultInstance()) : r0.e(e1.J(), q.a(), l0VarMessageInfoFor.getDefaultInstance());
        }
        return d(cls, l0VarMessageInfoFor);
    }

    private f0(m0 m0Var) {
        this.f3514a = (m0) x.b(m0Var, "messageInfoFactory");
    }
}
