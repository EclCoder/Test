package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f24106b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24107a;

    private g() {
    }

    public static g b() {
        return f24106b;
    }

    public Context a() {
        return this.f24107a;
    }

    public void a(Context context) {
        this.f24107a = context != null ? context.getApplicationContext() : null;
    }
}
