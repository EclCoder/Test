package i8;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f41175c = {8000, 8000, 2000, 2000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f41176d = {4000, 4000, 200, 200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicReferenceArray f41177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReferenceArray f41178b;

    public a() {
        this(4, 4);
    }

    public final byte[] a(int i10) {
        return b(i10, 0);
    }

    public byte[] b(int i10, int i11) {
        int iF = f(i10);
        if (i11 < iF) {
            i11 = iF;
        }
        byte[] bArr = (byte[]) this.f41177a.getAndSet(i10, null);
        return (bArr == null || bArr.length < i11) ? e(i11) : bArr;
    }

    public final char[] c(int i10) {
        return d(i10, 0);
    }

    public char[] d(int i10, int i11) {
        int iH = h(i10);
        if (i11 < iH) {
            i11 = iH;
        }
        char[] cArr = (char[]) this.f41178b.getAndSet(i10, null);
        return (cArr == null || cArr.length < i11) ? g(i11) : cArr;
    }

    protected byte[] e(int i10) {
        return new byte[i10];
    }

    protected int f(int i10) {
        return f41175c[i10];
    }

    protected char[] g(int i10) {
        return new char[i10];
    }

    protected int h(int i10) {
        return f41176d[i10];
    }

    public void i(int i10, byte[] bArr) {
        this.f41177a.set(i10, bArr);
    }

    public void j(int i10, char[] cArr) {
        this.f41178b.set(i10, cArr);
    }

    protected a(int i10, int i11) {
        this.f41177a = new AtomicReferenceArray(i10);
        this.f41178b = new AtomicReferenceArray(i11);
    }
}
