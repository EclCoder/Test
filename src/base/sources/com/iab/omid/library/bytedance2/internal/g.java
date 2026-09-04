package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f23836b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23837a;

    private g() {
    }

    public static g b() {
        return f23836b;
    }

    public Context a() {
        return this.f23837a;
    }

    public void a(Context context) {
        this.f23837a = context != null ? context.getApplicationContext() : null;
    }
}
