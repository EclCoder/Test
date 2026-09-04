package r3;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l3.i;
import l3.k;
import l3.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import w1.c0;
import w1.d0;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f51032b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f51033c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f51034d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f51035e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f51036f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f51037g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f51038h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f51039i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f51040a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f51041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f51042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f51043c;

        a(float f10, int i10, int i11) {
            this.f51041a = f10;
            this.f51042b = i10;
            this.f51043c = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f51044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f51045b;

        b(int i10, int i11) {
            this.f51044a = i10;
            this.f51045b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f51040a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean e(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals(DataSchemeDataSource.SCHEME_DATA) || str.equals("information");
    }

    private static Layout.Alignment f(String str) {
        String strE = sc.c.e(str);
        strE.getClass();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int g(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f51038h.matcher(attributeValue);
        if (!matcher.matches()) {
            n.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) w1.a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) w1.a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            w1.a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            n.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void h(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrU0 = c0.U0(str, "\\s+");
        if (strArrU0.length == 1) {
            matcher = f51034d.matcher(str);
        } else {
            if (strArrU0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrU0.length + ".");
            }
            matcher = f51034d.matcher(strArrU0[1]);
            n.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) w1.a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) w1.a.e(matcher.group(1))));
    }

    private static a i(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrU0 = c0.U0(attributeValue2, " ");
            w1.a.b(strArrU0.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(strArrU0[0]) / Integer.parseInt(strArrU0[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f51039i;
        int i11 = aVar.f51042b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f51043c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static Map j(XmlPullParser xmlPullParser, Map map, int i10, b bVar, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (d0.e(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String strA = d0.a(xmlPullParser, TtmlNode.TAG_STYLE);
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a((g) map.get(str));
                    }
                }
                String strG = gVarO.g();
                if (strG != null) {
                    map.put(strG, gVarO);
                }
            } else if (d0.e(xmlPullParser, TtmlNode.TAG_REGION)) {
                e eVarM = m(xmlPullParser, i10, bVar);
                if (eVarM != null) {
                    map2.put(eVarM.f51046a, eVarM);
                }
            } else if (d0.e(xmlPullParser, TtmlNode.TAG_METADATA)) {
                k(xmlPullParser, map3);
            }
        } while (!d0.c(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void k(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (d0.e(xmlPullParser, "image") && (strA = d0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!d0.c(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static c l(XmlPullParser xmlPullParser, c cVar, Map map, a aVar) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarO = o(xmlPullParser2, null);
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i10++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i11;
                    break;
                case "dur":
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (cVar != null) {
            long j10 = cVar.f51022d;
            if (j10 != C.TIME_UNSET) {
                if (jQ != C.TIME_UNSET) {
                    jQ += j10;
                }
                if (jQ2 != C.TIME_UNSET) {
                    jQ2 += j10;
                }
            }
        }
        long j11 = jQ;
        if (jQ2 == C.TIME_UNSET) {
            if (jQ3 != C.TIME_UNSET) {
                jQ2 = j11 + jQ3;
            } else if (cVar != null) {
                long j12 = cVar.f51023e;
                if (j12 != C.TIME_UNSET) {
                    jQ2 = j12;
                }
            }
        }
        return c.c(xmlPullParser.getName(), j11, jQ2, gVarO, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    private static e m(XmlPullParser xmlPullParser, int i10, b bVar) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i11;
        float f14;
        int i12;
        String strA = d0.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = d0.a(xmlPullParser, "origin");
        if (strA2 == null) {
            n.h("TtmlParser", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f51036f;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = f51037g;
        Matcher matcher2 = pattern2.matcher(strA2);
        int i13 = 2;
        if (matcher.matches()) {
            try {
                f10 = Float.parseFloat((String) w1.a.e(matcher.group(1))) / 100.0f;
                f11 = Float.parseFloat((String) w1.a.e(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                n.h("TtmlParser", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                n.h("TtmlParser", "Ignoring region with unsupported origin: " + strA2);
                return null;
            }
            if (bVar == null) {
                n.h("TtmlParser", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i14 = Integer.parseInt((String) w1.a.e(matcher2.group(1)));
                int i15 = Integer.parseInt((String) w1.a.e(matcher2.group(2)));
                float f15 = i14 / bVar.f51044a;
                float f16 = i15 / bVar.f51045b;
                f10 = f15;
                f11 = f16;
            } catch (NumberFormatException unused2) {
                n.h("TtmlParser", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        }
        String strA3 = d0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strA3 == null) {
            n.h("TtmlParser", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f12 = Float.parseFloat((String) w1.a.e(matcher3.group(1))) / 100.0f;
                f13 = Float.parseFloat((String) w1.a.e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                n.h("TtmlParser", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                n.h("TtmlParser", "Ignoring region with unsupported extent: " + strA2);
                return null;
            }
            if (bVar == null) {
                n.h("TtmlParser", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i16 = Integer.parseInt((String) w1.a.e(matcher4.group(1)));
                int i17 = Integer.parseInt((String) w1.a.e(matcher4.group(2)));
                float f17 = i16 / bVar.f51044a;
                f13 = i17 / bVar.f51045b;
                f12 = f17;
            } catch (NumberFormatException unused4) {
                n.h("TtmlParser", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        }
        float f18 = f13;
        String strA4 = d0.a(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (strA4 != null) {
            String strE = sc.c.e(strA4);
            strE.getClass();
            if (strE.equals(TtmlNode.CENTER)) {
                f14 = f11 + (f18 / 2.0f);
                i11 = 1;
            } else if (strE.equals("after")) {
                f14 = f11 + f18;
                i11 = 2;
            } else {
                i11 = 0;
                f14 = f11;
            }
        } else {
            i11 = 0;
            f14 = f11;
        }
        float f19 = 1.0f / i10;
        String strA5 = d0.a(xmlPullParser, "writingMode");
        if (strA5 != null) {
            String strE2 = sc.c.e(strA5);
            strE2.getClass();
            switch (strE2) {
                case "tb":
                case "tblr":
                    i12 = i13;
                    break;
                case "tbrl":
                    i12 = 1;
                    break;
                default:
                    i13 = Integer.MIN_VALUE;
                    i12 = i13;
                    break;
            }
        } else {
            i13 = Integer.MIN_VALUE;
            i12 = i13;
        }
        return new e(strA, f10, f14, 0, i11, f12, f18, 1, f19, i12);
    }

    private static float n(String str) {
        Matcher matcher = f51035e.matcher(str);
        if (!matcher.matches()) {
            n.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) w1.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            n.i("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    private static g o(XmlPullParser xmlPullParser, g gVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    gVar = d(gVar).B(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    gVar = d(gVar).x(attributeValue);
                    break;
                case "textAlign":
                    gVar = d(gVar).H(f(attributeValue));
                    break;
                case "textDecoration":
                    String strE = sc.c.e(attributeValue);
                    strE.getClass();
                    switch (strE) {
                        case "nounderline":
                            gVar = d(gVar).K(false);
                            break;
                        case "underline":
                            gVar = d(gVar).K(true);
                            break;
                        case "nolinethrough":
                            gVar = d(gVar).C(false);
                            break;
                        case "linethrough":
                            gVar = d(gVar).C(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = d(gVar).v(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = d(gVar).A(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strE2 = sc.c.e(attributeValue);
                    strE2.getClass();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = d(gVar).F(2);
                            break;
                        case "container":
                            gVar = d(gVar).F(1);
                            break;
                        case "delimiter":
                            gVar = d(gVar).F(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = d(gVar).F(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = d(gVar);
                    try {
                        gVar.w(w1.f.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        n.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = d(gVar).G(n(attributeValue));
                    break;
                case "textCombine":
                    String strE3 = sc.c.e(attributeValue);
                    strE3.getClass();
                    if (!strE3.equals("all")) {
                        if (strE3.equals(DevicePublicKeyStringDef.NONE)) {
                            gVar = d(gVar).I(false);
                        }
                        break;
                    } else {
                        gVar = d(gVar).I(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        n.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = d(gVar).J(r3.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strE4 = sc.c.e(attributeValue);
                    strE4.getClass();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = d(gVar).E(2);
                        }
                        break;
                    } else {
                        gVar = d(gVar).E(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = d(gVar);
                    try {
                        gVar.u(w1.f.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        n.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = d(gVar).D(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : c0.U0(strTrim, "\\s+");
    }

    private static long q(String str, a aVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        Matcher matcher = f51032b.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong((String) w1.a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) w1.a.e(matcher.group(2))) * 60) + Long.parseLong((String) w1.a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / aVar.f51041a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) aVar.f51042b)) / ((double) aVar.f51041a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f51033c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d15 = Double.parseDouble((String) w1.a.e(matcher2.group(1)));
        String str2 = (String) w1.a.e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d10 = aVar.f51041a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = aVar.f51043c;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d11;
        return (long) (d15 * 1000000.0d);
    }

    private static b r(XmlPullParser xmlPullParser) {
        String strA = d0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strA == null) {
            return null;
        }
        Matcher matcher = f51037g.matcher(strA);
        if (!matcher.matches()) {
            n.h("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) w1.a.e(matcher.group(1))), Integer.parseInt((String) w1.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            n.h("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, w1.h hVar) {
        i.c(b(bArr, i10, i11), bVar, hVar);
    }

    @Override // l3.r
    public k b(byte[] bArr, int i10, int i11) {
        char c10;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f51040a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iG = 15;
            a aVarI = f51039i;
            b bVarR = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            c10 = 15;
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        } else {
                            c10 = 15;
                        }
                        a aVar = aVarI;
                        b bVar = bVarR;
                        int i13 = iG;
                        if (e(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                j(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                try {
                                    c cVarL = l(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarL);
                                    if (cVar != null) {
                                        cVar.a(cVarL);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    n.i("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iG = i13;
                            bVarR = bVar;
                            aVarI = aVar;
                        } else {
                            n.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iG = i13;
                        bVarR = bVar;
                        aVarI = aVar;
                    } else {
                        c10 = 15;
                        if (eventType == 4) {
                            ((c) w1.a.e(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                hVar = new h((c) w1.a.e((c) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) w1.a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // l3.r
    public int c() {
        return 1;
    }
}
