package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f15144c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15143b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f15145d = "com.parse.bolts.measurement_event";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            if (c.a() != null) {
                return c.a();
            }
            c cVar = new c(context, null);
            c.b(cVar);
            c.c(cVar);
            return c.a();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ c a() {
        if (x7.a.c(c.class)) {
            return null;
        }
        try {
            return f15144c;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(c cVar) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            cVar.e();
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    public static final /* synthetic */ void c(c cVar) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            f15144c = cVar;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }

    private final void d() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s1.a aVarB = s1.a.b(this.f15146a);
            kotlin.jvm.internal.s.g(aVarB, "getInstance(applicationContext)");
            aVarB.e(this);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void e() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s1.a aVarB = s1.a.b(this.f15146a);
            kotlin.jvm.internal.s.g(aVarB, "getInstance(applicationContext)");
            aVarB.c(this, new IntentFilter(f15145d));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void finalize() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            com.facebook.appevents.o0 o0Var = new com.facebook.appevents.o0(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bf_");
            sb2.append(intent != null ? intent.getStringExtra("event_name") : null);
            String string = sb2.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    kotlin.jvm.internal.s.g(key, "key");
                    bundle.putString(new bm.o("[ -]*$").i(new bm.o("^[ -]*").i(new bm.o("[^0-9a-zA-Z _-]").i(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            o0Var.d(string, bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private c(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "context.applicationContext");
        this.f15146a = applicationContext;
    }
}
