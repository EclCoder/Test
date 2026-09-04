package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.f1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BroadcastReceiver f16076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.a f16077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16078c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(intent, "intent");
            if (kotlin.jvm.internal.s.c("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED", intent.getAction())) {
                v0.this.c((s0) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE"), (s0) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE"));
            }
        }
    }

    public v0() {
        f1.o();
        this.f16076a = new a();
        s1.a aVarB = s1.a.b(h0.m());
        kotlin.jvm.internal.s.g(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.f16077b = aVarB;
        d();
    }

    private final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        this.f16077b.c(this.f16076a, intentFilter);
    }

    public final boolean b() {
        return this.f16078c;
    }

    protected abstract void c(s0 s0Var, s0 s0Var2);

    public final void d() {
        if (this.f16078c) {
            return;
        }
        a();
        this.f16078c = true;
    }

    public final void e() {
        if (this.f16078c) {
            this.f16077b.e(this.f16076a);
            this.f16078c = false;
        }
    }
}
