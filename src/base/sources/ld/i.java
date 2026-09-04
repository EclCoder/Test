package ld;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f44344d = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f44345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f44347c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f44348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f44349b;

        a(byte[] bArr, int[] iArr) {
            this.f44348a = bArr;
            this.f44349b = iArr;
        }

        @Override // ld.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f44348a, this.f44349b[0], i10);
                int[] iArr = this.f44349b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f44351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44352b;

        b(byte[] bArr, int i10) {
            this.f44351a = bArr;
            this.f44352b = i10;
        }
    }

    i(File file, int i10) {
        this.f44345a = file;
        this.f44346b = i10;
    }

    private void f(long j10, String str) {
        if (this.f44347c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f44346b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f44347c.i(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f44344d));
            while (!this.f44347c.r() && this.f44347c.N0() > this.f44346b) {
                this.f44347c.m0();
            }
        } catch (IOException e10) {
            gd.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f44345a.exists()) {
            return null;
        }
        h();
        h hVar = this.f44347c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.N0()];
        try {
            this.f44347c.m(new a(bArr, iArr));
        } catch (IOException e10) {
            gd.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f44347c == null) {
            try {
                this.f44347c = new h(this.f44345a);
            } catch (IOException e10) {
                gd.g.f().e("Could not open log file: " + this.f44345a, e10);
            }
        }
    }

    @Override // ld.d
    public void a() {
        jd.i.f(this.f44347c, "There was a problem closing the Crashlytics log file.");
        this.f44347c = null;
    }

    @Override // ld.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f44344d);
        }
        return null;
    }

    @Override // ld.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f44352b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f44351a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // ld.d
    public void d() {
        a();
        this.f44345a.delete();
    }

    @Override // ld.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
