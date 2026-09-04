package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f4463a = new r();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements n4.g.a {
        @Override // n4.g.a
        public void a(n4.j owner) {
            kotlin.jvm.internal.s.h(owner, "owner");
            if (!(owner instanceof u1)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            t1 viewModelStore = ((u1) owner).getViewModelStore();
            n4.g savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                p1 p1VarB = viewModelStore.b(it.next());
                if (p1VarB != null) {
                    r.a(p1VarB, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f4464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n4.g f4465b;

        b(s sVar, n4.g gVar) {
            this.f4464a = sVar;
            this.f4465b = gVar;
        }

        @Override // androidx.lifecycle.y
        public void c(b0 source, s.a event) {
            kotlin.jvm.internal.s.h(source, "source");
            kotlin.jvm.internal.s.h(event, "event");
            if (event == s.a.ON_START) {
                this.f4464a.d(this);
                this.f4465b.d(a.class);
            }
        }
    }

    private r() {
    }

    public static final void a(p1 viewModel, n4.g registry, s lifecycle) {
        kotlin.jvm.internal.s.h(viewModel, "viewModel");
        kotlin.jvm.internal.s.h(registry, "registry");
        kotlin.jvm.internal.s.h(lifecycle, "lifecycle");
        b1 b1Var = (b1) viewModel.f("androidx.lifecycle.savedstate.vm.tag");
        if (b1Var == null || b1Var.l()) {
            return;
        }
        b1Var.d(registry, lifecycle);
        f4463a.c(registry, lifecycle);
    }

    public static final b1 b(n4.g registry, s lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.s.h(registry, "registry");
        kotlin.jvm.internal.s.h(lifecycle, "lifecycle");
        kotlin.jvm.internal.s.e(str);
        b1 b1Var = new b1(str, z0.f4563c.a(registry.a(str), bundle));
        b1Var.d(registry, lifecycle);
        f4463a.c(registry, lifecycle);
        return b1Var;
    }

    private final void c(n4.g gVar, s sVar) {
        s.b bVarB = sVar.b();
        if (bVarB == s.b.INITIALIZED || bVarB.e(s.b.STARTED)) {
            gVar.d(a.class);
        } else {
            sVar.a(new b(sVar, gVar));
        }
    }
}
