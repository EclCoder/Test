package com.iab.omid.library.inmobi;

import android.content.Context;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.utils.e;
import com.iab.omid.library.inmobi.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23933a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.7-Inmobi";
    }

    void c() {
        g.a();
        com.iab.omid.library.inmobi.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.inmobi.internal.b.g().a(context);
        com.iab.omid.library.inmobi.utils.a.a(context);
        com.iab.omid.library.inmobi.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.inmobi.internal.g.b().a(context);
        com.iab.omid.library.inmobi.internal.a.a().a(context);
        j.b().a(context);
    }

    boolean b() {
        return this.f23933a;
    }

    void a(boolean z10) {
        this.f23933a = z10;
    }
}
