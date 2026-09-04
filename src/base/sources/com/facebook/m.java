package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15919d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15920e = m.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BroadcastReceiver f15921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.a f15922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15923c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(intent, "intent");
            if (kotlin.jvm.internal.s.c("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                e1.l0(m.f15920e, "AccessTokenChanged");
                m.this.d((com.facebook.a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (com.facebook.a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public m() {
        f1.o();
        this.f15921a = new b();
        s1.a aVarB = s1.a.b(h0.m());
        kotlin.jvm.internal.s.g(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.f15922b = aVarB;
        e();
    }

    private final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f15922b.c(this.f15921a, intentFilter);
    }

    public final boolean c() {
        return this.f15923c;
    }

    protected abstract void d(com.facebook.a aVar, com.facebook.a aVar2);

    public final void e() {
        if (this.f15923c) {
            return;
        }
        b();
        this.f15923c = true;
    }

    public final void f() {
        if (this.f15923c) {
            this.f15922b.e(this.f15921a);
            this.f15923c = false;
        }
    }
}
