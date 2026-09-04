package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f24093d = new b();

    private b() {
    }

    public static b g() {
        return f24093d;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d
    public void b(boolean z10) {
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View viewC = it.next().c();
            if (viewC != null && viewC.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
