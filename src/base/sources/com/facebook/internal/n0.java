package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f15327a = new n0();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f15328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f15329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f15330c;

        b(InstallReferrerClient installReferrerClient, a aVar, CountDownLatch countDownLatch) {
            this.f15328a = installReferrerClient;
            this.f15329b = aVar;
            this.f15330c = countDownLatch;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void a(int i10) {
            CountDownLatch countDownLatch;
            if (x7.a.c(this)) {
                return;
            }
            try {
                try {
                    if (i10 == 0) {
                        try {
                            ReferrerDetails referrerDetailsB = this.f15328a.b();
                            kotlin.jvm.internal.s.g(referrerDetailsB, "{\n                      …r\n                      }");
                            String strA = referrerDetailsB.a();
                            if (strA != null && (bm.r.T(strA, "fb", false, 2, null) || bm.r.T(strA, "facebook", false, 2, null))) {
                                this.f15329b.a(strA);
                            }
                            n0.f15327a.f();
                        } catch (RemoteException unused) {
                            countDownLatch = this.f15330c;
                            if (countDownLatch == null) {
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        n0.f15327a.f();
                    }
                    try {
                        this.f15328a.a();
                    } catch (Exception unused2) {
                    }
                    countDownLatch = this.f15330c;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.countDown();
                } catch (Throwable th2) {
                    CountDownLatch countDownLatch2 = this.f15330c;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void b() {
            CountDownLatch countDownLatch = this.f15330c;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private n0() {
    }

    private final boolean b() {
        return com.facebook.h0.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar, CountDownLatch countDownLatch) {
        InstallReferrerClient installReferrerClientA = InstallReferrerClient.c(com.facebook.h0.m()).a();
        try {
            installReferrerClientA.d(new b(installReferrerClientA, aVar, countDownLatch));
        } catch (Exception unused) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    static /* synthetic */ void d(n0 n0Var, a aVar, CountDownLatch countDownLatch, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            countDownLatch = null;
        }
        n0Var.c(aVar, countDownLatch);
    }

    public static final void e(a callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        n0 n0Var = f15327a;
        if (n0Var.b()) {
            return;
        }
        d(n0Var, callback, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        com.facebook.h0.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
