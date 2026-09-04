package com.bumptech.glide;

import android.content.Context;
import f6.o;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f11149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u5.d f11150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u5.b f11151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v5.h f11152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w5.a f11153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w5.a f11154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private v5.a.InterfaceC0829a f11155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v5.i f11156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f6.c f11157k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o.b f11160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w5.a f11161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f11163q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11147a = new androidx.collection.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.f.a f11148b = new com.bumptech.glide.f.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11158l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.c.b f11159m = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.bumptech.glide.c.b {
        a() {
        }

        @Override // com.bumptech.glide.c.b
        public i6.f build() {
            return new i6.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements com.bumptech.glide.f.b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements com.bumptech.glide.f.b {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0151d implements com.bumptech.glide.f.b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements com.bumptech.glide.f.b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements com.bumptech.glide.f.b {
    }

    com.bumptech.glide.c a(Context context, List list, g6.a aVar) {
        if (this.f11153g == null) {
            this.f11153g = w5.a.c0();
        }
        if (this.f11154h == null) {
            this.f11154h = w5.a.s();
        }
        if (this.f11161o == null) {
            this.f11161o = w5.a.q();
        }
        if (this.f11156j == null) {
            this.f11156j = new v5.i.a(context).a();
        }
        if (this.f11157k == null) {
            this.f11157k = new f6.e();
        }
        if (this.f11150d == null) {
            int iB = this.f11156j.b();
            if (iB > 0) {
                this.f11150d = new u5.k(iB);
            } else {
                this.f11150d = new u5.e();
            }
        }
        if (this.f11151e == null) {
            this.f11151e = new u5.i(this.f11156j.a());
        }
        if (this.f11152f == null) {
            this.f11152f = new v5.g(this.f11156j.d());
        }
        if (this.f11155i == null) {
            this.f11155i = new v5.f(context);
        }
        if (this.f11149c == null) {
            this.f11149c = new com.bumptech.glide.load.engine.j(this.f11152f, this.f11155i, this.f11154h, this.f11153g, w5.a.d0(), this.f11161o, this.f11162p);
        }
        List list2 = this.f11163q;
        if (list2 == null) {
            this.f11163q = Collections.EMPTY_LIST;
        } else {
            this.f11163q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f11149c, this.f11152f, this.f11150d, this.f11151e, new o(this.f11160n), this.f11157k, this.f11158l, this.f11159m, this.f11147a, this.f11163q, list, aVar, this.f11148b.b());
    }

    void b(o.b bVar) {
        this.f11160n = bVar;
    }
}
