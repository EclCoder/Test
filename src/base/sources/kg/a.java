package kg;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0657a f43392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f43393b;

    /* JADX INFO: renamed from: kg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0657a {
        void b(int i10, View view);
    }

    public a(InterfaceC0657a interfaceC0657a, int i10) {
        this.f43392a = interfaceC0657a;
        this.f43393b = i10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f43392a.b(this.f43393b, view);
    }
}
