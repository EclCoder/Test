package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gl.i f54795a = new gl.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54796b;

    protected final void a(char[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        synchronized (this) {
            try {
                if (this.f54796b + array.length < k.f54778a) {
                    this.f54796b += array.length;
                    this.f54795a.addLast(array);
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f54795a.z();
            if (cArr != null) {
                this.f54796b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
