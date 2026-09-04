package fh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.q0;
import com.google.android.material.snackbar.Snackbar;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fl.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 %2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H&¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H&¢\u0006\u0004\b\u001c\u0010\u0003R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lfh/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "Lfl/g0;", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/databinding/p;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "H", "", "z", "()Ljava/lang/String;", "I", "Landroid/content/BroadcastReceiver;", "a", "Landroid/content/BroadcastReceiver;", "messageReceiver", "Lfh/j;", "y", "()Lfh/j;", "model", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BroadcastReceiver messageReceiver = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            h hVar = h.this;
            if (kotlin.jvm.internal.s.c(action, "action_request_projection") && hVar.isAdded()) {
                try {
                    s1.a.b(hVar.requireContext()).e(this);
                } catch (Exception e10) {
                    wp.a.e(e10);
                    com.google.firebase.crashlytics.a.b().d(e10);
                }
                Intent intentL = hVar.y().l();
                if (intentL != null) {
                    hVar.startActivityForResult(intentL, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 A(h hVar, g0 it) {
        kotlin.jvm.internal.s.h(it, "it");
        hVar.H();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 B(h hVar, g0 it) {
        kotlin.jvm.internal.s.h(it, "it");
        androidx.fragment.app.s activity = hVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 C(final h hVar, g0 it) {
        kotlin.jvm.internal.s.h(it, "it");
        lg.c.l(new lg.c.a() { // from class: fh.g
            @Override // lg.c.a
            public final void a(boolean z10) {
                h.D(this.f38677a, z10);
            }
        });
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(h hVar, boolean z10) {
        if (!z10) {
            j0.j(hVar.getContext(), R.string.toast_cant_use_without_grant_micro_permission);
        } else {
            if (!hVar.isAdded()) {
                wp.a.a("Fragment is not added to activity", new Object[0]);
                return;
            }
            wp.a.a("Fragment is added to activity", new Object[0]);
            s1.a.b(hVar.requireContext()).c(hVar.messageReceiver, new IntentFilter("action_request_projection"));
            l0.D(hVar.getContext(), "require_projection_live");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(h hVar, Boolean bool) {
        androidx.fragment.app.s activity;
        if (!kotlin.jvm.internal.s.c(bool, Boolean.TRUE) || (activity = hVar.getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(h hVar, Boolean bool) {
        Window window;
        Window window2;
        if (bool.booleanValue()) {
            androidx.fragment.app.s activity = hVar.getActivity();
            if (activity == null || (window2 = activity.getWindow()) == null) {
                return;
            }
            window2.setFlags(16, 16);
            return;
        }
        androidx.fragment.app.s activity2 = hVar.getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        window.clearFlags(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 G(h hVar, int i10) {
        Snackbar.g0(hVar.requireActivity().findViewById(android.R.id.content), hVar.getString(i10), -1).U();
        return g0.f38750a;
    }

    public abstract void H();

    public abstract void I();

    public abstract androidx.databinding.p J(LayoutInflater inflater, ViewGroup container);

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 123 || resultCode != -1) {
            j0.b(getActivity(), R.string.permission_cast_denied);
            return;
        }
        I();
        String strZ = z();
        if (Build.VERSION.SDK_INT >= 29) {
            l0.D(getContext(), "add_live_permissions");
        }
        y().w(resultCode, data, strZ);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        androidx.databinding.p pVarJ = J(inflater, container);
        y().m().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: fh.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.A(this.f38671a, (g0) obj);
            }
        }));
        y().k().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: fh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.B(this.f38672a, (g0) obj);
            }
        }));
        y().p().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: fh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.C(this.f38673a, (g0) obj);
            }
        }));
        y().q().j(getViewLifecycleOwner(), new q0() { // from class: fh.d
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                h.E(this.f38674a, (Boolean) obj);
            }
        });
        y().n().j(getViewLifecycleOwner(), new q0() { // from class: fh.e
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                h.F(this.f38675a, (Boolean) obj);
            }
        });
        y().o().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: fh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.G(this.f38676a, ((Integer) obj).intValue());
            }
        }));
        return pVarJ.B();
    }

    protected abstract j y();

    public abstract String z();
}
