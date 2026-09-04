package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.slider.Slider;
import kotlin.Metadata;
import tf.c5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Loh/t3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Luh/q0;", "a", "Lfl/k;", "s", "()Luh/q0;", "textSettingsViewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t3 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k textSettingsViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.q0.class), new a(this), new b(null, this), new c(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f48858a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48858a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48859a = aVar;
            this.f48860b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48859a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48860b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f48861a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48861a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final uh.q0 s() {
        return (uh.q0) this.textSettingsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(t3 t3Var, Slider slider, float f10, boolean z10) {
        kotlin.jvm.internal.s.h(slider, "<unused var>");
        t3Var.s().w().q(Float.valueOf(f10));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        c5 c5VarY = c5.Y(inflater, container, false);
        c5VarY.S(getViewLifecycleOwner());
        c5VarY.a0(s());
        kotlin.jvm.internal.s.g(c5VarY, "apply(...)");
        c5VarY.E.m(new com.google.android.material.slider.a() { // from class: oh.s3
            @Override // com.google.android.material.slider.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Slider slider, float f10, boolean z10) {
                t3.t(this.f48850a, slider, f10, z10);
            }
        });
        View viewB = c5VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }
}
