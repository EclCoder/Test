package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.slider.Slider;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import tf.e5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Loh/y3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luh/q0;", "a", "Lfl/k;", "v", "()Luh/q0;", "viewModel", "Ltf/e5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ltf/e5;", "binding", "Lph/e;", "c", "Lph/e;", "adapter", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y3 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k viewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.q0.class), new b(this), new c(null, this), new d(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e5 binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ph.e adapter;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48912a;

        a(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48912a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48912a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48912a.invoke(obj);
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
        final /* synthetic */ Fragment f48913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f48913a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48913a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48914a = aVar;
            this.f48915b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48914a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48915b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48916a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48916a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final uh.q0 v() {
        return (uh.q0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 w(y3 y3Var, int i10) {
        y3Var.v().q().q(Integer.valueOf(i10));
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 x(y3 y3Var, Integer num) {
        ph.e eVar = y3Var.adapter;
        if (eVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            eVar = null;
        }
        kotlin.jvm.internal.s.e(num);
        eVar.j(num.intValue());
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(float f10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) f10);
        sb2.append('%');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(y3 y3Var, Slider slider, float f10, boolean z10) {
        kotlin.jvm.internal.s.h(slider, "slider");
        y3Var.v().r().q(Float.valueOf(f10 / 100.0f));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        e5 e5VarY = e5.Y(inflater);
        this.binding = e5VarY;
        if (e5VarY == null) {
            kotlin.jvm.internal.s.w("binding");
            e5VarY = null;
        }
        View viewB = e5VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.adapter = new ph.e(new Function1() { // from class: oh.u3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y3.w(this.f48867a, ((Integer) obj).intValue());
            }
        });
        e5 e5Var = this.binding;
        e5 e5Var2 = null;
        if (e5Var == null) {
            kotlin.jvm.internal.s.w("binding");
            e5Var = null;
        }
        RecyclerView recyclerView = e5Var.A;
        ph.e eVar = this.adapter;
        if (eVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            eVar = null;
        }
        recyclerView.setAdapter(eVar);
        ph.e eVar2 = this.adapter;
        if (eVar2 == null) {
            kotlin.jvm.internal.s.w("adapter");
            eVar2 = null;
        }
        eVar2.i(rh.b.a());
        v().q().j(getViewLifecycleOwner(), new a(new Function1() { // from class: oh.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y3.x(this.f48885a, (Integer) obj);
            }
        }));
        e5 e5Var3 = this.binding;
        if (e5Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            e5Var3 = null;
        }
        e5Var3.B.setLabelFormatter(new com.google.android.material.slider.f() { // from class: oh.w3
            @Override // com.google.android.material.slider.f
            public final String a(float f10) {
                return y3.y(f10);
            }
        });
        e5 e5Var4 = this.binding;
        if (e5Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
            e5Var4 = null;
        }
        e5Var4.B.m(new com.google.android.material.slider.a() { // from class: oh.x3
            @Override // com.google.android.material.slider.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Slider slider, float f10, boolean z10) {
                y3.z(this.f48903a, slider, f10, z10);
            }
        });
        e5 e5Var5 = this.binding;
        if (e5Var5 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            e5Var2 = e5Var5;
        }
        Slider slider = e5Var2.B;
        Object objF = v().r().f();
        kotlin.jvm.internal.s.e(objF);
        slider.setValue(yl.g.i((int) (((Number) objF).floatValue() * 100), 0, 100));
    }
}
