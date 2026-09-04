package com.iab.omid.library.vungle.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f24266b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24267a;

    private g() {
    }

    public static g b() {
        return f24266b;
    }

    public Context a() {
        return this.f24267a;
    }

    public void a(Context context) {
        this.f24267a = context != null ? context.getApplicationContext() : null;
    }
}
