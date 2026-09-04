package wf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.j0;
import tf.s2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f56208g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s2 f56210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f56211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lg.a f56212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FirebaseAnalytics f56213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnClickListener f56214f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h0(String actionSource) {
        kotlin.jvm.internal.s.h(actionSource, "actionSource");
        this.f56209a = actionSource;
        this.f56214f = new View.OnClickListener() { // from class: wf.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h0.u(this.f56205a, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(h0 h0Var, View view) {
        lf.n.a aVar;
        int id2 = view.getId();
        if (id2 == R.id.close_btn) {
            h0Var.x("close");
            Dialog dialog = h0Var.getDialog();
            if (dialog != null) {
                dialog.dismiss();
                return;
            }
            return;
        }
        if (id2 == R.id.upgrade_btn) {
            h0Var.x("show_upgrade");
            h0Var.z();
            Dialog dialog2 = h0Var.getDialog();
            if (dialog2 != null) {
                dialog2.dismiss();
                return;
            }
            return;
        }
        if (id2 != R.id.watch_ads_btn) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - h0Var.f56211c < 1200) {
            return;
        }
        h0Var.f56211c = jElapsedRealtime;
        String str = h0Var.f56209a;
        if (kotlin.jvm.internal.s.c(str, "compress_video")) {
            aVar = lf.n.a.COMPRESS;
        } else {
            aVar = kotlin.jvm.internal.s.c(str, "auto_caption") ? lf.n.a.AUTO_CAPTION : lf.n.a.REMOVE_WATERMARK;
        }
        lf.n nVarA = lf.n.f44484g.a(aVar);
        if (!nVarA.j()) {
            h0Var.x("watch_ads_unavailable");
            j0.b(h0Var.getContext(), R.string.rewarded_video_not_available);
            nVarA.m();
            return;
        }
        h0Var.x("watch_ads");
        androidx.fragment.app.s activity = h0Var.getActivity();
        if (activity != null) {
            nVarA.p(activity);
        } else {
            wp.a.d("Activity is null; cannot show ad", new Object[0]);
        }
        Dialog dialog3 = h0Var.getDialog();
        if (dialog3 != null) {
            dialog3.dismiss();
        }
    }

    private final void x(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str);
        w().a("upgrade_or_watch_ads", bundle);
    }

    private final void z() {
        Intent intent = new Intent(getContext(), (Class<?>) UpgradeActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("action_source", this.f56209a);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().p(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        if (getActivity() != null) {
            y((s2) androidx.databinding.g.h(requireActivity().getLayoutInflater(), R.layout.dialog_upgrade_or_watch_ads, null, false));
            v().A.setOnClickListener(this.f56214f);
            v().B.setOnClickListener(this.f56214f);
            v().D.setOnClickListener(this.f56214f);
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.TransparentDialogTheme);
            builder.setView(v().B());
            AlertDialog alertDialogCreate = builder.create();
            if (alertDialogCreate != null) {
                return alertDialogCreate;
            }
        }
        throw new IllegalStateException("Activity cannot be null");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        Window window2;
        super.onResume();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window2 = dialog.getWindow()) == null) ? null : window2.getAttributes();
        if (attributes != null) {
            ((ViewGroup.LayoutParams) attributes).width = getResources().getDimensionPixelSize(R.dimen.dialog_min_width);
        }
        if (attributes != null) {
            ((ViewGroup.LayoutParams) attributes).height = -2;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setAttributes(attributes);
    }

    public final s2 v() {
        s2 s2Var = this.f56210b;
        if (s2Var != null) {
            return s2Var;
        }
        kotlin.jvm.internal.s.w("binding");
        return null;
    }

    public final FirebaseAnalytics w() {
        FirebaseAnalytics firebaseAnalytics = this.f56213e;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        kotlin.jvm.internal.s.w("firebaseAnalytics");
        return null;
    }

    public final void y(s2 s2Var) {
        kotlin.jvm.internal.s.h(s2Var, giNWGaNAgVQoO.pGnwJJEtJ);
        this.f56210b = s2Var;
    }
}
