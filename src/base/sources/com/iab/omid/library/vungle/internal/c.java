package com.iab.omid.library.vungle.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f24254c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f24255a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f24256b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f24254c;
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f24256b);
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24255a);
    }

    public boolean d() {
        return this.f24256b.size() > 0;
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar) {
        this.f24255a.add(aVar);
    }

    public void b(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f24255a.remove(aVar);
        this.f24256b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f24256b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
