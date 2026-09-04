package androidx.core.view.insets;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a implements d.InterfaceC0030d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f3349a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0.b f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0.b f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3354f;

    a(d dVar, List list) {
        e0.b bVar = e0.b.f36999e;
        this.f3351c = bVar;
        this.f3352d = bVar;
        f(list, false);
        f(list, true);
        dVar.g(this);
        this.f3350b = dVar;
    }

    private void f(List list, boolean z10) {
        if (list.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(list.get(0));
        throw null;
    }

    private void j() {
        e0.b bVar = e0.b.f36999e;
        int size = this.f3349a.size() - 1;
        if (size < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f3349a.get(size));
        throw null;
    }

    @Override // androidx.core.view.insets.d.InterfaceC0030d
    public void a() {
        int i10 = this.f3353e;
        boolean z10 = i10 > 0;
        int i11 = i10 - 1;
        this.f3353e = i11;
        if (z10 && i11 == 0) {
            j();
        }
    }

    @Override // androidx.core.view.insets.d.InterfaceC0030d
    public void b(int i10, e0.b bVar, RectF rectF) {
        int size = this.f3349a.size() - 1;
        if (size < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f3349a.get(size));
        throw null;
    }

    @Override // androidx.core.view.insets.d.InterfaceC0030d
    public void c() {
        this.f3353e++;
    }

    @Override // androidx.core.view.insets.d.InterfaceC0030d
    public void d(e0.b bVar, e0.b bVar2) {
        this.f3351c = bVar;
        this.f3352d = bVar2;
        j();
    }

    @Override // androidx.core.view.insets.d.InterfaceC0030d
    public void e(int i10) {
        int size = this.f3349a.size() - 1;
        if (size < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f3349a.get(size));
        throw null;
    }

    void g() {
        if (this.f3354f) {
            return;
        }
        this.f3354f = true;
        this.f3350b.m(this);
        int size = this.f3349a.size() - 1;
        if (size < 0) {
            this.f3349a.clear();
        } else {
            android.support.v4.media.session.b.a(this.f3349a.get(size));
            throw null;
        }
    }

    r0.a h(int i10) {
        android.support.v4.media.session.b.a(this.f3349a.get(i10));
        return null;
    }

    int i() {
        return this.f3349a.size();
    }
}
