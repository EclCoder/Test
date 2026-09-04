package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import tf.g5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Loh/b4;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luh/q0;", "a", "Lfl/k;", "t", "()Luh/q0;", "activityViewModel", "Luh/p0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "u", "()Luh/p0;", "fontViewModel", "Ltf/g5;", "c", "Ltf/g5;", "binding", "Lph/q;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lph/q;", "adapter", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b4 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k activityViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.q0.class), new b(this), new c(null, this), new d(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k fontViewModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g5 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ph.q adapter;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48614a;

        a(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48614a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48614a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48614a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f48615a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48615a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48616a = aVar;
            this.f48617b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48616a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48617b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48618a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48618a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f48619a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f48619a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.a aVar) {
            super(0);
            this.f48620a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.u1 invoke() {
            return (androidx.lifecycle.u1) this.f48620a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fl.k f48621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(fl.k kVar) {
            super(0);
            this.f48621a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            return androidx.fragment.app.t0.c(this.f48621a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fl.k f48623b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.a aVar, fl.k kVar) {
            super(0);
            this.f48622a = aVar;
            this.f48623b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48622a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            androidx.lifecycle.u1 u1VarC = androidx.fragment.app.t0.c(this.f48623b);
            androidx.lifecycle.q qVar = u1VarC instanceof androidx.lifecycle.q ? (androidx.lifecycle.q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fl.k f48625b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment, fl.k kVar) {
            super(0);
            this.f48624a = fragment;
            this.f48625b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory;
            androidx.lifecycle.u1 u1VarC = androidx.fragment.app.t0.c(this.f48625b);
            androidx.lifecycle.q qVar = u1VarC instanceof androidx.lifecycle.q ? (androidx.lifecycle.q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            androidx.lifecycle.s1.c defaultViewModelProviderFactory2 = this.f48624a.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public b4() {
        fl.k kVarA = fl.l.a(fl.o.NONE, new f(new e(this)));
        this.fontViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.p0.class), new g(kVarA), new h(null, kVarA), new i(this, kVarA));
    }

    private final uh.q0 t() {
        return (uh.q0) this.activityViewModel.getValue();
    }

    private final uh.p0 u() {
        return (uh.p0) this.fontViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 v(b4 b4Var, og.a it) {
        kotlin.jvm.internal.s.h(it, "it");
        ph.q qVar = b4Var.adapter;
        if (qVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            qVar = null;
        }
        qVar.j(it);
        b4Var.t().s().q(it);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 w(b4 b4Var, List list) {
        ph.q qVar = b4Var.adapter;
        ph.q qVar2 = null;
        if (qVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            qVar = null;
        }
        qVar.i(list);
        kotlin.jvm.internal.s.e(list);
        if (!list.isEmpty()) {
            og.a aVar = (og.a) b4Var.t().s().f();
            if (aVar == null) {
                b4Var.t().s().q(list.get(0));
            } else {
                ph.q qVar3 = b4Var.adapter;
                if (qVar3 == null) {
                    kotlin.jvm.internal.s.w("adapter");
                } else {
                    qVar2 = qVar3;
                }
                qVar2.j(aVar);
            }
        }
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        g5 g5VarY = g5.Y(LayoutInflater.from(getContext()));
        this.binding = g5VarY;
        if (g5VarY == null) {
            kotlin.jvm.internal.s.w("binding");
            g5VarY = null;
        }
        View viewB = g5VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        this.adapter = new ph.q(new Function1() { // from class: oh.z3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.v(this.f48921a, (og.a) obj);
            }
        });
        g5 g5Var = this.binding;
        ph.q qVar = null;
        if (g5Var == null) {
            kotlin.jvm.internal.s.w("binding");
            g5Var = null;
        }
        g5Var.A.setLayoutManager(new GridLayoutManager(getContext(), 3));
        g5 g5Var2 = this.binding;
        if (g5Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            g5Var2 = null;
        }
        RecyclerView recyclerView = g5Var2.A;
        ph.q qVar2 = this.adapter;
        if (qVar2 == null) {
            kotlin.jvm.internal.s.w("adapter");
        } else {
            qVar = qVar2;
        }
        recyclerView.setAdapter(qVar);
        u().j().j(getViewLifecycleOwner(), new a(new Function1() { // from class: oh.a4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.w(this.f48597a, (List) obj);
            }
        }));
    }
}
