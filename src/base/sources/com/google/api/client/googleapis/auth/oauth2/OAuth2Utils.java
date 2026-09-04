package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class OAuth2Utils {
    private static final int COMPUTE_PING_CONNECTION_TIMEOUT_MS = 500;
    private static final String DEFAULT_METADATA_SERVER_URL = "http://169.254.169.254";
    private static final int MAX_COMPUTE_PING_TRIES = 3;
    static final Charset UTF_8 = Charset.forName(C.UTF8_NAME);
    private static final Logger LOGGER = Logger.getLogger(OAuth2Utils.class.getName());

    static <T extends Throwable> T exceptionWithCause(T t10, Throwable th2) {
        t10.initCause(th2);
        return t10;
    }

    public static String getMetadataServerUrl() {
        return getMetadataServerUrl(SystemEnvironmentProvider.INSTANCE);
    }

    static boolean headersContainValue(HttpHeaders httpHeaders, String str, String str2) {
        Object obj = httpHeaders.get(str);
        if (!(obj instanceof Collection)) {
            return false;
        }
        for (Object obj2 : (Collection) obj) {
            if ((obj2 instanceof String) && ((String) obj2).equals(str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean runningOnComputeEngine(HttpTransport httpTransport, SystemEnvironmentProvider systemEnvironmentProvider) {
        if (Boolean.parseBoolean(systemEnvironmentProvider.getEnv("NO_GCE_CHECK"))) {
            return false;
        }
        GenericUrl genericUrl = new GenericUrl(getMetadataServerUrl(systemEnvironmentProvider));
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                HttpRequest httpRequestBuildGetRequest = httpTransport.createRequestFactory().buildGetRequest(genericUrl);
                httpRequestBuildGetRequest.setConnectTimeout(500);
                httpRequestBuildGetRequest.getHeaders().set("Metadata-Flavor", "Google");
                HttpResponse httpResponseExecute = httpRequestBuildGetRequest.execute();
                try {
                    return headersContainValue(httpResponseExecute.getHeaders(), "Metadata-Flavor", "Google");
                } finally {
                    httpResponseExecute.disconnect();
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException e10) {
                LOGGER.log(Level.WARNING, "Failed to detect whether we are running on Google Compute Engine.", (Throwable) e10);
            }
        }
        return false;
    }

    static String getMetadataServerUrl(SystemEnvironmentProvider systemEnvironmentProvider) {
        String env = systemEnvironmentProvider.getEnv("GCE_METADATA_HOST");
        if (env == null) {
            return DEFAULT_METADATA_SERVER_URL;
        }
        return "http://" + env;
    }
}
