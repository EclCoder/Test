package ip;

import java.io.Serializable;
import java.nio.CharBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f41582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41583b;

    public c(int i10) {
        a.g(i10, "Buffer capacity");
        this.f41582a = new char[i10];
    }

    private void e(int i10) {
        char[] cArr = new char[Math.max(this.f41582a.length << 1, i10)];
        System.arraycopy(this.f41582a, 0, cArr, 0, this.f41583b);
        this.f41582a = cArr;
    }

    public void a(char c10) {
        int i10 = this.f41583b + 1;
        if (i10 > this.f41582a.length) {
            e(i10);
        }
        this.f41582a[this.f41583b] = c10;
        this.f41583b = i10;
    }

    public void b(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i10 = this.f41583b + length;
        if (i10 > this.f41582a.length) {
            e(i10);
        }
        str.getChars(0, length, this.f41582a, this.f41583b);
        this.f41583b = i10;
    }

    public void c(char[] cArr, int i10, int i11) {
        int i12;
        if (cArr == null) {
            return;
        }
        if (i10 < 0 || i10 > cArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > cArr.length) {
            throw new IndexOutOfBoundsException("off: " + i10 + " len: " + i11 + " b.length: " + cArr.length);
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.f41583b + i11;
        if (i13 > this.f41582a.length) {
            e(i13);
        }
        System.arraycopy(cArr, i10, this.f41582a, this.f41583b, i11);
        this.f41583b = i13;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f41582a[i10];
    }

    public void clear() {
        this.f41583b = 0;
    }

    public void d(int i10) {
        if (i10 <= 0) {
            return;
        }
        int length = this.f41582a.length;
        int i11 = this.f41583b;
        if (i10 > length - i11) {
            e(i11 + i10);
        }
    }

    public boolean isEmpty() {
        return this.f41583b == 0;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f41583b;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i10);
        }
        if (i11 > this.f41583b) {
            throw new IndexOutOfBoundsException("endIndex: " + i11 + " > length: " + this.f41583b);
        }
        if (i10 <= i11) {
            return CharBuffer.wrap(this.f41582a, i10, i11);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.f41582a, 0, this.f41583b);
    }
}
