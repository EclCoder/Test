package com.google.api.client.auth.oauth;

import com.google.api.client.util.Base64;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.security.PrivateKey;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class OAuthRsaSigner implements OAuthSigner {
    public PrivateKey privateKey;

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String computeSignature(String str) {
        return Base64.encodeBase64String(SecurityUtils.sign(SecurityUtils.getSha1WithRsaSignatureAlgorithm(), this.privateKey, StringUtils.getBytesUtf8(str)));
    }

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String getSignatureMethod() {
        return "RSA-SHA1";
    }
}
