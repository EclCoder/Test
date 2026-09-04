package com.hecorat.screenrecorder.free.ui.live.youtube;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.p;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.ui.live.youtube.LiveYtFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fh.h;
import fl.g0;
import fl.k;
import fl.l;
import fl.o;
import jh.f;
import jh.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import nh.j0;
import tf.m4;
import y3.e1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\"\u0010%\u001a\u00020\u001e8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/youtube/LiveYtFragment;", "Lfh/h;", "<init>", "()V", "", "O", "()Ljava/lang/String;", "Lfl/g0;", "V", "U", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/databinding/p;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "z", "I", "H", "Landroidx/lifecycle/s1$c;", "c", "Landroidx/lifecycle/s1$c;", "Q", "()Landroidx/lifecycle/s1$c;", "setViewModelFactory", "(Landroidx/lifecycle/s1$c;)V", "viewModelFactory", "Ljh/j;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lfl/k;", "P", "()Ljh/j;", "model", "Ltf/m4;", "e", "Ltf/m4;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveYtFragment extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public s1.c viewModelFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final k model;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public m4 binding;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tl.a aVar) {
            super(0);
            this.f23162a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23162a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f23163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f23163a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23163a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f23165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, k kVar) {
            super(0);
            this.f23164a = aVar;
            this.f23165b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23164a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23165b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    public LiveYtFragment() {
        tl.a aVar = new tl.a() { // from class: jh.c
            @Override // tl.a
            public final Object invoke() {
                return LiveYtFragment.R(this.f42465a);
            }
        };
        tl.a aVar2 = new tl.a() { // from class: jh.d
            @Override // tl.a
            public final Object invoke() {
                return LiveYtFragment.S(this.f42466a);
            }
        };
        k kVarA = l.a(o.NONE, new a(aVar));
        this.model = t0.b(this, l0.b(j.class), new b(kVarA), new c(null, kVarA), aVar2);
    }

    private final String O() {
        m4 m4Var = this.binding;
        if (m4Var == null) {
            s.w("binding");
            m4Var = null;
        }
        String string = m4Var.B.getText().toString();
        if (string.length() > 0) {
            return string;
        }
        String str = getString(R.string.az_live_hashtag) + System.lineSeparator() + getString(R.string.az_live_description_suffix, getString(R.string.app_name), "https://azrecorder.page.link/Best");
        s.g(str, "toString(...)");
        return str;
    }

    public static final u1 R(LiveYtFragment liveYtFragment) {
        androidx.fragment.app.s activity = liveYtFragment.getActivity();
        s.f(activity, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.ui.live.youtube.LiveYtActivity");
        return (LiveYtActivity) activity;
    }

    public static final s1.c S(LiveYtFragment liveYtFragment) {
        return liveYtFragment.Q();
    }

    public static final g0 T(LiveYtFragment liveYtFragment, g0 it) {
        s.h(it, "it");
        liveYtFragment.V();
        return g0.f38750a;
    }

    private final void U() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/live_dashboard_splash"));
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    private final void V() {
        try {
            View viewInflate = getLayoutInflater().inflate(R.layout.dialog_youtube_go_live_tutorial, (ViewGroup) null);
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(requireActivity()).setView(viewInflate).create();
            alertDialogCreate.show();
            viewInflate.findViewById(R.id.btn_grant).setOnClickListener(new View.OnClickListener() { // from class: jh.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveYtFragment.W(alertDialogCreate, this, view);
                }
            });
        } catch (Exception e10) {
            j0.b(AzRecorderApp.e().getApplicationContext(), R.string.toast_common_error);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static final void W(AlertDialog alertDialog, LiveYtFragment liveYtFragment, View view) {
        alertDialog.dismiss();
        liveYtFragment.U();
    }

    @Override // fh.h
    public void H() {
        y3.g0 g0VarA = androidx.navigation.fragment.a.a(this);
        e1 e1VarA = f.a();
        s.g(e1VarA, "actionLiveYtFragmentToYtSettingsFragment(...)");
        g0VarA.K(e1VarA);
    }

    @Override // fh.h
    public void I() {
        j jVarY = y();
        m4 m4Var = this.binding;
        m4 m4Var2 = null;
        if (m4Var == null) {
            s.w("binding");
            m4Var = null;
        }
        jVarY.h0(m4Var.H.getText().toString());
        j jVarY2 = y();
        m4 m4Var3 = this.binding;
        if (m4Var3 == null) {
            s.w("binding");
        } else {
            m4Var2 = m4Var3;
        }
        jVarY2.f0(m4Var2.B.getText().toString());
        y().j0(O());
        Context context = getContext();
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putString("platform", "youtube");
            FirebaseAnalytics.getInstance(context).a("request_start_livestream", bundle);
        }
    }

    @Override // fh.h
    public p J(LayoutInflater inflater, ViewGroup container) {
        s.h(inflater, "inflater");
        m4 m4VarY = m4.Y(inflater, container, false);
        s.g(m4VarY, "inflate(...)");
        m4VarY.a0(y());
        m4VarY.S(getViewLifecycleOwner());
        this.binding = m4VarY;
        y().i0(getString(R.string.app_name));
        m4 m4Var = this.binding;
        if (m4Var != null) {
            return m4Var;
        }
        s.w("binding");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fh.h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public j y() {
        return (j) this.model.getValue();
    }

    public s1.c Q() {
        s1.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        s.w("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        s.h(context, "context");
        super.onAttach(context);
        AzRecorderApp.d().g().a().c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        y().c0().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: jh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveYtFragment.T(this.f42464a, (g0) obj);
            }
        }));
    }

    @Override // fh.h
    public String z() {
        m4 m4Var = this.binding;
        if (m4Var == null) {
            s.w("binding");
            m4Var = null;
        }
        String string = m4Var.H.getText().toString();
        if (string.length() != 0) {
            return string;
        }
        String string2 = getString(R.string.az_live_with_app, getString(R.string.app_name));
        s.g(string2, "getString(...)");
        return string2;
    }
}
