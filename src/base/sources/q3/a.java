package q3;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l3.r;
import sc.e;
import w1.h;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f50341d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f50342e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f50343a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f50344b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f50345c = new u();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    private v1.a d(Spanned spanned, String str) {
        v1.a.b bVarO = new v1.a.b().o(spanned);
        if (str == null) {
            return bVarO.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                bVarO.l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVarO.l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                bVarO.l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            default:
                bVarO.l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                bVarO.i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVarO.i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                bVarO.i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            default:
                bVarO.i(1);
                break;
        }
        return bVarO.k(f(bVarO.d())).h(f(bVarO.c()), 0).a();
    }

    private Charset e(u uVar) {
        Charset charsetO = uVar.O();
        return charsetO != null ? charsetO : e.f52294c;
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) w1.a.e(matcher.group(i10 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (Long.parseLong((String) w1.a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String h(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f50342e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, h hVar) {
        int i12;
        long j10;
        String str;
        this.f50345c.R(bArr, i10 + i11);
        this.f50345c.T(i10);
        Charset charsetE = e(this.f50345c);
        long j11 = bVar.f43875a;
        long j12 = C.TIME_UNSET;
        ArrayList arrayList = (j11 == C.TIME_UNSET || !bVar.f43876b) ? null : new ArrayList();
        while (true) {
            String strS = this.f50345c.s(charsetE);
            i12 = 0;
            if (strS == null) {
                break;
            }
            if (strS.length() != 0) {
                try {
                    Integer.parseInt(strS);
                    String strS2 = this.f50345c.s(charsetE);
                    if (strS2 == null) {
                        n.h("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f50341d.matcher(strS2);
                    if (matcher.matches()) {
                        long jG = g(matcher, 1);
                        long jG2 = g(matcher, 6);
                        this.f50343a.setLength(0);
                        this.f50344b.clear();
                        String strS3 = this.f50345c.s(charsetE);
                        while (!TextUtils.isEmpty(strS3)) {
                            if (this.f50343a.length() > 0) {
                                this.f50343a.append("<br>");
                            }
                            this.f50343a.append(h(strS3, this.f50344b));
                            strS3 = this.f50345c.s(charsetE);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f50343a.toString());
                        while (true) {
                            if (i12 >= this.f50344b.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f50344b.get(i12);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        j10 = j12;
                        long j13 = bVar.f43875a;
                        if (j13 == j10 || jG >= j13) {
                            hVar.accept(new l3.e(c0.D(d(spannedFromHtml, str)), jG, jG2 - jG));
                        } else if (arrayList != null) {
                            arrayList.add(new l3.e(c0.D(d(spannedFromHtml, str)), jG, jG2 - jG));
                        }
                    } else {
                        j10 = j12;
                        n.h("SubripParser", "Skipping invalid timing: " + strS2);
                    }
                    j12 = j10;
                } catch (NumberFormatException unused) {
                    j10 = j12;
                    n.h("SubripParser", "Skipping invalid index: " + strS);
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hVar.accept((l3.e) obj);
            }
        }
    }

    @Override // l3.r
    public int c() {
        return 1;
    }
}
