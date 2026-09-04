package c1;

import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.n1;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f extends v implements o0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile v0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private h0 preferences_ = h0.i();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends v.a implements o0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a o(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            j();
            ((f) this.f3741b).M().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g0 f9259a = g0.d(n1.b.f3637k, "", n1.b.f3639m, h.V());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        v.H(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map M() {
        return O();
    }

    private h0 O() {
        if (!this.preferences_.m()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    private h0 P() {
        return this.preferences_;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static f R(InputStream inputStream) {
        return (f) v.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map N() {
        return Collections.unmodifiableMap(P());
    }

    @Override // androidx.datastore.preferences.protobuf.v
    protected final Object o(v.d dVar, Object obj, Object obj2) {
        v0 bVar;
        e eVar = null;
        switch (e.f9258a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return v.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f9259a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new v.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
