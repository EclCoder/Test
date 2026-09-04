package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15003f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f15004g = t0.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f15005h = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.internal.b f15006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f15008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15010e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t0(com.facebook.internal.b attributionIdentifiers, String anonymousAppDeviceGUID) {
        kotlin.jvm.internal.s.h(attributionIdentifiers, "attributionIdentifiers");
        kotlin.jvm.internal.s.h(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f15006a = attributionIdentifiers;
        this.f15007b = anonymousAppDeviceGUID;
        this.f15008c = new ArrayList();
        this.f15009d = new ArrayList();
    }

    private final void f(com.facebook.j0 j0Var, Context context, int i10, JSONArray jSONArray, JSONArray jSONArray2, boolean z10) {
        JSONObject jSONObject;
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                jSONObject = n7.i.a(n7.i.a.CUSTOM_APP_EVENTS, this.f15006a, this.f15007b, z10, context);
                if (this.f15010e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            j0Var.E(jSONObject);
            Bundle bundleU = j0Var.u();
            String string = jSONArray.toString();
            kotlin.jvm.internal.s.g(string, "events.toString()");
            bundleU.putString("custom_events", string);
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.IapLoggingLib5To7)) {
                bundleU.putString("operational_parameters", jSONArray2.toString());
            }
            j0Var.H(string);
            j0Var.G(bundleU);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final synchronized void a(d event) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(event, "event");
            if (this.f15008c.size() + this.f15009d.size() >= f15005h) {
                this.f15010e++;
            } else {
                this.f15008c.add(event);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final synchronized void b(boolean z10) {
        if (x7.a.c(this)) {
            return;
        }
        if (z10) {
            try {
                this.f15008c.addAll(this.f15009d);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
        }
        this.f15009d.clear();
        this.f15010e = 0;
    }

    public final synchronized int c() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return this.f15008c.size();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    public final synchronized List d() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            List list = this.f15008c;
            this.f15008c = new ArrayList();
            return list;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final int e(com.facebook.j0 request, Context applicationContext, boolean z10, boolean z11) {
        Throwable th2;
        Throwable th3;
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.s.h(request, "request");
            kotlin.jvm.internal.s.h(applicationContext, "applicationContext");
            try {
                synchronized (this) {
                    try {
                        int i10 = this.f15010e;
                        g7.a.d(this.f15008c);
                        this.f15009d.addAll(this.f15008c);
                        this.f15008c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (d dVar : this.f15009d) {
                            try {
                                if (z10 || !dVar.m()) {
                                    jSONArray.put(dVar.j());
                                    jSONArray2.put(dVar.l());
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            fl.g0 g0Var = fl.g0.f38750a;
                            f(request, applicationContext, i10, jSONArray, jSONArray2, z11);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th5) {
                            th2 = th5;
                            x7.a.b(th2, this);
                            return 0;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
                x7.a.b(th2, this);
                return 0;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
