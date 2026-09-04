package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24087f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.mmadbridge.utils.f f24088a = new com.iab.omid.library.mmadbridge.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24092e;

    private a(d dVar) {
        this.f24091d = dVar;
    }

    public static a a() {
        return f24087f;
    }

    private void c() {
        if (!this.f24090c || this.f24089b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f24089b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24088a.a();
        Date date = this.f24089b;
        if (date == null || dateA.after(date)) {
            this.f24089b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f24090c) {
            return;
        }
        this.f24091d.a(context);
        this.f24091d.a(this);
        this.f24091d.e();
        this.f24092e = this.f24091d.c();
        this.f24090c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (!this.f24092e && z10) {
            d();
        }
        this.f24092e = z10;
    }
}
