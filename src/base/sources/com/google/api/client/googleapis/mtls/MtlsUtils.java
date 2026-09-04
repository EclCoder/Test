package com.google.api.client.googleapis.mtls;

import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.util.SecurityUtils;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MtlsUtils {
    private static final MtlsProvider MTLS_PROVIDER = new DefaultMtlsProvider();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class DefaultMtlsProvider implements MtlsProvider {
        private static final String DEFAULT_CONTEXT_AWARE_METADATA_PATH = System.getProperty("user.home") + "/.secureConnect/context_aware_metadata.json";
        public static final String GOOGLE_API_USE_CLIENT_CERTIFICATE = "GOOGLE_API_USE_CLIENT_CERTIFICATE";
        private EnvironmentProvider envProvider;
        private String metadataPath;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        interface EnvironmentProvider {
            String getenv(String str);
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class SystemEnvironmentProvider implements EnvironmentProvider {
            SystemEnvironmentProvider() {
            }

            @Override // com.google.api.client.googleapis.mtls.MtlsUtils.DefaultMtlsProvider.EnvironmentProvider
            public String getenv(String str) {
                return System.getenv(str);
            }
        }

        DefaultMtlsProvider() {
            this(new SystemEnvironmentProvider(), DEFAULT_CONTEXT_AWARE_METADATA_PATH);
        }

        static List<String> extractCertificateProviderCommand(InputStream inputStream) {
            return ((ContextAwareMetadataJson) Utils.getDefaultJsonFactory().createJsonParser(inputStream).parse(ContextAwareMetadataJson.class)).getCommands();
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public KeyStore getKeyStore() throws IOException {
            try {
                Process processStart = new ProcessBuilder(extractCertificateProviderCommand(new FileInputStream(this.metadataPath))).start();
                int iRunCertificateProviderCommand = runCertificateProviderCommand(processStart, 1000L);
                if (iRunCertificateProviderCommand == 0) {
                    return SecurityUtils.createMtlsKeyStore(processStart.getInputStream());
                }
                throw new IOException("Cert provider command failed with exit code: " + iRunCertificateProviderCommand);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (InterruptedException e10) {
                throw new IOException("Interrupted executing certificate provider command", e10);
            }
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public String getKeyStorePassword() {
            return "";
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public boolean useMtlsClientCertificate() {
            return "true".equals(this.envProvider.getenv(GOOGLE_API_USE_CLIENT_CERTIFICATE));
        }

        DefaultMtlsProvider(EnvironmentProvider environmentProvider, String str) {
            this.envProvider = environmentProvider;
            this.metadataPath = str;
        }

        static int runCertificateProviderCommand(Process process, long j10) throws InterruptedException, IOException {
            long jCurrentTimeMillis = System.currentTimeMillis();
            do {
                try {
                    process.exitValue();
                    return process.exitValue();
                } catch (IllegalThreadStateException unused) {
                    if (j10 > 0) {
                        Thread.sleep(Math.min(1 + j10, 100L));
                    }
                    j10 -= System.currentTimeMillis() - jCurrentTimeMillis;
                }
            } while (j10 > 0);
            process.destroy();
            throw new IOException(dmHT.QSQAVGWAUF);
        }
    }

    public static MtlsProvider getDefaultMtlsProvider() {
        return MTLS_PROVIDER;
    }
}
