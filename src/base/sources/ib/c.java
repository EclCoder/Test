package ib;

import android.text.Layout;
import bb.i;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
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
import ob.r0;
import ob.t0;
import ob.u;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends bb.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f41257p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f41258q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f41259r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Pattern f41260s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Pattern f41261t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f41262u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f41263v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final b f41264w = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final a f41265x = new a(32, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f41266o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f41267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f41268b;

        a(int i10, int i11) {
            this.f41267a = i10;
            this.f41268b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f41269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f41270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f41271c;

        b(float f10, int i10, int i11) {
            this.f41269a = f10;
            this.f41270b = i10;
            this.f41271c = i11;
        }
    }

    /* JADX INFO: renamed from: ib.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0627c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f41272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f41273b;

        C0627c(int i10, int i11) {
            this.f41272a = i10;
            this.f41273b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f41266o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static a A(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f41263v.matcher(attributeValue);
        if (!matcher.matches()) {
            u.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int i10 = Integer.parseInt((String) ob.a.e(matcher.group(1)));
            int i11 = Integer.parseInt((String) ob.a.e(matcher.group(2)));
            if (i10 != 0 && i11 != 0) {
                return new a(i10, i11);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i10 + " " + i11);
        } catch (NumberFormatException unused) {
            u.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void B(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrY0 = r0.Y0(str, "\\s+");
        if (strArrY0.length == 1) {
            matcher = f41259r.matcher(str);
        } else {
            if (strArrY0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrY0.length + ".");
            }
            matcher = f41259r.matcher(strArrY0[1]);
            u.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) ob.a.e(matcher.group(3));
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
        gVar.y(Float.parseFloat((String) ob.a.e(matcher.group(1))));
    }

    private static b C(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrY0 = r0.Y0(attributeValue2, " ");
            if (strArrY0.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrY0[0]) / Integer.parseInt(strArrY0[1]);
        } else {
            f10 = 1.0f;
        }
        b bVar = f41264w;
        int i11 = bVar.f41270b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f41271c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    private static Map D(XmlPullParser xmlPullParser, Map map, a aVar, C0627c c0627c, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String strA = t0.a(xmlPullParser, TtmlNode.TAG_STYLE);
                g gVarI = I(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : J(strA)) {
                        gVarI.a((g) map.get(str));
                    }
                }
                String strG = gVarI.g();
                if (strG != null) {
                    map.put(strG, gVarI);
                }
            } else if (t0.f(xmlPullParser, TtmlNode.TAG_REGION)) {
                e eVarG = G(xmlPullParser, aVar, c0627c);
                if (eVarG != null) {
                    map2.put(eVarG.f41287a, eVarG);
                }
            } else if (t0.f(xmlPullParser, TtmlNode.TAG_METADATA)) {
                E(xmlPullParser, map3);
            }
        } while (!t0.d(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void E(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "image") && (strA = t0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!t0.d(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static d F(XmlPullParser xmlPullParser, d dVar, Map map, b bVar) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarI = I(xmlPullParser2, null);
        long jK = -9223372036854775807L;
        long jK2 = -9223372036854775807L;
        long jK3 = -9223372036854775807L;
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
                    jK3 = K(attributeValue, bVar);
                    break;
                case "end":
                    jK2 = K(attributeValue, bVar);
                    break;
                case "begin":
                    jK = K(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrJ = J(attributeValue);
                    if (strArrJ.length > 0) {
                        strArr = strArrJ;
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
        if (dVar != null) {
            long j10 = dVar.f41277d;
            if (j10 != C.TIME_UNSET) {
                if (jK != C.TIME_UNSET) {
                    jK += j10;
                }
                if (jK2 != C.TIME_UNSET) {
                    jK2 += j10;
                }
            }
        }
        long j11 = jK;
        if (jK2 == C.TIME_UNSET) {
            if (jK3 != C.TIME_UNSET) {
                jK2 = j11 + jK3;
            } else if (dVar != null) {
                long j12 = dVar.f41278e;
                if (j12 != C.TIME_UNSET) {
                    jK2 = j12;
                }
            }
        }
        return d.c(xmlPullParser.getName(), j11, jK2, gVarI, strArr, str, strSubstring, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b5  */
    private static e G(XmlPullParser xmlPullParser, a aVar, C0627c c0627c) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        int i11;
        String strA = t0.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = t0.a(xmlPullParser, "origin");
        if (strA2 == null) {
            u.i("TtmlDecoder", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f41261t;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = f41262u;
        Matcher matcher2 = pattern2.matcher(strA2);
        int i12 = 2;
        if (matcher.matches()) {
            try {
                f10 = Float.parseFloat((String) ob.a.e(matcher.group(1))) / 100.0f;
                f11 = Float.parseFloat((String) ob.a.e(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                u.i("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                u.i("TtmlDecoder", "Ignoring region with unsupported origin: " + strA2);
                return null;
            }
            if (c0627c == null) {
                u.i("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i13 = Integer.parseInt((String) ob.a.e(matcher2.group(1)));
                int i14 = Integer.parseInt((String) ob.a.e(matcher2.group(2)));
                float f15 = i13 / c0627c.f41272a;
                float f16 = i14 / c0627c.f41273b;
                f10 = f15;
                f11 = f16;
            } catch (NumberFormatException unused2) {
                u.i("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                return null;
            }
        }
        String strA3 = t0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strA3 == null) {
            u.i("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f12 = Float.parseFloat((String) ob.a.e(matcher3.group(1))) / 100.0f;
                f13 = Float.parseFloat((String) ob.a.e(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                u.i("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                u.i("TtmlDecoder", "Ignoring region with unsupported extent: " + strA2);
                return null;
            }
            if (c0627c == null) {
                u.i("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                return null;
            }
            try {
                int i15 = Integer.parseInt((String) ob.a.e(matcher4.group(1)));
                int i16 = Integer.parseInt((String) ob.a.e(matcher4.group(2)));
                float f17 = i15 / c0627c.f41272a;
                f13 = i16 / c0627c.f41273b;
                f12 = f17;
            } catch (NumberFormatException unused4) {
                u.i("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                return null;
            }
        }
        float f18 = f13;
        String strA4 = t0.a(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (strA4 != null) {
            String strE = sc.c.e(strA4);
            strE.getClass();
            if (strE.equals(TtmlNode.CENTER)) {
                f14 = f11 + (f18 / 2.0f);
                i10 = 1;
            } else if (strE.equals("after")) {
                f14 = f11 + f18;
                i10 = 2;
            } else {
                i10 = 0;
                f14 = f11;
            }
        } else {
            i10 = 0;
            f14 = f11;
        }
        float f19 = 1.0f / aVar.f41268b;
        String strA5 = t0.a(xmlPullParser, "writingMode");
        if (strA5 != null) {
            String strE2 = sc.c.e(strA5);
            strE2.getClass();
            switch (strE2) {
                case "tb":
                case "tblr":
                    i11 = i12;
                    break;
                case "tbrl":
                    i11 = 1;
                    break;
                default:
                    i12 = Integer.MIN_VALUE;
                    i11 = i12;
                    break;
            }
        } else {
            i12 = Integer.MIN_VALUE;
            i11 = i12;
        }
        return new e(strA, f10, f14, 0, i10, f12, f18, 1, f19, i11);
    }

    private static float H(String str) {
        Matcher matcher = f41260s.matcher(str);
        if (!matcher.matches()) {
            u.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) ob.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            u.j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    private static String[] J(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : r0.Y0(strTrim, "\\s+");
    }

    private static long K(String str, b bVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        Matcher matcher = f41257p.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong((String) ob.a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) ob.a.e(matcher.group(2))) * 60) + Long.parseLong((String) ob.a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / bVar.f41269a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) bVar.f41270b)) / ((double) bVar.f41269a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f41258q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d15 = Double.parseDouble((String) ob.a.e(matcher2.group(1)));
        String str2 = (String) ob.a.e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d10 = bVar.f41269a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = bVar.f41271c;
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

    private static C0627c L(XmlPullParser xmlPullParser) {
        String strA = t0.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strA == null) {
            return null;
        }
        Matcher matcher = f41262u.matcher(strA);
        if (!matcher.matches()) {
            u.i("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new C0627c(Integer.parseInt((String) ob.a.e(matcher.group(1))), Integer.parseInt((String) ob.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            u.i("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    private static g x(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean y(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals(DataSchemeDataSource.SCHEME_DATA) || str.equals("information");
    }

    private static Layout.Alignment z(String str) {
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

    @Override // bb.h
    protected i v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f41266o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            int i11 = 0;
            C0627c c0627cL = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarC = f41264w;
            a aVarA = f41265x;
            h hVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            bVarC = C(xmlPullParserNewPullParser);
                            aVarA = A(xmlPullParserNewPullParser, f41265x);
                            c0627cL = L(xmlPullParserNewPullParser);
                        }
                        b bVar = bVarC;
                        C0627c c0627c = c0627cL;
                        a aVar = aVarA;
                        if (y(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                D(xmlPullParserNewPullParser, map, aVar, c0627c, map2, map3);
                            } else {
                                try {
                                    d dVarF = F(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarF);
                                    if (dVar != null) {
                                        dVar.a(dVarF);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    u.j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            aVarA = aVar;
                            c0627cL = c0627c;
                            bVarC = bVar;
                        } else {
                            u.f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i11++;
                        aVarA = aVar;
                        c0627cL = c0627c;
                        bVarC = bVar;
                    } else if (eventType == 4) {
                        ((d) ob.a.e(dVar)).a(d.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            hVar = new h((d) ob.a.e((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }

    private static g I(XmlPullParser xmlPullParser, g gVar) {
        byte b10;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b10 = !attributeName.equals(giNWGaNAgVQoO.wANtPSwNzJSzAF) ? (byte) -1 : (byte) 0;
                    break;
                case -1224696685:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY) ? (byte) -1 : (byte) 1;
                    break;
                case -1065511464:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN) ? (byte) -1 : (byte) 2;
                    break;
                case -879295043:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION) ? (byte) -1 : (byte) 3;
                    break;
                case -734428249:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT) ? (byte) -1 : (byte) 4;
                    break;
                case 3355:
                    b10 = !attributeName.equals("id") ? (byte) -1 : (byte) 5;
                    break;
                case 3511770:
                    b10 = !attributeName.equals("ruby") ? (byte) -1 : (byte) 6;
                    break;
                case 94842723:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_COLOR) ? (byte) -1 : (byte) 7;
                    break;
                case 109403361:
                    b10 = !attributeName.equals("shear") ? (byte) -1 : (byte) 8;
                    break;
                case 110138194:
                    b10 = !attributeName.equals("textCombine") ? (byte) -1 : (byte) 9;
                    break;
                case 365601008:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE) ? (byte) -1 : (byte) 10;
                    break;
                case 921125321:
                    b10 = !attributeName.equals("textEmphasis") ? (byte) -1 : (byte) 11;
                    break;
                case 1115953443:
                    b10 = !attributeName.equals("rubyPosition") ? (byte) -1 : (byte) 12;
                    break;
                case 1287124693:
                    b10 = !attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR) ? (byte) -1 : (byte) 13;
                    break;
                case 1754920356:
                    b10 = !attributeName.equals("multiRowAlign") ? (byte) -1 : (byte) 14;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    gVar = x(gVar).B(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    gVar = x(gVar).x(attributeValue);
                    break;
                case 2:
                    gVar = x(gVar).H(z(attributeValue));
                    break;
                case 3:
                    String strE = sc.c.e(attributeValue);
                    strE.getClass();
                    switch (strE) {
                        case "nounderline":
                            gVar = x(gVar).K(false);
                            break;
                        case "underline":
                            gVar = x(gVar).K(true);
                            break;
                        case "nolinethrough":
                            gVar = x(gVar).C(false);
                            break;
                        case "linethrough":
                            gVar = x(gVar).C(true);
                            break;
                    }
                    break;
                case 4:
                    gVar = x(gVar).v(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        gVar = x(gVar).A(attributeValue);
                    }
                    break;
                case 6:
                    String strE2 = sc.c.e(attributeValue);
                    strE2.getClass();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = x(gVar).F(2);
                            break;
                        case "container":
                            gVar = x(gVar).F(1);
                            break;
                        case "delimiter":
                            gVar = x(gVar).F(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = x(gVar).F(3);
                            break;
                    }
                    break;
                case 7:
                    gVar = x(gVar);
                    try {
                        gVar.w(ob.f.c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        u.i("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                    }
                    break;
                case 8:
                    gVar = x(gVar).G(H(attributeValue));
                    break;
                case 9:
                    String strE3 = sc.c.e(attributeValue);
                    strE3.getClass();
                    if (!strE3.equals("all")) {
                        if (strE3.equals(DevicePublicKeyStringDef.NONE)) {
                            gVar = x(gVar).I(false);
                        }
                    } else {
                        gVar = x(gVar).I(true);
                    }
                    break;
                case 10:
                    try {
                        gVar = x(gVar);
                        B(attributeValue, gVar);
                    } catch (SubtitleDecoderException unused2) {
                        u.i("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                    }
                    break;
                case 11:
                    gVar = x(gVar).J(ib.b.a(attributeValue));
                    break;
                case 12:
                    String strE4 = sc.c.e(attributeValue);
                    strE4.getClass();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = x(gVar).E(2);
                        }
                    } else {
                        gVar = x(gVar).E(1);
                    }
                    break;
                case 13:
                    gVar = x(gVar);
                    try {
                        gVar.u(ob.f.c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        u.i("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                    }
                    break;
                case 14:
                    gVar = x(gVar).D(z(attributeValue));
                    break;
            }
        }
        return gVar;
    }
}
