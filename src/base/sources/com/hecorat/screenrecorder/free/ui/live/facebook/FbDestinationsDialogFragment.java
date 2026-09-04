package com.hecorat.screenrecorder.free.ui.live.facebook;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import com.hecorat.screenrecorder.free.ui.live.facebook.FbDestinationsDialogFragment;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import fl.k;
import fl.l;
import fl.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import tf.v1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/facebook/FbDestinationsDialogFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "Lfl/g0;", "onAttach", "(Landroid/content/Context;)V", "Ltf/v1;", "a", "Ltf/v1;", "binding", "Landroidx/lifecycle/s1$c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/lifecycle/s1$c;", "z", "()Landroidx/lifecycle/s1$c;", "setViewModelFactory", "(Landroidx/lifecycle/s1$c;)V", "viewModelFactory", "Lgh/o;", "c", "Lfl/k;", "y", "()Lgh/o;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FbDestinationsDialogFragment extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private v1 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public s1.c viewModelFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k viewModel;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tl.a aVar) {
            super(0);
            this.f23129a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23129a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f23130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f23130a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23130a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, k kVar) {
            super(0);
            this.f23131a = aVar;
            this.f23132b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23131a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23132b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    public FbDestinationsDialogFragment() {
        tl.a aVar = new tl.a() { // from class: gh.d
            @Override // tl.a
            public final Object invoke() {
                return FbDestinationsDialogFragment.D(this.f39188a);
            }
        };
        tl.a aVar2 = new tl.a() { // from class: gh.e
            @Override // tl.a
            public final Object invoke() {
                return FbDestinationsDialogFragment.E(this.f39189a);
            }
        };
        k kVarA = l.a(o.NONE, new a(aVar));
        this.viewModel = t0.b(this, l0.b(gh.o.class), new b(kVarA), new c(null, kVarA), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 A(FbDestinationsDialogFragment fbDestinationsDialogFragment, FBLiveDestination it) {
        s.h(it, "it");
        fbDestinationsDialogFragment.y().W(it);
        fbDestinationsDialogFragment.dismiss();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(gh.a aVar, List list) {
        aVar.i(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 C(FbDestinationsDialogFragment fbDestinationsDialogFragment, g0 it) {
        s.h(it, "it");
        fbDestinationsDialogFragment.dismiss();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 D(FbDestinationsDialogFragment fbDestinationsDialogFragment) {
        androidx.fragment.app.s activity = fbDestinationsDialogFragment.getActivity();
        s.f(activity, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbActivity");
        return (LiveFbActivity) activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.c E(FbDestinationsDialogFragment fbDestinationsDialogFragment) {
        return fbDestinationsDialogFragment.z();
    }

    private final gh.o y() {
        return (gh.o) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        s.h(context, "context");
        super.onAttach(context);
        AzRecorderApp.d().D().a().a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.h(inflater, "inflater");
        v1 v1Var = (v1) g.h(inflater, R.layout.dialog_fb_destinations, container, false);
        this.binding = v1Var;
        v1 v1Var2 = null;
        if (v1Var == null) {
            s.w("binding");
            v1Var = null;
        }
        v1Var.Y(y());
        v1 v1Var3 = this.binding;
        if (v1Var3 == null) {
            s.w("binding");
            v1Var3 = null;
        }
        v1Var3.S(getViewLifecycleOwner());
        Object objF = y().S().f();
        s.e(objF);
        final gh.a aVar = new gh.a((FBLiveDestination) objF, new gh.c(new Function1() { // from class: gh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FbDestinationsDialogFragment.A(this.f39190a, (FBLiveDestination) obj);
            }
        }));
        v1 v1Var4 = this.binding;
        if (v1Var4 == null) {
            s.w("binding");
            v1Var4 = null;
        }
        v1Var4.B.setAdapter(aVar);
        y().N().j(this, new q0() { // from class: gh.g
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                FbDestinationsDialogFragment.B(aVar, (List) obj);
            }
        });
        y().O().j(this, new wg.b(new Function1() { // from class: gh.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FbDestinationsDialogFragment.C(this.f39192a, (g0) obj);
            }
        }));
        v1 v1Var5 = this.binding;
        if (v1Var5 == null) {
            s.w("binding");
        } else {
            v1Var2 = v1Var5;
        }
        return v1Var2.B();
    }

    public final s1.c z() {
        s1.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        s.w("viewModelFactory");
        return null;
    }
}
