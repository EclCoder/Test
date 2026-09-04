package pi;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f50129g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f50123a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f50124b = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f50130h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f50131i = new AtomicBoolean(false);

    public final void a() {
        this.f50123a.d();
        Iterator it = this.f50130h.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public final void b(int i10, int i11, boolean z10, int i12, boolean z11, boolean z12) {
        this.f50124b.b(i10, i11, z10, i12, z11, z12);
    }

    public final void c(int i10, int i11, boolean z10, ti.a mode, int i12, boolean z11, boolean z12) {
        s.h(mode, "mode");
        this.f50124b.c(i10, i11, z10, mode, i12, z11, z12);
    }

    public final Surface d() {
        Surface surfaceE = this.f50123a.e();
        s.g(surfaceE, "getSurface(...)");
        return surfaceE;
    }

    public final SurfaceTexture e() {
        SurfaceTexture surfaceTextureF = this.f50123a.f();
        s.g(surfaceTextureF, "getSurfaceTexture(...)");
        return surfaceTextureF;
    }

    public final void f(Context context, int i10, int i11, int i12, int i13) {
        s.h(context, "context");
        this.f50129g = context;
        this.f50125c = i10;
        this.f50126d = i11;
        this.f50127e = i12;
        this.f50128f = i13;
        this.f50123a.g(i10, i11, context, i12, i13);
        this.f50124b.f(i10, i11);
        this.f50124b.g(this.f50123a.a());
        this.f50124b.d(context);
        this.f50131i.set(true);
    }

    public final boolean g() {
        return this.f50131i.get();
    }

    public final void h() {
        this.f50131i.set(false);
        this.f50123a.h();
        Iterator it = this.f50130h.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f50130h.clear();
        this.f50124b.e();
    }

    public final void i(int i10) {
        this.f50123a.j(i10);
    }

    public final void j() {
        this.f50123a.l();
    }
}
