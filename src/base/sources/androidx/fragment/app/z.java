package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f4330a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f4331b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f0.l f4332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f4333b;

        a(f0.l lVar, boolean z10) {
            this.f4332a = lVar;
            this.f4333b = z10;
        }
    }

    z(f0 f0Var) {
        this.f4331b = f0Var;
    }

    void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().a(fragment, bundle, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.a(this.f4331b, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z10) {
        Context contextF = this.f4331b.A0().f();
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().b(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.b(this.f4331b, fragment, contextF);
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().c(fragment, bundle, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.c(this.f4331b, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().d(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.d(this.f4331b, fragment);
            }
        }
    }

    void e(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().e(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.e(this.f4331b, fragment);
            }
        }
    }

    void f(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().f(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.f(this.f4331b, fragment);
            }
        }
    }

    void g(Fragment fragment, boolean z10) {
        Context contextF = this.f4331b.A0().f();
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().g(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.g(this.f4331b, fragment, contextF);
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().h(fragment, bundle, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.h(this.f4331b, fragment, bundle);
            }
        }
    }

    void i(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().i(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.i(this.f4331b, fragment);
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().j(fragment, bundle, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.j(this.f4331b, fragment, bundle);
            }
        }
    }

    void k(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().k(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.k(this.f4331b, fragment);
            }
        }
    }

    void l(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().l(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.l(this.f4331b, fragment);
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.m(this.f4331b, fragment, view, bundle);
            }
        }
    }

    void n(Fragment fragment, boolean z10) {
        Fragment fragmentD0 = this.f4331b.D0();
        if (fragmentD0 != null) {
            fragmentD0.getParentFragmentManager().C0().n(fragment, true);
        }
        for (a aVar : this.f4330a) {
            if (!z10 || aVar.f4333b) {
                aVar.f4332a.n(this.f4331b, fragment);
            }
        }
    }

    public void o(f0.l lVar, boolean z10) {
        this.f4330a.add(new a(lVar, z10));
    }

    public void p(f0.l lVar) {
        synchronized (this.f4330a) {
            try {
                int size = this.f4330a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((a) this.f4330a.get(i10)).f4332a == lVar) {
                        this.f4330a.remove(i10);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
