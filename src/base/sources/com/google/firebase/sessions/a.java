package com.google.firebase.sessions;

import android.content.Context;
import kl.j;
import ne.b0;
import ne.h0;
import ne.i;
import ne.l;
import ne.n0;
import ne.p0;
import ne.s;
import ne.s0;
import ne.t0;
import ne.v0;
import qe.k;
import qe.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements com.google.firebase.sessions.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f22408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j f22409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j f22410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.f f22411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private de.e f22412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ce.b f22413f;

        private b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b build() {
            pe.d.a(this.f22408a, Context.class);
            pe.d.a(this.f22409b, j.class);
            pe.d.a(this.f22410c, j.class);
            pe.d.a(this.f22411d, com.google.firebase.f.class);
            pe.d.a(this.f22412e, de.e.class);
            pe.d.a(this.f22413f, ce.b.class);
            return new c(this.f22408a, this.f22409b, this.f22410c, this.f22411d, this.f22412e, this.f22413f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b f(Context context) {
            this.f22408a = (Context) pe.d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(j jVar) {
            this.f22409b = (j) pe.d.b(jVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b b(j jVar) {
            this.f22410c = (j) pe.d.b(jVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b e(com.google.firebase.f fVar) {
            this.f22411d = (com.google.firebase.f) pe.d.b(fVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b d(de.e eVar) {
            this.f22412e = (de.e) pe.d.b(eVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b c(ce.b bVar) {
            this.f22413f = (ce.b) pe.d.b(bVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements com.google.firebase.sessions.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f22414a = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        pe.e f22415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        pe.e f22416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        pe.e f22417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        pe.e f22418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        pe.e f22419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        pe.e f22420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        pe.e f22421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        pe.e f22422i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        pe.e f22423j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        pe.e f22424k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        pe.e f22425l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        pe.e f22426m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        pe.e f22427n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        pe.e f22428o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        pe.e f22429p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        pe.e f22430q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        pe.e f22431r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        pe.e f22432s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        pe.e f22433t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        pe.e f22434u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        pe.e f22435v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        pe.e f22436w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        pe.e f22437x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        pe.e f22438y;

        c(Context context, j jVar, j jVar2, com.google.firebase.f fVar, de.e eVar, ce.b bVar) {
            c(context, jVar, jVar2, fVar, eVar, bVar);
        }

        private void c(Context context, j jVar, j jVar2, com.google.firebase.f fVar, de.e eVar, ce.b bVar) {
            this.f22415b = pe.c.a(fVar);
            pe.b bVarA = pe.c.a(context);
            this.f22416c = bVarA;
            this.f22417d = pe.a.b(qe.c.a(bVarA));
            this.f22418e = pe.a.b(f.a());
            this.f22419f = pe.c.a(eVar);
            this.f22420g = pe.a.b(com.google.firebase.sessions.c.b(this.f22415b));
            pe.b bVarA2 = pe.c.a(jVar2);
            this.f22421h = bVarA2;
            this.f22422i = pe.a.b(qe.f.a(this.f22420g, bVarA2));
            this.f22423j = pe.c.a(jVar);
            pe.e eVarB = pe.a.b(d.a(this.f22416c, this.f22421h));
            this.f22424k = eVarB;
            pe.e eVarB2 = pe.a.b(n.a(this.f22423j, this.f22418e, eVarB));
            this.f22425l = eVarB2;
            pe.e eVarB3 = pe.a.b(qe.g.a(this.f22418e, this.f22419f, this.f22420g, this.f22422i, eVarB2));
            this.f22426m = eVarB3;
            this.f22427n = pe.a.b(k.a(this.f22417d, eVarB3));
            pe.e eVarB4 = pe.a.b(g.a());
            this.f22428o = eVarB4;
            this.f22429p = pe.a.b(p0.a(this.f22418e, eVarB4));
            pe.b bVarA3 = pe.c.a(bVar);
            this.f22430q = bVarA3;
            pe.e eVarB5 = pe.a.b(i.a(bVarA3));
            this.f22431r = eVarB5;
            this.f22432s = pe.a.b(n0.a(this.f22415b, this.f22419f, this.f22427n, eVarB5, this.f22423j));
            pe.e eVarB6 = pe.a.b(h0.a(this.f22429p));
            this.f22433t = eVarB6;
            this.f22434u = pe.a.b(e.a(this.f22416c, this.f22421h, eVarB6));
            pe.e eVarB7 = pe.a.b(b0.a(this.f22416c, this.f22428o));
            this.f22435v = eVarB7;
            pe.e eVarB8 = pe.a.b(v0.a(this.f22427n, this.f22429p, this.f22432s, this.f22418e, this.f22434u, eVarB7, this.f22423j));
            this.f22436w = eVarB8;
            pe.e eVarB9 = pe.a.b(s0.a(eVarB8));
            this.f22437x = eVarB9;
            this.f22438y = pe.a.b(s.a(this.f22415b, this.f22427n, this.f22423j, eVarB9));
        }

        @Override // com.google.firebase.sessions.b
        public t0 a() {
            return (t0) this.f22436w.get();
        }

        @Override // com.google.firebase.sessions.b
        public l b() {
            return (l) this.f22438y.get();
        }
    }

    public static com.google.firebase.sessions.b.a a() {
        return new b();
    }
}
