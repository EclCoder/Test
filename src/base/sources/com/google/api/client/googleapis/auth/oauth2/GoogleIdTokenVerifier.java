package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdToken;
import com.google.api.client.auth.openidconnect.IdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleIdTokenVerifier extends IdTokenVerifier {
    private final GooglePublicKeysManager publicKeys;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder extends IdTokenVerifier.Builder {
        GooglePublicKeysManager publicKeys;

        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory) {
            this(new GooglePublicKeysManager(httpTransport, jsonFactory));
        }

        public final JsonFactory getJsonFactory() {
            return this.publicKeys.getJsonFactory();
        }

        public final GooglePublicKeysManager getPublicCerts() {
            return this.publicKeys;
        }

        @Deprecated
        public final String getPublicCertsEncodedUrl() {
            return this.publicKeys.getPublicCertsEncodedUrl();
        }

        public final HttpTransport getTransport() {
            return this.publicKeys.getTransport();
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public /* bridge */ /* synthetic */ IdTokenVerifier.Builder setAudience(Collection collection) {
            return setAudience((Collection<String>) collection);
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public /* bridge */ /* synthetic */ IdTokenVerifier.Builder setIssuers(Collection collection) {
            return setIssuers((Collection<String>) collection);
        }

        @Deprecated
        public Builder setPublicCertsEncodedUrl(String str) {
            this.publicKeys = new GooglePublicKeysManager.Builder(getTransport(), getJsonFactory()).setPublicCertsEncodedUrl(str).setClock(this.publicKeys.getClock()).build();
            return this;
        }

        public Builder(GooglePublicKeysManager googlePublicKeysManager) {
            this.publicKeys = (GooglePublicKeysManager) Preconditions.checkNotNull(googlePublicKeysManager);
            setIssuers((Collection<String>) Arrays.asList("accounts.google.com", "https://accounts.google.com"));
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public GoogleIdTokenVerifier build() {
            return new GoogleIdTokenVerifier(this);
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public Builder setAcceptableTimeSkewSeconds(long j10) {
            return (Builder) super.setAcceptableTimeSkewSeconds(j10);
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public Builder setAudience(Collection<String> collection) {
            return (Builder) super.setAudience(collection);
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public Builder setClock(Clock clock) {
            return (Builder) super.setClock(clock);
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public Builder setIssuer(String str) {
            return (Builder) super.setIssuer(str);
        }

        @Override // com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
        public Builder setIssuers(Collection<String> collection) {
            return (Builder) super.setIssuers(collection);
        }
    }

    public GoogleIdTokenVerifier(HttpTransport httpTransport, JsonFactory jsonFactory) {
        this(new Builder(httpTransport, jsonFactory));
    }

    @Deprecated
    public final long getExpirationTimeMilliseconds() {
        return this.publicKeys.getExpirationTimeMilliseconds();
    }

    public final JsonFactory getJsonFactory() {
        return this.publicKeys.getJsonFactory();
    }

    @Deprecated
    public final String getPublicCertsEncodedUrl() {
        return this.publicKeys.getPublicCertsEncodedUrl();
    }

    @Deprecated
    public final List<PublicKey> getPublicKeys() {
        return this.publicKeys.getPublicKeys();
    }

    public final GooglePublicKeysManager getPublicKeysManager() {
        return this.publicKeys;
    }

    public final HttpTransport getTransport() {
        return this.publicKeys.getTransport();
    }

    @Deprecated
    public GoogleIdTokenVerifier loadPublicCerts() {
        this.publicKeys.refresh();
        return this;
    }

    public boolean verify(GoogleIdToken googleIdToken) {
        if (!super.verify((IdToken) googleIdToken)) {
            return false;
        }
        Iterator<PublicKey> it = this.publicKeys.getPublicKeys().iterator();
        while (it.hasNext()) {
            if (googleIdToken.verifySignature(it.next())) {
                return true;
            }
        }
        return false;
    }

    public GoogleIdTokenVerifier(GooglePublicKeysManager googlePublicKeysManager) {
        this(new Builder(googlePublicKeysManager));
    }

    protected GoogleIdTokenVerifier(Builder builder) {
        super(builder);
        this.publicKeys = builder.publicKeys;
    }

    public GoogleIdToken verify(String str) {
        GoogleIdToken googleIdToken = GoogleIdToken.parse(getJsonFactory(), str);
        if (verify(googleIdToken)) {
            return googleIdToken;
        }
        return null;
    }
}
