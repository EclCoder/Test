package androidx.fragment.app;

import androidx.lifecycle.r1;
import androidx.lifecycle.s1;
import androidx.lifecycle.u1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f4285a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f4285a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f4285a.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final fl.k b(Fragment fragment, zl.c viewModelClass, tl.a storeProducer, tl.a extrasProducer, tl.a aVar) {
        kotlin.jvm.internal.s.h(fragment, "<this>");
        kotlin.jvm.internal.s.h(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.s.h(storeProducer, "storeProducer");
        kotlin.jvm.internal.s.h(extrasProducer, "extrasProducer");
        if (aVar == null) {
            aVar = new a(fragment);
        }
        return new r1(viewModelClass, storeProducer, aVar, extrasProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 c(fl.k kVar) {
        return (u1) kVar.getValue();
    }
}
