package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends androidx.datastore.preferences.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected j1 unknownFields = j1.c();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a extends androidx.datastore.preferences.protobuf.a.AbstractC0032a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f3740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected v f3741b;

        protected a(v vVar) {
            this.f3740a = vVar;
            if (vVar.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f3741b = n();
        }

        private static void m(Object obj, Object obj2) {
            y0.a().d(obj).mergeFrom(obj, obj2);
        }

        private v n() {
            return this.f3740a.E();
        }

        public final v f() {
            v vVarBuildPartial = buildPartial();
            if (vVarBuildPartial.w()) {
                return vVarBuildPartial;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0032a.e(vVarBuildPartial);
        }

        @Override // androidx.datastore.preferences.protobuf.n0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public v buildPartial() {
            if (!this.f3741b.y()) {
                return this.f3741b;
            }
            this.f3741b.z();
            return this.f3741b;
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            aVarNewBuilderForType.f3741b = buildPartial();
            return aVarNewBuilderForType;
        }

        protected final void j() {
            if (this.f3741b.y()) {
                return;
            }
            k();
        }

        protected void k() {
            v vVarN = n();
            m(vVarN, this.f3741b);
            this.f3741b = vVarN;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public v getDefaultInstanceForType() {
            return this.f3740a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class b extends androidx.datastore.preferences.protobuf.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f3742b;

        public b(v vVar) {
            this.f3742b = vVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends l {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static x.b B(x.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Object D(n0 n0Var, String str, Object[] objArr) {
        return new a1(n0Var, str, objArr);
    }

    protected static v F(v vVar, InputStream inputStream) {
        return g(G(vVar, h.g(inputStream), n.b()));
    }

    static v G(v vVar, h hVar, n nVar) throws InvalidProtocolBufferException {
        v vVarE = vVar.E();
        try {
            c1 c1VarD = y0.a().d(vVarE);
            c1VarD.a(vVarE, i.f(hVar), nVar);
            c1VarD.makeImmutable(vVarE);
            return vVarE;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.d()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.p(vVarE);
        } catch (UninitializedMessageException e11) {
            throw e11.d().p(vVarE);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).p(vVarE);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void H(Class cls, v vVar) {
        vVar.A();
        defaultInstanceMap.put(cls, vVar);
    }

    private static v g(v vVar) throws InvalidProtocolBufferException {
        if (vVar == null || vVar.w()) {
            return vVar;
        }
        throw vVar.d().d().p(vVar);
    }

    private int k(c1 c1Var) {
        return c1Var == null ? y0.a().d(this).getSerializedSize(this) : c1Var.getSerializedSize(this);
    }

    protected static x.b p() {
        return z0.d();
    }

    static v q(Class cls) {
        v vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (vVar != null) {
            return vVar;
        }
        v defaultInstanceForType = ((v) l1.i(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean x(v vVar, boolean z10) {
        byte bByteValue = ((Byte) vVar.m(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = y0.a().d(vVar).isInitialized(vVar);
        if (z10) {
            vVar.n(d.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? vVar : null);
        }
        return zIsInitialized;
    }

    void A() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) m(d.NEW_BUILDER);
    }

    v E() {
        return (v) m(d.NEW_MUTABLE_INSTANCE);
    }

    void I(int i10) {
        this.memoizedHashCode = i10;
    }

    void J(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public void b(CodedOutputStream codedOutputStream) {
        y0.a().d(this).b(this, j.g(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int c(c1 c1Var) {
        if (!y()) {
            if (t() != Integer.MAX_VALUE) {
                return t();
            }
            int iK = k(c1Var);
            J(iK);
            return iK;
        }
        int iK2 = k(c1Var);
        if (iK2 >= 0) {
            return iK2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iK2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return y0.a().d(this).equals(this, (v) obj);
        }
        return false;
    }

    Object f() {
        return m(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public int getSerializedSize() {
        return c(null);
    }

    void h() {
        this.memoizedHashCode = 0;
    }

    public int hashCode() {
        if (y()) {
            return j();
        }
        if (u()) {
            I(j());
        }
        return s();
    }

    void i() {
        J(Integer.MAX_VALUE);
    }

    int j() {
        return y0.a().d(this).hashCode(this);
    }

    protected final a l() {
        return (a) m(d.NEW_BUILDER);
    }

    protected Object m(d dVar) {
        return o(dVar, null, null);
    }

    protected Object n(d dVar, Object obj) {
        return o(dVar, obj, null);
    }

    protected abstract Object o(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.o0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final v getDefaultInstanceForType() {
        return (v) m(d.GET_DEFAULT_INSTANCE);
    }

    int s() {
        return this.memoizedHashCode;
    }

    int t() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public String toString() {
        return p0.f(this, super.toString());
    }

    boolean u() {
        return s() == 0;
    }

    public final boolean w() {
        return x(this, true);
    }

    boolean y() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void z() {
        y0.a().d(this).makeImmutable(this);
        A();
    }
}
