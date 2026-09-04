package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TabLayout f21280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewPager2 f21281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f21284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.h f21285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f21287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TabLayout.d f21288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RecyclerView.j f21289j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11, int i12) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11) {
            d.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(TabLayout.g gVar, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends ViewPager2.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f21291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21293c;

        c(TabLayout tabLayout) {
            this.f21291a = new WeakReference(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            this.f21292b = this.f21293c;
            this.f21293c = i10;
            TabLayout tabLayout = (TabLayout) this.f21291a.get();
            if (tabLayout != null) {
                tabLayout.T(this.f21293c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void b(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f21291a.get();
            if (tabLayout != null) {
                int i12 = this.f21293c;
                boolean z10 = true;
                if (i12 == 2 && this.f21292b != 1) {
                    z10 = false;
                }
                if (i12 == 2 && this.f21292b == 0) {
                    z10 = false;
                }
                tabLayout.N(i10, f10, z10, z10, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            TabLayout tabLayout = (TabLayout) this.f21291a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f21293c;
            tabLayout.J(tabLayout.z(i10), i11 == 0 || (i11 == 2 && this.f21292b == 0));
        }

        void d() {
            this.f21293c = 0;
            this.f21292b = 0;
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (this.f21286g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.h adapter = this.f21281b.getAdapter();
        this.f21285f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f21286g = true;
        c cVar = new c(this.f21280a);
        this.f21287h = cVar;
        this.f21281b.g(cVar);
        C0317d c0317d = new C0317d(this.f21281b, this.f21283d);
        this.f21288i = c0317d;
        this.f21280a.h(c0317d);
        if (this.f21282c) {
            a aVar = new a();
            this.f21289j = aVar;
            this.f21285f.registerAdapterDataObserver(aVar);
        }
        b();
        this.f21280a.L(this.f21281b.getCurrentItem(), 0.0f, true);
    }

    void b() {
        this.f21280a.F();
        RecyclerView.h hVar = this.f21285f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.g gVarC = this.f21280a.C();
                this.f21284e.a(gVarC, i10);
                this.f21280a.j(gVarC, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f21281b.getCurrentItem(), this.f21280a.getTabCount() - 1);
                if (iMin != this.f21280a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f21280a;
                    tabLayout.I(tabLayout.z(iMin));
                }
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, b bVar) {
        this.f21280a = tabLayout;
        this.f21281b = viewPager2;
        this.f21282c = z10;
        this.f21283d = z11;
        this.f21284e = bVar;
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0317d implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager2 f21294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21295b;

        C0317d(ViewPager2 viewPager2, boolean z10) {
            this.f21294a = viewPager2;
            this.f21295b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            this.f21294a.j(gVar.g(), this.f21295b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }
}
