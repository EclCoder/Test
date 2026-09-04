package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f19751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19756f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f19757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19758b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f19760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f19761e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f19759c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19762f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19763g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f19764h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f19765i = -1;

        public b(float f10, int i10) {
            this.f19757a = f10;
            this.f19758b = i10;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            int i10 = this.f19758b;
            if (f15 > i10) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, i10));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f19765i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f19765i = this.f19759c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f19760d == null) {
                    this.f19760d = cVar;
                    this.f19762f = this.f19759c.size();
                }
                if (this.f19763g != -1 && this.f19759c.size() - this.f19763g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f19760d.f19769d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f19761e = cVar;
                this.f19763g = this.f19759c.size();
            } else {
                if (this.f19760d == null && cVar.f19769d < this.f19764h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f19761e != null && cVar.f19769d > this.f19764h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f19764h = cVar.f19769d;
            this.f19759c.add(cVar);
            return this;
        }

        public b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        public b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        public e i() {
            if (this.f19760d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f19759c.size(); i10++) {
                c cVar = (c) this.f19759c.get(i10);
                arrayList.add(new c(j(this.f19760d.f19767b, this.f19757a, this.f19762f, i10), cVar.f19767b, cVar.f19768c, cVar.f19769d, cVar.f19770e, cVar.f19771f, cVar.f19772g, cVar.f19773h));
            }
            return new e(this.f19757a, arrayList, this.f19762f, this.f19763g, this.f19758b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f19766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f19767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f19768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f19769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f19770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f19771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f19772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f19773h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(tb.b.a(cVar.f19766a, cVar2.f19766a, f10), tb.b.a(cVar.f19767b, cVar2.f19767b, f10), tb.b.a(cVar.f19768c, cVar2.f19768c, f10), tb.b.a(cVar.f19769d, cVar2.f19769d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f19766a = f10;
            this.f19767b = f11;
            this.f19768c = f12;
            this.f19769d = f13;
            this.f19770e = z10;
            this.f19771f = f14;
            this.f19772g = f15;
            this.f19773h = f16;
        }
    }

    static e o(e eVar, e eVar2, float f10) {
        if (eVar.g() != eVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listH = eVar.h();
        List listH2 = eVar2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < eVar.h().size(); i10++) {
            arrayList.add(c.a((c) listH.get(i10), (c) listH2.get(i10), f10));
        }
        return new e(eVar.g(), arrayList, tb.b.c(eVar.c(), eVar2.c(), f10), tb.b.c(eVar.j(), eVar2.j(), f10), eVar.f19756f);
    }

    static e p(e eVar, int i10) {
        b bVar = new b(eVar.g(), i10);
        float f10 = (i10 - eVar.k().f19767b) - (eVar.k().f19769d / 2.0f);
        int size = eVar.h().size() - 1;
        while (size >= 0) {
            c cVar = (c) eVar.h().get(size);
            bVar.d((cVar.f19769d / 2.0f) + f10, cVar.f19768c, cVar.f19769d, size >= eVar.c() && size <= eVar.j(), cVar.f19770e);
            f10 += cVar.f19769d;
            size--;
        }
        return bVar.i();
    }

    int a() {
        return this.f19756f;
    }

    c b() {
        return (c) this.f19753c.get(this.f19754d);
    }

    int c() {
        return this.f19754d;
    }

    c d() {
        return (c) this.f19753c.get(0);
    }

    c e() {
        for (int i10 = 0; i10 < this.f19753c.size(); i10++) {
            c cVar = (c) this.f19753c.get(i10);
            if (!cVar.f19770e) {
                return cVar;
            }
        }
        return null;
    }

    List f() {
        return this.f19753c.subList(this.f19754d, this.f19755e + 1);
    }

    float g() {
        return this.f19751a;
    }

    List h() {
        return this.f19753c;
    }

    c i() {
        return (c) this.f19753c.get(this.f19755e);
    }

    int j() {
        return this.f19755e;
    }

    c k() {
        List list = this.f19753c;
        return (c) list.get(list.size() - 1);
    }

    c l() {
        for (int size = this.f19753c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f19753c.get(size);
            if (!cVar.f19770e) {
                return cVar;
            }
        }
        return null;
    }

    int m() {
        Iterator it = this.f19753c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f19770e) {
                i10++;
            }
        }
        return this.f19753c.size() - i10;
    }

    int n() {
        return this.f19752b;
    }

    private e(float f10, List list, int i10, int i11, int i12) {
        this.f19751a = f10;
        this.f19753c = Collections.unmodifiableList(list);
        this.f19754d = i10;
        this.f19755e = i11;
        while (i10 <= i11) {
            if (((c) list.get(i10)).f19771f == 0.0f) {
                this.f19752b++;
            }
            i10++;
        }
        this.f19756f = i12;
    }
}
