package um;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f54793a = n.f54792c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54794b;

    private final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= g1.a().length || (b10 = g1.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f54793a[iF] = cCharAt;
                i11 = i12;
            } else if (b10 == 1) {
                String str2 = g1.b()[cCharAt];
                kotlin.jvm.internal.s.e(str2);
                int iF2 = f(iF, str2.length());
                str2.getChars(0, str2.length(), this.f54793a, iF2);
                i11 = iF2 + str2.length();
                this.f54794b = i11;
            } else {
                char[] cArr = this.f54793a;
                cArr[iF] = '\\';
                cArr[iF + 1] = (char) b10;
                i11 = iF + 2;
                this.f54794b = i11;
            }
            i10++;
        }
        int iF3 = f(i11, 1);
        this.f54793a[iF3] = '\"';
        this.f54794b = iF3 + 1;
    }

    private final void e(int i10) {
        f(this.f54794b, i10);
    }

    private final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f54793a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, yl.g.d(i12, i10 * 2));
            kotlin.jvm.internal.s.g(cArrCopyOf, "copyOf(...)");
            this.f54793a = cArrCopyOf;
        }
        return i10;
    }

    @Override // um.c0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f54793a;
        int i10 = this.f54794b;
        this.f54794b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // um.c0
    public void b(String text) {
        kotlin.jvm.internal.s.h(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f54793a;
        int i10 = this.f54794b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < g1.a().length && g1.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f54794b = i12 + 1;
    }

    @Override // um.c0
    public void c(String text) {
        kotlin.jvm.internal.s.h(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f54793a, this.f54794b);
        this.f54794b += length;
    }

    public void g() {
        n.f54792c.c(this.f54793a);
    }

    public String toString() {
        return new String(this.f54793a, 0, this.f54794b);
    }

    @Override // um.c0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
