package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.api.client.http.HttpMethods;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f18104a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f18105b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f18106c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f18107d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f18108e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f18109f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f18110g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f18111h = new String(new byte[]{13, 10});

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f18113b;

        public a(String str, String str2) {
            this.f18112a = str;
            this.f18113b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18115b;

        public b(String str, long j10) {
            this.f18114a = str;
            this.f18115b = j10;
        }
    }

    public static void a(boolean z10, String str) throws ParserException {
        if (!z10) {
            throw ParserException.c(str, null);
        }
    }

    public static byte[] b(List list) {
        return sc.i.g(f18111h).d(list).getBytes(s.f18082g);
    }

    private static String c(int i10) {
        if (i10 == 200) {
            return "OK";
        }
        if (i10 == 461) {
            return "Unsupported Transport";
        }
        if (i10 == 500) {
            return "Internal Server Error";
        }
        if (i10 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i10 == 301) {
            return "Move Permanently";
        }
        if (i10 == 302) {
            return "Move Temporarily";
        }
        if (i10 == 400) {
            return "Bad Request";
        }
        if (i10 == 401) {
            return "Unauthorized";
        }
        if (i10 == 404) {
            return "Not Found";
        }
        if (i10 == 405) {
            return "Method Not Allowed";
        }
        switch (i10) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(s.f18082g);
    }

    public static boolean e(List list) {
        return f18105b.matcher((CharSequence) list.get(0)).matches();
    }

    public static boolean f(String str) {
        return f18104a.matcher(str).matches() || f18105b.matcher(str).matches();
    }

    public static long g(String str) throws ParserException {
        try {
            Matcher matcher = f18106c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) ob.a.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e10) {
            throw ParserException.c(str, e10);
        }
    }

    public static int h(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw ParserException.c(str, e10);
        }
    }

    private static int i(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static com.google.common.collect.c0 j(String str) {
        if (str == null) {
            return com.google.common.collect.c0.C();
        }
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        for (String str2 : r0.Y0(str, ",\\s?")) {
            aVar.a(Integer.valueOf(i(str2)));
        }
        return aVar.m();
    }

    public static x k(List list) {
        Matcher matcher = f18104a.matcher((CharSequence) list.get(0));
        ob.a.a(matcher.matches());
        int i10 = i((String) ob.a.e(matcher.group(1)));
        Uri uri = Uri.parse((String) ob.a.e(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        ob.a.a(iIndexOf > 0);
        return new x(uri, i10, new m.b().c(list.subList(1, iIndexOf)).e(), sc.i.g(f18111h).d(list.subList(iIndexOf + 1, list.size())));
    }

    public static y l(List list) {
        Matcher matcher = f18105b.matcher((CharSequence) list.get(0));
        ob.a.a(matcher.matches());
        int i10 = Integer.parseInt((String) ob.a.e(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        ob.a.a(iIndexOf > 0);
        return new y(i10, new m.b().c(list.subList(1, iIndexOf)).e(), sc.i.g(f18111h).d(list.subList(iIndexOf + 1, list.size())));
    }

    public static b m(String str) throws ParserException {
        long j10;
        Matcher matcher = f18107d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.c(str, null);
        }
        String str2 = (String) ob.a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e10) {
                throw ParserException.c(str, e10);
            }
        } else {
            j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        return new b(str2, j10);
    }

    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrZ0 = r0.Z0(userInfo, ":");
        return new a(strArrZ0[0], strArrZ0[1]);
    }

    public static i o(String str) throws ParserException {
        Matcher matcher = f18108e.matcher(str);
        if (matcher.find()) {
            return new i(2, (String) ob.a.e(matcher.group(1)), (String) ob.a.e(matcher.group(3)), sc.w.e(matcher.group(4)));
        }
        Matcher matcher2 = f18109f.matcher(str);
        if (matcher2.matches()) {
            return new i(1, (String) ob.a.e(matcher2.group(1)), "", "");
        }
        throw ParserException.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) ob.a.e(uri.getAuthority());
        ob.a.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(r0.Y0(str, "@")[1]).build();
    }

    public static com.google.common.collect.c0 q(x xVar) {
        ob.a.a(xVar.f18123c.d("CSeq") != null);
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        aVar.a(r0.D("%s %s %s", t(xVar.f18122b), xVar.f18121a, "RTSP/1.0"));
        com.google.common.collect.d0 d0VarB = xVar.f18123c.b();
        p1 it = d0VarB.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.google.common.collect.c0 c0Var = d0VarB.get(str);
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                aVar.a(r0.D("%s: %s", str, c0Var.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(xVar.f18124d);
        return aVar.m();
    }

    public static com.google.common.collect.c0 r(y yVar) {
        ob.a.a(yVar.f18126b.d("CSeq") != null);
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        aVar.a(r0.D("%s %s %s", "RTSP/1.0", Integer.valueOf(yVar.f18125a), c(yVar.f18125a)));
        com.google.common.collect.d0 d0VarB = yVar.f18126b.b();
        p1 it = d0VarB.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.google.common.collect.c0 c0Var = d0VarB.get(str);
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                aVar.a(r0.D("%s: %s", str, c0Var.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(yVar.f18127c);
        return aVar.m();
    }

    public static String[] s(String str) {
        String str2 = f18111h;
        if (!str.contains(str2)) {
            str2 = f18110g;
        }
        return r0.Y0(str, str2);
    }

    public static String t(int i10) {
        switch (i10) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return HttpMethods.OPTIONS;
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
