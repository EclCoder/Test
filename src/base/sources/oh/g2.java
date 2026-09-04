package oh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Loh/g2;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lph/u;", "a", "Lph/u;", "adapter", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", "s", "()Luh/y;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ph.u adapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k viewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new a(this), new b(null, this), new c(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f48665a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48665a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48666a = aVar;
            this.f48667b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48666a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48667b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f48668a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48668a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final uh.y s() {
        return (uh.y) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 t(g2 g2Var, qh.d it) {
        kotlin.jvm.internal.s.h(it, "it");
        ph.u uVar = g2Var.adapter;
        if (uVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            uVar = null;
        }
        uVar.m(it);
        g2Var.s().Q0().q(it);
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        tf.c4 c4VarY = tf.c4.Y(getLayoutInflater(), container, false);
        kotlin.jvm.internal.s.g(c4VarY, "inflate(...)");
        c4VarY.a0(s());
        c4VarY.S(getViewLifecycleOwner());
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        List listB = rh.d.b(contextRequireContext);
        Object objF = s().Q0().f();
        kotlin.jvm.internal.s.e(objF);
        int iIndexOf = listB.indexOf(objF);
        ph.u uVar = new ph.u(new Function1() { // from class: oh.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g2.t(this.f48658a, (qh.d) obj);
            }
        });
        this.adapter = uVar;
        uVar.l(iIndexOf);
        RecyclerView recyclerView = c4VarY.A;
        ph.u uVar2 = this.adapter;
        ph.u uVar3 = null;
        if (uVar2 == null) {
            kotlin.jvm.internal.s.w("adapter");
            uVar2 = null;
        }
        recyclerView.setAdapter(uVar2);
        ph.u uVar4 = this.adapter;
        if (uVar4 == null) {
            kotlin.jvm.internal.s.w("adapter");
        } else {
            uVar3 = uVar4;
        }
        uVar3.i(listB);
        View viewB = c4VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }
}
