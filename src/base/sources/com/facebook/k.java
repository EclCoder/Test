package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.e1;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15515f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static k f15516g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.a f15517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.facebook.b f15518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.facebook.a f15519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f15521e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j0 c(com.facebook.a aVar, j0.b bVar) {
            e eVarF = f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarF.a());
            bundle.putString("client_id", aVar.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            j0 j0VarX = j0.f15486n.x(aVar, eVarF.b(), bVar);
            j0VarX.G(bundle);
            j0VarX.F(p0.GET);
            return j0VarX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j0 d(com.facebook.a aVar, j0.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            j0 j0VarX = j0.f15486n.x(aVar, "me/permissions", bVar);
            j0VarX.G(bundle);
            j0VarX.F(p0.GET);
            return j0VarX;
        }

        private final e f(com.facebook.a aVar) {
            String strJ = aVar.j();
            if (strJ == null) {
                strJ = "facebook";
            }
            return kotlin.jvm.internal.s.c(strJ, "instagram") ? new c() : new b();
        }

        public final k e() {
            k kVar;
            k kVar2 = k.f15516g;
            if (kVar2 != null) {
                return kVar2;
            }
            synchronized (this) {
                kVar = k.f15516g;
                if (kVar == null) {
                    s1.a aVarB = s1.a.b(h0.m());
                    kotlin.jvm.internal.s.g(aVarB, "getInstance(applicationContext)");
                    k kVar3 = new k(aVarB, new com.facebook.b());
                    k.f15516g = kVar3;
                    kVar = kVar3;
                }
            }
            return kVar;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15522a = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15523b = "fb_extend_sso_token";

        @Override // com.facebook.k.e
        public String a() {
            return this.f15523b;
        }

        @Override // com.facebook.k.e
        public String b() {
            return this.f15522a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15524a = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15525b = "ig_refresh_token";

        @Override // com.facebook.k.e
        public String a() {
            return this.f15525b;
        }

        @Override // com.facebook.k.e
        public String b() {
            return this.f15524a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f15529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f15530e;

        public final String a() {
            return this.f15526a;
        }

        public final Long b() {
            return this.f15529d;
        }

        public final int c() {
            return this.f15527b;
        }

        public final int d() {
            return this.f15528c;
        }

        public final String e() {
            return this.f15530e;
        }

        public final void f(String str) {
            this.f15526a = str;
        }

        public final void g(Long l10) {
            this.f15529d = l10;
        }

        public final void h(int i10) {
            this.f15527b = i10;
        }

        public final void i(int i10) {
            this.f15528c = i10;
        }

        public final void j(String str) {
            this.f15530e = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        String a();

        String b();
    }

    public k(s1.a localBroadcastManager, com.facebook.b accessTokenCache) {
        kotlin.jvm.internal.s.h(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.s.h(accessTokenCache, "accessTokenCache");
        this.f15517a = localBroadcastManager;
        this.f15518b = accessTokenCache;
        this.f15520d = new AtomicBoolean(false);
        this.f15521e = new Date(0L);
    }

    public static final void A() {
        com.facebook.appevents.m.n(com.facebook.appevents.l0.EAGER_FLUSHING_EVENT);
    }

    private final void B() {
        Context contextM = h0.m();
        com.facebook.a.c cVar = com.facebook.a.f14853l;
        com.facebook.a aVarE = cVar.e();
        AlarmManager alarmManager = (AlarmManager) contextM.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (cVar.g()) {
            if ((aVarE != null ? aVarE.i() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextM, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, aVarE.i().getTime(), PendingIntent.getBroadcast(contextM, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean C() {
        com.facebook.a aVarM = m();
        if (aVarM == null) {
            return false;
        }
        long time = new Date().getTime();
        return aVarM.o().g() && time - this.f15521e.getTime() > 3600000 && time - aVarM.l().getTime() > com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS;
    }

    public static final void p(k this$0, com.facebook.a.InterfaceC0259a interfaceC0259a) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.q(interfaceC0259a);
    }

    private final void q(final com.facebook.a.InterfaceC0259a interfaceC0259a) {
        final com.facebook.a aVarM = m();
        if (aVarM == null) {
            if (interfaceC0259a != null) {
                interfaceC0259a.a(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.f15520d.compareAndSet(false, true)) {
            if (interfaceC0259a != null) {
                interfaceC0259a.a(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.f15521e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        final j0.b bVar = new j0.b() { // from class: com.facebook.e
            @Override // com.facebook.j0.b
            public final void a(o0 o0Var) {
                k.r(atomicBoolean, hashSet, hashSet2, hashSet3, o0Var);
            }
        };
        final j0.b bVar2 = new j0.b() { // from class: com.facebook.f
            @Override // com.facebook.j0.b
            public final void a(o0 o0Var) {
                k.s(dVar, o0Var);
            }
        };
        final Runnable runnable = new Runnable(aVarM, interfaceC0259a, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: com.facebook.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f15069b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f15070c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Set f15071d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Set f15072e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Set f15073f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ k f15074g;

            {
                this.f15070c = atomicBoolean;
                this.f15071d = hashSet;
                this.f15072e = hashSet2;
                this.f15073f = hashSet3;
                this.f15074g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                k.t(this.f15068a, this.f15069b, null, this.f15070c, this.f15071d, this.f15072e, this.f15073f, this.f15074g);
            }
        };
        a aVar = f15515f;
        j0 j0VarD = aVar.d(aVarM, bVar);
        j0 j0VarC = aVar.c(aVarM, bVar2);
        if (!kotlin.jvm.internal.s.c(aVarM.j(), "gaming")) {
            n0 n0Var = new n0(j0VarD, j0VarC);
            n0Var.d(new n0.a() { // from class: com.facebook.j
                @Override // com.facebook.n0.a
                public final void a(n0 n0Var2) {
                    k.w(runnable, n0Var2);
                }
            });
            n0Var.h();
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        j0.b bVar3 = new j0.b() { // from class: com.facebook.h
            @Override // com.facebook.j0.b
            public final void a(o0 o0Var) {
                k.u(bVar, atomicInteger, runnable, o0Var);
            }
        };
        j0.b bVar4 = new j0.b() { // from class: com.facebook.i
            @Override // com.facebook.j0.b
            public final void a(o0 o0Var) {
                k.v(bVar2, atomicInteger, runnable, o0Var);
            }
        };
        j0VarD.C(bVar3);
        j0VarC.C(bVar4);
        j0VarD.l();
        j0VarC.l();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a1, please report this as an issue */
    public static final void r(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, o0 response) {
        JSONArray jSONArrayOptJSONArray;
        kotlin.jvm.internal.s.h(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.s.h(permissions, "$permissions");
        kotlin.jvm.internal.s.h(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.s.h(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.s.h(response, "response");
        JSONObject jSONObjectD = response.d();
        if (jSONObjectD == null || (jSONArrayOptJSONArray = jSONObjectD.optJSONArray(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String status = jSONObjectOptJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                if (!e1.e0(strOptString) && !e1.e0(status)) {
                    kotlin.jvm.internal.s.g(status, "status");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.s.g(US, "US");
                    String status2 = status.toLowerCase(US);
                    kotlin.jvm.internal.s.g(status2, "this as java.lang.String).toLowerCase(locale)");
                    kotlin.jvm.internal.s.g(status2, "status");
                    int iHashCode = status2.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(strOptString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + status2);
                            }
                        } else if (status2.equals("granted")) {
                            permissions.add(strOptString);
                        } else {
                            Log.w("AccessTokenManager", "Unexpected status: " + status2);
                        }
                    } else if (status2.equals("expired")) {
                        expiredPermissions.add(strOptString);
                    } else {
                        Log.w("AccessTokenManager", "Unexpected status: " + status2);
                    }
                }
            }
        }
    }

    public static final void s(d refreshResult, o0 response) {
        kotlin.jvm.internal.s.h(refreshResult, "$refreshResult");
        kotlin.jvm.internal.s.h(response, "response");
        JSONObject jSONObjectD = response.d();
        if (jSONObjectD == null) {
            return;
        }
        refreshResult.f(jSONObjectD.optString("access_token"));
        refreshResult.h(jSONObjectD.optInt("expires_at"));
        refreshResult.i(jSONObjectD.optInt("expires_in"));
        refreshResult.g(Long.valueOf(jSONObjectD.optLong("data_access_expiration_time")));
        refreshResult.j(jSONObjectD.optString("graph_domain", null));
    }

    public static final void t(d refreshResult, com.facebook.a aVar, com.facebook.a.InterfaceC0259a interfaceC0259a, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, k this$0) throws Throwable {
        boolean z10;
        com.facebook.a aVar2;
        a aVar3;
        kotlin.jvm.internal.s.h(refreshResult, "$refreshResult");
        kotlin.jvm.internal.s.h(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.s.h(permissions, "$permissions");
        kotlin.jvm.internal.s.h(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.s.h(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.s.h(this$0, "this$0");
        String strA = refreshResult.a();
        int iC = refreshResult.c();
        Long lB = refreshResult.b();
        String strE = refreshResult.e();
        try {
            a aVar4 = f15515f;
            if (aVar4.e().m() != null) {
                try {
                    com.facebook.a aVarM = aVar4.e().m();
                    if ((aVarM != null ? aVarM.q() : null) == aVar.q()) {
                        if (!permissionsCallSucceeded.get() && strA == null && iC == 0) {
                            if (interfaceC0259a != null) {
                                interfaceC0259a.a(new FacebookException("Failed to refresh access token"));
                            }
                            this$0.f15520d.set(false);
                            return;
                        }
                        Date dateI = aVar.i();
                        if (refreshResult.c() != 0) {
                            aVar3 = aVar4;
                            dateI = new Date(((long) refreshResult.c()) * 1000);
                        } else {
                            aVar3 = aVar4;
                            if (refreshResult.d() != 0) {
                                dateI = new Date((((long) refreshResult.d()) * 1000) + new Date().getTime());
                            }
                        }
                        Date date = dateI;
                        if (strA == null) {
                            strA = aVar.p();
                        }
                        String str = strA;
                        String strC = aVar.c();
                        String strQ = aVar.q();
                        Set setN = permissionsCallSucceeded.get() ? permissions : aVar.n();
                        Set setF = permissionsCallSucceeded.get() ? declinedPermissions : aVar.f();
                        Set setG = permissionsCallSucceeded.get() ? expiredPermissions : aVar.g();
                        l lVarO = aVar.o();
                        Date date2 = new Date();
                        Date date3 = lB != null ? new Date(lB.longValue() * 1000) : aVar.e();
                        if (strE == null) {
                            strE = aVar.j();
                        }
                        aVar2 = new com.facebook.a(str, strC, strQ, setN, setF, setG, lVarO, date, date2, date3, strE);
                        try {
                            aVar3.e().y(aVar2);
                            this$0.f15520d.set(false);
                            if (interfaceC0259a != null) {
                                interfaceC0259a.b(aVar2);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            this$0.f15520d.set(z10);
                            if (interfaceC0259a != null && aVar2 != null) {
                                interfaceC0259a.b(aVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                    aVar2 = null;
                    this$0.f15520d.set(z10);
                    if (interfaceC0259a != null) {
                        interfaceC0259a.b(aVar2);
                    }
                    throw th;
                }
            }
            if (interfaceC0259a != null) {
                interfaceC0259a.a(new FacebookException("No current access token to refresh"));
            }
            this$0.f15520d.set(false);
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
    }

    public static final void u(j0.b permissionsCallback, AtomicInteger completedCount, Runnable onAllCompleted, o0 response) {
        kotlin.jvm.internal.s.h(permissionsCallback, "$permissionsCallback");
        kotlin.jvm.internal.s.h(completedCount, "$completedCount");
        kotlin.jvm.internal.s.h(onAllCompleted, "$onAllCompleted");
        kotlin.jvm.internal.s.h(response, "response");
        permissionsCallback.a(response);
        if (completedCount.incrementAndGet() == 2) {
            onAllCompleted.run();
        }
    }

    public static final void v(j0.b extendCallback, AtomicInteger completedCount, Runnable onAllCompleted, o0 response) {
        kotlin.jvm.internal.s.h(extendCallback, "$extendCallback");
        kotlin.jvm.internal.s.h(completedCount, "$completedCount");
        kotlin.jvm.internal.s.h(onAllCompleted, "$onAllCompleted");
        kotlin.jvm.internal.s.h(response, "response");
        extendCallback.a(response);
        if (completedCount.incrementAndGet() == 2) {
            onAllCompleted.run();
        }
    }

    public static final void w(Runnable onAllCompleted, n0 it) {
        kotlin.jvm.internal.s.h(onAllCompleted, "$onAllCompleted");
        kotlin.jvm.internal.s.h(it, "it");
        onAllCompleted.run();
    }

    private final void x(com.facebook.a aVar, com.facebook.a aVar2) {
        Intent intent = new Intent(h0.m(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f15517a.d(intent);
    }

    private final void z(com.facebook.a aVar, boolean z10) {
        com.facebook.a aVar2 = this.f15519c;
        String strQ = aVar2 != null ? aVar2.q() : null;
        String strQ2 = aVar != null ? aVar.q() : null;
        if (strQ != null && !kotlin.jvm.internal.s.c(strQ, strQ2)) {
            h0.v().execute(new Runnable() { // from class: com.facebook.c
                @Override // java.lang.Runnable
                public final void run() {
                    k.A();
                }
            });
        }
        this.f15519c = aVar;
        this.f15520d.set(false);
        this.f15521e = new Date(0L);
        if (z10) {
            if (aVar != null) {
                this.f15518b.g(aVar);
            } else {
                this.f15518b.a();
                e1.i(h0.m());
            }
        }
        if (e1.e(aVar2, aVar)) {
            return;
        }
        x(aVar2, aVar);
        B();
    }

    public final void k() {
        x(m(), m());
    }

    public final void l() {
        if (C()) {
            o(null);
        }
    }

    public final com.facebook.a m() {
        return this.f15519c;
    }

    public final boolean n() {
        com.facebook.a aVarF = this.f15518b.f();
        if (aVarF == null) {
            return false;
        }
        z(aVarF, false);
        return true;
    }

    public final void o(final com.facebook.a.InterfaceC0259a interfaceC0259a) {
        if (kotlin.jvm.internal.s.c(Looper.getMainLooper(), Looper.myLooper())) {
            q(interfaceC0259a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(interfaceC0259a) { // from class: com.facebook.d
                @Override // java.lang.Runnable
                public final void run() {
                    k.p(this.f15062a, null);
                }
            });
        }
    }

    public final void y(com.facebook.a aVar) {
        z(aVar, true);
    }
}
