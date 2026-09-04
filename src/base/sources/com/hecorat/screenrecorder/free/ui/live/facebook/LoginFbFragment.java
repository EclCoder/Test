package com.hecorat.screenrecorder.free.ui.live.facebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.facebook.FacebookException;
import com.facebook.login.f0;
import com.facebook.login.h0;
import com.facebook.r;
import com.facebook.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import gh.q;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import nh.j0;
import nh.l0;
import y3.e1;
import y3.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/facebook/LoginFbFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", CampaignEx.JSON_KEY_AD_Q, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "", "loginType", "s", "(Ljava/lang/String;)V", "Lcom/facebook/r;", "a", "Lcom/facebook/r;", "callbackManager", "Lcom/facebook/login/f0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/facebook/login/f0;", "loginManager", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginFbFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private r callbackManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f0 loginManager;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements u {
        a() {
        }

        @Override // com.facebook.u
        public void a(FacebookException error) {
            s.h(error, "error");
            if (l0.f47742a.k()) {
                j0.b(AzRecorderApp.e().getApplicationContext(), R.string.toast_live_login_fall);
            } else {
                j0.b(AzRecorderApp.e().getApplicationContext(), R.string.toast_error_get_internet);
            }
            androidx.fragment.app.s activity = LoginFbFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // com.facebook.u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h0 result) {
            s.h(result, "result");
            LoginFbFragment.this.s("manually");
            g0 g0VarA = androidx.navigation.fragment.a.a(LoginFbFragment.this);
            e1 e1VarA = q.a();
            s.g(e1VarA, "actionLoginFbFragmentToLiveFacebookFragment(...)");
            g0VarA.K(e1VarA);
        }

        @Override // com.facebook.u
        public void onCancel() {
            j0.b(AzRecorderApp.e().getApplicationContext(), R.string.toast_live_login_cancel);
            androidx.fragment.app.s activity = LoginFbFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private final void q() {
        f0 f0VarC = f0.f15590j.c();
        this.loginManager = f0VarC;
        if (f0VarC != null) {
            f0VarC.u();
        }
        f0 f0Var = this.loginManager;
        if (f0Var != null) {
            f0Var.z(this.callbackManager, new a());
        }
        f0 f0Var2 = this.loginManager;
        if (f0Var2 != null) {
            List listAsList = Arrays.asList("publish_video", "manage_pages", "publish_pages");
            s.g(listAsList, "asList(...)");
            f0Var2.s(this, listAsList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        r rVar = this.callbackManager;
        if (rVar != null) {
            rVar.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.h(inflater, "inflater");
        this.callbackManager = r.b.a();
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        if (aVarE == null || aVarE.s()) {
            q();
        } else {
            s("automatically");
            g0 g0VarA = androidx.navigation.fragment.a.a(this);
            e1 e1VarA = q.a();
            s.g(e1VarA, "actionLoginFbFragmentToLiveFacebookFragment(...)");
            g0VarA.K(e1VarA);
        }
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    public final void s(String loginType) {
        s.h(loginType, NhHRaDJCHtCTJR.GIqxmideRiplPK);
        Context context = getContext();
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putString("platform", "facebook");
            bundle.putString("signin_type", loginType);
            FirebaseAnalytics.getInstance(context).a("signin_success_livestream", bundle);
        }
    }
}
