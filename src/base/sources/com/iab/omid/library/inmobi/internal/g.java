package com.iab.omid.library.inmobi.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f23971b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23972a;

    private g() {
    }

    public static g b() {
        return f23971b;
    }

    public Context a() {
        return this.f23972a;
    }

    public void a(Context context) {
        this.f23972a = context != null ? context.getApplicationContext() : null;
    }
}
