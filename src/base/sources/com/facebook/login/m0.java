package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f15667a = new m0();

    private m0() {
    }

    public static final com.facebook.j0 a(String authorizationCode, String redirectUri, String codeVerifier) {
        kotlin.jvm.internal.s.h(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.s.h(redirectUri, "redirectUri");
        kotlin.jvm.internal.s.h(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", com.facebook.h0.n());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        com.facebook.j0 j0VarX = com.facebook.j0.f15486n.x(null, "oauth/access_token", null);
        j0VarX.F(com.facebook.p0.GET);
        j0VarX.G(bundle);
        return j0VarX;
    }

    public static final String b(String codeVerifier, a codeChallengeMethod) {
        kotlin.jvm.internal.s.h(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.s.h(codeChallengeMethod, "codeChallengeMethod");
        if (!d(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == a.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(bm.d.f9083f);
            kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            kotlin.jvm.internal.s.g(strEncodeToString, "{\n      // try to genera… or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new FacebookException(e10);
        }
    }

    public static final String c() {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(86) + 43;
        List listT0 = gl.r.t0(gl.r.t0(gl.r.t0(gl.r.t0(gl.r.s0(gl.r.r0(new yl.c('a', 'z'), new yl.c('A', 'Z')), new yl.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iNextInt);
        for (int i10 = 0; i10 < iNextInt; i10++) {
            Character ch2 = (Character) listT0.get(secureRandom.nextInt(listT0.size()));
            ch2.charValue();
            arrayList.add(ch2);
        }
        return gl.r.l0(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final boolean d(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new bm.o("^[-._~A-Za-z0-9]+$").h(str);
    }
}
