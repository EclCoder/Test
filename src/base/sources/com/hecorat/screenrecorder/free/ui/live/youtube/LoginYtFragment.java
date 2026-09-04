package com.hecorat.screenrecorder.free.ui.live.youtube;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import bg.o;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.Scopes;
import com.google.api.services.youtube.YouTubeScopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.ui.live.youtube.LoginYtFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import em.k;
import em.o0;
import em.s1;
import fl.g0;
import fl.s;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.m;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.c;
import net.openid.appauth.e;
import net.openid.appauth.f;
import net.openid.appauth.g;
import net.openid.appauth.n;
import nh.j0;
import rf.d;
import y3.e1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/youtube/LoginYtFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", "E", "H", "Landroid/content/Intent;", "intent", "C", "(Landroid/content/Intent;)V", "", "loginType", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Ljava/lang/String;)V", "F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "", "requestCode", "resultCode", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "a", "I", "RC_AUTH", "Lnet/openid/appauth/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lnet/openid/appauth/c;", "authState", "Lnet/openid/appauth/f;", "c", "Lnet/openid/appauth/f;", "authService", "Llg/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llg/a;", "getPreferenceManager", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lrf/d;", "e", "Lrf/d;", "getLiveYtRepository", "()Lrf/d;", "setLiveYtRepository", "(Lrf/d;)V", "liveYtRepository", "Lbg/a;", "f", "Lbg/a;", "A", "()Lbg/a;", "setGetAuthStateUseCase", "(Lbg/a;)V", "getAuthStateUseCase", "Lbg/o;", "g", "Lbg/o;", "B", "()Lbg/o;", "setSetAuthStateUseCase", "(Lbg/o;)V", "setAuthStateUseCase", "", "h", "Z", "sentAuthIntent", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginYtFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int RC_AUTH = 1111;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public c authState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public f authService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public d liveYtRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public bg.a getAuthStateUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public o setAuthStateUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean sentAuthIntent;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23174r;

        public a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return LoginYtFragment.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23174r;
            if (i10 == 0) {
                s.b(obj);
                o oVarB = LoginYtFragment.this.B();
                c cVar = LoginYtFragment.this.authState;
                kotlin.jvm.internal.s.e(cVar);
                this.f23174r = 1;
                if (oVarB.b(cVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f23176r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f23177s;

        public b(kl.f fVar) {
            super(2, fVar);
        }

        public static final void k(LoginYtFragment loginYtFragment, String str, String str2, AuthorizationException authorizationException) {
            if (authorizationException != null) {
                loginYtFragment.H();
            } else {
                loginYtFragment.G("automatically");
                loginYtFragment.F();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return LoginYtFragment.this.new b(fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LoginYtFragment loginYtFragment;
            Object objF = ll.b.f();
            int i10 = this.f23177s;
            if (i10 == 0) {
                s.b(obj);
                LoginYtFragment loginYtFragment2 = LoginYtFragment.this;
                bg.a aVarA = loginYtFragment2.A();
                g0 g0Var = g0.f38750a;
                this.f23176r = loginYtFragment2;
                this.f23177s = 1;
                Object objB = aVarA.b(g0Var, this);
                if (objB == objF) {
                    return objF;
                }
                loginYtFragment = loginYtFragment2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                loginYtFragment = (LoginYtFragment) this.f23176r;
                s.b(obj);
            }
            g0 g0Var2 = null;
            loginYtFragment.authState = (c) wg.d.b((wg.c) obj, null);
            c cVar = LoginYtFragment.this.authState;
            if (cVar != null && cVar.k()) {
                c cVar2 = LoginYtFragment.this.authState;
                if (cVar2 == null || !cVar2.i()) {
                    LoginYtFragment.this.G("automatically");
                    LoginYtFragment.this.F();
                } else {
                    f fVar = LoginYtFragment.this.authService;
                    if (fVar != null) {
                        final LoginYtFragment loginYtFragment3 = LoginYtFragment.this;
                        c cVar3 = loginYtFragment3.authState;
                        if (cVar3 != null) {
                            cVar3.p(fVar, new c.b() { // from class: com.hecorat.screenrecorder.free.ui.live.youtube.a
                                @Override // net.openid.appauth.c.b
                                public final void a(String str, String str2, AuthorizationException authorizationException) {
                                    LoginYtFragment.b.k(loginYtFragment3, str, str2, authorizationException);
                                }
                            });
                            g0Var2 = g0.f38750a;
                        }
                        if (g0Var2 == null) {
                            LoginYtFragment.this.H();
                        }
                    } else {
                        LoginYtFragment.this.H();
                    }
                }
            } else if (!LoginYtFragment.this.sentAuthIntent) {
                LoginYtFragment.this.sentAuthIntent = true;
                LoginYtFragment.this.H();
            }
            return g0.f38750a;
        }
    }

    private final void C(Intent intent) {
        e eVarD = e.d(intent);
        AuthorizationException authorizationExceptionH = AuthorizationException.h(intent);
        if (eVarD == null) {
            androidx.fragment.app.s activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        c cVar = new c(eVarD, authorizationExceptionH);
        this.authState = cVar;
        kotlin.jvm.internal.s.e(cVar);
        wp.a.a("Handled Authorization Response %s ", cVar.o());
        f fVar = this.authService;
        if (fVar != null) {
            fVar.e(eVarD.b(), new f.b() { // from class: jh.m
                @Override // net.openid.appauth.f.b
                public final void a(net.openid.appauth.n nVar, AuthorizationException authorizationException) {
                    LoginYtFragment.D(this.f42548a, nVar, authorizationException);
                }
            });
        }
    }

    public static final void D(LoginYtFragment loginYtFragment, n nVar, AuthorizationException authorizationException) {
        if (authorizationException != null) {
            j0.b(loginYtFragment.getActivity(), R.string.live_authorization_failed);
            androidx.fragment.app.s activity = loginYtFragment.getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (nVar != null) {
            loginYtFragment.G("manually");
            c cVar = loginYtFragment.authState;
            kotlin.jvm.internal.s.e(cVar);
            cVar.s(nVar, null);
            k.d(s1.f38055a, null, null, loginYtFragment.new a(null), 3, null);
            loginYtFragment.F();
        }
    }

    private final void E() {
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        k.d(c0.a(viewLifecycleOwner), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        y3.g0 g0VarA = androidx.navigation.fragment.a.a(this);
        e1 e1VarA = jh.n.a();
        kotlin.jvm.internal.s.g(e1VarA, "actionLoginYtFragmentToLiveYtFragment(...)");
        g0VarA.K(e1VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String loginType) {
        Context context = getContext();
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putString("platform", "youtube");
            bundle.putString("signin_type", loginType);
            FirebaseAnalytics.getInstance(context).a("signin_success_livestream", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        net.openid.appauth.d.b bVar = new net.openid.appauth.d.b(new g(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token"), null), "544061412085-id0qm29omoi9letd5c8kknbrspfelkme.apps.googleusercontent.com", "code", Uri.parse("com.hecorat.screenrecorder.free:/oauth2callback"));
        bVar.o(Scopes.PROFILE, "email", YouTubeScopes.YOUTUBE);
        net.openid.appauth.d dVarA = bVar.a();
        kotlin.jvm.internal.s.g(dVarA, "build(...)");
        try {
            f fVar = this.authService;
            Intent intentC = fVar != null ? fVar.c(dVarA) : null;
            if (intentC != null) {
                startActivityForResult(intentC, this.RC_AUTH);
            }
        } catch (ActivityNotFoundException e10) {
            j0.b(requireContext(), R.string.error_live_yt_not_supported_browser);
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            androidx.fragment.app.s activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final bg.a A() {
        bg.a aVar = this.getAuthStateUseCase;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("getAuthStateUseCase");
        return null;
    }

    public final o B() {
        o oVar = this.setAuthStateUseCase;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.s.w("setAuthStateUseCase");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != this.RC_AUTH || data == null) {
            return;
        }
        C(data);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.authService = new f(requireActivity());
        E();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.s.h(context, qEagQqzJZsd.XHPH);
        super.onAttach(context);
        AzRecorderApp.d().g().a().d(this);
    }
}
