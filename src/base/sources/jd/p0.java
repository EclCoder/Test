package jd;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class p0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f42367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42369c;

    p0(String str, String str2, File file) {
        this.f42368b = str;
        this.f42369c = str2;
        this.f42367a = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (stream == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = stream.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                stream.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    byteArrayOutputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
            if (stream != null) {
                stream.close();
            }
            throw th6;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // jd.u0
    public md.h0.d.b a() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return md.h0.d.b.a().b(bArrC).c(this.f42368b).a();
        }
        return null;
    }

    @Override // jd.u0
    public String b() {
        return this.f42369c;
    }

    @Override // jd.u0
    public InputStream getStream() {
        if (this.f42367a.exists() && this.f42367a.isFile()) {
            try {
                return new FileInputStream(this.f42367a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
