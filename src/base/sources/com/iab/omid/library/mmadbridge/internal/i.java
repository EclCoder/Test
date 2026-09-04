package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f24112f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f24113a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.e f24114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.b f24115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.devicevolume.d f24116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f24117e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.f24114b = eVar;
        this.f24115c = bVar;
    }

    private c a() {
        if (this.f24117e == null) {
            this.f24117e = c.c();
        }
        return this.f24117e;
    }

    public static i c() {
        if (f24112f == null) {
            f24112f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f24112f;
    }

    public float b() {
        return this.f24113a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f24116d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f24116d.d();
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f10) {
        this.f24113a = f10;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24116d = this.f24114b.a(new Handler(), context, this.f24115c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
