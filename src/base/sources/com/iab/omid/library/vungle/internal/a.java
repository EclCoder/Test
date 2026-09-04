package com.iab.omid.library.vungle.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24247f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.vungle.utils.f f24248a = new com.iab.omid.library.vungle.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24252e;

    private a(d dVar) {
        this.f24251d = dVar;
    }

    public static a a() {
        return f24247f;
    }

    private void c() {
        if (!this.f24250c || this.f24249b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f24249b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24248a.a();
        Date date = this.f24249b;
        if (date == null || dateA.after(date)) {
            this.f24249b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f24250c) {
            return;
        }
        this.f24251d.a(context);
        this.f24251d.a(this);
        this.f24251d.e();
        this.f24252e = this.f24251d.c();
        this.f24250c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (!this.f24252e && z10) {
            d();
        }
        this.f24252e = z10;
    }
}
