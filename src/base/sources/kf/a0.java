package kf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f43198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f43199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f43200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f43201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f43202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f43203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f43204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f43205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f43206j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends a0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f43207k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f43208l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f43209m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Integer f43210n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Integer f43211o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final f f43212p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f43213q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final tl.a f43214r;

        public /* synthetic */ a(String str, int i10, int i11, Integer num, Integer num2, f fVar, boolean z10, tl.a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, i11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2, (i12 & 32) != 0 ? null : fVar, (i12 & 64) != 0 ? false : z10, aVar);
        }

        @Override // kf.a0
        public f a() {
            return this.f43212p;
        }

        @Override // kf.a0
        public Integer b() {
            return this.f43210n;
        }

        @Override // kf.a0
        public Integer d() {
            return Integer.valueOf(this.f43209m);
        }

        @Override // kf.a0
        public Integer e() {
            return this.f43211o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f43207k, aVar.f43207k) && this.f43208l == aVar.f43208l && this.f43209m == aVar.f43209m && kotlin.jvm.internal.s.c(this.f43210n, aVar.f43210n) && kotlin.jvm.internal.s.c(this.f43211o, aVar.f43211o) && kotlin.jvm.internal.s.c(this.f43212p, aVar.f43212p) && this.f43213q == aVar.f43213q && kotlin.jvm.internal.s.c(this.f43214r, aVar.f43214r);
        }

        @Override // kf.a0
        public String g() {
            return this.f43207k;
        }

        @Override // kf.a0
        public Integer h() {
            return Integer.valueOf(this.f43208l);
        }

        public int hashCode() {
            int iHashCode = ((((this.f43207k.hashCode() * 31) + Integer.hashCode(this.f43208l)) * 31) + Integer.hashCode(this.f43209m)) * 31;
            Integer num = this.f43210n;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f43211o;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            f fVar = this.f43212p;
            return ((((iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f43213q)) * 31) + this.f43214r.hashCode();
        }

        @Override // kf.a0
        public boolean j() {
            return this.f43213q;
        }

        public final tl.a k() {
            return this.f43214r;
        }

        public String toString() {
            return "Action(id=" + this.f43207k + ", titleRes=" + this.f43208l + ", iconRes=" + this.f43209m + ", bgTint=" + this.f43210n + ", iconTint=" + this.f43211o + ", badge=" + this.f43212p + ", isNew=" + this.f43213q + ", onClick=" + this.f43214r + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2, int i10, int i11, Integer num, Integer num2, f fVar, boolean z10, tl.a onClick) {
            super(id2, Integer.valueOf(i10), Integer.valueOf(i11), num, num2, fVar, z10, null, null, null, 896, null);
            kotlin.jvm.internal.s.h(id2, "id");
            kotlin.jvm.internal.s.h(onClick, "onClick");
            this.f43207k = id2;
            this.f43208l = i10;
            this.f43209m = i11;
            this.f43210n = num;
            this.f43211o = num2;
            this.f43212p = fVar;
            this.f43213q = z10;
            this.f43214r = onClick;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends a0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f43215k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Integer f43216l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Integer f43217m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Integer f43218n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Integer f43219o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final f f43220p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f43221q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final String f43222r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final String f43223s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f43224t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final tl.a f43225u;

        public /* synthetic */ b(String str, Integer num, Integer num2, Integer num3, Integer num4, f fVar, boolean z10, String str2, String str3, String str4, tl.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : num4, (i10 & 32) != 0 ? null : fVar, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? null : str2, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : str4, aVar);
        }

        @Override // kf.a0
        public f a() {
            return this.f43220p;
        }

        @Override // kf.a0
        public Integer b() {
            return this.f43218n;
        }

        @Override // kf.a0
        public String c() {
            return this.f43224t;
        }

        @Override // kf.a0
        public Integer d() {
            return this.f43217m;
        }

        @Override // kf.a0
        public Integer e() {
            return this.f43219o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.s.c(this.f43215k, bVar.f43215k) && kotlin.jvm.internal.s.c(this.f43216l, bVar.f43216l) && kotlin.jvm.internal.s.c(this.f43217m, bVar.f43217m) && kotlin.jvm.internal.s.c(this.f43218n, bVar.f43218n) && kotlin.jvm.internal.s.c(this.f43219o, bVar.f43219o) && kotlin.jvm.internal.s.c(this.f43220p, bVar.f43220p) && this.f43221q == bVar.f43221q && kotlin.jvm.internal.s.c(this.f43222r, bVar.f43222r) && kotlin.jvm.internal.s.c(this.f43223s, bVar.f43223s) && kotlin.jvm.internal.s.c(this.f43224t, bVar.f43224t) && kotlin.jvm.internal.s.c(this.f43225u, bVar.f43225u);
        }

        @Override // kf.a0
        public String f() {
            return this.f43223s;
        }

        @Override // kf.a0
        public String g() {
            return this.f43215k;
        }

        @Override // kf.a0
        public Integer h() {
            return this.f43216l;
        }

        public int hashCode() {
            int iHashCode = this.f43215k.hashCode() * 31;
            Integer num = this.f43216l;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f43217m;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f43218n;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f43219o;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            f fVar = this.f43220p;
            int iHashCode6 = (((iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.f43221q)) * 31;
            String str = this.f43222r;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f43223s;
            int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f43224t;
            return ((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f43225u.hashCode();
        }

        @Override // kf.a0
        public String i() {
            return this.f43222r;
        }

        @Override // kf.a0
        public boolean j() {
            return this.f43221q;
        }

        public final tl.a k() {
            return this.f43225u;
        }

        public String toString() {
            return "Promo(id=" + this.f43215k + ", titleRes=" + this.f43216l + ", iconRes=" + this.f43217m + ", bgTint=" + this.f43218n + ", iconTint=" + this.f43219o + ", badge=" + this.f43220p + ", isNew=" + this.f43221q + ", titleText=" + this.f43222r + ", iconUrl=" + this.f43223s + ", destination=" + this.f43224t + ", onClick=" + this.f43225u + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id2, Integer num, Integer num2, Integer num3, Integer num4, f fVar, boolean z10, String str, String str2, String str3, tl.a onClick) {
            super(id2, num, num2, num3, num4, fVar, z10, str, str2, str3, null);
            kotlin.jvm.internal.s.h(id2, "id");
            kotlin.jvm.internal.s.h(onClick, "onClick");
            this.f43215k = id2;
            this.f43216l = num;
            this.f43217m = num2;
            this.f43218n = num3;
            this.f43219o = num4;
            this.f43220p = fVar;
            this.f43221q = z10;
            this.f43222r = str;
            this.f43223s = str2;
            this.f43224t = str3;
            this.f43225u = onClick;
        }
    }

    public /* synthetic */ a0(String str, Integer num, Integer num2, Integer num3, Integer num4, f fVar, boolean z10, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, num3, num4, fVar, z10, str2, str3, str4);
    }

    public abstract f a();

    public abstract Integer b();

    public String c() {
        return this.f43206j;
    }

    public abstract Integer d();

    public abstract Integer e();

    public String f() {
        return this.f43205i;
    }

    public abstract String g();

    public abstract Integer h();

    public String i() {
        return this.f43204h;
    }

    public abstract boolean j();

    private a0(String str, Integer num, Integer num2, Integer num3, Integer num4, f fVar, boolean z10, String str2, String str3, String str4) {
        this.f43197a = str;
        this.f43198b = num;
        this.f43199c = num2;
        this.f43200d = num3;
        this.f43201e = num4;
        this.f43202f = fVar;
        this.f43203g = z10;
        this.f43204h = str2;
        this.f43205i = str3;
        this.f43206j = str4;
    }

    public /* synthetic */ a0(String str, Integer num, Integer num2, Integer num3, Integer num4, f fVar, boolean z10, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : num4, (i10 & 32) != 0 ? null : fVar, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? null : str2, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : str4, null);
    }
}
