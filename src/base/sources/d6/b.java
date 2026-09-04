package d6;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q5.a.InterfaceC0775a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.d f36211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.b f36212b;

    public b(u5.d dVar, u5.b bVar) {
        this.f36211a = dVar;
        this.f36212b = bVar;
    }

    @Override // q5.a.InterfaceC0775a
    public void a(Bitmap bitmap) {
        this.f36211a.d(bitmap);
    }

    @Override // q5.a.InterfaceC0775a
    public byte[] b(int i10) {
        u5.b bVar = this.f36212b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // q5.a.InterfaceC0775a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f36211a.f(i10, i11, config);
    }

    @Override // q5.a.InterfaceC0775a
    public int[] d(int i10) {
        u5.b bVar = this.f36212b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // q5.a.InterfaceC0775a
    public void e(byte[] bArr) {
        u5.b bVar = this.f36212b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // q5.a.InterfaceC0775a
    public void f(int[] iArr) {
        u5.b bVar = this.f36212b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
