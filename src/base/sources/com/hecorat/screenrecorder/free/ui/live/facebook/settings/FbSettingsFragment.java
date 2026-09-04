package com.hecorat.screenrecorder.free.ui.live.facebook.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.p;
import androidx.fragment.app.s;
import androidx.fragment.app.t0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbActivity;
import com.hecorat.screenrecorder.free.ui.live.facebook.settings.FbSettingsFragment;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fh.q;
import fl.k;
import fl.l;
import fl.o;
import ih.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import tf.k4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0014@\u0014X\u0095.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/facebook/settings/FbSettingsFragment;", "Lfh/q;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/databinding/p;", "x", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "Lfl/g0;", "w", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroidx/lifecycle/s1$c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/lifecycle/s1$c;", "B", "()Landroidx/lifecycle/s1$c;", "setViewModelFactory", "(Landroidx/lifecycle/s1$c;)V", "viewModelFactory", "Lih/f;", "c", "Lfl/k;", "A", "()Lih/f;", "model", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FbSettingsFragment extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    protected s1.c viewModelFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k model;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23153a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tl.a aVar) {
            super(0);
            this.f23153a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23153a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f23154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f23154a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23154a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23156b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, k kVar) {
            super(0);
            this.f23155a = aVar;
            this.f23156b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23155a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23156b);
            androidx.lifecycle.q qVar = u1VarC instanceof androidx.lifecycle.q ? (androidx.lifecycle.q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    public FbSettingsFragment() {
        tl.a aVar = new tl.a() { // from class: ih.d
            @Override // tl.a
            public final Object invoke() {
                return FbSettingsFragment.C(this.f41440a);
            }
        };
        tl.a aVar2 = new tl.a() { // from class: ih.e
            @Override // tl.a
            public final Object invoke() {
                return FbSettingsFragment.D(this.f41441a);
            }
        };
        k kVarA = l.a(o.NONE, new a(aVar));
        this.model = t0.b(this, l0.b(f.class), new b(kVarA), new c(null, kVarA), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 C(FbSettingsFragment fbSettingsFragment) {
        s activity = fbSettingsFragment.getActivity();
        kotlin.jvm.internal.s.f(activity, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbActivity");
        return (LiveFbActivity) activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.c D(FbSettingsFragment fbSettingsFragment) {
        return fbSettingsFragment.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fh.q
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public f t() {
        return (f) this.model.getValue();
    }

    protected s1.c B() {
        s1.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.s.w("viewModelFactory");
        return null;
    }

    @Override // yg.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        super.onAttach(context);
        AzRecorderApp.d().D().a().b(this);
    }

    @Override // fh.q
    public void w() {
        new FbResolutionDialogFragment().show(getParentFragmentManager(), (String) null);
    }

    @Override // fh.q
    public p x(LayoutInflater inflater, ViewGroup container) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        k4 k4VarY = k4.Y(inflater, container, false);
        k4VarY.a0(t());
        k4VarY.S(getViewLifecycleOwner());
        kotlin.jvm.internal.s.g(k4VarY, "apply(...)");
        return k4VarY;
    }
}
