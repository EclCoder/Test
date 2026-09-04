package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 I2\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J)\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010.\u001a\u00020\bH\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u0010\u0003R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188\u0006@BX\u0086.¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001aR0\u0010B\u001a\b\u0012\u0004\u0012\u00020(0=2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=8\u0006@BX\u0086.¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/facebook/login/a0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/fragment/app/s;", "activity", "Lkotlin/Function1;", "Lf/a;", "Lfl/g0;", "z", "(Landroidx/fragment/app/s;)Lkotlin/jvm/functions/Function1;", "Lcom/facebook/login/w$f;", "outcome", "E", "(Lcom/facebook/login/w$f;)V", "H", "A", "Landroid/app/Activity;", "B", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/facebook/login/w;", "v", "()Lcom/facebook/login/w;", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "F", "", "a", "Ljava/lang/String;", "callingPackage", "Lcom/facebook/login/w$e;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/facebook/login/w$e;", com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, "<set-?>", "c", "Lcom/facebook/login/w;", "y", "loginClient", "Lf/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lf/c;", "w", "()Lf/c;", "launcher", "e", "Landroid/view/View;", "progressBar", "x", "()I", "layoutResId", "f", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String callingPackage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private w.e request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private w loginClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f.c launcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private View progressBar;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.s f15557b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.s sVar) {
            super(1);
            this.f15557b = sVar;
        }

        public final void a(f.a result) {
            kotlin.jvm.internal.s.h(result, "result");
            if (result.b() == -1) {
                a0.this.y().A(w.f15766m.b(), result.b(), result.a());
            } else {
                this.f15557b.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f.a) obj);
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements w.a {
        c() {
        }

        @Override // com.facebook.login.w.a
        public void a() {
            a0.this.H();
        }

        @Override // com.facebook.login.w.a
        public void b() {
            a0.this.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.s.w("progressBar");
            view = null;
        }
        view.setVisibility(8);
        F();
    }

    private final void B(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(a0 this$0, w.f outcome) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(outcome, "outcome");
        this$0.E(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(Function1 tmp0, f.a aVar) {
        kotlin.jvm.internal.s.h(tmp0, "$tmp0");
        tmp0.invoke(aVar);
    }

    private final void E(w.f outcome) {
        this.request = null;
        int i10 = outcome.f15804a == w.f.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.s activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.s.w("progressBar");
            view = null;
        }
        view.setVisibility(0);
        G();
    }

    private final Function1 z(androidx.fragment.app.s activity) {
        return new b(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        y().A(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        w wVarV = savedInstanceState != null ? (w) savedInstanceState.getParcelable("loginClient") : null;
        if (wVarV != null) {
            wVarV.C(this);
        } else {
            wVarV = v();
        }
        this.loginClient = wVarV;
        y().D(new w.d() { // from class: com.facebook.login.y
            @Override // com.facebook.login.w.d
            public final void a(w.f fVar) {
                a0.C(this.f15917a, fVar);
            }
        });
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        B(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.request = (w.e) bundleExtra.getParcelable(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA);
        }
        g.f fVar = new g.f();
        final Function1 function1Z = z(activity);
        f.c cVarRegisterForActivityResult = registerForActivityResult(fVar, new f.b() { // from class: com.facebook.login.z
            @Override // f.b
            public final void a(Object obj) {
                a0.D(function1Z, (f.a) obj);
            }
        });
        kotlin.jvm.internal.s.g(cVarRegisterForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.launcher = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        View viewInflate = inflater.inflate(x(), container, false);
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.c.f15045d);
        kotlin.jvm.internal.s.g(viewFindViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.progressBar = viewFindViewById;
        y().B(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        y().e();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(com.facebook.common.c.f15045d) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            y().E(this.request);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.s.h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", y());
    }

    protected w v() {
        return new w(this);
    }

    public final f.c w() {
        f.c cVar = this.launcher;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.s.w("launcher");
        return null;
    }

    protected int x() {
        return com.facebook.common.d.f15050c;
    }

    public final w y() {
        w wVar = this.loginClient;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.s.w("loginClient");
        return null;
    }

    protected void F() {
    }

    protected void G() {
    }
}
