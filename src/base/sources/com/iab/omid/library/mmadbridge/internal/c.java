package com.iab.omid.library.mmadbridge.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f24094c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f24095a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f24096b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f24094c;
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f24096b);
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24095a);
    }

    public boolean d() {
        return this.f24096b.size() > 0;
    }

    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        this.f24095a.add(aVar);
    }

    public void b(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f24095a.remove(aVar);
        this.f24096b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f24096b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
