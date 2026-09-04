package com.hecorat.screenrecorder.free.ui.live.facebook;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.databinding.p;
import androidx.fragment.app.s;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fh.h;
import fl.g0;
import fl.k;
import fl.l;
import fl.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import tf.i4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/facebook/LiveFbFragment;", "Lfh/h;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/g0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/databinding/p;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "", "z", "()Ljava/lang/String;", "I", "H", "Landroidx/lifecycle/s1$c;", "c", "Landroidx/lifecycle/s1$c;", "O", "()Landroidx/lifecycle/s1$c;", "setViewModelFactory", "(Landroidx/lifecycle/s1$c;)V", "viewModelFactory", "Lgh/o;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lfl/k;", "N", "()Lgh/o;", "model", "Ltf/i4;", "e", "Ltf/i4;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveFbFragment extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public s1.c viewModelFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k model;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i4 binding;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tl.a aVar) {
            super(0);
            this.f23138a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23138a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f23139a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f23139a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23139a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23141b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, k kVar) {
            super(0);
            this.f23140a = aVar;
            this.f23141b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23140a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23141b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    public LiveFbFragment() {
        tl.a aVar = new tl.a() { // from class: gh.l
            @Override // tl.a
            public final Object invoke() {
                return LiveFbFragment.P(this.f39195a);
            }
        };
        tl.a aVar2 = new tl.a() { // from class: gh.m
            @Override // tl.a
            public final Object invoke() {
                return LiveFbFragment.Q(this.f39196a);
            }
        };
        k kVarA = l.a(o.NONE, new a(aVar));
        this.model = t0.b(this, l0.b(gh.o.class), new b(kVarA), new c(null, kVarA), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 P(LiveFbFragment liveFbFragment) {
        s activity = liveFbFragment.getActivity();
        kotlin.jvm.internal.s.f(activity, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbActivity");
        return (LiveFbActivity) activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.c Q(LiveFbFragment liveFbFragment) {
        return liveFbFragment.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 R(LiveFbFragment liveFbFragment, g0 it) {
        kotlin.jvm.internal.s.h(it, "it");
        if (((List) liveFbFragment.y().N().f()) != null) {
            androidx.navigation.fragment.a.a(liveFbFragment).F(R.id.action_liveFacebookFragment_to_fbDestinationsDialogFragment);
        }
        return g0.f38750a;
    }

    @Override // fh.h
    public void H() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_liveFacebookFragment_to_facebookSettingsFragment);
    }

    @Override // fh.h
    public void I() {
        gh.o oVarY = y();
        i4 i4Var = this.binding;
        if (i4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i4Var = null;
        }
        oVarY.V(i4Var.H.getText().toString());
        Context context = getContext();
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putString("platform", "facebook");
            FirebaseAnalytics.getInstance(context).a("request_start_livestream", bundle);
        }
    }

    @Override // fh.h
    public p J(LayoutInflater inflater, ViewGroup container) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        i4 i4Var = (i4) g.h(inflater, R.layout.fragment_live_facebook, container, false);
        this.binding = i4Var;
        if (i4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i4Var = null;
        }
        i4Var.Y(y());
        i4 i4Var2 = this.binding;
        if (i4Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            i4Var2 = null;
        }
        i4Var2.S(getViewLifecycleOwner());
        i4 i4Var3 = this.binding;
        if (i4Var3 != null) {
            return i4Var3;
        }
        kotlin.jvm.internal.s.w("binding");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fh.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public gh.o y() {
        return (gh.o) this.model.getValue();
    }

    public s1.c O() {
        s1.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.s.w("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        super.onAttach(context);
        AzRecorderApp.d().D().a().d(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        y().R().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: gh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveFbFragment.R(this.f39194a, (g0) obj);
            }
        }));
    }

    @Override // fh.h
    public String z() {
        i4 i4Var = this.binding;
        if (i4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i4Var = null;
        }
        String string = i4Var.H.getText().toString();
        if (string.length() != 0) {
            return string;
        }
        String string2 = getString(R.string.az_live_with_app, getString(R.string.app_name));
        kotlin.jvm.internal.s.g(string2, "getString(...)");
        return string2;
    }
}
