package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15211b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f15212a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Uri a(String action, Bundle bundle) {
            kotlin.jvm.internal.s.h(action, "action");
            return e1.g(x0.b(), com.facebook.h0.y() + "/dialog/" + action, bundle);
        }

        private a() {
        }
    }

    public f(String action, Bundle bundle) {
        kotlin.jvm.internal.s.h(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        g0[] g0VarArrValues = g0.values();
        ArrayList arrayList = new ArrayList(g0VarArrValues.length);
        for (g0 g0Var : g0VarArrValues) {
            arrayList.add(g0Var.g());
        }
        this.f15212a = arrayList.contains(action) ? e1.g(x0.g(), "/dialog/" + action, bundle) : f15211b.a(action, bundle);
    }

    public final boolean a(Activity activity, String str) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.s.h(activity, "activity");
            androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0018d(com.facebook.login.d.f15576b.b()).a();
            dVarA.f1834a.setPackage(str);
            try {
                dVarA.a(activity, this.f15212a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    protected final void b(Uri uri) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(uri, "<set-?>");
            this.f15212a = uri;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
