package va;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.google.common.collect.c0;
import com.google.common.collect.l0;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.p0;
import ob.r0;
import ob.t0;
import ob.u;
import ob.y;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends DefaultHandler implements com.google.android.exoplayer2.upstream.d.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f55316b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f55317c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f55318d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f55319e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f55320a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f55321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0 f55322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f55323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f55324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f55325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f55326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f55327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f55328h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List f55329i;

        public a(v0 v0Var, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j10) {
            this.f55321a = v0Var;
            this.f55322b = c0.x(list);
            this.f55323c = kVar;
            this.f55324d = str;
            this.f55325e = arrayList;
            this.f55326f = arrayList2;
            this.f55328h = list2;
            this.f55329i = list3;
            this.f55327g = j10;
        }
    }

    public d() {
        try {
            this.f55320a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int C(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f55330a) && (str = eVar.f55331b) != null) {
                Matcher matcher = f55317c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                u.i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f55331b);
            }
        }
        return -1;
    }

    protected static int D(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (vHmGJpUTWNVV.hyqdkN.equals(eVar.f55330a) && (str = eVar.f55331b) != null) {
                Matcher matcher = f55318d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                u.i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f55331b);
            }
        }
        return -1;
    }

    protected static long G(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : r0.O0(attributeValue);
    }

    protected static e H(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strQ0 = q0(xmlPullParser, "schemeIdUri", "");
        String strQ1 = q0(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
        String strQ2 = q0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!t0.d(xmlPullParser, str));
        return new e(strQ0, strQ1, strQ2);
    }

    protected static int I(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue == null) {
            return -1;
        }
        String strE = sc.c.e(attributeValue);
        strE.getClass();
        switch (strE) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    protected static int J(XmlPullParser xmlPullParser) {
        int iT = T(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (iT <= 0 || iT >= 33) {
            return -1;
        }
        return iT;
    }

    protected static int K(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    protected static long L(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : r0.P0(attributeValue);
    }

    protected static String M(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            String str = eVar.f55330a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f55331b)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f55331b)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    protected static float Q(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float R(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f55316b.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
            }
        }
        return f10;
    }

    protected static int T(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long V(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (sc.c.a("http://dashif.org/guidelines/last-segment-number", eVar.f55330a)) {
                return Long.parseLong(eVar.f55331b);
            }
        }
        return -1L;
    }

    protected static long W(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int Y(XmlPullParser xmlPullParser) {
        int iT = T(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (iT >= 0) {
            int[] iArr = f55319e;
            if (iT < iArr.length) {
                return iArr[iT];
            }
        }
        return -1;
    }

    private long a(List list, long j10, long j11, int i10, long j12) {
        int iM = i10 >= 0 ? i10 + 1 : (int) r0.m(j12 - j10, j11);
        for (int i11 = 0; i11 < iM; i11++) {
            list.add(l(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    private static int o(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        ob.a.g(i10 == i11);
        return i10;
    }

    private static String p(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        ob.a.g(str.equals(str2));
        return str;
    }

    private static void q(ArrayList arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            com.google.android.exoplayer2.drm.h.b bVar = (com.google.android.exoplayer2.drm.h.b) arrayList.get(i10);
            if (o9.b.f48264c.equals(bVar.f16859b) && (str = bVar.f16860c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            com.google.android.exoplayer2.drm.h.b bVar2 = (com.google.android.exoplayer2.drm.h.b) arrayList.get(i11);
            if (o9.b.f48263b.equals(bVar2.f16859b) && bVar2.f16860c == null) {
                arrayList.set(i11, new com.google.android.exoplayer2.drm.h.b(o9.b.f48264c, str, bVar2.f16861d, bVar2.f16862e));
            }
        }
    }

    protected static String q0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static void r(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.google.android.exoplayer2.drm.h.b bVar = (com.google.android.exoplayer2.drm.h.b) arrayList.get(size);
            if (!bVar.c()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((com.google.android.exoplayer2.drm.h.b) arrayList.get(i10)).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                v(xmlPullParser);
            }
        } while (!t0.d(xmlPullParser, str));
        return text;
    }

    private static long s(long j10, long j11) {
        if (j11 != C.TIME_UNSET) {
            j10 = j11;
        }
        return j10 == Long.MAX_VALUE ? C.TIME_UNSET : j10;
    }

    private static String t(String str, String str2) {
        if (y.o(str)) {
            return y.c(str2);
        }
        if (y.s(str)) {
            return y.n(str2);
        }
        if (y.r(str) || y.p(str)) {
            return str;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(str)) {
            return null;
        }
        String strG = y.g(str2);
        return MimeTypes.TEXT_VTT.equals(strG) ? MimeTypes.APPLICATION_MP4VTT : strG;
    }

    private boolean u(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void v(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (t0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (t0.e(xmlPullParser)) {
                    i10++;
                } else if (t0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    protected long A(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List B(XmlPullParser xmlPullParser, List list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strR0 = r0(xmlPullParser, "BaseURL");
        if (p0.b(strR0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strR0;
            }
            return l0.k(new b(strR0, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            String strD = p0.d(bVar.f55299a, strR0);
            String str = attributeValue3 == null ? strD : attributeValue3;
            if (z10) {
                i10 = bVar.f55301c;
                i11 = bVar.f55302d;
                str = bVar.f55300b;
            }
            arrayList.add(new b(strD, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    protected Pair E(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? B;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strE = sc.c.e(attributeValue3);
            strE.getClass();
            switch (strE) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = o9.b.f48264c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = o9.b.f48266e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = o9.b.f48265d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    String strB = t0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strB) && !"00000000-0000-0000-0000-000000000000".equals(strB)) {
                        String[] strArrSplit = strB.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                            uuidArr[i10] = UUID.fromString(strArrSplit[i10]);
                        }
                        uuid = o9.b.f48263b;
                        attributeValue2 = 0;
                        B = ca.l.b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                B = B;
                attributeValue2 = xmlPullParser.getText();
            } else if (t0.f(xmlPullParser, "ms:laurl")) {
                B = B;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && t0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidF = ca.l.f(bArrDecode);
                if (uuidF == null) {
                    u.i("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidF;
                    B = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    B = bArrDecode;
                    uuid = uuidF;
                    attributeValue2 = attributeValue2;
                }
            } else if (B == 0) {
                UUID uuid3 = o9.b.f48266e;
                if (uuid3.equals(uuid) && t0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = ca.l.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    v(xmlPullParser);
                    B = B;
                    attributeValue2 = attributeValue2;
                }
            } else {
                v(xmlPullParser);
                B = B;
                attributeValue2 = attributeValue2;
            }
        } while (!t0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new com.google.android.exoplayer2.drm.h.b(uuid, attributeValue2, MimeTypes.VIDEO_MP4, B) : null);
    }

    protected int F(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
            return 1;
        }
        if (MimeTypes.BASE_TYPE_VIDEO.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    protected Pair N(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jW = W(xmlPullParser, "id", 0L);
        long jW2 = W(xmlPullParser, "duration", C.TIME_UNSET);
        long jW3 = W(xmlPullParser, "presentationTime", 0L);
        long jU0 = r0.U0(jW2, 1000L, j10);
        long jU1 = r0.U0(jW3 - j11, 1000000L, j10);
        String strQ0 = q0(xmlPullParser, "messageData", null);
        byte[] bArrO = O(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jU1);
        if (strQ0 != null) {
            bArrO = r0.q0(strQ0);
        }
        return Pair.create(lValueOf, c(str, str2, jW, jU0, bArrO));
    }

    protected byte[] O(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, sc.e.f52294c.name());
        xmlPullParser.nextToken();
        while (!t0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f P(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j10;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String strQ0 = q0(xmlPullParser, "schemeIdUri", "");
        String strQ1 = q0(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        long jW = W(xmlPullParser, "timescale", 1L);
        long jW2 = W(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "Event")) {
                j10 = jW;
                str = strQ1;
                str2 = strQ0;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(N(xmlPullParser2, str2, str, j10, jW2, byteArrayOutputStream));
            } else {
                j10 = jW;
                str = strQ1;
                str2 = strQ0;
                xmlPullParser2 = xmlPullParser;
                v(xmlPullParser2);
            }
            if (t0.d(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            strQ0 = str2;
            strQ1 = str;
            jW = j10;
        }
        long[] jArr = new long[arrayList.size()];
        ja.a[] aVarArr = new ja.a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            aVarArr[i10] = (ja.a) pair.second;
        }
        return d(str2, str, j10, jArr, aVarArr);
    }

    protected i S(XmlPullParser xmlPullParser) {
        return c0(xmlPullParser, "sourceURL", "range");
    }

    protected String U(XmlPullParser xmlPullParser) {
        return r0(xmlPullParser, "Label");
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0 A[LOOP:0: B:24:0x00a5->B:81:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c A[SYNTHETIC] */
    protected c X(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j10;
        ArrayList arrayList5;
        long j11;
        Throwable th2;
        long j12;
        d dVar = this;
        boolean zU = dVar.u(dVar.a0(xmlPullParser, "profiles", new String[0]));
        long jG = G(xmlPullParser, "availabilityStartTime", C.TIME_UNSET);
        long jL = L(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long jL2 = L(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jL3 = zEquals ? L(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long jL4 = zEquals ? L(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long jL5 = zEquals ? L(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        long jG2 = G(xmlPullParser, "publishTime", C.TIME_UNSET);
        long j13 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListK = l0.k(new b(uri.toString(), uri.toString(), zU ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j14 = zEquals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = arrayListK;
        long jA = j13;
        boolean z10 = false;
        boolean z11 = false;
        h hVarB0 = null;
        o oVarV0 = null;
        Uri uriE = null;
        l lVarP0 = null;
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "BaseURL")) {
                if (!z11) {
                    jA = dVar.A(xmlPullParser, jA);
                    z11 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(dVar.B(xmlPullParser, arrayList, zU));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (t0.f(xmlPullParser, "ProgramInformation")) {
                    hVarB0 = b0(xmlPullParser);
                } else if (t0.f(xmlPullParser, "UTCTiming")) {
                    oVarV0 = v0(xmlPullParser);
                } else if (t0.f(xmlPullParser, "Location")) {
                    uriE = p0.e(uri.toString(), xmlPullParser.nextText());
                } else {
                    if (t0.f(xmlPullParser, "ServiceDescription")) {
                        lVarP0 = p0(xmlPullParser);
                    } else if (!t0.f(xmlPullParser, "Period") || z10) {
                        arrayList3 = arrayList7;
                        arrayList8 = arrayList;
                        long j15 = j14;
                        long j16 = jA;
                        arrayList4 = arrayList2;
                        v(xmlPullParser);
                        j14 = j15;
                        j10 = j16;
                    } else {
                        if (arrayList7.isEmpty()) {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        } else {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            arrayList4 = arrayList2;
                        }
                        Pair pairZ = Z(xmlPullParser, arrayList5, j14, jA, jG, jL4, zU);
                        g gVar = (g) pairZ.first;
                        if (gVar.f55339b != C.TIME_UNSET) {
                            long jLongValue = ((Long) pairZ.second).longValue();
                            j11 = jLongValue == C.TIME_UNSET ? -9223372036854775807L : gVar.f55339b + jLongValue;
                            arrayList4.add(gVar);
                        } else {
                            if (!zEquals) {
                                throw ParserException.c("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j11 = j14;
                            z10 = true;
                        }
                        j10 = jA;
                        j14 = j11;
                    }
                    if (t0.d(xmlPullParser, "MPD")) {
                        if (jL != C.TIME_UNSET) {
                            th2 = null;
                            j12 = jL;
                        } else if (j14 != C.TIME_UNSET) {
                            j12 = j14;
                            th2 = null;
                        } else {
                            if (!zEquals) {
                                throw ParserException.c("Unable to determine duration of static manifest.", null);
                            }
                            th2 = null;
                            j12 = jL;
                        }
                        if (arrayList4.isEmpty()) {
                            throw ParserException.c("No periods found.", th2);
                        }
                        return f(jG, j12, jL2, zEquals, jL3, jL4, jL5, jG2, hVarB0, oVarV0, lVarP0, uriE, arrayList4);
                    }
                    long j17 = jL4;
                    long j18 = jL2;
                    ArrayList arrayList9 = arrayList4;
                    dVar = this;
                    zEquals = zEquals;
                    jL3 = jL3;
                    jA = j10;
                    arrayList6 = arrayList9;
                    arrayList7 = arrayList3;
                    jL2 = j18;
                    jL4 = j17;
                    jL = jL;
                }
            }
            arrayList3 = arrayList7;
            j10 = jA;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (t0.d(xmlPullParser, "MPD")) {
                if (jL != C.TIME_UNSET) {
                    th2 = null;
                    j12 = jL;
                } else if (j14 != C.TIME_UNSET) {
                    j12 = j14;
                    th2 = null;
                } else {
                    if (!zEquals) {
                        throw ParserException.c("Unable to determine duration of static manifest.", null);
                    }
                    th2 = null;
                    j12 = jL;
                }
                if (arrayList4.isEmpty()) {
                    return f(jG, j12, jL2, zEquals, jL3, jL4, jL5, jG2, hVarB0, oVarV0, lVarP0, uriE, arrayList4);
                }
                throw ParserException.c("No periods found.", th2);
            }
            long j19 = jL4;
            long j110 = jL2;
            ArrayList arrayList10 = arrayList4;
            dVar = this;
            zEquals = zEquals;
            jL3 = jL3;
            jA = j10;
            arrayList6 = arrayList10;
            arrayList7 = arrayList3;
            jL2 = j110;
            jL4 = j19;
            jL = jL;
        }
    }

    protected Pair Z(XmlPullParser xmlPullParser, List list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        long jA;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j14;
        Object obj;
        long j15;
        k kVarK0;
        long j16;
        long j17;
        k kVar;
        ArrayList arrayList3;
        boolean z11;
        long j18;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List list2;
        ArrayList arrayList7;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jL = L(xmlPullParser2, "start", j10);
        long j19 = j12 != C.TIME_UNSET ? j12 + jL : -9223372036854775807L;
        long jL2 = L(xmlPullParser2, "duration", C.TIME_UNSET);
        ArrayList arrayList8 = new ArrayList();
        long j20 = -9223372036854775807L;
        ArrayList arrayList9 = new ArrayList();
        boolean z12 = false;
        e eVarH = null;
        long jA2 = j11;
        ArrayList arrayList10 = arrayList8;
        k kVar2 = null;
        long j21 = -9223372036854775807L;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (t0.f(xmlPullParser2, "BaseURL")) {
                if (!z12) {
                    jA2 = A(xmlPullParser2, jA2);
                    z12 = true;
                }
                arrayList11.addAll(B(xmlPullParser2, list, z10));
                arrayList2 = arrayList10;
                j16 = jA2;
                arrayList = arrayList9;
                z11 = z12;
                j14 = j20;
                obj = null;
                jL2 = jL2;
                arrayList7 = arrayList11;
                eVarH = eVarH;
                xmlPullParser2 = xmlPullParser2;
                kVar = kVar2;
                j18 = j21;
                j19 = j19;
            } else {
                ArrayList arrayList12 = arrayList10;
                if (t0.f(xmlPullParser2, "AdaptationSet")) {
                    if (arrayList11.isEmpty()) {
                        arrayList6 = arrayList11;
                        list2 = list;
                    } else {
                        ArrayList arrayList13 = arrayList11;
                        arrayList6 = arrayList13;
                        list2 = arrayList13;
                    }
                    ArrayList arrayList14 = arrayList9;
                    long j22 = jA2;
                    long j23 = j19;
                    long j24 = jL2;
                    va.a aVarX = x(xmlPullParser2, list2, kVar2, j24, j22, j21, j23, j13, z10);
                    j19 = j23;
                    jA = j21;
                    arrayList12.add(aVarX);
                    jL2 = j24;
                    arrayList = arrayList14;
                    obj = null;
                    j15 = j22;
                    arrayList2 = arrayList12;
                    j14 = C.TIME_UNSET;
                    arrayList5 = arrayList6;
                } else {
                    ArrayList arrayList15 = arrayList11;
                    ArrayList arrayList16 = arrayList9;
                    long j25 = jA2;
                    jA = j21;
                    if (t0.f(xmlPullParser2, "EventStream")) {
                        arrayList16.add(P(xmlPullParser));
                        jL2 = jL2;
                        arrayList = arrayList16;
                        arrayList2 = arrayList12;
                        j14 = C.TIME_UNSET;
                        obj = null;
                        j15 = j25;
                        arrayList5 = arrayList15;
                    } else {
                        if (t0.f(xmlPullParser2, "SegmentBase")) {
                            kVarK0 = i0(xmlPullParser2, null);
                            j16 = j25;
                            obj = null;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j14 = C.TIME_UNSET;
                        } else if (t0.f(xmlPullParser2, "SegmentList")) {
                            long j26 = j19;
                            long j27 = jL2;
                            long jA3 = A(xmlPullParser2, C.TIME_UNSET);
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j14 = -9223372036854775807L;
                            k.b bVarJ0 = j0(xmlPullParser2, null, j26, j27, j25, jA3, j13);
                            j16 = j25;
                            obj = null;
                            j19 = j26;
                            jL2 = j27;
                            eVarH = eVarH;
                            xmlPullParser2 = xmlPullParser2;
                            j17 = jA3;
                            kVar = bVarJ0;
                            arrayList3 = arrayList15;
                        } else {
                            kVar2 = kVar2;
                            arrayList = arrayList16;
                            arrayList2 = arrayList12;
                            j14 = C.TIME_UNSET;
                            if (t0.f(xmlPullParser2, "SegmentTemplate")) {
                                jA = A(xmlPullParser2, C.TIME_UNSET);
                                obj = null;
                                kVarK0 = k0(xmlPullParser2, null, c0.C(), j19, jL2, j25, jA, j13);
                                j16 = j25;
                            } else {
                                obj = null;
                                jL2 = jL2;
                                xmlPullParser2 = xmlPullParser2;
                                j15 = j25;
                                j19 = j19;
                                if (t0.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVarH = H(xmlPullParser2, "AssetIdentifier");
                                    arrayList4 = arrayList15;
                                } else {
                                    v(xmlPullParser2);
                                    arrayList4 = arrayList15;
                                }
                                j16 = j15;
                                eVarH = eVarH;
                                j17 = jA;
                                kVar = kVar2;
                                arrayList3 = arrayList4;
                            }
                        }
                        j17 = jA;
                        kVar = kVarK0;
                        arrayList3 = arrayList15;
                    }
                    z11 = z12;
                    j18 = j17;
                    arrayList7 = arrayList3;
                }
                j19 = j19;
                arrayList4 = arrayList5;
                j16 = j15;
                eVarH = eVarH;
                j17 = jA;
                kVar = kVar2;
                arrayList3 = arrayList4;
                z11 = z12;
                j18 = j17;
                arrayList7 = arrayList3;
            }
            if (t0.d(xmlPullParser2, "Period")) {
                return Pair.create(g(attributeValue, jL, arrayList2, arrayList, eVarH), Long.valueOf(jL2));
            }
            xmlPullParser2 = xmlPullParser2;
            j19 = j19;
            kVar2 = kVar;
            j21 = j18;
            arrayList11 = arrayList7;
            arrayList10 = arrayList2;
            eVarH = eVarH;
            z12 = z11;
            jL2 = jL2;
            j20 = j14;
            jA2 = j16;
            arrayList9 = arrayList;
        }
    }

    protected String[] a0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected va.a b(long j10, int i10, List list, List list2, List list3, List list4) {
        return new va.a(j10, i10, list, list2, list3, list4);
    }

    protected h b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strQ0 = q0(xmlPullParser, "moreInformationURL", null);
        String strQ1 = q0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (t0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (t0.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                v(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (t0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str2, str, str3, strQ0, strQ1);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    protected ja.a c(String str, String str2, long j10, long j11, byte[] bArr) {
        return new ja.a(str, str2, j11, j10, bArr);
    }

    protected i c0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j11 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
        } else {
            j10 = 0;
        }
        return h(attributeValue, j10, j11);
    }

    protected f d(String str, String str2, long j10, long[] jArr, ja.a[] aVarArr) {
        return new f(str, str2, j10, jArr, aVarArr);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0214 A[LOOP:0: B:3:0x006c->B:56:0x0214, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c7 A[EDGE_INSN: B:57:0x01c7->B:46:0x01c7 BREAK  A[LOOP:0: B:3:0x006c->B:56:0x0214], SYNTHETIC] */
    protected a d0(XmlPullParser xmlPullParser, List list, String str, String str2, int i10, int i11, float f10, int i12, int i13, String str3, List list2, List list3, List list4, List list5, k kVar, long j10, long j11, long j12, long j13, long j14, boolean z10) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int iZ;
        k kVarI0;
        long j15;
        k kVarK0;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        int iT = T(xmlPullParser2, "bandwidth", -1);
        String strQ0 = q0(xmlPullParser2, "mimeType", str);
        String strQ1 = q0(xmlPullParser2, "codecs", str2);
        int iT2 = T(xmlPullParser2, "width", i10);
        int iT3 = T(xmlPullParser2, "height", i11);
        float fR = R(xmlPullParser2, f10);
        int iT4 = T(xmlPullParser2, "audioSamplingRate", i13);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list4);
        ArrayList arrayList10 = new ArrayList(list5);
        int i14 = i12;
        long j16 = j13;
        String str4 = null;
        boolean z11 = false;
        k kVar2 = kVar;
        long jA = j12;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (t0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    jA = A(xmlPullParser2, jA);
                    z11 = true;
                }
                arrayList11.addAll(B(xmlPullParser2, list, z10));
                xmlPullParser2 = xmlPullParser2;
                arrayList6 = arrayList11;
                j16 = j16;
                iT = iT;
                iZ = i14;
                str4 = str4;
                z11 = z11;
                arrayList = arrayList8;
                kVarI0 = kVar2;
                j15 = jA;
            } else {
                arrayList = arrayList8;
                if (t0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                    kVarI0 = kVar2;
                    iZ = z(xmlPullParser);
                } else {
                    if (t0.f(xmlPullParser2, "SegmentBase")) {
                        iZ = i14;
                        kVarI0 = i0(xmlPullParser2, (k.e) kVar2);
                    } else {
                        if (t0.f(xmlPullParser2, "SegmentList")) {
                            long jA2 = A(xmlPullParser2, j16);
                            arrayList4 = arrayList11;
                            arrayList2 = arrayList10;
                            iT = iT;
                            arrayList = arrayList;
                            kVarK0 = j0(xmlPullParser2, (k.b) kVar2, j10, j11, jA, jA2, j14);
                            arrayList3 = arrayList9;
                            j16 = jA2;
                        } else {
                            ArrayList arrayList12 = arrayList11;
                            arrayList2 = arrayList10;
                            iT = iT;
                            arrayList = arrayList;
                            ArrayList arrayList13 = arrayList9;
                            if (t0.f(xmlPullParser2, "SegmentTemplate")) {
                                long jA3 = A(xmlPullParser2, j16);
                                long j17 = jA;
                                kVarK0 = k0(xmlPullParser2, (k.c) kVar2, list5, j10, j11, j17, jA3, j14);
                                jA = j17;
                                arrayList3 = arrayList13;
                                j16 = jA3;
                                arrayList4 = arrayList12;
                            } else {
                                xmlPullParser2 = xmlPullParser2;
                                arrayList7 = arrayList7;
                                if (t0.f(xmlPullParser2, "ContentProtection")) {
                                    Pair pairE = E(xmlPullParser);
                                    Object obj = pairE.first;
                                    if (obj != null) {
                                        str4 = (String) obj;
                                    }
                                    Object obj2 = pairE.second;
                                    if (obj2 != null) {
                                        arrayList7.add((com.google.android.exoplayer2.drm.h.b) obj2);
                                    }
                                    arrayList3 = arrayList13;
                                } else if (t0.f(xmlPullParser2, "InbandEventStream")) {
                                    arrayList.add(H(xmlPullParser2, "InbandEventStream"));
                                    arrayList3 = arrayList13;
                                } else {
                                    if (t0.f(xmlPullParser2, "EssentialProperty")) {
                                        arrayList3 = arrayList13;
                                        arrayList3.add(H(xmlPullParser2, "EssentialProperty"));
                                    } else {
                                        arrayList3 = arrayList13;
                                        if (t0.f(xmlPullParser2, "SupplementalProperty")) {
                                            arrayList10 = arrayList2;
                                            arrayList10.add(H(xmlPullParser2, "SupplementalProperty"));
                                        } else {
                                            arrayList10 = arrayList2;
                                            v(xmlPullParser2);
                                        }
                                    }
                                    j16 = j16;
                                    iZ = i14;
                                    str4 = str4;
                                    z11 = z11;
                                    kVarI0 = kVar2;
                                    j15 = jA;
                                    arrayList5 = arrayList12;
                                }
                                arrayList10 = arrayList2;
                                j16 = j16;
                                iZ = i14;
                                str4 = str4;
                                z11 = z11;
                                kVarI0 = kVar2;
                                j15 = jA;
                                arrayList5 = arrayList12;
                            }
                        }
                        iZ = i14;
                        str4 = str4;
                        z11 = z11;
                        kVarI0 = kVarK0;
                        j15 = jA;
                        arrayList10 = arrayList2;
                        arrayList5 = arrayList4;
                    }
                    if (t0.d(xmlPullParser2, "Representation")) {
                        break;
                    }
                    ArrayList arrayList14 = arrayList10;
                    arrayList9 = arrayList3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList;
                    kVar2 = kVarI0;
                    jA = j15;
                    iT = iT;
                    j16 = j16;
                    z11 = z11;
                    str4 = str4;
                    arrayList10 = arrayList14;
                    i14 = iZ;
                    arrayList11 = arrayList5;
                    xmlPullParser2 = xmlPullParser;
                }
                j15 = jA;
                arrayList6 = arrayList11;
            }
            arrayList7 = arrayList7;
            arrayList3 = arrayList9;
            arrayList5 = arrayList6;
            if (t0.d(xmlPullParser2, "Representation")) {
                break;
                break;
            }
            ArrayList arrayList15 = arrayList10;
            arrayList9 = arrayList3;
            arrayList7 = arrayList7;
            arrayList8 = arrayList;
            kVar2 = kVarI0;
            jA = j15;
            iT = iT;
            j16 = j16;
            z11 = z11;
            str4 = str4;
            arrayList10 = arrayList15;
            i14 = iZ;
            arrayList11 = arrayList5;
            xmlPullParser2 = xmlPullParser;
        }
        ArrayList arrayList16 = arrayList7;
        List list6 = arrayList10;
        v0 v0VarE = e(attributeValue, strQ0, iT2, iT3, fR, iZ, iT4, iT, str3, list2, list3, strQ1, arrayList3, list6);
        if (kVarI0 == null) {
            kVarI0 = new k.e();
        }
        boolean zIsEmpty = arrayList5.isEmpty();
        List list7 = arrayList5;
        if (zIsEmpty) {
            list7 = list;
        }
        return new a(v0VarE, list7, kVarI0, str4, arrayList16, arrayList, arrayList3, list6, -1L);
    }

    protected v0 e(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String strT = t(str2, str5);
        if (MimeTypes.AUDIO_E_AC3.equals(strT)) {
            strT = M(list4);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(strT)) {
                str5 = "ec+3";
            }
        }
        int iO0 = o0(list);
        int iH0 = h0(list) | e0(list2) | g0(list3) | g0(list4);
        Pair pairS0 = s0(list3);
        v0.b bVarX = new v0.b().U(str).M(str2).g0(strT).K(str5).b0(i14).i0(iO0).e0(iH0).X(str3);
        int iD = -1;
        v0.b bVarM0 = bVarX.l0(pairS0 != null ? ((Integer) pairS0.first).intValue() : -1).m0(pairS0 != null ? ((Integer) pairS0.second).intValue() : -1);
        if (y.s(strT)) {
            bVarM0.n0(i10).S(i11).R(f10);
        } else if (y.o(strT)) {
            bVarM0.J(i12).h0(i13);
        } else if (y.r(strT)) {
            if (MimeTypes.APPLICATION_CEA608.equals(strT)) {
                iD = C(list2);
            } else if (MimeTypes.APPLICATION_CEA708.equals(strT)) {
                iD = D(list2);
            }
            bVarM0.H(iD);
        } else if (y.p(strT)) {
            bVarM0.n0(i10).S(i11);
        }
        return bVarM0.G();
    }

    protected int e0(List list) {
        int iT0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = (e) list.get(i11);
            if (sc.c.a("urn:mpeg:dash:role:2011", eVar.f55330a)) {
                iT0 = f0(eVar.f55331b);
            } else {
                if (sc.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f55330a)) {
                    iT0 = t0(eVar.f55331b);
                }
            }
            i10 |= iT0;
        }
        return i10;
    }

    protected c f(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    protected int f0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    protected g g(String str, long j10, List list, List list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    protected int g0(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (sc.c.a("http://dashif.org/guidelines/trickmode", ((e) list.get(i11)).f55330a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    protected i h(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    protected int h0(List list) {
        int iF0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (sc.c.a("urn:mpeg:dash:role:2011", eVar.f55330a)) {
                iF0 |= f0(eVar.f55331b);
            }
        }
        return iF0;
    }

    protected j i(a aVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        v0.b bVarB = aVar.f55321a.b();
        if (str != null) {
            bVarB.W(str);
        }
        String str3 = aVar.f55324d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = aVar.f55325e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            q(arrayList3);
            r(arrayList3);
            bVarB.O(new com.google.android.exoplayer2.drm.h(str2, arrayList3));
        }
        ArrayList arrayList4 = aVar.f55326f;
        arrayList4.addAll(arrayList2);
        return j.n(aVar.f55327g, bVarB.G(), aVar.f55322b, aVar.f55323c, arrayList4, aVar.f55328h, aVar.f55329i, null);
    }

    protected k.e i0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long jW = W(xmlPullParser, "timescale", eVar != null ? eVar.f55367b : 1L);
        long jW2 = W(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f55368c : 0L);
        long j10 = eVar != null ? eVar.f55381d : 0L;
        long j11 = eVar != null ? eVar.f55382e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
        }
        long j12 = j11;
        i iVarS = eVar != null ? eVar.f55366a : null;
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "Initialization")) {
                iVarS = S(xmlPullParser);
            } else {
                v(xmlPullParser);
            }
            i iVar = iVarS;
            if (t0.d(xmlPullParser, "SegmentBase")) {
                return m(iVar, jW, jW2, j10, j12);
            }
            iVarS = iVar;
        }
    }

    protected k.b j(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, r0.H0(j15), r0.H0(j16));
    }

    protected k.b j0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long jW = W(xmlPullParser, "timescale", bVar != null ? bVar.f55367b : 1L);
        long jW2 = W(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f55368c : 0L);
        long jW3 = W(xmlPullParser, "duration", bVar != null ? bVar.f55370e : C.TIME_UNSET);
        long jW4 = W(xmlPullParser, "startNumber", bVar != null ? bVar.f55369d : 1L);
        long jS = s(j12, j13);
        List arrayList = null;
        i iVarS = null;
        List listL0 = null;
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "Initialization")) {
                iVarS = S(xmlPullParser);
                j15 = jW;
            } else if (t0.f(xmlPullParser, "SegmentTimeline")) {
                j15 = jW;
                listL0 = l0(xmlPullParser, j15, j11);
            } else {
                j15 = jW;
                if (t0.f(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m0(xmlPullParser));
                } else {
                    v(xmlPullParser);
                }
            }
            if (t0.d(xmlPullParser, "SegmentList")) {
                break;
            }
            jW = j15;
        }
        if (bVar != null) {
            if (iVarS == null) {
                iVarS = bVar.f55366a;
            }
            if (listL0 == null) {
                listL0 = bVar.f55371f;
            }
            if (arrayList == null) {
                arrayList = bVar.f55375j;
            }
        }
        return j(iVarS, j15, jW2, jW4, jW3, listL0, jS, arrayList, j14, j10);
    }

    protected k.c k(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, r0.H0(j16), r0.H0(j17));
    }

    protected k.d l(long j10, long j11) {
        return new k.d(j10, j11);
    }

    protected List l0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long jW = -9223372036854775807L;
        boolean z10 = false;
        int iT = 0;
        do {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "S")) {
                long jW2 = W(xmlPullParser, "t", C.TIME_UNSET);
                if (z10) {
                    ArrayList arrayList2 = arrayList;
                    jA = a(arrayList2, jA, jW, iT, jW2);
                    arrayList = arrayList2;
                }
                if (jW2 != C.TIME_UNSET) {
                    jA = jW2;
                }
                jW = W(xmlPullParser, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, C.TIME_UNSET);
                iT = T(xmlPullParser, CampaignEx.JSON_KEY_AD_R, 0);
                z10 = true;
            } else {
                v(xmlPullParser);
            }
        } while (!t0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, jA, jW, iT, r0.U0(j11, j10, 1000L));
        }
        return arrayList;
    }

    protected k.e m(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    protected i m0(XmlPullParser xmlPullParser) {
        return c0(xmlPullParser, "media", "mediaRange");
    }

    protected o n(String str, String str2) {
        return new o(str, str2);
    }

    protected int n0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int o0(List list) {
        int iN0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (sc.c.a("urn:mpeg:dash:role:2011", eVar.f55330a)) {
                iN0 |= n0(eVar.f55331b);
            }
        }
        return iN0;
    }

    protected l p0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jW = -9223372036854775807L;
        long jW2 = -9223372036854775807L;
        long jW3 = -9223372036854775807L;
        float fQ = -3.4028235E38f;
        float fQ2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "Latency")) {
                jW = W(xmlPullParser, "target", C.TIME_UNSET);
                jW2 = W(xmlPullParser, "min", C.TIME_UNSET);
                jW3 = W(xmlPullParser, "max", C.TIME_UNSET);
            } else if (t0.f(xmlPullParser, "PlaybackRate")) {
                fQ = Q(xmlPullParser, "min", -3.4028235E38f);
                fQ2 = Q(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = jW;
            long j11 = jW2;
            long j12 = jW3;
            float f10 = fQ;
            float f11 = fQ2;
            if (t0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f10, f11);
            }
            jW = j10;
            jW2 = j11;
            jW3 = j12;
            fQ = f10;
            fQ2 = f11;
        }
    }

    protected Pair s0(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if ((sc.c.a("http://dashif.org/thumbnail_tile", eVar.f55330a) || sc.c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f55330a)) && (str = eVar.f55331b) != null) {
                String[] strArrY0 = r0.Y0(str, "x");
                if (strArrY0.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrY0[0])), Integer.valueOf(Integer.parseInt(strArrY0[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    protected int t0(String str) {
        if (str == null) {
            return 0;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b10 = 0;
                }
                break;
            case 50:
                if (str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    b10 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b10 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b10 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    protected n u0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected o v0(XmlPullParser xmlPullParser) {
        return n(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    @Override // com.google.android.exoplayer2.upstream.d.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public c parse(Uri uri, InputStream inputStream) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f55320a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return X(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw ParserException.c(null, e10);
        }
    }

    protected void y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        v(xmlPullParser);
    }

    protected int z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strQ0 = q0(xmlPullParser, "schemeIdUri", null);
        strQ0.getClass();
        int iJ = -1;
        switch (strQ0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iJ = J(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iJ = T(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iJ = I(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iJ = Y(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iJ = K(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!t0.d(xmlPullParser, "AudioChannelConfiguration"));
        return iJ;
    }

    protected k.c k0(XmlPullParser xmlPullParser, k.c cVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        d dVar = this;
        long jW = W(xmlPullParser, "timescale", cVar != null ? cVar.f55367b : 1L);
        long jW2 = W(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f55368c : 0L);
        long jW3 = W(xmlPullParser, "duration", cVar != null ? cVar.f55370e : C.TIME_UNSET);
        long jW4 = W(xmlPullParser, "startNumber", cVar != null ? cVar.f55369d : 1L);
        long jV = V(list);
        long jS = s(j12, j13);
        n nVarU0 = dVar.u0(xmlPullParser, "media", cVar != null ? cVar.f55377k : null);
        n nVarU1 = dVar.u0(xmlPullParser, "initialization", cVar != null ? cVar.f55376j : null);
        i iVarS = null;
        List listL0 = null;
        while (true) {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, "Initialization")) {
                iVarS = S(xmlPullParser);
                j15 = jW;
            } else if (t0.f(xmlPullParser, mDXVAtwcaFMHJ.FjANFBwLkMBa)) {
                j15 = jW;
                listL0 = dVar.l0(xmlPullParser, j15, j11);
            } else {
                j15 = jW;
                v(xmlPullParser);
            }
            if (t0.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dVar = this;
            jS = jS;
            jV = jV;
            jW4 = jW4;
            jW2 = jW2;
            jW = j15;
        }
        if (cVar != null) {
            if (iVarS == null) {
                iVarS = cVar.f55366a;
            }
            if (listL0 == null) {
                listL0 = cVar.f55371f;
            }
        }
        return k(iVarS, j15, jW2, jW4, jV, jW3, listL0, jS, nVarU1, nVarU0, j14, j10);
    }

    protected va.a x(XmlPullParser xmlPullParser, List list, k kVar, long j10, long j11, long j12, long j13, long j14, boolean z10) throws XmlPullParserException, IOException {
        int iO;
        String str;
        long j15;
        float f10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j16;
        int i11;
        ArrayList arrayList5;
        int i12;
        long j17;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long jW = W(xmlPullParser2, "id", -1L);
        int iF = F(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iT = T(xmlPullParser2, "width", -1);
        int iT2 = T(xmlPullParser2, "height", -1);
        float fR = R(xmlPullParser2, -1.0f);
        int iT3 = T(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String str3 = attributeValue2;
        int iO2 = iF;
        long j18 = j12;
        ArrayList arrayList15 = arrayList13;
        int i13 = iT;
        int i14 = iT2;
        float f11 = fR;
        String strU = attributeValue4;
        String str4 = attributeValue3;
        boolean z11 = false;
        int iZ = -1;
        String str5 = null;
        k kVarJ0 = kVar;
        String str6 = attributeValue;
        long jA = j11;
        while (true) {
            xmlPullParser2.next();
            float f12 = f11;
            if (t0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    jA = A(xmlPullParser2, jA);
                    z11 = true;
                }
                long j19 = jA;
                arrayList14.addAll(B(xmlPullParser2, list, z10));
                arrayList14 = arrayList14;
                str2 = str2;
                arrayList6 = arrayList6;
                arrayList12 = arrayList12;
                kVarJ0 = kVarJ0;
                arrayList15 = arrayList15;
                arrayList11 = arrayList11;
                f10 = f12;
                arrayList = arrayList10;
                i11 = iT3;
                arrayList5 = arrayList9;
                arrayList2 = arrayList8;
                j16 = j19;
            } else {
                long j20 = jA;
                if (t0.f(xmlPullParser2, "ContentProtection")) {
                    Pair pairE = E(xmlPullParser);
                    Object obj = pairE.first;
                    if (obj != null) {
                        str5 = (String) obj;
                    }
                    Object obj2 = pairE.second;
                    if (obj2 != null) {
                        arrayList6.add((com.google.android.exoplayer2.drm.h.b) obj2);
                    }
                    arrayList14 = arrayList14;
                } else if (t0.f(xmlPullParser2, "ContentComponent")) {
                    String strP = p(str4, xmlPullParser2.getAttributeValue(null, str2));
                    iO2 = o(iO2, F(xmlPullParser));
                    str4 = strP;
                } else {
                    if (t0.f(xmlPullParser2, "Role")) {
                        arrayList9.add(H(xmlPullParser2, "Role"));
                    } else if (t0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                        iZ = z(xmlPullParser);
                    } else if (t0.f(xmlPullParser2, "Accessibility")) {
                        arrayList8.add(H(xmlPullParser2, "Accessibility"));
                    } else if (t0.f(xmlPullParser2, "EssentialProperty")) {
                        arrayList10.add(H(xmlPullParser2, "EssentialProperty"));
                    } else if (t0.f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList12.add(H(xmlPullParser2, "SupplementalProperty"));
                    } else {
                        if (t0.f(xmlPullParser2, "Representation")) {
                            arrayList14 = arrayList14;
                            int i15 = iO2;
                            str2 = str2;
                            String str7 = str3;
                            String str8 = str4;
                            int i16 = i13;
                            a aVarD0 = d0(xmlPullParser2, !arrayList14.isEmpty() ? arrayList14 : list, str6, str7, i16, i14, f12, iZ, iT3, str8, arrayList9, arrayList8, arrayList10, arrayList12, kVarJ0, j13, j10, j20, j18, j14, z10);
                            str6 = str6;
                            i14 = i14;
                            str = str8;
                            arrayList5 = arrayList9;
                            arrayList = arrayList10;
                            kVarJ0 = kVarJ0;
                            f10 = f12;
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList12;
                            j16 = j20;
                            str3 = str7;
                            i13 = i16;
                            i11 = iT3;
                            j15 = j18;
                            i10 = iZ;
                            iO = o(i15, y.k(aVarD0.f55321a.f18868l));
                            arrayList4 = arrayList15;
                            arrayList4.add(aVarD0);
                            xmlPullParser2 = xmlPullParser2;
                        } else {
                            arrayList14 = arrayList14;
                            iO = iO2;
                            str = str4;
                            str2 = str2;
                            arrayList6 = arrayList6;
                            kVarJ0 = kVarJ0;
                            arrayList11 = arrayList11;
                            j15 = j18;
                            f10 = f12;
                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                            arrayList = arrayList10;
                            i10 = iZ;
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList12;
                            arrayList4 = arrayList15;
                            j16 = j20;
                            i11 = iT3;
                            arrayList5 = arrayList9;
                            if (t0.f(xmlPullParser3, "SegmentBase")) {
                                xmlPullParser2 = xmlPullParser3;
                                kVarJ0 = i0(xmlPullParser3, (k.e) kVarJ0);
                            } else if (t0.f(xmlPullParser3, trPLwhKZgZ.nsLPiWrM)) {
                                long jA2 = A(xmlPullParser3, j15);
                                arrayList15 = arrayList4;
                                xmlPullParser2 = xmlPullParser;
                                kVarJ0 = j0(xmlPullParser2, (k.b) kVarJ0, j13, j10, j16, jA2, j14);
                                arrayList12 = arrayList3;
                                str4 = str;
                                iO2 = iO;
                                arrayList11 = arrayList11;
                                j17 = jA2;
                                iZ = i10;
                                j18 = j17;
                            } else {
                                i12 = iO;
                                xmlPullParser2 = xmlPullParser3;
                                arrayList15 = arrayList4;
                                if (t0.f(xmlPullParser2, "SegmentTemplate")) {
                                    long jA3 = A(xmlPullParser2, j15);
                                    arrayList12 = arrayList3;
                                    k kVarK0 = k0(xmlPullParser2, (k.c) kVarJ0, arrayList12, j13, j10, j16, jA3, j14);
                                    j16 = j16;
                                    kVarJ0 = kVarK0;
                                    str4 = str;
                                    iZ = i10;
                                    iO2 = i12;
                                    arrayList11 = arrayList11;
                                    j18 = jA3;
                                } else {
                                    arrayList12 = arrayList3;
                                    if (t0.f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList11 = arrayList11;
                                        arrayList11.add(H(xmlPullParser2, "InbandEventStream"));
                                    } else {
                                        arrayList11 = arrayList11;
                                        if (t0.f(xmlPullParser2, "Label")) {
                                            strU = U(xmlPullParser);
                                        } else if (t0.e(xmlPullParser2)) {
                                            y(xmlPullParser);
                                        }
                                    }
                                    iZ = i10;
                                    j17 = j15;
                                    str4 = str;
                                    iO2 = i12;
                                    j18 = j17;
                                }
                            }
                        }
                        arrayList15 = arrayList4;
                        arrayList12 = arrayList3;
                        iZ = i10;
                        arrayList11 = arrayList11;
                        j18 = j15;
                        str4 = str;
                        iO2 = iO;
                    }
                    arrayList14 = arrayList14;
                    str = str4;
                    str2 = str2;
                    arrayList6 = arrayList6;
                    arrayList12 = arrayList12;
                    kVarJ0 = kVarJ0;
                    arrayList15 = arrayList15;
                    arrayList11 = arrayList11;
                    f10 = f12;
                    arrayList = arrayList10;
                    i11 = iT3;
                    arrayList5 = arrayList9;
                    arrayList2 = arrayList8;
                    j16 = j20;
                    long j21 = j18;
                    i12 = iO2;
                    i10 = iZ;
                    j15 = j21;
                    iZ = i10;
                    j17 = j15;
                    str4 = str;
                    iO2 = i12;
                    j18 = j17;
                }
                f10 = f12;
                arrayList = arrayList10;
                i11 = iT3;
                arrayList5 = arrayList9;
                arrayList2 = arrayList8;
                j16 = j20;
            }
            if (t0.d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            iT3 = i11;
            arrayList8 = arrayList2;
            arrayList9 = arrayList5;
            str2 = str2;
            arrayList15 = arrayList15;
            arrayList12 = arrayList12;
            kVarJ0 = kVarJ0;
            jA = j16;
            f11 = f10;
            arrayList10 = arrayList;
            arrayList6 = arrayList6;
            arrayList11 = arrayList11;
            arrayList14 = arrayList14;
        }
        List arrayList16 = new ArrayList(arrayList15.size());
        int i17 = 0;
        while (i17 < arrayList15.size()) {
            ArrayList arrayList17 = arrayList11;
            arrayList16.add(i((a) arrayList15.get(i17), strU, str5, arrayList6, arrayList17));
            i17++;
            arrayList11 = arrayList17;
        }
        return b(jW, iO2, arrayList16, arrayList2, arrayList, arrayList12);
    }
}
