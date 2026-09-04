package com.hecorat.screenrecorder.free.ui.live.facebook.settings;

import android.content.Context;
import androidx.appcompat.app.d;
import androidx.fragment.app.s;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.ui.live.facebook.settings.FbResolutionDialogFragment;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fh.n;
import fl.k;
import fl.l;
import fl.o;
import ih.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/facebook/settings/FbResolutionDialogFragment;", "Lfh/n;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/g0;", "onAttach", "(Landroid/content/Context;)V", "Landroidx/lifecycle/s1$c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/lifecycle/s1$c;", "D", "()Landroidx/lifecycle/s1$c;", "setViewModelFactory", "(Landroidx/lifecycle/s1$c;)V", "viewModelFactory", "Lih/f;", "c", "Lfl/k;", "C", "()Lih/f;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FbResolutionDialogFragment extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public s1.c viewModelFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k viewModel;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23147a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tl.a aVar) {
            super(0);
            this.f23147a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23147a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f23148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f23148a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23148a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f23149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, k kVar) {
            super(0);
            this.f23149a = aVar;
            this.f23150b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23149a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23150b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    public FbResolutionDialogFragment() {
        tl.a aVar = new tl.a() { // from class: ih.a
            @Override // tl.a
            public final Object invoke() {
                return FbResolutionDialogFragment.E(this.f41438a);
            }
        };
        tl.a aVar2 = new tl.a() { // from class: ih.b
            @Override // tl.a
            public final Object invoke() {
                return FbResolutionDialogFragment.F(this.f41439a);
            }
        };
        k kVarA = l.a(o.NONE, new a(aVar));
        this.viewModel = t0.b(this, l0.b(f.class), new b(kVarA), new c(null, kVarA), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 E(FbResolutionDialogFragment fbResolutionDialogFragment) {
        s activity = fbResolutionDialogFragment.getActivity();
        kotlin.jvm.internal.s.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (d) activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.c F(FbResolutionDialogFragment fbResolutionDialogFragment) {
        return fbResolutionDialogFragment.D();
    }

    @Override // fh.n
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public f w() {
        return (f) this.viewModel.getValue();
    }

    public s1.c D() {
        s1.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.s.w("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        super.onAttach(context);
        AzRecorderApp.d().D().a().c(this);
    }
}
