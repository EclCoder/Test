package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.videoeditor.AddBackgroundFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import fl.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import tf.g3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/AddBackgroundFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/g3;", "<init>", "()V", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Lfl/g0;", "K", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/g3;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "C", "Lph/b;", "c", "Lph/b;", "adapter", "Luh/e;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lfl/k;", "I", "()Luh/e;", "backgroundViewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddBackgroundFragment extends com.hecorat.screenrecorder.free.videoeditor.d<g3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ph.b adapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final fl.k backgroundViewModel;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23196a;

        public a(Function1 function) {
            s.h(function, "function");
            this.f23196a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23196a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23196a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23197a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f23197a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f23197a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar) {
            super(0);
            this.f23198a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23198a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fl.k f23199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fl.k kVar) {
            super(0);
            this.f23199a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23199a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23201b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.a aVar, fl.k kVar) {
            super(0);
            this.f23200a = aVar;
            this.f23201b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23200a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23201b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23203b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, fl.k kVar) {
            super(0);
            this.f23202a = fragment;
            this.f23203b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory;
            u1 u1VarC = t0.c(this.f23203b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            s1.c defaultViewModelProviderFactory2 = this.f23202a.getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public AddBackgroundFragment() {
        fl.k kVarA = fl.l.a(o.NONE, new c(new b(this)));
        this.backgroundViewModel = t0.b(this, l0.b(uh.e.class), new d(kVarA), new e(null, kVarA), new f(this, kVarA));
    }

    private final uh.e I() {
        return (uh.e) this.backgroundViewModel.getValue();
    }

    private final void K(String path) {
        ph.b bVar = this.adapter;
        if (bVar == null) {
            s.w("adapter");
            bVar = null;
        }
        bVar.j(path);
        v().t1(path);
    }

    public static final g0 L(AddBackgroundFragment addBackgroundFragment, String path) {
        s.h(path, "path");
        addBackgroundFragment.K(path);
        return g0.f38750a;
    }

    public static final g0 M(final AddBackgroundFragment addBackgroundFragment, List list) {
        ph.b bVar = addBackgroundFragment.adapter;
        ph.b bVar2 = null;
        if (bVar == null) {
            s.w("adapter");
            bVar = null;
        }
        bVar.i(list);
        qh.b bVarF = addBackgroundFragment.v().g1().f();
        if (bVarF != null) {
            ph.b bVar3 = addBackgroundFragment.adapter;
            if (bVar3 == null) {
                s.w("adapter");
            } else {
                bVar2 = bVar3;
            }
            bVar2.n(bVarF.a());
        } else {
            addBackgroundFragment.v().G0().j(addBackgroundFragment.getViewLifecycleOwner(), new a(new Function1() { // from class: oh.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddBackgroundFragment.N(this.f48671a, (String) obj);
                }
            }));
        }
        return g0.f38750a;
    }

    public static final g0 N(AddBackgroundFragment addBackgroundFragment, String str) {
        ph.b bVar = addBackgroundFragment.adapter;
        if (bVar == null) {
            s.w("adapter");
            bVar = null;
        }
        bVar.n(str);
        return g0.f38750a;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        super.C();
        ph.b bVar = this.adapter;
        if (bVar == null) {
            s.w("adapter");
            bVar = null;
        }
        String strK = bVar.k();
        if (strK != null) {
            v().y1(strK);
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public g3 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        g3 g3VarY = g3.Y(layoutInflater, container, false);
        s.g(g3VarY, "inflate(...)");
        return g3VarY;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((g3) w()).a0(v());
        this.adapter = new ph.b(new Function1() { // from class: oh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddBackgroundFragment.L(this.f48655a, (String) obj);
            }
        });
        RecyclerView recyclerView = ((g3) w()).A;
        ph.b bVar = this.adapter;
        if (bVar == null) {
            s.w("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        I().l().j(getViewLifecycleOwner(), new a(new Function1() { // from class: oh.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddBackgroundFragment.M(this.f48661a, (List) obj);
            }
        }));
    }
}
