package f1;

import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements f1.b.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f38196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final f1.f f38197e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f38202j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f1.b f38205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f38180n = new f("translationX");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f38181o = new g("translationY");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f38182p = new h("translationZ");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f38183q = new i("scaleX");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f38184r = new j("scaleY");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f38185s = new k("rotation");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f38186t = new l("rotationX");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f38187u = new m("rotationY");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f38188v = new n("x");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f38189w = new a("y");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q f38190x = new b("z");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q f38191y = new c("alpha");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final q f38192z = new d("scrollX");
    public static final q A = new C0569e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f38193a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f38194b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f38195c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f38198f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f38199g = Float.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f38200h = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f38201i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f38203k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f38204l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends q {
        a(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends q {
        b(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return q0.O(view);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            q0.F0(view, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends q {
        c(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends q {
        d(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: renamed from: f1.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0569e extends q {
        C0569e(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends q {
        f(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends q {
        g(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends q {
        h(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return q0.L(view);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            q0.D0(view, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends q {
        i(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j extends q {
        j(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k extends q {
        k(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l extends q {
        l(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m extends q {
        m(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n extends q {
        n(String str) {
            super(str, null);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f38206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f38207b;

        o() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface p {
        void a(e eVar, boolean z10, float f10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class q extends f1.f {
        /* synthetic */ q(String str, f fVar) {
            this(str);
        }

        private q(String str) {
            super(str);
        }
    }

    e(Object obj, f1.f fVar) {
        this.f38196d = obj;
        this.f38197e = fVar;
        if (fVar == f38185s || fVar == f38186t || fVar == f38187u) {
            this.f38202j = 0.1f;
            return;
        }
        if (fVar == f38191y) {
            this.f38202j = 0.00390625f;
        } else if (fVar == f38183q || fVar == f38184r) {
            this.f38202j = 0.002f;
        } else {
            this.f38202j = 1.0f;
        }
    }

    private void d(boolean z10) {
        this.f38198f = false;
        e().k(this);
        this.f38201i = 0L;
        this.f38195c = false;
        for (int i10 = 0; i10 < this.f38203k.size(); i10++) {
            if (this.f38203k.get(i10) != null) {
                ((p) this.f38203k.get(i10)).a(this, z10, this.f38194b, this.f38193a);
            }
        }
        k(this.f38203k);
    }

    private float f() {
        return this.f38197e.a(this.f38196d);
    }

    private static void j(ArrayList arrayList, Object obj) {
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private static void k(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void q() {
        if (this.f38198f) {
            return;
        }
        this.f38198f = true;
        if (!this.f38195c) {
            this.f38194b = f();
        }
        float f10 = this.f38194b;
        if (f10 > this.f38199g || f10 < this.f38200h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        e().d(this, 0L);
    }

    @Override // f1.b.c
    public boolean a(long j10) {
        long j11 = this.f38201i;
        if (j11 == 0) {
            this.f38201i = j10;
            m(this.f38194b);
            return false;
        }
        long j12 = j10 - j11;
        this.f38201i = j10;
        float fG = e().g();
        boolean zR = r(fG == 0.0f ? 2147483647L : (long) (j12 / fG));
        float fMin = Math.min(this.f38194b, this.f38199g);
        this.f38194b = fMin;
        float fMax = Math.max(fMin, this.f38200h);
        this.f38194b = fMax;
        m(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public e b(p pVar) {
        if (!this.f38203k.contains(pVar)) {
            this.f38203k.add(pVar);
        }
        return this;
    }

    public void c() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f38198f) {
            d(true);
        }
    }

    public f1.b e() {
        f1.b bVar = this.f38205m;
        return bVar != null ? bVar : f1.b.h();
    }

    float g() {
        return this.f38202j * 0.75f;
    }

    public boolean h() {
        return this.f38198f;
    }

    public void i(p pVar) {
        j(this.f38203k, pVar);
    }

    public e l(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f38202j = f10;
        o(f10 * 0.75f);
        return this;
    }

    void m(float f10) {
        this.f38197e.b(this.f38196d, f10);
        for (int i10 = 0; i10 < this.f38204l.size(); i10++) {
            if (this.f38204l.get(i10) != null) {
                android.support.v4.media.session.b.a(this.f38204l.get(i10));
                throw null;
            }
        }
        k(this.f38204l);
    }

    public e n(float f10) {
        this.f38194b = f10;
        this.f38195c = true;
        return this;
    }

    abstract void o(float f10);

    public void p() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f38198f) {
            return;
        }
        q();
    }

    abstract boolean r(long j10);
}
