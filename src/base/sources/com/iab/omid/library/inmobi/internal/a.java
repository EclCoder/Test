package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f23952f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f23953a = new com.iab.omid.library.inmobi.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f23954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f23956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23957e;

    private a(d dVar) {
        this.f23956d = dVar;
    }

    public static a a() {
        return f23952f;
    }

    private void c() {
        if (!this.f23955c || this.f23954b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f23954b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f23953a.a();
        Date date = this.f23954b;
        if (date == null || dateA.after(date)) {
            this.f23954b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f23955c) {
            return;
        }
        this.f23956d.a(context);
        this.f23956d.a(this);
        this.f23956d.e();
        this.f23957e = this.f23956d.c();
        this.f23955c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (!this.f23957e && z10) {
            d();
        }
        this.f23957e = z10;
    }
}
