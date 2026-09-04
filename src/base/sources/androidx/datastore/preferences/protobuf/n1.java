package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f3625a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f3626b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f3627c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f3628d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f3629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f3630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f3631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f3632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f3633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f3634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f3635i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f3636j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f3637k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f3638l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f3639m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f3640n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f3641o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f3642p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f3643q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f3644r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f3645s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f3646t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f3647u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f3648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3649b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum C0034b extends b {
            C0034b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        final enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f3629c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f3630d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f3631e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f3632f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f3633g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f3634h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f3635i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f3636j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f3637k = aVar;
            c cVar3 = c.MESSAGE;
            C0034b c0034b = new C0034b("GROUP", 9, cVar3, 3);
            f3638l = c0034b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f3639m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f3640n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f3641o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f3642p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f3643q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f3644r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f3645s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f3646t = bVar14;
            f3647u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0034b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f3647u.clone();
        }

        public c d() {
            return this.f3648a;
        }

        public int g() {
            return this.f3649b;
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f3648a = cVar;
            this.f3649b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(g.f3535b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f3660a;

        c(Object obj) {
            this.f3660a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
