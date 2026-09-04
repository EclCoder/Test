package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class i implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f23842f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23843a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f23844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f23845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f23846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f23847e;

    public i(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f23844b = eVar;
        this.f23845c = bVar;
    }

    private c a() {
        if (this.f23847e == null) {
            this.f23847e = c.c();
        }
        return this.f23847e;
    }

    public static i c() {
        if (f23842f == null) {
            f23842f = new i(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f23842f;
    }

    public float b() {
        return this.f23843a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f23846d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f23846d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f10) {
        this.f23843a = f10;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f23846d = this.f23844b.a(new Handler(), context, this.f23845c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
