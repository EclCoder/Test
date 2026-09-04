package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Credential implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler {
    static final Logger LOGGER = Logger.getLogger(Credential.class.getName());
    private String accessToken;
    private final HttpExecuteInterceptor clientAuthentication;
    private final Clock clock;
    private Long expirationTimeMilliseconds;
    private final JsonFactory jsonFactory;
    private final Lock lock;
    private final AccessMethod method;
    private final Collection<CredentialRefreshListener> refreshListeners;
    private String refreshToken;
    private final HttpRequestInitializer requestInitializer;
    private final String tokenServerEncodedUrl;
    private final HttpTransport transport;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface AccessMethod {
        String getAccessTokenFromRequest(HttpRequest httpRequest);

        void intercept(HttpRequest httpRequest, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        HttpExecuteInterceptor clientAuthentication;
        JsonFactory jsonFactory;
        final AccessMethod method;
        HttpRequestInitializer requestInitializer;
        GenericUrl tokenServerUrl;
        HttpTransport transport;
        Clock clock = Clock.SYSTEM;
        Collection<CredentialRefreshListener> refreshListeners = Lists.newArrayList();

        public Builder(AccessMethod accessMethod) {
            this.method = (AccessMethod) Preconditions.checkNotNull(accessMethod);
        }

        public Builder addRefreshListener(CredentialRefreshListener credentialRefreshListener) {
            this.refreshListeners.add((CredentialRefreshListener) Preconditions.checkNotNull(credentialRefreshListener));
            return this;
        }

        public Credential build() {
            return new Credential(this);
        }

        public final HttpExecuteInterceptor getClientAuthentication() {
            return this.clientAuthentication;
        }

        public final Clock getClock() {
            return this.clock;
        }

        public final JsonFactory getJsonFactory() {
            return this.jsonFactory;
        }

        public final AccessMethod getMethod() {
            return this.method;
        }

        public final Collection<CredentialRefreshListener> getRefreshListeners() {
            return this.refreshListeners;
        }

        public final HttpRequestInitializer getRequestInitializer() {
            return this.requestInitializer;
        }

        public final GenericUrl getTokenServerUrl() {
            return this.tokenServerUrl;
        }

        public final HttpTransport getTransport() {
            return this.transport;
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.clientAuthentication = httpExecuteInterceptor;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setJsonFactory(JsonFactory jsonFactory) {
            this.jsonFactory = jsonFactory;
            return this;
        }

        public Builder setRefreshListeners(Collection<CredentialRefreshListener> collection) {
            this.refreshListeners = (Collection) Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.requestInitializer = httpRequestInitializer;
            return this;
        }

        public Builder setTokenServerEncodedUrl(String str) {
            this.tokenServerUrl = str == null ? null : new GenericUrl(str);
            return this;
        }

        public Builder setTokenServerUrl(GenericUrl genericUrl) {
            this.tokenServerUrl = genericUrl;
            return this;
        }

        public Builder setTransport(HttpTransport httpTransport) {
            this.transport = httpTransport;
            return this;
        }
    }

    public Credential(AccessMethod accessMethod) {
        this(new Builder(accessMethod));
    }

    protected TokenResponse executeRefreshToken() {
        if (this.refreshToken == null) {
            return null;
        }
        return new RefreshTokenRequest(this.transport, this.jsonFactory, new GenericUrl(this.tokenServerEncodedUrl), this.refreshToken).setClientAuthentication(this.clientAuthentication).setRequestInitializer(this.requestInitializer).execute();
    }

    public final String getAccessToken() {
        this.lock.lock();
        try {
            return this.accessToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final HttpExecuteInterceptor getClientAuthentication() {
        return this.clientAuthentication;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final Long getExpirationTimeMilliseconds() {
        this.lock.lock();
        try {
            return this.expirationTimeMilliseconds;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpiresInSeconds() {
        this.lock.lock();
        try {
            Long l10 = this.expirationTimeMilliseconds;
            if (l10 == null) {
                return null;
            }
            return Long.valueOf((l10.longValue() - this.clock.currentTimeMillis()) / 1000);
        } finally {
            this.lock.unlock();
        }
    }

    public final JsonFactory getJsonFactory() {
        return this.jsonFactory;
    }

    public final AccessMethod getMethod() {
        return this.method;
    }

    public final Collection<CredentialRefreshListener> getRefreshListeners() {
        return this.refreshListeners;
    }

    public final String getRefreshToken() {
        this.lock.lock();
        try {
            return this.refreshToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final HttpRequestInitializer getRequestInitializer() {
        return this.requestInitializer;
    }

    public final String getTokenServerEncodedUrl() {
        return this.tokenServerEncodedUrl;
    }

    public final HttpTransport getTransport() {
        return this.transport;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z10) {
        boolean zFind;
        boolean z11;
        List<String> authenticateAsList = httpResponse.getHeaders().getAuthenticateAsList();
        boolean z12 = true;
        if (authenticateAsList == null) {
            zFind = false;
            z11 = false;
            break;
        }
        Iterator<String> it = authenticateAsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                zFind = false;
                z11 = false;
                break;
            }
            String next = it.next();
            if (next.startsWith("Bearer ")) {
                zFind = BearerToken.INVALID_TOKEN_ERROR.matcher(next).find();
                z11 = true;
                break;
            }
        }
        if (!z11) {
            zFind = httpResponse.getStatusCode() == 401;
        }
        if (zFind) {
            try {
                this.lock.lock();
                try {
                    if (Objects.equal(this.accessToken, this.method.getAccessTokenFromRequest(httpRequest)) && !refreshToken()) {
                        z12 = false;
                    }
                    return z12;
                } finally {
                    this.lock.unlock();
                }
            } catch (IOException e10) {
                LOGGER.log(Level.SEVERE, "unable to refresh token", (Throwable) e10);
            }
        }
        return false;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0005, B:6:0x000f, B:15:0x0029, B:11:0x001c), top: B:19:0x0005 }] */
    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) {
        this.lock.lock();
        try {
            Long expiresInSeconds = getExpiresInSeconds();
            if (this.accessToken == null || (expiresInSeconds != null && expiresInSeconds.longValue() <= 60)) {
                refreshToken();
                if (this.accessToken != null) {
                    this.method.intercept(httpRequest, this.accessToken);
                }
            } else {
                this.method.intercept(httpRequest, this.accessToken);
            }
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean refreshToken() {
        this.lock.lock();
        boolean z10 = true;
        try {
            try {
                TokenResponse tokenResponseExecuteRefreshToken = executeRefreshToken();
                if (tokenResponseExecuteRefreshToken != null) {
                    setFromTokenResponse(tokenResponseExecuteRefreshToken);
                    Iterator<CredentialRefreshListener> it = this.refreshListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onTokenResponse(this, tokenResponseExecuteRefreshToken);
                    }
                    this.lock.unlock();
                    return true;
                }
            } catch (TokenResponseException e10) {
                if (400 > e10.getStatusCode() || e10.getStatusCode() >= 500) {
                    z10 = false;
                }
                if (e10.getDetails() != null && z10) {
                    setAccessToken(null);
                    setExpiresInSeconds(null);
                }
                Iterator<CredentialRefreshListener> it2 = this.refreshListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onTokenErrorResponse(this, e10.getDetails());
                }
                if (z10) {
                    throw e10;
                }
            }
            this.lock.unlock();
            return false;
        } catch (Throwable th2) {
            this.lock.unlock();
            throw th2;
        }
    }

    public Credential setAccessToken(String str) {
        this.lock.lock();
        try {
            this.accessToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public Credential setExpirationTimeMilliseconds(Long l10) {
        this.lock.lock();
        try {
            this.expirationTimeMilliseconds = l10;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public Credential setExpiresInSeconds(Long l10) {
        return setExpirationTimeMilliseconds(l10 == null ? null : Long.valueOf(this.clock.currentTimeMillis() + (l10.longValue() * 1000)));
    }

    public Credential setFromTokenResponse(TokenResponse tokenResponse) {
        setAccessToken(tokenResponse.getAccessToken());
        if (tokenResponse.getRefreshToken() != null) {
            setRefreshToken(tokenResponse.getRefreshToken());
        }
        setExpiresInSeconds(tokenResponse.getExpiresInSeconds());
        return this;
    }

    public Credential setRefreshToken(String str) {
        this.lock.lock();
        if (str != null) {
            try {
                Preconditions.checkArgument((this.jsonFactory == null || this.transport == null || this.clientAuthentication == null || this.tokenServerEncodedUrl == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } finally {
                this.lock.unlock();
            }
        }
        this.refreshToken = str;
        return this;
    }

    protected Credential(Builder builder) {
        this.lock = new ReentrantLock();
        this.method = (AccessMethod) Preconditions.checkNotNull(builder.method);
        this.transport = builder.transport;
        this.jsonFactory = builder.jsonFactory;
        GenericUrl genericUrl = builder.tokenServerUrl;
        this.tokenServerEncodedUrl = genericUrl == null ? null : genericUrl.build();
        this.clientAuthentication = builder.clientAuthentication;
        this.requestInitializer = builder.requestInitializer;
        this.refreshListeners = Collections.unmodifiableCollection(builder.refreshListeners);
        this.clock = (Clock) Preconditions.checkNotNull(builder.clock);
    }
}
