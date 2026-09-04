package kg;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements w0.a.InterfaceC0848a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f43394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f43395b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void c(int i10, AdapterView adapterView, View view, int i11, long j10);
    }

    public b(a aVar, int i10) {
        this.f43394a = aVar;
        this.f43395b = i10;
    }

    @Override // w0.a.InterfaceC0848a
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        this.f43394a.c(this.f43395b, adapterView, view, i10, j10);
    }
}
