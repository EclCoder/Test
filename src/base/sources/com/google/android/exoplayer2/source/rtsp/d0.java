package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f17967a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f17968b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f17969c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    private static void a(c0.b bVar, a.b bVar2) throws ParserException {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw ParserException.c(null, e10);
        }
    }

    public static c0 b(String str) throws ParserException {
        String str2;
        c0.b bVar = new c0.b();
        a.b bVarC = null;
        for (String str3 : u.s(str)) {
            if (!"".equals(str3)) {
                Matcher matcher = f17967a.matcher(str3);
                if (!matcher.matches()) {
                    throw ParserException.c("Malformed SDP line: " + str3, null);
                }
                String str4 = (String) ob.a.e(matcher.group(1));
                String str5 = (String) ob.a.e(matcher.group(2));
                switch (str4.hashCode()) {
                    case 97:
                        if (str4.equals("a")) {
                            Matcher matcher2 = f17968b.matcher(str5);
                            if (!matcher2.matches()) {
                                throw ParserException.c("Malformed Attribute line: " + str3, null);
                            }
                            String str6 = (String) ob.a.e(matcher2.group(1));
                            String strE = sc.w.e(matcher2.group(2));
                            if (bVarC == null) {
                                bVar.m(str6, strE);
                            } else {
                                bVarC.i(str6, strE);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 98:
                        if (str4.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                            String[] strArrY0 = r0.Y0(str5, ":\\s?");
                            ob.a.a(strArrY0.length == 2);
                            int i10 = Integer.parseInt(strArrY0[1]);
                            if (bVarC == null) {
                                bVar.p(i10 * 1000);
                            } else {
                                bVarC.m(i10 * 1000);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 99:
                        if (!str4.equals("c")) {
                            continue;
                        } else if (bVarC == null) {
                            bVar.q(str5);
                        } else {
                            bVarC.n(str5);
                        }
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 106:
                    case 108:
                    case 110:
                    case ASSET_RESPONSE_DATA_ERROR_VALUE:
                    case JSON_ENCODE_ERROR_VALUE:
                    case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                    case TPAT_ERROR_VALUE:
                    default:
                        continue;
                    case 101:
                        if (str4.equals("e")) {
                            bVar.r(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 105:
                        if (!str4.equals("i")) {
                            continue;
                        } else if (bVarC == null) {
                            bVar.v(str5);
                        } else {
                            bVarC.p(str5);
                        }
                        break;
                    case 107:
                        if (!str4.equals(CampaignEx.JSON_KEY_AD_K)) {
                            continue;
                        } else if (bVarC == null) {
                            bVar.s(str5);
                        } else {
                            bVarC.o(str5);
                        }
                        break;
                    case 109:
                        if (str4.equals("m")) {
                            if (bVarC != null) {
                                a(bVar, bVarC);
                            }
                            bVarC = c(str5);
                        } else {
                            continue;
                        }
                        break;
                    case 111:
                        if (str4.equals("o")) {
                            bVar.t(str5);
                        } else {
                            continue;
                        }
                        break;
                    case ASSET_REQUEST_ERROR_VALUE:
                        if (str4.equals(TtmlNode.TAG_P)) {
                            bVar.u(str5);
                        } else {
                            continue;
                        }
                        break;
                    case ASSET_WRITE_ERROR_VALUE:
                        str2 = CampaignEx.JSON_KEY_AD_R;
                        break;
                    case INVALID_INDEX_URL_VALUE:
                        if (str4.equals("s")) {
                            bVar.w(str5);
                        } else {
                            continue;
                        }
                        break;
                    case GZIP_ENCODE_ERROR_VALUE:
                        if (str4.equals("t")) {
                            bVar.x(str5);
                        } else {
                            continue;
                        }
                        break;
                    case ASSET_FAILED_STATUS_CODE_VALUE:
                        if (str4.equals("u")) {
                            bVar.y(Uri.parse(str5));
                        } else {
                            continue;
                        }
                        break;
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        if (str4.equals("v")) {
                            if (!MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str5)) {
                                throw ParserException.c(String.format("SDP version %s is not supported.", str5), null);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case INVALID_ADS_ENDPOINT_VALUE:
                        str2 = "z";
                        break;
                }
                str4.equals(str2);
            }
        }
        if (bVarC != null) {
            a(bVar, bVarC);
        }
        try {
            return bVar.o();
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw ParserException.c(null, e10);
        }
    }

    private static a.b c(String str) throws ParserException {
        Matcher matcher = f17969c.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new a.b((String) ob.a.e(matcher.group(1)), Integer.parseInt((String) ob.a.e(matcher.group(2))), (String) ob.a.e(matcher.group(3)), Integer.parseInt((String) ob.a.e(matcher.group(4))));
        } catch (NumberFormatException e10) {
            throw ParserException.c("Malformed SDP media description line: " + str, e10);
        }
    }
}
