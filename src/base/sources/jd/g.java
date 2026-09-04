package jd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class g implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f42285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42287c;

    g(String str, String str2, byte[] bArr) {
        this.f42286b = str;
        this.f42287c = str2;
        this.f42285a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f42285a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f42285a;
        return bArr == null || bArr.length == 0;
    }

    @Override // jd.u0
    public md.h0.d.b a() {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return md.h0.d.b.a().b(bArrC).c(this.f42286b).a();
    }

    @Override // jd.u0
    public String b() {
        return this.f42287c;
    }

    @Override // jd.u0
    public InputStream getStream() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f42285a);
    }
}
