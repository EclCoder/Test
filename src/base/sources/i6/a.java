package i6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.j0;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.Map;
import r5.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41088a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f41092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f41094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41095h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41100m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f41102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41103p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Resources.Theme f41108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f41110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f41111x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f41113z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f41089b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t5.a f41090c = t5.a.f53134e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.h f41091d = com.bumptech.glide.h.NORMAL;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41096i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41097j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41098k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r5.e f41099l = l6.c.c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41101n = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r5.g f41104q = new r5.g();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f41105r = new m6.b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Class f41106s = Object.class;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f41112y = true;

    private boolean K(int i10) {
        return L(this.f41088a, i10);
    }

    private static boolean L(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a U(l lVar, k kVar) {
        return b0(lVar, kVar, false);
    }

    private a a0(l lVar, k kVar) {
        return b0(lVar, kVar, true);
    }

    private a b0(l lVar, k kVar, boolean z10) {
        a aVarJ0 = z10 ? j0(lVar, kVar) : V(lVar, kVar);
        aVarJ0.f41112y = true;
        return aVarJ0;
    }

    public final float A() {
        return this.f41089b;
    }

    public final Resources.Theme B() {
        return this.f41108u;
    }

    public final Map C() {
        return this.f41105r;
    }

    public final boolean D() {
        return this.f41113z;
    }

    public final boolean E() {
        return this.f41110w;
    }

    protected final boolean F() {
        return this.f41109v;
    }

    public final boolean G(a aVar) {
        return Float.compare(aVar.f41089b, this.f41089b) == 0 && this.f41093f == aVar.f41093f && m6.l.d(this.f41092e, aVar.f41092e) && this.f41095h == aVar.f41095h && m6.l.d(this.f41094g, aVar.f41094g) && this.f41103p == aVar.f41103p && m6.l.d(this.f41102o, aVar.f41102o) && this.f41096i == aVar.f41096i && this.f41097j == aVar.f41097j && this.f41098k == aVar.f41098k && this.f41100m == aVar.f41100m && this.f41101n == aVar.f41101n && this.f41110w == aVar.f41110w && this.f41111x == aVar.f41111x && this.f41090c.equals(aVar.f41090c) && this.f41091d == aVar.f41091d && this.f41104q.equals(aVar.f41104q) && this.f41105r.equals(aVar.f41105r) && this.f41106s.equals(aVar.f41106s) && m6.l.d(this.f41099l, aVar.f41099l) && m6.l.d(this.f41108u, aVar.f41108u);
    }

    public final boolean H() {
        return this.f41096i;
    }

    public final boolean I() {
        return K(8);
    }

    boolean J() {
        return this.f41112y;
    }

    public final boolean M() {
        return this.f41101n;
    }

    public final boolean N() {
        return this.f41100m;
    }

    public final boolean O() {
        return K(2048);
    }

    public final boolean P() {
        return m6.l.t(this.f41098k, this.f41097j);
    }

    public a Q() {
        this.f41107t = true;
        return c0();
    }

    public a R() {
        return V(l.f11552e, new j());
    }

    public a S() {
        return U(l.f11551d, new com.bumptech.glide.load.resource.bitmap.k());
    }

    public a T() {
        return U(l.f11550c, new v());
    }

    final a V(l lVar, k kVar) {
        if (this.f41109v) {
            return clone().V(lVar, kVar);
        }
        i(lVar);
        return m0(kVar, false);
    }

    public a W(int i10, int i11) {
        if (this.f41109v) {
            return clone().W(i10, i11);
        }
        this.f41098k = i10;
        this.f41097j = i11;
        this.f41088a |= 512;
        return d0();
    }

    public a X(int i10) {
        if (this.f41109v) {
            return clone().X(i10);
        }
        this.f41095h = i10;
        int i11 = this.f41088a | 128;
        this.f41094g = null;
        this.f41088a = i11 & (-65);
        return d0();
    }

    public a Y(com.bumptech.glide.h hVar) {
        if (this.f41109v) {
            return clone().Y(hVar);
        }
        this.f41091d = (com.bumptech.glide.h) m6.k.e(hVar);
        this.f41088a |= 8;
        return d0();
    }

    a Z(r5.f fVar) {
        if (this.f41109v) {
            return clone().Z(fVar);
        }
        this.f41104q.e(fVar);
        return d0();
    }

    public a b(a aVar) {
        if (this.f41109v) {
            return clone().b(aVar);
        }
        if (L(aVar.f41088a, 2)) {
            this.f41089b = aVar.f41089b;
        }
        if (L(aVar.f41088a, MediaHttpUploader.MINIMUM_CHUNK_SIZE)) {
            this.f41110w = aVar.f41110w;
        }
        if (L(aVar.f41088a, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.f41113z = aVar.f41113z;
        }
        if (L(aVar.f41088a, 4)) {
            this.f41090c = aVar.f41090c;
        }
        if (L(aVar.f41088a, 8)) {
            this.f41091d = aVar.f41091d;
        }
        if (L(aVar.f41088a, 16)) {
            this.f41092e = aVar.f41092e;
            this.f41093f = 0;
            this.f41088a &= -33;
        }
        if (L(aVar.f41088a, 32)) {
            this.f41093f = aVar.f41093f;
            this.f41092e = null;
            this.f41088a &= -17;
        }
        if (L(aVar.f41088a, 64)) {
            this.f41094g = aVar.f41094g;
            this.f41095h = 0;
            this.f41088a &= -129;
        }
        if (L(aVar.f41088a, 128)) {
            this.f41095h = aVar.f41095h;
            this.f41094g = null;
            this.f41088a &= -65;
        }
        if (L(aVar.f41088a, 256)) {
            this.f41096i = aVar.f41096i;
        }
        if (L(aVar.f41088a, 512)) {
            this.f41098k = aVar.f41098k;
            this.f41097j = aVar.f41097j;
        }
        if (L(aVar.f41088a, UserVerificationMethods.USER_VERIFY_ALL)) {
            this.f41099l = aVar.f41099l;
        }
        if (L(aVar.f41088a, 4096)) {
            this.f41106s = aVar.f41106s;
        }
        if (L(aVar.f41088a, 8192)) {
            this.f41102o = aVar.f41102o;
            this.f41103p = 0;
            this.f41088a &= -16385;
        }
        if (L(aVar.f41088a, 16384)) {
            this.f41103p = aVar.f41103p;
            this.f41102o = null;
            this.f41088a &= -8193;
        }
        if (L(aVar.f41088a, 32768)) {
            this.f41108u = aVar.f41108u;
        }
        if (L(aVar.f41088a, C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
            this.f41101n = aVar.f41101n;
        }
        if (L(aVar.f41088a, 131072)) {
            this.f41100m = aVar.f41100m;
        }
        if (L(aVar.f41088a, 2048)) {
            this.f41105r.putAll(aVar.f41105r);
            this.f41112y = aVar.f41112y;
        }
        if (L(aVar.f41088a, 524288)) {
            this.f41111x = aVar.f41111x;
        }
        if (!this.f41101n) {
            this.f41105r.clear();
            int i10 = this.f41088a;
            this.f41100m = false;
            this.f41088a = i10 & (-133121);
            this.f41112y = true;
        }
        this.f41088a |= aVar.f41088a;
        this.f41104q.d(aVar.f41104q);
        return d0();
    }

    public a c() {
        if (this.f41107t && !this.f41109v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f41109v = true;
        return Q();
    }

    protected final a d0() {
        if (this.f41107t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return c0();
    }

    public a e() {
        return j0(l.f11552e, new j());
    }

    public a e0(r5.f fVar, Object obj) {
        if (this.f41109v) {
            return clone().e0(fVar, obj);
        }
        m6.k.e(fVar);
        m6.k.e(obj);
        this.f41104q.f(fVar, obj);
        return d0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return G((a) obj);
        }
        return false;
    }

    @Override // 
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            r5.g gVar = new r5.g();
            aVar.f41104q = gVar;
            gVar.d(this.f41104q);
            m6.b bVar = new m6.b();
            aVar.f41105r = bVar;
            bVar.putAll(this.f41105r);
            aVar.f41107t = false;
            aVar.f41109v = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a f0(r5.e eVar) {
        if (this.f41109v) {
            return clone().f0(eVar);
        }
        this.f41099l = (r5.e) m6.k.e(eVar);
        this.f41088a |= UserVerificationMethods.USER_VERIFY_ALL;
        return d0();
    }

    public a g(Class cls) {
        if (this.f41109v) {
            return clone().g(cls);
        }
        this.f41106s = (Class) m6.k.e(cls);
        this.f41088a |= 4096;
        return d0();
    }

    public a g0(float f10) {
        if (this.f41109v) {
            return clone().g0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f41089b = f10;
        this.f41088a |= 2;
        return d0();
    }

    public a h(t5.a aVar) {
        if (this.f41109v) {
            return clone().h(aVar);
        }
        this.f41090c = (t5.a) m6.k.e(aVar);
        this.f41088a |= 4;
        return d0();
    }

    public a h0(boolean z10) {
        if (this.f41109v) {
            return clone().h0(true);
        }
        this.f41096i = !z10;
        this.f41088a |= 256;
        return d0();
    }

    public int hashCode() {
        return m6.l.o(this.f41108u, m6.l.o(this.f41099l, m6.l.o(this.f41106s, m6.l.o(this.f41105r, m6.l.o(this.f41104q, m6.l.o(this.f41091d, m6.l.o(this.f41090c, m6.l.p(this.f41111x, m6.l.p(this.f41110w, m6.l.p(this.f41101n, m6.l.p(this.f41100m, m6.l.n(this.f41098k, m6.l.n(this.f41097j, m6.l.p(this.f41096i, m6.l.o(this.f41102o, m6.l.n(this.f41103p, m6.l.o(this.f41094g, m6.l.n(this.f41095h, m6.l.o(this.f41092e, m6.l.n(this.f41093f, m6.l.l(this.f41089b)))))))))))))))))))));
    }

    public a i(l lVar) {
        return e0(l.f11555h, (l) m6.k.e(lVar));
    }

    public a i0(Resources.Theme theme) {
        if (this.f41109v) {
            return clone().i0(theme);
        }
        this.f41108u = theme;
        if (theme != null) {
            this.f41088a |= 32768;
            return e0(b6.g.f8492b, theme);
        }
        this.f41088a &= -32769;
        return Z(b6.g.f8492b);
    }

    public a j(int i10) {
        if (this.f41109v) {
            return clone().j(i10);
        }
        this.f41093f = i10;
        int i11 = this.f41088a | 32;
        this.f41092e = null;
        this.f41088a = i11 & (-17);
        return d0();
    }

    final a j0(l lVar, k kVar) {
        if (this.f41109v) {
            return clone().j0(lVar, kVar);
        }
        i(lVar);
        return l0(kVar);
    }

    public a k() {
        return a0(l.f11550c, new v());
    }

    a k0(Class cls, k kVar, boolean z10) {
        if (this.f41109v) {
            return clone().k0(cls, kVar, z10);
        }
        m6.k.e(cls);
        m6.k.e(kVar);
        this.f41105r.put(cls, kVar);
        int i10 = this.f41088a;
        this.f41101n = true;
        this.f41088a = 67584 | i10;
        this.f41112y = false;
        if (z10) {
            this.f41088a = i10 | 198656;
            this.f41100m = true;
        }
        return d0();
    }

    public a l(long j10) {
        return e0(j0.f11536d, Long.valueOf(j10));
    }

    public a l0(k kVar) {
        return m0(kVar, true);
    }

    public final t5.a m() {
        return this.f41090c;
    }

    a m0(k kVar, boolean z10) {
        if (this.f41109v) {
            return clone().m0(kVar, z10);
        }
        t tVar = new t(kVar, z10);
        k0(Bitmap.class, kVar, z10);
        k0(Drawable.class, tVar, z10);
        k0(BitmapDrawable.class, tVar.c(), z10);
        k0(d6.c.class, new d6.f(kVar), z10);
        return d0();
    }

    public final int n() {
        return this.f41093f;
    }

    public a n0(boolean z10) {
        if (this.f41109v) {
            return clone().n0(z10);
        }
        this.f41113z = z10;
        this.f41088a |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        return d0();
    }

    public final Drawable o() {
        return this.f41092e;
    }

    public final Drawable p() {
        return this.f41102o;
    }

    public final int q() {
        return this.f41103p;
    }

    public final boolean r() {
        return this.f41111x;
    }

    public final r5.g s() {
        return this.f41104q;
    }

    public final int t() {
        return this.f41097j;
    }

    public final int u() {
        return this.f41098k;
    }

    public final Drawable v() {
        return this.f41094g;
    }

    public final int w() {
        return this.f41095h;
    }

    public final com.bumptech.glide.h x() {
        return this.f41091d;
    }

    public final Class y() {
        return this.f41106s;
    }

    public final r5.e z() {
        return this.f41099l;
    }

    private a c0() {
        return this;
    }
}
