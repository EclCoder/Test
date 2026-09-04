package bm;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f9106d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f9107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f9108f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f9111c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0117a f9112j = new C0117a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f9113k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f9117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f9118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f9119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f9120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f9121h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f9122i;

        /* JADX INFO: renamed from: bm.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0117a {
            public /* synthetic */ C0117a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f9113k;
            }

            private C0117a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            kotlin.jvm.internal.s.h(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.s.h(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.s.h(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.s.h(byteSuffix, "byteSuffix");
            this.f9114a = i10;
            this.f9115b = i11;
            this.f9116c = groupSeparator;
            this.f9117d = byteSeparator;
            this.f9118e = bytePrefix;
            this.f9119f = byteSuffix;
            this.f9120g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f9121h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f9122i = h.b(groupSeparator) || h.b(byteSeparator) || h.b(bytePrefix) || h.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            kotlin.jvm.internal.s.h(sb2, "sb");
            kotlin.jvm.internal.s.h(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f9114a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f9115b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f9116c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f9117d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f9118e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f9119f);
            sb2.append("\"");
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f9107e;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f9123h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f9124i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f9127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f9128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f9129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f9130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f9131g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f9124i;
            }

            private a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            kotlin.jvm.internal.s.h(prefix, "prefix");
            kotlin.jvm.internal.s.h(suffix, "suffix");
            this.f9125a = prefix;
            this.f9126b = suffix;
            this.f9127c = z10;
            this.f9128d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f9129e = z11;
            this.f9130f = z11 && i10 == 1;
            this.f9131g = h.b(prefix) || h.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            kotlin.jvm.internal.s.h(sb2, "sb");
            kotlin.jvm.internal.s.h(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f9125a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f9126b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f9127c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f9128d);
            return sb2;
        }

        public final boolean c() {
            return this.f9131g;
        }

        public final String d() {
            return this.f9125a;
        }

        public final String e() {
            return this.f9126b;
        }

        public final boolean f() {
            return this.f9129e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0117a c0117a = a.f9112j;
        a aVarA = c0117a.a();
        c.a aVar = c.f9123h;
        f9107e = new g(false, aVarA, aVar.a());
        f9108f = new g(true, c0117a.a(), aVar.a());
    }

    public g(boolean z10, a bytes, c number) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        kotlin.jvm.internal.s.h(number, "number");
        this.f9109a = z10;
        this.f9110b = bytes;
        this.f9111c = number;
    }

    public final c b() {
        return this.f9111c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f9109a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f9110b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f9111c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
