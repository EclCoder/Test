package f6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.a f38251b;

    d(Context context, b.a aVar) {
        this.f38250a = context.getApplicationContext();
        this.f38251b = aVar;
    }

    private void i() {
        r.a(this.f38250a).d(this.f38251b);
    }

    private void j() {
        r.a(this.f38250a).e(this.f38251b);
    }

    @Override // f6.l
    public void onStart() {
        i();
    }

    @Override // f6.l
    public void onStop() {
        j();
    }

    @Override // f6.l
    public void onDestroy() {
    }
}
