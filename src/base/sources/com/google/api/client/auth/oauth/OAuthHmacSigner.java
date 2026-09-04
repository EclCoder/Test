package com.google.api.client.auth.oauth;

import com.google.api.client.util.Base64;
import com.google.api.client.util.StringUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class OAuthHmacSigner implements OAuthSigner {
    public String clientSharedSecret;
    public String tokenSharedSecret;

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String computeSignature(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.clientSharedSecret;
        if (str2 != null) {
            sb2.append(OAuthParameters.escape(str2));
        }
        sb2.append('&');
        String str3 = this.tokenSharedSecret;
        if (str3 != null) {
            sb2.append(OAuthParameters.escape(str3));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(StringUtils.getBytesUtf8(sb2.toString()), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        return Base64.encodeBase64String(mac.doFinal(StringUtils.getBytesUtf8(str)));
    }

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String getSignatureMethod() {
        return "HMAC-SHA1";
    }
}
