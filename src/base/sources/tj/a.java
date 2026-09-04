package tj;

import bm.r;
import com.coremedia.iso.boxes.AuthorBox;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Random;
import ji.i;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53428a = new a();

    private a() {
    }

    private final String a(String str, String str2) {
        for (String str3 : (String[]) r.F0(str2, new String[]{"&"}, false, 0, 6, null).toArray(new String[0])) {
            if (r.T(str3, str, false, 2, null)) {
                String strSubstring = str3.substring(str.length());
                s.g(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public final String b(String user, String password, String salt, String challenge, String opaque) {
        s.h(user, "user");
        s.h(password, "password");
        s.h(salt, "salt");
        s.h(challenge, "challenge");
        s.h(opaque, "opaque");
        o0 o0Var = o0.f43602a;
        String str = String.format("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(new Random().nextInt())}, 1));
        s.g(str, "format(...)");
        String strH = h(user + salt + password);
        if (opaque.length() > 0) {
            strH = strH + opaque;
        } else if (challenge.length() > 0) {
            strH = strH + challenge;
        }
        String str2 = "?authmod=adobe&user=" + user + "&challenge=" + str + "&response=" + h(strH + str);
        if (opaque.length() <= 0) {
            return str2;
        }
        return str2 + "&opaque=" + opaque;
    }

    public final String c(String description) {
        s.h(description, "description");
        return a("challenge=", description);
    }

    public final String d(String user, String password, String nonce, String app) {
        String strSubstring;
        s.h(user, "user");
        s.h(password, "password");
        s.h(nonce, "nonce");
        s.h(app, "app");
        o0 o0Var = o0.f43602a;
        String str = String.format("%08x", Arrays.copyOf(new Object[]{1}, 1));
        s.g(str, "format(...)");
        String str2 = String.format("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(new Random().nextInt())}, 1));
        s.g(str2, "format(...)");
        int iF0 = r.f0(app, "?", 0, false, 6, null);
        if (iF0 >= 0) {
            strSubstring = app.substring(0, iF0);
            s.g(strSubstring, "substring(...)");
        } else {
            strSubstring = app;
        }
        if (!r.T(strSubstring, "/", false, 2, null)) {
            strSubstring = strSubstring + "/_definst_";
        }
        String strF = i.f(user + ":live:" + password);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("publish");
        sb2.append(":/");
        sb2.append(strSubstring);
        return "?authmod=llnw&user=" + user + "&nonce=" + nonce + "&cnonce=" + str2 + "&nc=" + str + "&response=" + i.f(strF + ":" + nonce + ":" + str + ":" + str2 + ":" + AuthorBox.TYPE + ":" + i.f(sb2.toString()));
    }

    public final String e(String description) {
        s.h(description, "description");
        return a("nonce=", description);
    }

    public final String f(String description) {
        s.h(description, "description");
        return a("opaque=", description);
    }

    public final String g(String description) {
        s.h(description, "description");
        return a("salt=", description);
    }

    public final String h(String s10) {
        s.h(s10, "s");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bytes = s10.getBytes(bm.d.f9079b);
            s.g(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            rl.a.C0793a c0793a = rl.a.f51358f;
            s.e(bArrDigest);
            return rl.a.d(c0793a, bArrDigest, 0, 0, 6, null);
        } catch (Exception unused) {
            return "";
        }
    }
}
