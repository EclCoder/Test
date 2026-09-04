package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.e1;
import com.pairip.VMRunner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14817d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AuthenticationTokenManager f14818e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.a f14819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f14820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f14821c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfl/g0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("s7EE5o60g3E6ob6n", new Object[]{this, context, intent});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f14818e;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f14818e;
                if (authenticationTokenManager == null) {
                    s1.a aVarB = s1.a.b(h0.m());
                    kotlin.jvm.internal.s.g(aVarB, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(aVarB, new o());
                    AuthenticationTokenManager.f14818e = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }

        public a() {
        }
    }

    public AuthenticationTokenManager(s1.a localBroadcastManager, o authenticationTokenCache) {
        kotlin.jvm.internal.s.h(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.s.h(authenticationTokenCache, "authenticationTokenCache");
        this.f14819a = localBroadcastManager;
        this.f14820b = authenticationTokenCache;
    }

    private final void d(n nVar, n nVar2) {
        Intent intent = new Intent(h0.m(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", nVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", nVar2);
        this.f14819a.d(intent);
    }

    private final void f(n nVar, boolean z10) {
        n nVarC = c();
        this.f14821c = nVar;
        if (z10) {
            if (nVar != null) {
                this.f14820b.b(nVar);
            } else {
                this.f14820b.a();
                e1.i(h0.m());
            }
        }
        if (e1.e(nVarC, nVar)) {
            return;
        }
        d(nVarC, nVar);
    }

    public final n c() {
        return this.f14821c;
    }

    public final void e(n nVar) {
        f(nVar, true);
    }
}
