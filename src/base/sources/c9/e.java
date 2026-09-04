package c9;

import android.content.Context;
import k9.n0;
import k9.w0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f9650a;

        private b() {
        }

        @Override // c9.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f9650a = (Context) e9.d.b(context);
            return this;
        }

        @Override // c9.v.a
        public v build() {
            e9.d.a(this.f9650a, Context.class);
            return new c(this.f9650a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f9651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private el.a f9652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private el.a f9653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private el.a f9654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private el.a f9655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private el.a f9656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private el.a f9657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private el.a f9658h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private el.a f9659i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private el.a f9660j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private el.a f9661k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private el.a f9662l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private el.a f9663m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private el.a f9664n;

        private void i(Context context) {
            this.f9652b = e9.a.a(k.a());
            e9.b bVarA = e9.c.a(context);
            this.f9653c = bVarA;
            d9.j jVarA = d9.j.a(bVarA, m9.c.a(), m9.d.a());
            this.f9654d = jVarA;
            this.f9655e = e9.a.a(d9.l.a(this.f9653c, jVarA));
            this.f9656f = w0.a(this.f9653c, k9.g.a(), k9.i.a());
            this.f9657g = e9.a.a(k9.h.a(this.f9653c));
            this.f9658h = e9.a.a(n0.a(m9.c.a(), m9.d.a(), k9.j.a(), this.f9656f, this.f9657g));
            i9.g gVarB = i9.g.b(m9.c.a());
            this.f9659i = gVarB;
            i9.i iVarA = i9.i.a(this.f9653c, this.f9658h, gVarB, m9.d.a());
            this.f9660j = iVarA;
            el.a aVar = this.f9652b;
            el.a aVar2 = this.f9655e;
            el.a aVar3 = this.f9658h;
            this.f9661k = i9.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
            el.a aVar4 = this.f9653c;
            el.a aVar5 = this.f9655e;
            el.a aVar6 = this.f9658h;
            this.f9662l = j9.s.a(aVar4, aVar5, aVar6, this.f9660j, this.f9652b, aVar6, m9.c.a(), m9.d.a(), this.f9658h);
            el.a aVar7 = this.f9652b;
            el.a aVar8 = this.f9658h;
            this.f9663m = j9.w.a(aVar7, aVar8, this.f9660j, aVar8);
            this.f9664n = e9.a.a(w.a(m9.c.a(), m9.d.a(), this.f9661k, this.f9662l, this.f9663m));
        }

        @Override // c9.v
        k9.d d() {
            return (k9.d) this.f9658h.get();
        }

        @Override // c9.v
        u h() {
            return (u) this.f9664n.get();
        }

        private c(Context context) {
            this.f9651a = this;
            i(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
