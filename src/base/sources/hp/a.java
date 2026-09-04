package hp;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.h;
import org.apache.http.ssl.SSLInitializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(h.TLS);
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e10) {
            throw new SSLInitializationException(e10.getMessage(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new SSLInitializationException(e11.getMessage(), e11);
        }
    }
}
