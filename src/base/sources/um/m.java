package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gl.i f54790a = new gl.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54791b;

    protected final void a(byte[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        synchronized (this) {
            try {
                if (this.f54791b + array.length < k.f54778a) {
                    this.f54791b += array.length / 2;
                    this.f54790a.addLast(array);
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final byte[] b(int i10) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f54790a.z();
            if (bArr != null) {
                this.f54791b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i10] : bArr;
    }
}
