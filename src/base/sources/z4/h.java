package z4;

import bm.r;
import fl.k;
import fl.l;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f58636f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h f58637g = new h(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h f58638h = new h(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final h f58639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f58640j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f58644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f58645e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f58638h;
        }

        public final h b(String str) {
            if (str == null || r.h0(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            s.g(description, "description");
            return new h(iIntValue, iIntValue2, iIntValue3, description, null);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements tl.a {
        b() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(h.this.d()).shiftLeft(32).or(BigInteger.valueOf(h.this.e())).shiftLeft(32).or(BigInteger.valueOf(h.this.f()));
        }
    }

    static {
        h hVar = new h(1, 0, 0, "");
        f58639i = hVar;
        f58640j = hVar;
    }

    public /* synthetic */ h(int i10, int i11, int i12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str);
    }

    private final BigInteger c() {
        Object value = this.f58645e.getValue();
        s.g(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        s.h(other, "other");
        return c().compareTo(other.c());
    }

    public final int d() {
        return this.f58641a;
    }

    public final int e() {
        return this.f58642b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58641a == hVar.f58641a && this.f58642b == hVar.f58642b && this.f58643c == hVar.f58643c;
    }

    public final int f() {
        return this.f58643c;
    }

    public int hashCode() {
        return ((((527 + this.f58641a) * 31) + this.f58642b) * 31) + this.f58643c;
    }

    public String toString() {
        return this.f58641a + '.' + this.f58642b + '.' + this.f58643c + (!r.h0(this.f58644d) ? s.p("-", this.f58644d) : "");
    }

    private h(int i10, int i11, int i12, String str) {
        this.f58641a = i10;
        this.f58642b = i11;
        this.f58643c = i12;
        this.f58644d = str;
        this.f58645e = l.b(new b());
    }
}
