package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f23977f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23978a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f23979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f23980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f23981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f23982e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f23979b = eVar;
        this.f23980c = bVar;
    }

    private c a() {
        if (this.f23982e == null) {
            this.f23982e = c.c();
        }
        return this.f23982e;
    }

    public static i c() {
        if (f23977f == null) {
            f23977f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f23977f;
    }

    public float b() {
        return this.f23978a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f23981d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f23981d.c();
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f23978a = f10;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f23981d = this.f23979b.a(new Handler(), context, this.f23980c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
