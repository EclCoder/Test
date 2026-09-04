package lf;

import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAdView;
import gl.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f44428h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lf.b f44429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lf.b f44430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f44431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeAdView f44432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tl.a f44433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f44434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44435g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: lf.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0676a implements lf.b.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f44436a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ lf.b f44437b;

            C0676a(lf.b bVar) {
                this.f44437b = bVar;
            }

            @Override // lf.b.a
            public void a() {
                lf.b.a.C0673a.a(this);
            }

            @Override // lf.b.a
            public void b() {
                if (this.f44436a) {
                    return;
                }
                this.f44436a = true;
                lf.b bVar = this.f44437b;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // lf.b.a
            public void onAdsLoaded() {
                this.f44436a = true;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(lf.b bVar, lf.b bVar2) {
            if (l0.o()) {
                return;
            }
            if (bVar == null) {
                if (bVar2 != null) {
                    bVar2.a();
                }
            } else {
                if (bVar.b()) {
                    return;
                }
                if (bVar2 == null || !(bVar2.b() || bVar2.c())) {
                    bVar.e(new C0676a(bVar2));
                    bVar.a();
                }
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements lf.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.b f44443b;

        d(lf.b bVar) {
            this.f44443b = bVar;
        }

        @Override // lf.b.a
        public void a() {
            tl.a aVar = i.this.f44433e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // lf.b.a
        public void b() {
            i.this.d();
        }

        @Override // lf.b.a
        public void onAdsLoaded() {
            i.this.e(this.f44443b);
        }
    }

    public i(lf.b bVar, lf.b bVar2, ViewGroup viewGroup, NativeAdView nativeAdView, tl.a aVar, boolean z10) {
        this.f44429a = bVar;
        this.f44430b = bVar2;
        this.f44431c = viewGroup;
        this.f44432d = nativeAdView;
        this.f44433e = aVar;
        this.f44434f = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        lf.b bVar;
        if (this.f44435g || (bVar = this.f44430b) == null) {
            return;
        }
        if (bVar.b()) {
            e(bVar);
        } else {
            bVar.e(new b(bVar));
            bVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(lf.b bVar) {
        if (l0.o() || this.f44435g) {
            return;
        }
        this.f44435g = true;
        if (bVar instanceof l) {
            ((l) bVar).n(this.f44432d);
        } else if (bVar instanceof lf.c) {
            ((lf.c) bVar).p(this.f44431c);
        }
    }

    public static final void g(lf.b bVar, lf.b bVar2) {
        f44428h.a(bVar, bVar2);
    }

    public final void f() {
        lf.b bVar = this.f44429a;
        if (bVar != null) {
            bVar.f();
        }
        lf.b bVar2 = this.f44430b;
        if (bVar2 != null) {
            bVar2.f();
        }
    }

    public final void h() {
        this.f44431c = null;
        this.f44432d = null;
        lf.b bVar = this.f44429a;
        if (bVar != null) {
            bVar.release();
        }
        lf.b bVar2 = this.f44430b;
        if (bVar2 != null) {
            bVar2.release();
        }
    }

    public final void i() {
        if (l0.o()) {
            return;
        }
        if (this.f44434f) {
            f44428h.a(this.f44429a, this.f44430b);
            return;
        }
        lf.b bVar = this.f44429a;
        if (bVar != null) {
            bVar.a();
        }
        lf.b bVar2 = this.f44430b;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    public final void j() {
        lf.b bVar = this.f44429a;
        if (bVar != null) {
            bVar.d();
        }
        lf.b bVar2 = this.f44430b;
        if (bVar2 != null) {
            bVar2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0014  */
    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    public final void k() {
        if (this.f44435g) {
            return;
        }
        lf.b bVar = this.f44429a;
        if (bVar == null) {
            bVar = this.f44430b;
            if (bVar != null || !bVar.b()) {
                bVar = null;
            }
        } else {
            if (!bVar.b()) {
                bVar = null;
            }
            if (bVar == null) {
                bVar = this.f44430b;
                if (bVar != null) {
                    bVar = null;
                } else {
                    bVar = null;
                }
            }
        }
        if (bVar != null) {
            e(bVar);
            return;
        }
        if (this.f44434f) {
            lf.b bVar2 = this.f44429a;
            if (bVar2 == null || !bVar2.c()) {
                d();
                return;
            } else {
                bVar2.e(new d(bVar2));
                return;
            }
        }
        for (lf.b bVar3 : r.o(this.f44429a, this.f44430b)) {
            if (bVar3 != null) {
                lf.b bVar4 = bVar3.c() ? bVar3 : null;
                if (bVar4 != null) {
                    bVar4.e(new c(bVar3));
                }
            }
        }
    }

    public /* synthetic */ i(lf.b bVar, lf.b bVar2, ViewGroup viewGroup, NativeAdView nativeAdView, tl.a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2, viewGroup, nativeAdView, (i10 & 16) != 0 ? null : aVar, (i10 & 32) != 0 ? false : z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements lf.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.b f44439b;

        b(lf.b bVar) {
            this.f44439b = bVar;
        }

        @Override // lf.b.a
        public void a() {
            tl.a aVar = i.this.f44433e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // lf.b.a
        public void onAdsLoaded() {
            i.this.e(this.f44439b);
        }

        @Override // lf.b.a
        public void b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements lf.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.b f44441b;

        c(lf.b bVar) {
            this.f44441b = bVar;
        }

        @Override // lf.b.a
        public void a() {
            tl.a aVar = i.this.f44433e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // lf.b.a
        public void onAdsLoaded() {
            i.this.e(this.f44441b);
        }

        @Override // lf.b.a
        public void b() {
        }
    }
}
