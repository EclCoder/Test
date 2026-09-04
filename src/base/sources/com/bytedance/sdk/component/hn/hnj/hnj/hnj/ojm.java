package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import com.bytedance.sdk.component.hn.hnj.fc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends fc {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    InputStream f12878hn;
    HttpURLConnection hnj;

    ojm(HttpURLConnection httpURLConnection) {
        this.hnj = httpURLConnection;
        this.f12878hn = new dse(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.hn.hnj.fc, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f12878hn.close();
            this.hnj.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.fc
    public byte[] gjv() {
        try {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = this.f12878hn.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.fc
    public String hn() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f12878hn));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.fc
    public long hnj() {
        try {
            return this.hnj.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.hn.hnj.fc
    public InputStream qor() {
        return this.f12878hn;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.fc
    public com.bytedance.sdk.component.hn.hnj.ojm sk() {
        if (this.hnj.getContentType() != null) {
            return com.bytedance.sdk.component.hn.hnj.ojm.hnj(this.hnj.getContentType());
        }
        return null;
    }

    ojm(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.hnj = httpURLConnection;
        this.f12878hn = new dse(inputStream, httpURLConnection);
    }
}
