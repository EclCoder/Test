package zn;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.PrivilegedAction;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ URL f59015a;

    f(URL url) {
        this.f59015a = url;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.PrivilegedAction
    public Object run() throws Throwable {
        InputStream inputStream;
        Throwable th2;
        StringBuffer stringBuffer;
        try {
            URLConnection uRLConnectionOpenConnection = this.f59015a.openConnection();
            uRLConnectionOpenConnection.setUseCaches(false);
            inputStream = uRLConnectionOpenConnection.getInputStream();
            if (inputStream == null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        if (h.t()) {
                            stringBuffer = new StringBuffer();
                            stringBuffer.append("Unable to close stream for URL ");
                            stringBuffer.append(this.f59015a);
                            h.v(stringBuffer.toString());
                        }
                    }
                }
                return null;
            }
            try {
                try {
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    inputStream.close();
                    return properties;
                } catch (IOException unused2) {
                    if (h.t()) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Unable to read URL ");
                        stringBuffer2.append(this.f59015a);
                        h.v(stringBuffer2.toString());
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                            if (h.t()) {
                                stringBuffer = new StringBuffer();
                                stringBuffer.append("Unable to close stream for URL ");
                                stringBuffer.append(this.f59015a);
                                h.v(stringBuffer.toString());
                            }
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                        if (h.t()) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Unable to close stream for URL ");
                            stringBuffer3.append(this.f59015a);
                            h.v(stringBuffer3.toString());
                        }
                    }
                }
                throw th2;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th4) {
            inputStream = null;
            th2 = th4;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }
}
