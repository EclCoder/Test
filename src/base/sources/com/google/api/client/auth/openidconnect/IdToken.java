package com.google.api.client.auth.openidconnect;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class IdToken extends JsonWebSignature {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Payload extends JsonWebToken.Payload {

        @Key("at_hash")
        private String accessTokenHash;

        @Key("auth_time")
        private Long authorizationTimeSeconds;

        @Key("azp")
        private String authorizedParty;

        @Key("acr")
        private String classReference;

        @Key("amr")
        private List<String> methodsReferences;

        @Key
        private String nonce;

        public final String getAccessTokenHash() {
            return this.accessTokenHash;
        }

        public final Long getAuthorizationTimeSeconds() {
            return this.authorizationTimeSeconds;
        }

        public final String getAuthorizedParty() {
            return this.authorizedParty;
        }

        public final String getClassReference() {
            return this.classReference;
        }

        public final List<String> getMethodsReferences() {
            return this.methodsReferences;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public Payload setAccessTokenHash(String str) {
            this.accessTokenHash = str;
            return this;
        }

        public Payload setAuthorizationTimeSeconds(Long l10) {
            this.authorizationTimeSeconds = l10;
            return this;
        }

        public Payload setAuthorizedParty(String str) {
            this.authorizedParty = str;
            return this;
        }

        public Payload setClassReference(String str) {
            this.classReference = str;
            return this;
        }

        public Payload setMethodsReferences(List<String> list) {
            this.methodsReferences = list;
            return this;
        }

        public Payload setNonce(String str) {
            this.nonce = str;
            return this;
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setAudience(Object obj) {
            return (Payload) super.setAudience(obj);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setExpirationTimeSeconds(Long l10) {
            return (Payload) super.setExpirationTimeSeconds(l10);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setIssuedAtTimeSeconds(Long l10) {
            return (Payload) super.setIssuedAtTimeSeconds(l10);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setIssuer(String str) {
            return (Payload) super.setIssuer(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setJwtId(String str) {
            return (Payload) super.setJwtId(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setNotBeforeTimeSeconds(Long l10) {
            return (Payload) super.setNotBeforeTimeSeconds(l10);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setSubject(String str) {
            return (Payload) super.setSubject(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload
        public Payload setType(String str) {
            return (Payload) super.setType(str);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload, com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Payload, com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Payload clone() {
            return (Payload) super.clone();
        }
    }

    public IdToken(JsonWebSignature.Header header, Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload, bArr, bArr2);
    }

    public static IdToken parse(JsonFactory jsonFactory, String str) {
        JsonWebSignature jsonWebSignature = JsonWebSignature.parser(jsonFactory).setPayloadClass(Payload.class).parse(str);
        return new IdToken(jsonWebSignature.getHeader(), (Payload) jsonWebSignature.getPayload(), jsonWebSignature.getSignatureBytes(), jsonWebSignature.getSignedContentBytes());
    }

    public final boolean verifyAudience(Collection<String> collection) {
        List<String> audienceAsList = getPayload().getAudienceAsList();
        if (audienceAsList.isEmpty()) {
            return false;
        }
        return collection.containsAll(audienceAsList);
    }

    public final boolean verifyExpirationTime(long j10, long j11) {
        return j10 <= (getPayload().getExpirationTimeSeconds().longValue() + j11) * 1000;
    }

    public final boolean verifyIssuedAtTime(long j10, long j11) {
        return j10 >= (getPayload().getIssuedAtTimeSeconds().longValue() - j11) * 1000;
    }

    public final boolean verifyIssuer(String str) {
        return verifyIssuer(Collections.singleton(str));
    }

    public final boolean verifyTime(long j10, long j11) {
        return verifyExpirationTime(j10, j11) && verifyIssuedAtTime(j10, j11);
    }

    @Override // com.google.api.client.json.webtoken.JsonWebToken
    public Payload getPayload() {
        return (Payload) super.getPayload();
    }

    public final boolean verifyIssuer(Collection<String> collection) {
        return collection.contains(getPayload().getIssuer());
    }
}
