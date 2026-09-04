package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14970b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f14971a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o0 a(Context context, String str) {
            return new o0(context, str);
        }

        public final o0 b(String activityName, String str, com.facebook.a aVar) {
            kotlin.jvm.internal.s.h(activityName, "activityName");
            return new o0(activityName, str, aVar);
        }

        public final Executor c() {
            return s.f14988c.i();
        }

        public final o.b d() {
            return s.f14988c.k();
        }

        public final String e() {
            return s.f14988c.m();
        }

        public final void f(Map ud2) {
            kotlin.jvm.internal.s.h(ud2, "ud");
            v0.g(ud2);
        }

        private a() {
        }
    }

    public o0(s loggerImpl) {
        kotlin.jvm.internal.s.h(loggerImpl, "loggerImpl");
        this.f14971a = loggerImpl;
    }

    public final void a() {
        this.f14971a.l();
    }

    public final void b(Bundle parameters) {
        kotlin.jvm.internal.s.h(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || com.facebook.h0.q()) {
            this.f14971a.s("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void c(String str, double d10, Bundle bundle) {
        if (com.facebook.h0.q()) {
            this.f14971a.n(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (com.facebook.h0.q()) {
            this.f14971a.o(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f14971a.r(str, str2);
    }

    public final void f(String str) {
        if (com.facebook.h0.q()) {
            this.f14971a.s(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (com.facebook.h0.q()) {
            this.f14971a.s(str, null, bundle);
        }
    }

    public final void h(String str, Double d10, Bundle bundle) {
        if (com.facebook.h0.q()) {
            this.f14971a.s(str, d10, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, p0 p0Var) {
        if (com.facebook.h0.q()) {
            this.f14971a.t(str, bigDecimal, currency, bundle, p0Var);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle, p0 p0Var) {
        if (com.facebook.h0.q()) {
            this.f14971a.v(bigDecimal, currency, bundle, p0Var);
        }
    }

    public o0(Context context) {
        this(new s(context, (String) null, (com.facebook.a) null));
    }

    public o0(Context context, String str) {
        this(new s(context, str, (com.facebook.a) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(String activityName, String str, com.facebook.a aVar) {
        this(new s(activityName, str, aVar));
        kotlin.jvm.internal.s.h(activityName, "activityName");
    }
}
