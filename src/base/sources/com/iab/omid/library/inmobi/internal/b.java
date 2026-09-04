package com.iab.omid.library.inmobi.internal;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f23958d = new b();

    private b() {
    }

    public static b g() {
        return f23958d;
    }

    @Override // com.iab.omid.library.inmobi.internal.d
    public void b(boolean z10) {
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().a(z10);
        }
    }

    @Override // com.iab.omid.library.inmobi.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View viewE = it.next().e();
            if (viewE != null && viewE.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
