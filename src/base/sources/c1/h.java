package c1;

import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v implements o0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile v0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends v.a implements o0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a o(boolean z10) {
            j();
            ((h) this.f3741b).e0(z10);
            return this;
        }

        public a p(androidx.datastore.preferences.protobuf.g gVar) {
            j();
            ((h) this.f3741b).f0(gVar);
            return this;
        }

        public a q(double d10) {
            j();
            ((h) this.f3741b).g0(d10);
            return this;
        }

        public a r(float f10) {
            j();
            ((h) this.f3741b).h0(f10);
            return this;
        }

        public a s(int i10) {
            j();
            ((h) this.f3741b).i0(i10);
            return this;
        }

        public a t(long j10) {
            j();
            ((h) this.f3741b).j0(j10);
            return this;
        }

        public a u(String str) {
            j();
            ((h) this.f3741b).k0(str);
            return this;
        }

        public a v(g.a aVar) {
            j();
            ((h) this.f3741b).l0((g) aVar.f());
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9270a;

        b(int i10) {
            this.f9270a = i10;
        }

        public static b e(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        v.H(h.class, hVar);
    }

    private h() {
    }

    public static h V() {
        return DEFAULT_INSTANCE;
    }

    public static a d0() {
        return (a) DEFAULT_INSTANCE.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(androidx.datastore.preferences.protobuf.g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public androidx.datastore.preferences.protobuf.g U() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.f3535b;
    }

    public double W() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float X() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int Y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long Z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String a0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g b0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.O();
    }

    public b c0() {
        return b.e(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.v
    protected final Object o(v.d dVar, Object obj, Object obj2) {
        v0 bVar;
        e eVar = null;
        switch (e.f9258a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return v.D(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (h.class) {
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
