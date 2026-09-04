package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f23817f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f23818a = new com.iab.omid.library.bytedance2.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f23819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f23821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23822e;

    private a(d dVar) {
        this.f23821d = dVar;
    }

    public static a a() {
        return f23817f;
    }

    private void c() {
        if (!this.f23820c || this.f23819b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f23819b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f23818a.a();
        Date date = this.f23819b;
        if (date == null || dateA.after(date)) {
            this.f23819b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f23820c) {
            return;
        }
        this.f23821d.a(context);
        this.f23821d.a(this);
        this.f23821d.e();
        this.f23822e = this.f23821d.c();
        this.f23820c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f23822e && z10) {
            d();
        }
        this.f23822e = z10;
    }
}
