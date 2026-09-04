package jc;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f42212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0641a f42213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42214c;

    /* JADX INFO: renamed from: jc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0641a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0641a interfaceC0641a, Typeface typeface) {
        this.f42212a = typeface;
        this.f42213b = interfaceC0641a;
    }

    private void d(Typeface typeface) {
        if (this.f42214c) {
            return;
        }
        this.f42213b.a(typeface);
    }

    @Override // jc.f
    public void a(int i10) {
        d(this.f42212a);
    }

    @Override // jc.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f42214c = true;
    }
}
