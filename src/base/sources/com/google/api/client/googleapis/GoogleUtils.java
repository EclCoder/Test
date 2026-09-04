package com.google.api.client.googleapis;

import com.google.api.client.util.SecurityUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GoogleUtils {
    public static final Integer BUGFIX_VERSION;
    public static final Integer MAJOR_VERSION;
    public static final Integer MINOR_VERSION;
    public static final String VERSION;
    static final Pattern VERSION_PATTERN;
    static KeyStore certTrustStore;

    static {
        String version = getVersion();
        VERSION = version;
        Pattern patternCompile = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        VERSION_PATTERN = patternCompile;
        Matcher matcher = patternCompile.matcher(version);
        matcher.find();
        MAJOR_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        MINOR_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(2)));
        BUGFIX_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(3)));
    }

    private GoogleUtils() {
    }

    public static synchronized KeyStore getCertificateTrustStore() {
        try {
            if (certTrustStore == null) {
                certTrustStore = SecurityUtils.getJavaKeyStore();
                SecurityUtils.loadKeyStore(certTrustStore, GoogleUtils.class.getResourceAsStream("google.jks"), "notasecret");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return certTrustStore;
    }

    private static String getVersion() {
        String property = null;
        try {
            InputStream resourceAsStream = GoogleUtils.class.getResourceAsStream("google-api-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    property = properties.getProperty("google-api-client.version");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return property == null ? "unknown-version" : property;
    }
}
