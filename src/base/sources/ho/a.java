package ho;

import co.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a extends org.apache.http.entity.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f40724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f40725c;

    public a(j jVar, e eVar) {
        super(jVar);
        this.f40724b = eVar;
    }

    private InputStream f() {
        return new f(this.f49262a.getContent(), this.f40724b);
    }

    @Override // org.apache.http.entity.e, co.j
    public InputStream getContent() {
        if (!this.f49262a.isStreaming()) {
            return f();
        }
        if (this.f40725c == null) {
            this.f40725c = f();
        }
        return this.f40725c;
    }

    @Override // org.apache.http.entity.e, co.j
    public co.d getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.entity.e, co.j
    public long getContentLength() {
        return -1L;
    }

    @Override // org.apache.http.entity.e, co.j
    public void writeTo(OutputStream outputStream) throws IOException {
        ip.a.h(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i10 = content.read(bArr);
                if (i10 == -1) {
                    content.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            content.close();
            throw th2;
        }
    }
}
