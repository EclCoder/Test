package com.iab.omid.library.bytedance2;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.utils.e;
import com.iab.omid.library.bytedance2.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23804a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.12-Bytedance2";
    }

    void c() {
        g.a();
        com.iab.omid.library.bytedance2.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.bytedance2.internal.b.g().a(context);
        com.iab.omid.library.bytedance2.utils.a.a(context);
        com.iab.omid.library.bytedance2.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.bytedance2.internal.g.b().a(context);
        com.iab.omid.library.bytedance2.internal.a.a().a(context);
    }

    boolean b() {
        return this.f23804a;
    }

    void a(boolean z10) {
        this.f23804a = z10;
    }
}
