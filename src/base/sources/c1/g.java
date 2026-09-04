package c1;

import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.x;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g extends v implements o0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile v0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x.b strings_ = v.p();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends v.a implements o0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a o(Iterable iterable) {
            j();
            ((g) this.f3741b).M(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        v.H(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(Iterable iterable) {
        N();
        androidx.datastore.preferences.protobuf.a.a(iterable, this.strings_);
    }

    private void N() {
        x.b bVar = this.strings_;
        if (bVar.isModifiable()) {
            return;
        }
        this.strings_ = v.B(bVar);
    }

    public static g O() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public List P() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    protected final Object o(v.d dVar, Object obj, Object obj2) {
        v0 bVar;
        e eVar = null;
        switch (e.f9258a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return v.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (g.class) {
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
