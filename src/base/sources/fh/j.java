package fh;

import android.content.Intent;
import androidx.lifecycle.k0;
import androidx.lifecycle.p0;
import androidx.lifecycle.p1;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg.a f38693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f38694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p0 f38695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f38696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f38697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p0 f38698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p0 f38699h;

    public j(dg.a azLive) {
        kotlin.jvm.internal.s.h(azLive, "azLive");
        this.f38693b = azLive;
        this.f38694c = new p0();
        this.f38695d = new p0();
        this.f38696e = new p0();
        this.f38697f = new p0();
        this.f38698g = new p0();
        this.f38699h = new p0();
    }

    public final void j() {
        this.f38695d.q(new wg.a(g0.f38750a));
    }

    public final k0 k() {
        return this.f38695d;
    }

    public final Intent l() {
        return this.f38693b.k();
    }

    public final k0 m() {
        return this.f38694c;
    }

    public final k0 n() {
        return this.f38697f;
    }

    public final k0 o() {
        return this.f38698g;
    }

    public final k0 p() {
        return this.f38696e;
    }

    public final k0 q() {
        return this.f38699h;
    }

    protected final p0 r() {
        return this.f38695d;
    }

    protected final p0 s() {
        return this.f38697f;
    }

    protected final p0 t() {
        return this.f38698g;
    }

    protected final p0 u() {
        return this.f38699h;
    }

    public final void v() {
        this.f38696e.q(new wg.a(g0.f38750a));
    }

    public abstract void w(int i10, Intent intent, String str);

    public final void x() {
        this.f38694c.q(new wg.a(g0.f38750a));
    }
}
