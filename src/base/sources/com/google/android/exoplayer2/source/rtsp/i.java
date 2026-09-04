package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18005d;

    public i(int i10, String str, String str2, String str3) {
        this.f18002a = i10;
        this.f18003b = str;
        this.f18004c = str2;
        this.f18005d = str3;
    }

    private String b(u.a aVar) {
        return r0.D("Basic %s", Base64.encodeToString(u.d(aVar.f18112a + ":" + aVar.f18113b), 0));
    }

    private String c(u.a aVar, Uri uri, int i10) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            String strT = u.t(i10);
            String strE1 = r0.e1(messageDigest.digest(u.d(aVar.f18112a + ":" + this.f18003b + ":" + aVar.f18113b)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strT);
            sb2.append(":");
            sb2.append(uri);
            String strE2 = r0.e1(messageDigest.digest(u.d(strE1 + ":" + this.f18004c + ":" + r0.e1(messageDigest.digest(u.d(sb2.toString()))))));
            return this.f18005d.isEmpty() ? r0.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f18112a, this.f18003b, this.f18004c, uri, strE2) : r0.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f18112a, this.f18003b, this.f18004c, uri, strE2, this.f18005d);
        } catch (NoSuchAlgorithmException e10) {
            throw ParserException.d(null, e10);
        }
    }

    public String a(u.a aVar, Uri uri, int i10) throws ParserException {
        int i11 = this.f18002a;
        if (i11 == 1) {
            return b(aVar);
        }
        if (i11 == 2) {
            return c(aVar, uri, i10);
        }
        throw ParserException.d(null, new UnsupportedOperationException());
    }
}
