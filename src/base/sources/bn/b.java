package bn;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f9164v = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cn.e f9165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f9167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f9168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cn.c f9169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cn.e f9172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private cn.e f9173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f9174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f9175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f9176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f9177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f9178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f9179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f9180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private cn.e f9181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f9182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f9183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f9185u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(cn.e location, int i10, float f10, float f11, cn.c shape, long j10, boolean z10, cn.e acceleration, cn.e velocity, float f12, float f13, float f14, float f15) {
        s.h(location, "location");
        s.h(shape, "shape");
        s.h(acceleration, "acceleration");
        s.h(velocity, "velocity");
        this.f9165a = location;
        this.f9166b = i10;
        this.f9167c = f10;
        this.f9168d = f11;
        this.f9169e = shape;
        this.f9170f = j10;
        this.f9171g = z10;
        this.f9172h = acceleration;
        this.f9173i = velocity;
        this.f9174j = f12;
        this.f9175k = f13;
        this.f9176l = f14;
        this.f9177m = f15;
        this.f9179o = f10;
        this.f9180p = 60.0f;
        this.f9181q = new cn.e(0.0f, 0.02f);
        this.f9182r = 255;
        this.f9185u = true;
    }

    private final void l(float f10, cn.a aVar) {
        this.f9180p = f10 > 0.0f ? 1.0f / f10 : 60.0f;
        if (this.f9165a.d() > aVar.getHeight()) {
            this.f9182r = 0;
            return;
        }
        this.f9173i.a(this.f9172h);
        this.f9173i.e(this.f9174j);
        this.f9165a.b(this.f9173i, this.f9180p * f10 * this.f9177m);
        long j10 = this.f9170f - ((long) (1000 * f10));
        this.f9170f = j10;
        if (j10 <= 0) {
            m(f10);
        }
        float f11 = this.f9178n + (this.f9176l * f10 * this.f9180p);
        this.f9178n = f11;
        if (f11 >= 360.0f) {
            this.f9178n = 0.0f;
        }
        float fAbs = this.f9179o - ((Math.abs(this.f9175k) * f10) * this.f9180p);
        this.f9179o = fAbs;
        if (fAbs < 0.0f) {
            this.f9179o = this.f9167c;
        }
        this.f9183s = Math.abs((this.f9179o / this.f9167c) - 0.5f) * 2;
        this.f9184t = (this.f9182r << 24) | (this.f9166b & 16777215);
        this.f9185u = aVar.e((int) this.f9165a.c(), (int) this.f9165a.d());
    }

    private final void m(float f10) {
        int iD = 0;
        if (this.f9171g) {
            iD = g.d(this.f9182r - ((int) ((5 * f10) * this.f9180p)), 0);
        }
        this.f9182r = iD;
    }

    public final void a(cn.e force) {
        s.h(force, "force");
        this.f9172h.b(force, 1.0f / this.f9168d);
    }

    public final int b() {
        return this.f9182r;
    }

    public final int c() {
        return this.f9184t;
    }

    public final boolean d() {
        return this.f9185u;
    }

    public final cn.e e() {
        return this.f9165a;
    }

    public final float f() {
        return this.f9178n;
    }

    public final float g() {
        return this.f9183s;
    }

    public final cn.c h() {
        return this.f9169e;
    }

    public final float i() {
        return this.f9167c;
    }

    public final boolean j() {
        return this.f9182r <= 0;
    }

    public final void k(float f10, cn.a drawArea) {
        s.h(drawArea, "drawArea");
        a(this.f9181q);
        l(f10, drawArea);
    }

    public /* synthetic */ b(cn.e eVar, int i10, float f10, float f11, cn.c cVar, long j10, boolean z10, cn.e eVar2, cn.e eVar3, float f12, float f13, float f14, float f15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, i10, f10, f11, cVar, (i11 & 32) != 0 ? -1L : j10, (i11 & 64) != 0 ? true : z10, (i11 & 128) != 0 ? new cn.e(0.0f, 0.0f) : eVar2, (i11 & 256) != 0 ? new cn.e(0.0f, 0.0f, 3, null) : eVar3, f12, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 1.0f : f13, (i11 & 2048) != 0 ? 1.0f : f14, f15);
    }
}
