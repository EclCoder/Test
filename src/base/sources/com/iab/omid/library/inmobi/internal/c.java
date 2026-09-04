package com.iab.omid.library.inmobi.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f23959c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f23960a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f23961b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f23959c;
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f23961b);
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f23960a);
    }

    public boolean d() {
        return this.f23961b.size() > 0;
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f23960a.add(aVar);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f23960a.remove(aVar);
        this.f23961b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f23961b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
