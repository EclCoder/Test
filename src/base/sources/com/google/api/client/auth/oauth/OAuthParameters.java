package com.google.api.client.auth.oauth;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.util.escape.PercentEscaper;
import com.google.common.collect.o1;
import com.google.common.collect.r0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class OAuthParameters implements HttpExecuteInterceptor, HttpRequestInitializer {
    public String callback;
    public String consumerKey;
    public String nonce;
    public String realm;
    public String signature;
    public String signatureMethod;
    public OAuthSigner signer;
    public String timestamp;
    public String token;
    public String verifier;
    public String version;
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final PercentEscaper ESCAPER = new PercentEscaper("-_.~");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class Parameter implements Comparable<Parameter> {
        private final String key;
        private final String value;

        public Parameter(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Comparable
        public int compareTo(Parameter parameter) {
            int iCompareTo = this.key.compareTo(parameter.key);
            return iCompareTo == 0 ? this.value.compareTo(parameter.value) : iCompareTo;
        }
    }

    private void appendParameter(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(escape(str));
            sb2.append("=\"");
            sb2.append(escape(str2));
            sb2.append("\",");
        }
    }

    public static String escape(String str) {
        return ESCAPER.escape(str);
    }

    private void putParameter(r0 r0Var, String str, Object obj) {
        r0Var.add(new Parameter(escape(str), obj == null ? null : escape(obj.toString())));
    }

    private void putParameterIfValueNotNull(r0 r0Var, String str, String str2) {
        if (str2 != null) {
            putParameter(r0Var, str, str2);
        }
    }

    public void computeNonce() {
        this.nonce = Long.toHexString(Math.abs(RANDOM.nextLong()));
    }

    public void computeSignature(String str, GenericUrl genericUrl) {
        OAuthSigner oAuthSigner = this.signer;
        String signatureMethod = oAuthSigner.getSignatureMethod();
        this.signatureMethod = signatureMethod;
        o1 o1VarC = o1.C();
        putParameterIfValueNotNull(o1VarC, "oauth_callback", this.callback);
        putParameterIfValueNotNull(o1VarC, "oauth_consumer_key", this.consumerKey);
        putParameterIfValueNotNull(o1VarC, "oauth_nonce", this.nonce);
        putParameterIfValueNotNull(o1VarC, "oauth_signature_method", signatureMethod);
        putParameterIfValueNotNull(o1VarC, "oauth_timestamp", this.timestamp);
        putParameterIfValueNotNull(o1VarC, "oauth_token", this.token);
        putParameterIfValueNotNull(o1VarC, "oauth_verifier", this.verifier);
        putParameterIfValueNotNull(o1VarC, "oauth_version", this.version);
        for (Map.Entry<String, Object> entry : genericUrl.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value instanceof Collection) {
                    Iterator it = ((Collection) value).iterator();
                    while (it.hasNext()) {
                        putParameter(o1VarC, key, it.next());
                    }
                } else {
                    putParameter(o1VarC, key, value);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Parameter parameter : o1VarC.l()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append('&');
            }
            sb2.append(parameter.getKey());
            String value2 = parameter.getValue();
            if (value2 != null) {
                sb2.append('=');
                sb2.append(value2);
            }
        }
        String string = sb2.toString();
        GenericUrl genericUrl2 = new GenericUrl();
        String scheme = genericUrl.getScheme();
        genericUrl2.setScheme(scheme);
        genericUrl2.setHost(genericUrl.getHost());
        genericUrl2.setPathParts(genericUrl.getPathParts());
        int port = genericUrl.getPort();
        if (("http".equals(scheme) && port == 80) || ("https".equals(scheme) && port == 443)) {
            port = -1;
        }
        genericUrl2.setPort(port);
        this.signature = oAuthSigner.computeSignature(escape(str) + '&' + escape(genericUrl2.build()) + '&' + escape(string));
    }

    public void computeTimestamp() {
        this.timestamp = Long.toString(System.currentTimeMillis() / 1000);
    }

    public String getAuthorizationHeader() {
        StringBuilder sb2 = new StringBuilder("OAuth");
        appendParameter(sb2, "realm", this.realm);
        appendParameter(sb2, "oauth_callback", this.callback);
        appendParameter(sb2, "oauth_consumer_key", this.consumerKey);
        appendParameter(sb2, "oauth_nonce", this.nonce);
        appendParameter(sb2, "oauth_signature", this.signature);
        appendParameter(sb2, "oauth_signature_method", this.signatureMethod);
        appendParameter(sb2, "oauth_timestamp", this.timestamp);
        appendParameter(sb2, "oauth_token", this.token);
        appendParameter(sb2, "oauth_verifier", this.verifier);
        appendParameter(sb2, "oauth_version", this.version);
        return sb2.substring(0, sb2.length() - 1);
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        computeNonce();
        computeTimestamp();
        try {
            computeSignature(httpRequest.getRequestMethod(), httpRequest.getUrl());
            httpRequest.getHeaders().setAuthorization(getAuthorizationHeader());
        } catch (GeneralSecurityException e10) {
            IOException iOException = new IOException();
            iOException.initCause(e10);
            throw iOException;
        }
    }
}
