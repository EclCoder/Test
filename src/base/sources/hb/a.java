package hb;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import bb.h;
import bb.i;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.d0;
import ob.u;
import ob.v;
import sc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f40318q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f40319r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f40320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f40321p;

    public a() {
        super("SubripDecoder");
        this.f40320o = new StringBuilder();
        this.f40321p = new ArrayList();
    }

    private static long A(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) ob.a.e(matcher.group(i10 + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (Long.parseLong((String) ob.a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String B(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f40319r.matcher(strTrim);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    private bb.b x(Spanned spanned, String str) {
        bb.b.C0112b c0112bO = new bb.b.C0112b().o(spanned);
        if (str == null) {
            return c0112bO.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c0112bO.l(1);
                } else {
                    c0112bO.l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c0112bO.l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c0112bO.l(1);
                } else {
                    c0112bO.l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    c0112bO.l(1);
                } else {
                    c0112bO.l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c0112bO.l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    c0112bO.l(1);
                } else {
                    c0112bO.l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c0112bO.l(1);
                } else {
                    c0112bO.l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c0112bO.l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c0112bO.l(1);
                } else {
                    c0112bO.l(2);
                }
                break;
            default:
                c0112bO.l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    c0112bO.i(1);
                } else {
                    c0112bO.i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    c0112bO.i(1);
                } else {
                    c0112bO.i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    c0112bO.i(1);
                } else {
                    c0112bO.i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c0112bO.i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c0112bO.i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c0112bO.i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    c0112bO.i(1);
                } else {
                    c0112bO.i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    c0112bO.i(1);
                } else {
                    c0112bO.i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    c0112bO.i(1);
                } else {
                    c0112bO.i(0);
                }
                break;
            default:
                c0112bO.i(1);
                break;
        }
        return c0112bO.k(z(c0112bO.d())).h(z(c0112bO.c()), 0).a();
    }

    private Charset y(d0 d0Var) {
        Charset charsetP = d0Var.P();
        return charsetP != null ? charsetP : e.f52294c;
    }

    static float z(int i10) {
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

    @Override // bb.h
    protected i v(byte[] bArr, int i10, boolean z10) {
        String str;
        ArrayList arrayList = new ArrayList();
        v vVar = new v();
        d0 d0Var = new d0(bArr, i10);
        Charset charsetY = y(d0Var);
        while (true) {
            String strT = d0Var.t(charsetY);
            int i11 = 0;
            if (strT == null) {
                break;
            }
            if (strT.length() != 0) {
                try {
                    Integer.parseInt(strT);
                    String strT2 = d0Var.t(charsetY);
                    if (strT2 == null) {
                        u.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f40318q.matcher(strT2);
                    if (matcher.matches()) {
                        vVar.a(A(matcher, 1));
                        vVar.a(A(matcher, 6));
                        this.f40320o.setLength(0);
                        this.f40321p.clear();
                        for (String strT3 = d0Var.t(charsetY); !TextUtils.isEmpty(strT3); strT3 = d0Var.t(charsetY)) {
                            if (this.f40320o.length() > 0) {
                                this.f40320o.append("<br>");
                            }
                            this.f40320o.append(B(strT3, this.f40321p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f40320o.toString());
                        while (true) {
                            if (i11 >= this.f40321p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f40321p.get(i11);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(x(spannedFromHtml, str));
                        arrayList.add(bb.b.f8732r);
                    } else {
                        u.i("SubripDecoder", "Skipping invalid timing: " + strT2);
                    }
                } catch (NumberFormatException unused) {
                    u.i("SubripDecoder", "Skipping invalid index: " + strT);
                }
            }
        }
        return new b((bb.b[]) arrayList.toArray(new bb.b[0]), vVar.d());
    }
}
