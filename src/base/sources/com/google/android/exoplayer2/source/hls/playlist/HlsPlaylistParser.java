package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import ca.l;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.i0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.p0;
import ob.r0;
import ob.u;
import ob.y;
import wa.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class HlsPlaylistParser implements com.google.android.exoplayer2.upstream.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f17725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f17726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f17701c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f17702d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f17703e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f17704f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f17705g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f17706h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f17707i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f17708j = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f17709k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f17710l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f17711m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f17712n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f17713o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f17714p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f17715q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f17716r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f17717s = b("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f17718t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f17719u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f17720v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f17721w = b("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f17722x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f17723y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f17724z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = b("AUTOSELECT");
    private static final Pattern U = b("DEFAULT");
    private static final Pattern V = b("FORCED");
    private static final Pattern W = b("INDEPENDENT");
    private static final Pattern X = b("GAP");
    private static final Pattern Y = b("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f17699a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f17700b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class DeltaUpdateException extends IOException {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f17727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue f17728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17729c;

        public a(Queue queue, BufferedReader bufferedReader) {
            this.f17728b = queue;
            this.f17727a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f17729c != null) {
                return true;
            }
            if (!this.f17728b.isEmpty()) {
                this.f17729c = (String) ob.a.e((String) this.f17728b.poll());
                return true;
            }
            do {
                String line = this.f17727a.readLine();
                this.f17729c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f17729c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f17729c;
            this.f17729c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(d.f17804n, null);
    }

    private static String A(String str, Map map) {
        Matcher matcher = f17700b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int B(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !r0.C0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean a(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iB = B(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iB != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iB = bufferedReader.read();
        }
        return r0.C0(B(bufferedReader, false, iB));
    }

    private static Pattern b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static h c(String str, h.b[] bVarArr) {
        h.b[] bVarArr2 = new h.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b(null);
        }
        return new h(str, bVarArr2);
    }

    private static String d(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static d.b e(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d.b bVar = (d.b) arrayList.get(i10);
            if (str.equals(bVar.f17822d)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d.b bVar = (d.b) arrayList.get(i10);
            if (str.equals(bVar.f17823e)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d.b bVar = (d.b) arrayList.get(i10);
            if (str.equals(bVar.f17821c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double i(String str, Pattern pattern) {
        return Double.parseDouble(y(str, pattern, Collections.EMPTY_MAP));
    }

    private static h.b j(String str, String str2, Map map) throws ParserException {
        String strT = t(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strY = y(str, K, map);
            return new h.b(o9.b.f48265d, MimeTypes.VIDEO_MP4, Base64.decode(strY.substring(strY.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new h.b(o9.b.f48265d, "hls", r0.q0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strT)) {
            return null;
        }
        String strY2 = y(str, K, map);
        byte[] bArrDecode = Base64.decode(strY2.substring(strY2.indexOf(44)), 0);
        UUID uuid = o9.b.f48266e;
        return new h.b(uuid, MimeTypes.VIDEO_MP4, l.a(uuid, bArrDecode));
    }

    private static String k(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
    }

    private static int l(String str, Pattern pattern) {
        return Integer.parseInt(y(str, pattern, Collections.EMPTY_MAP));
    }

    private static long m(String str, Pattern pattern) {
        return Long.parseLong(y(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0322 A[PHI: r13
      0x0322: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v2 java.lang.String) binds: [B:118:0x0331, B:112:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:228:0x0624  */
    /* JADX WARN: Code duplicated, block: B:230:0x0631  */
    /* JADX WARN: Code duplicated, block: B:233:0x0647  */
    private static c n(d dVar, c cVar, a aVar, String str) throws DeltaUpdateException, ParserException {
        String str2;
        c.d dVar2;
        int i10;
        long j10;
        long j11;
        long j12;
        c.d dVar3;
        long j13;
        boolean z10;
        h hVar;
        h hVarC;
        c.d dVar4;
        dVar = dVar;
        c cVar2 = cVar;
        boolean z11 = dVar.f56812c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c.f fVar = new c.f(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        boolean z12 = z11;
        long j14 = -9223372036854775807L;
        long jI = -9223372036854775807L;
        long j15 = 0;
        long j16 = 0;
        long jH0 = 0;
        long j17 = 0;
        long jM = 0;
        long jZ = 0;
        long j18 = 0;
        String strT = "";
        String str3 = strT;
        boolean zP = false;
        String strK = null;
        h hVar2 = null;
        c.b bVar = null;
        int i11 = 0;
        boolean z13 = false;
        h hVarC2 = null;
        String str4 = null;
        long j19 = -1;
        boolean z14 = false;
        boolean z15 = false;
        int i12 = 0;
        c.d dVar5 = null;
        int i13 = 0;
        String strY = null;
        long j20 = -1;
        boolean z16 = false;
        long jL = -9223372036854775807L;
        long j21 = 0;
        int iL = 1;
        while (aVar.a()) {
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList4.add(strB);
            }
            if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strY2 = y(strB, f17715q, map);
                if ("VOD".equals(strY2)) {
                    i11 = 1;
                } else if ("EVENT".equals(strY2)) {
                    i11 = 2;
                }
            } else if (strB.equals("#EXT-X-I-FRAMES-ONLY")) {
                z16 = true;
            } else {
                if (strB.startsWith("#EXT-X-START")) {
                    ArrayList arrayList5 = arrayList4;
                    fVar = fVar;
                    long jI2 = (long) (i(strB, C) * 1000000.0d);
                    zP = p(strB, Y, false);
                    arrayList4 = arrayList5;
                    j14 = jI2;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    fVar = fVar;
                    if (strB.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar = x(strB);
                        arrayList4 = arrayList6;
                    } else if (strB.startsWith("#EXT-X-PART-INF")) {
                        jI = (long) (i(strB, f17713o) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (strB.startsWith("#EXT-X-MAP")) {
                        String strY3 = y(strB, K, map);
                        boolean z17 = zP;
                        String strU = u(strB, E, map);
                        if (strU != null) {
                            String[] strArrY0 = r0.Y0(strU, "@");
                            j19 = Long.parseLong(strArrY0[0]);
                            if (strArrY0.length > 1) {
                                j15 = Long.parseLong(strArrY0[1]);
                            }
                        }
                        long j22 = j19;
                        long j23 = j22 == j20 ? 0L : j15;
                        if (strY != null && str4 == null) {
                            throw ParserException.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        c.d dVar6 = new c.d(strY3, j23, j22, strY, str4);
                        String str5 = str4;
                        if (j22 != j20) {
                            j23 += j22;
                        }
                        str4 = str5;
                        arrayList4 = arrayList6;
                        dVar5 = dVar6;
                        j15 = j23;
                        j19 = j20;
                        fVar = fVar;
                        zP = z17;
                    } else {
                        zP = zP;
                        arrayList4 = arrayList6;
                        str4 = str4;
                        strY = strY;
                        if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                            jL = 1000000 * ((long) l(strB, f17711m));
                        } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            jM = m(strB, f17722x);
                            j21 = jM;
                            fVar = fVar;
                            zP = zP;
                            arrayList4 = arrayList4;
                        } else if (strB.startsWith("#EXT-X-VERSION")) {
                            iL = l(strB, f17714p);
                        } else {
                            if (strB.startsWith("#EXT-X-DEFINE")) {
                                String strU2 = u(strB, f17699a0, map);
                                if (strU2 != null) {
                                    String str6 = (String) dVar.f17813l.get(strU2);
                                    if (str6 != null) {
                                        map.put(strU2, str6);
                                    }
                                } else {
                                    map.put(y(strB, P, map), y(strB, Z, map));
                                }
                                treeMap = treeMap;
                                str2 = str3;
                            } else if (strB.startsWith("#EXTINF")) {
                                jZ = z(strB, f17723y);
                                strT = t(strB, f17724z, str3, map);
                            } else {
                                String str7 = str3;
                                if (strB.startsWith("#EXT-X-SKIP")) {
                                    int iL2 = l(strB, f17718t);
                                    ob.a.g(cVar2 != null && arrayList.isEmpty());
                                    str2 = str7;
                                    int i14 = (int) (j21 - ((c) r0.j(cVar2)).f17769k);
                                    int i15 = iL2 + i14;
                                    if (i14 < 0 || i15 > cVar2.f17776r.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    strY = strY;
                                    str4 = str4;
                                    long j24 = j16;
                                    while (i14 < i15) {
                                        c.d dVarB = (c.d) cVar2.f17776r.get(i14);
                                        int i16 = i14;
                                        if (j21 != cVar2.f17769k) {
                                            dVarB = dVarB.b(j24, (cVar2.f17768j - i12) + dVarB.f17791d);
                                        }
                                        arrayList.add(dVarB);
                                        j17 = j24 + dVarB.f17790c;
                                        long j25 = dVarB.f17797j;
                                        if (j25 != j20) {
                                            j15 = dVarB.f17796i + j25;
                                        }
                                        int i17 = dVarB.f17791d;
                                        c.d dVar7 = dVarB.f17789b;
                                        hVar2 = dVarB.f17793f;
                                        String str8 = dVarB.f17794g;
                                        String str9 = dVarB.f17795h;
                                        int i18 = i15;
                                        if (str9 == null || !str9.equals(Long.toHexString(jM))) {
                                            str4 = dVarB.f17795h;
                                        }
                                        jM++;
                                        i13 = i17;
                                        dVar5 = dVar7;
                                        strY = str8;
                                        j24 = j17;
                                        i14 = i16 + 1;
                                        i15 = i18;
                                    }
                                    j16 = j24;
                                } else {
                                    str2 = str7;
                                    if (strB.startsWith("#EXT-X-KEY")) {
                                        String strY4 = y(strB, H, map);
                                        String strT2 = t(strB, I, "identity", map);
                                        if ("NONE".equals(strY4)) {
                                            treeMap.clear();
                                            hVar2 = null;
                                            str4 = null;
                                            strY = null;
                                        } else {
                                            String strU3 = u(strB, L, map);
                                            if (!"identity".equals(strT2)) {
                                                if (strK == null) {
                                                    strK = k(strY4);
                                                }
                                                h.b bVarJ = j(strB, strT2, map);
                                                if (bVarJ != null) {
                                                    treeMap.put(strT2, bVarJ);
                                                    str4 = strU3;
                                                    hVar2 = null;
                                                    strY = null;
                                                } else {
                                                    str4 = strU3;
                                                    strY = null;
                                                }
                                            } else if ("AES-128".equals(strY4)) {
                                                strY = y(strB, K, map);
                                                str4 = strU3;
                                            } else {
                                                str4 = strU3;
                                                strY = null;
                                            }
                                        }
                                    } else {
                                        if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                            String[] strArrY1 = r0.Y0(y(strB, D, map), "@");
                                            j19 = Long.parseLong(strArrY1[0]);
                                            if (strArrY1.length > 1) {
                                                j15 = Long.parseLong(strArrY1[1]);
                                            }
                                        } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i12 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                            dVar = dVar;
                                            strY = strY;
                                            str4 = str4;
                                            fVar = fVar;
                                            zP = zP;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z15 = true;
                                        } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                            i13++;
                                        } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jH0 == 0) {
                                                jH0 = r0.H0(r0.O0(strB.substring(strB.indexOf(58) + 1))) - j16;
                                            } else {
                                                treeMap = treeMap;
                                            }
                                        } else if (strB.equals("#EXT-X-GAP")) {
                                            dVar = dVar;
                                            strY = strY;
                                            str4 = str4;
                                            fVar = fVar;
                                            zP = zP;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z14 = true;
                                        } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            dVar = dVar;
                                            strY = strY;
                                            str4 = str4;
                                            fVar = fVar;
                                            zP = zP;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z12 = true;
                                        } else if (strB.equals("#EXT-X-ENDLIST")) {
                                            dVar = dVar;
                                            strY = strY;
                                            str4 = str4;
                                            fVar = fVar;
                                            zP = zP;
                                            arrayList4 = arrayList4;
                                            str3 = str2;
                                            z13 = true;
                                        } else if (strB.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            treeMap = treeMap;
                                            arrayList3.add(new c.C0287c(Uri.parse(p0.d(str, y(strB, K, map))), s(strB, A, j20), r(strB, B, -1)));
                                        } else {
                                            treeMap = treeMap;
                                            if (!strB.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j10 = jM;
                                                if (strB.startsWith("#EXT-X-PART")) {
                                                    String strD = d(j10, strY, str4);
                                                    String strY5 = y(strB, K, map);
                                                    long jI3 = (long) (i(strB, f17712n) * 1000000.0d);
                                                    boolean zP2 = p(strB, W, false) | (z12 && arrayList2.isEmpty());
                                                    boolean zP3 = p(strB, X, false);
                                                    String strU4 = u(strB, E, map);
                                                    if (strU4 != null) {
                                                        String[] strArrY2 = r0.Y0(strU4, "@");
                                                        long j26 = Long.parseLong(strArrY2[0]);
                                                        if (strArrY2.length > 1) {
                                                            j18 = Long.parseLong(strArrY2[1]);
                                                        }
                                                        j11 = j26;
                                                    } else {
                                                        j11 = -1;
                                                    }
                                                    long j27 = j11 == -1 ? 0L : j18;
                                                    if (hVar2 == null && !treeMap.isEmpty()) {
                                                        h.b[] bVarArr = (h.b[]) treeMap.values().toArray(new h.b[0]);
                                                        hVar2 = new h(strK, bVarArr);
                                                        if (hVarC2 == null) {
                                                            hVarC2 = c(strK, bVarArr);
                                                        }
                                                    }
                                                    h hVar3 = hVar2;
                                                    c.d dVar8 = dVar5;
                                                    int i19 = i13;
                                                    arrayList2.add(new c.b(strY5, dVar5, jI3, i13, j17, hVar3, strY, strD, j27, j11, zP3, zP2, false));
                                                    j17 += jI3;
                                                    if (j11 != -1) {
                                                        j27 += j11;
                                                    }
                                                    j18 = j27;
                                                    dVar5 = dVar8;
                                                    strY = strY;
                                                    jM = j10;
                                                    i13 = i19;
                                                    hVar2 = hVar3;
                                                    str3 = str2;
                                                } else {
                                                    dVar2 = dVar5;
                                                    i10 = i13;
                                                    if (strB.startsWith("#")) {
                                                        j16 = j16;
                                                        dVar = dVar;
                                                        dVar5 = dVar2;
                                                        strY = strY;
                                                        str4 = str4;
                                                        jM = j10;
                                                        strT = strT;
                                                        jZ = jZ;
                                                        j16 = j16;
                                                        j15 = j15;
                                                        fVar = fVar;
                                                        zP = zP;
                                                        arrayList4 = arrayList4;
                                                        str3 = str2;
                                                        treeMap = treeMap;
                                                        j20 = -1;
                                                        cVar2 = cVar;
                                                        i13 = i10;
                                                    } else {
                                                        long j28 = j16;
                                                        String strD2 = d(j10, strY, str4);
                                                        jM = j10 + 1;
                                                        String strA = A(strB, map);
                                                        c.d dVar9 = (c.d) map2.get(strA);
                                                        if (j19 == -1) {
                                                            dVar3 = dVar9;
                                                            j13 = 0;
                                                        } else {
                                                            if (z16 && dVar2 == null && dVar9 == null) {
                                                                j12 = j15;
                                                                dVar9 = new c.d(strA, 0L, j12, null, null);
                                                                map2.put(strA, dVar9);
                                                            } else {
                                                                j12 = j15;
                                                            }
                                                            dVar3 = dVar9;
                                                            j13 = j12;
                                                        }
                                                        if (hVar2 != null || treeMap.isEmpty()) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                            h.b[] bVarArr2 = (h.b[]) treeMap.values().toArray(new h.b[0]);
                                                            hVar2 = new h(strK, bVarArr2);
                                                            if (hVarC2 == null) {
                                                                hVarC = c(strK, bVarArr2);
                                                                hVar = hVar2;
                                                            }
                                                            if (dVar2 != null) {
                                                                dVar4 = dVar2;
                                                            } else {
                                                                dVar4 = dVar3;
                                                            }
                                                            long j29 = jZ;
                                                            arrayList.add(new c.d(strA, dVar4, strT, j29, i10, j28, hVar, strY, strD2, j13, j19, z14, arrayList2));
                                                            j17 = j28 + j29;
                                                            arrayList2 = new ArrayList();
                                                            if (j19 != -1) {
                                                                j13 += j19;
                                                            }
                                                            j15 = j13;
                                                            dVar5 = dVar2;
                                                            strY = strY;
                                                            hVarC2 = hVarC;
                                                            z14 = z10;
                                                            i13 = i10;
                                                            hVar2 = hVar;
                                                            j16 = j17;
                                                            jZ = 0;
                                                            strT = str2;
                                                            str3 = strT;
                                                            j19 = -1;
                                                        }
                                                        hVar = hVar2;
                                                        hVarC = hVarC2;
                                                        if (dVar2 != null) {
                                                            dVar4 = dVar2;
                                                        } else {
                                                            dVar4 = dVar3;
                                                        }
                                                        long j210 = jZ;
                                                        arrayList.add(new c.d(strA, dVar4, strT, j210, i10, j28, hVar, strY, strD2, j13, j19, z14, arrayList2));
                                                        j17 = j28 + j210;
                                                        arrayList2 = new ArrayList();
                                                        if (j19 != -1) {
                                                            j13 += j19;
                                                        }
                                                        j15 = j13;
                                                        dVar5 = dVar2;
                                                        strY = strY;
                                                        hVarC2 = hVarC;
                                                        z14 = z10;
                                                        i13 = i10;
                                                        hVar2 = hVar;
                                                        j16 = j17;
                                                        jZ = 0;
                                                        strT = str2;
                                                        str3 = strT;
                                                        j19 = -1;
                                                    }
                                                }
                                                j20 = -1;
                                                cVar2 = cVar;
                                            } else if (bVar == null && "PART".equals(y(strB, N, map))) {
                                                String strY6 = y(strB, K, map);
                                                long jS = s(strB, F, -1L);
                                                long jS2 = s(strB, G, -1L);
                                                long j30 = jM;
                                                String strD3 = d(j30, strY, str4);
                                                if (hVar2 == null && !treeMap.isEmpty()) {
                                                    h.b[] bVarArr3 = (h.b[]) treeMap.values().toArray(new h.b[0]);
                                                    hVar2 = new h(strK, bVarArr3);
                                                    if (hVarC2 == null) {
                                                        hVarC2 = c(strK, bVarArr3);
                                                    }
                                                }
                                                h hVar4 = hVar2;
                                                if (jS == -1 || jS2 != -1) {
                                                    bVar = new c.b(strY6, dVar5, 0L, i13, j17, hVar4, strY, strD3, jS != -1 ? jS : 0L, jS2, false, false, true);
                                                }
                                                dVar = dVar;
                                                cVar2 = cVar;
                                                strY = strY;
                                                str4 = str4;
                                                jM = j30;
                                                hVar2 = hVar4;
                                                fVar = fVar;
                                                zP = zP;
                                                arrayList4 = arrayList4;
                                                str3 = str2;
                                                treeMap = treeMap;
                                                j20 = -1;
                                            }
                                        }
                                        strY = strY;
                                        str4 = str4;
                                    }
                                }
                                fVar = fVar;
                                zP = zP;
                                arrayList4 = arrayList4;
                                str3 = str2;
                            }
                            dVar2 = dVar5;
                            i10 = i13;
                            j10 = jM;
                            dVar = dVar;
                            dVar5 = dVar2;
                            strY = strY;
                            str4 = str4;
                            jM = j10;
                            strT = strT;
                            jZ = jZ;
                            j16 = j16;
                            j15 = j15;
                            fVar = fVar;
                            zP = zP;
                            arrayList4 = arrayList4;
                            str3 = str2;
                            treeMap = treeMap;
                            j20 = -1;
                            cVar2 = cVar;
                            i13 = i10;
                        }
                        fVar = fVar;
                        zP = zP;
                        arrayList4 = arrayList4;
                    }
                }
                fVar = fVar;
            }
        }
        boolean z18 = zP;
        ArrayList arrayList7 = arrayList4;
        c.f fVar2 = fVar;
        HashMap map3 = new HashMap();
        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
            c.C0287c c0287c = (c.C0287c) arrayList3.get(i20);
            long size = c0287c.f17784b;
            if (size == -1) {
                size = (j21 + ((long) arrayList.size())) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int size2 = c0287c.f17785c;
            if (size2 == -1 && jI != C.TIME_UNSET) {
                size2 = (arrayList2.isEmpty() ? ((c.d) i0.d(arrayList)).f17787m : arrayList2).size() - 1;
            }
            Uri uri = c0287c.f17783a;
            map3.put(uri, new c.C0287c(uri, size, size2));
        }
        if (bVar != null) {
            arrayList2.add(bVar);
        }
        return new c(i11, str, arrayList7, j14, z18, jH0, z15, i12, j21, iL, jL, jI, z12, z13, jH0 != 0, hVarC2, arrayList, arrayList2, fVar2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:82:0x02fc  */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x032a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    private static d o(a aVar, String str) throws ParserException {
        ArrayList arrayList;
        String strG;
        ArrayList arrayList2;
        int i10;
        String str2;
        ArrayList arrayList3;
        String strG2;
        int i11;
        int i12;
        Uri uriE;
        int i13;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            int i14 = 1;
            if (!aVar.a()) {
                ArrayList arrayList12 = arrayList6;
                ArrayList arrayList13 = arrayList7;
                ArrayList arrayList14 = arrayList8;
                ArrayList arrayList15 = arrayList11;
                boolean z12 = z10;
                ArrayList arrayList16 = arrayList10;
                boolean z13 = z11;
                ArrayList arrayList17 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i15 = 0;
                while (i15 < arrayList4.size()) {
                    d.b bVar = (d.b) arrayList4.get(i15);
                    if (hashSet.add(bVar.f17819a)) {
                        ob.a.g(bVar.f17820b.f18866j == null ? i14 : 0);
                        ha.a.b[] bVarArr = new ha.a.b[i14];
                        bVarArr[0] = new q(null, null, (List) ob.a.e((ArrayList) map.get(bVar.f17819a)));
                        arrayList17.add(bVar.a(bVar.f17820b.b().Z(new ha.a(bVarArr)).G()));
                    }
                    i15++;
                    i14 = 1;
                }
                int i16 = 0;
                ArrayList arrayList18 = null;
                v0 v0VarG = null;
                while (i16 < arrayList9.size()) {
                    String str4 = (String) arrayList9.get(i16);
                    String strY = y(str4, Q, map2);
                    String strY2 = y(str4, P, map2);
                    v0.b bVar2 = new v0.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strY);
                    ArrayList arrayList19 = arrayList18;
                    sb2.append(":");
                    sb2.append(strY2);
                    v0.b bVarX = bVar2.U(sb2.toString()).W(strY2).M(MimeTypes.APPLICATION_M3U8).i0(w(str4)).e0(v(str4, map2)).X(u(str4, O, map2));
                    String strU = u(str4, K, map2);
                    Uri uriE2 = strU == null ? null : p0.e(str3, strU);
                    ArrayList arrayList20 = arrayList9;
                    ha.a aVar2 = new ha.a(new q(strY, strY2, Collections.EMPTY_LIST));
                    String strY3 = y(str4, M, map2);
                    strY3.getClass();
                    switch (strY3) {
                        case "SUBTITLES":
                            arrayList = arrayList12;
                            d.b bVarF = f(arrayList4, strY);
                            if (bVarF != null) {
                                String strM = r0.M(bVarF.f17820b.f18865i, 3);
                                bVarX.K(strM);
                                strG = y.g(strM);
                            } else {
                                strG = null;
                            }
                            if (strG == null) {
                                strG = MimeTypes.TEXT_VTT;
                            }
                            bVarX.g0(strG).Z(aVar2);
                            if (uriE2 != null) {
                                d.a aVar3 = new d.a(uriE2, bVarX.G(), strY, strY2);
                                arrayList2 = arrayList13;
                                arrayList2.add(aVar3);
                            } else {
                                arrayList2 = arrayList13;
                                u.i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList3 = arrayList19;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList12;
                            String strY4 = y(str4, S, map2);
                            if (strY4.startsWith("CC")) {
                                i10 = Integer.parseInt(strY4.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i10 = Integer.parseInt(strY4.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            arrayList3 = arrayList19 == null ? new ArrayList() : arrayList19;
                            bVarX.g0(str2).H(i10);
                            arrayList3.add(bVarX.G());
                            arrayList2 = arrayList13;
                            break;
                        case "AUDIO":
                            d.b bVarE = e(arrayList4, strY);
                            if (bVarE != null) {
                                String strM2 = r0.M(bVarE.f17820b.f18865i, 1);
                                bVarX.K(strM2);
                                strG2 = y.g(strM2);
                            } else {
                                strG2 = null;
                            }
                            String strU2 = u(str4, f17707i, map2);
                            if (strU2 != null) {
                                bVarX.J(Integer.parseInt(r0.Z0(strU2, "/")[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(strG2) && strU2.endsWith("/JOC")) {
                                    bVarX.K("ec+3");
                                    strG2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            bVarX.g0(strG2);
                            if (uriE2 == null) {
                                arrayList = arrayList12;
                                if (bVarE != null) {
                                    arrayList3 = arrayList19;
                                    v0VarG = bVarX.G();
                                    arrayList2 = arrayList13;
                                }
                                break;
                            } else {
                                bVarX.Z(aVar2);
                                arrayList = arrayList12;
                                arrayList.add(new d.a(uriE2, bVarX.G(), strY, strY2));
                            }
                            arrayList2 = arrayList13;
                            arrayList3 = arrayList19;
                            break;
                        case "VIDEO":
                            d.b bVarG = g(arrayList4, strY);
                            if (bVarG != null) {
                                v0 v0Var = bVarG.f17820b;
                                String strM3 = r0.M(v0Var.f18865i, 2);
                                bVarX.K(strM3).g0(y.g(strM3)).n0(v0Var.f18873q).S(v0Var.f18874r).R(v0Var.f18875s);
                            }
                            if (uriE2 != null) {
                                bVarX.Z(aVar2);
                                arrayList5.add(new d.a(uriE2, bVarX.G(), strY, strY2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList13;
                            arrayList = arrayList12;
                            arrayList3 = arrayList19;
                            break;
                    }
                    i16++;
                    str3 = str;
                    arrayList13 = arrayList2;
                    arrayList12 = arrayList;
                    arrayList18 = arrayList3;
                    arrayList9 = arrayList20;
                }
                return new d(str, arrayList15, arrayList17, arrayList5, arrayList12, arrayList13, arrayList14, v0VarG, z12 ? Collections.EMPTY_LIST : arrayList18, z13, map2, arrayList16);
            }
            String strB = aVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList11.add(strB);
            }
            boolean zStartsWith = strB.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList21 = arrayList8;
            if (strB.startsWith("#EXT-X-DEFINE")) {
                map2.put(y(strB, P, map2), y(strB, Z, map2));
            } else {
                if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z11 = true;
                } else if (strB.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strB);
                } else if (strB.startsWith("#EXT-X-SESSION-KEY")) {
                    h.b bVarJ = j(strB, t(strB, I, "identity", map2), map2);
                    if (bVarJ != null) {
                        arrayList10.add(new h(k(y(strB, H, map2)), bVarJ));
                    }
                } else if (strB.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z10 | strB.contains("CLOSED-CAPTIONS=NONE");
                    int i17 = zStartsWith ? 16384 : 0;
                    int iL = l(strB, f17706h);
                    int iR = r(strB, f17701c, -1);
                    String strU3 = u(strB, f17708j, map2);
                    String strU4 = u(strB, f17709k, map2);
                    if (strU4 != null) {
                        String[] strArrY0 = r0.Y0(strU4, "x");
                        int i18 = Integer.parseInt(strArrY0[0]);
                        int i19 = Integer.parseInt(strArrY0[1]);
                        if (i18 <= 0 || i19 <= 0) {
                            i19 = -1;
                            i13 = -1;
                        } else {
                            i13 = i18;
                        }
                        i12 = i19;
                        i11 = i13;
                    } else {
                        i11 = -1;
                        i12 = -1;
                    }
                    String strU5 = u(strB, f17710l, map2);
                    float f10 = strU5 != null ? Float.parseFloat(strU5) : -1.0f;
                    String strU6 = u(strB, f17702d, map2);
                    String strU7 = u(strB, f17703e, map2);
                    String strU8 = u(strB, f17704f, map2);
                    String strU9 = u(strB, f17705g, map2);
                    if (zStartsWith) {
                        uriE = p0.e(str3, y(strB, K, map2));
                    } else {
                        if (!aVar.a()) {
                            throw ParserException.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriE = p0.e(str3, A(aVar.b(), map2));
                    }
                    Uri uri = uriE;
                    arrayList4.add(new d.b(uri, new v0.b().T(arrayList4.size()).M(MimeTypes.APPLICATION_M3U8).K(strU3).I(iR).b0(iL).n0(i11).S(i12).R(f10).e0(i17).G(), strU6, strU7, strU8, strU9));
                    ArrayList arrayList22 = (ArrayList) map.get(uri);
                    if (arrayList22 == null) {
                        arrayList22 = new ArrayList();
                        map.put(uri, arrayList22);
                    }
                    arrayList22.add(new q.b(iR, iL, strU6, strU7, strU8, strU9));
                    z10 = zContains;
                    z11 = z11;
                }
                arrayList8 = arrayList21;
                arrayList11 = arrayList11;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
            }
            arrayList8 = arrayList21;
            arrayList11 = arrayList11;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
        }
    }

    private static boolean p(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double q(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) ob.a.e(matcher.group(1))) : d10;
    }

    private static int r(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) ob.a.e(matcher.group(1))) : i10;
    }

    private static long s(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) ob.a.e(matcher.group(1))) : j10;
    }

    private static String t(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) ob.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : A(str2, map);
    }

    private static String u(String str, Pattern pattern, Map map) {
        return t(str, pattern, null, map);
    }

    private static int v(String str, Map map) {
        String strU = u(str, R, map);
        if (TextUtils.isEmpty(strU)) {
            return 0;
        }
        String[] strArrY0 = r0.Y0(strU, ",");
        int i10 = r0.s(strArrY0, "public.accessibility.describes-video") ? 512 : 0;
        if (r0.s(strArrY0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (r0.s(strArrY0, "public.accessibility.describes-music-and-sound")) {
            i10 |= UserVerificationMethods.USER_VERIFY_ALL;
        }
        return r0.s(strArrY0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int w(String str) {
        boolean zP = p(str, U, false);
        ?? r10 = zP;
        if (p(str, V, false)) {
            r10 = (zP ? 1 : 0) | 2;
        }
        return p(str, T, false) ? r10 | 4 : r10;
    }

    private static c.f x(String str) {
        double dQ = q(str, f17716r, -9.223372036854776E18d);
        long j10 = C.TIME_UNSET;
        long j11 = dQ == -9.223372036854776E18d ? -9223372036854775807L : (long) (dQ * 1000000.0d);
        boolean zP = p(str, f17717s, false);
        double dQ2 = q(str, f17719u, -9.223372036854776E18d);
        long j12 = dQ2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dQ2 * 1000000.0d);
        double dQ3 = q(str, f17720v, -9.223372036854776E18d);
        if (dQ3 != -9.223372036854776E18d) {
            j10 = (long) (dQ3 * 1000000.0d);
        }
        return new c.f(j11, zP, j12, j10, p(str, f17721w, false));
    }

    private static String y(String str, Pattern pattern, Map map) throws ParserException {
        String strU = u(str, pattern, map);
        if (strU != null) {
            return strU;
        }
        throw ParserException.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long z(String str, Pattern pattern) {
        return new BigDecimal(y(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    @Override // com.google.android.exoplayer2.upstream.d.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public xa.d parse(Uri uri, InputStream inputStream) throws ParserException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!a(bufferedReader)) {
                throw ParserException.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    r0.n(bufferedReader);
                    throw ParserException.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        d dVarO = o(new a(arrayDeque, bufferedReader), uri.toString());
                        r0.n(bufferedReader);
                        return dVarO;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    c cVarN = n(this.f17725a, this.f17726b, new a(arrayDeque, bufferedReader), uri.toString());
                    r0.n(bufferedReader);
                    return cVarN;
                }
            }
        } catch (Throwable th2) {
            r0.n(bufferedReader);
            throw th2;
        }
    }

    public HlsPlaylistParser(d dVar, c cVar) {
        this.f17725a = dVar;
        this.f17726b = cVar;
    }
}
