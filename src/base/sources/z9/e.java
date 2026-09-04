package z9;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import ob.t0;
import ob.u;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f58685a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f58686b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f58687c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            u.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!t0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        c0 c0VarC = c0.C();
        long jE = C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (t0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                c0VarC = c(xmlPullParserNewPullParser);
            } else if (t0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                c0VarC = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (t0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c0VarC = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!t0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c0VarC.isEmpty()) {
            return null;
        }
        return new b(jE, c0VarC);
    }

    private static c0 c(XmlPullParser xmlPullParser) {
        for (String str : f58687c) {
            String strA = t0.a(xmlPullParser, str);
            if (strA != null) {
                return c0.E(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return c0.C();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f58685a) {
            String strA = t0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f58686b) {
            String strA = t0.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                return j10 == -1 ? C.TIME_UNSET : j10;
            }
        }
        return C.TIME_UNSET;
    }

    private static c0 f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        c0.a aVarR = c0.r();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (t0.f(xmlPullParser, str3)) {
                String strA = t0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = t0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = t0.a(xmlPullParser, str2 + ":Length");
                String strA4 = t0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return c0.C();
                }
                aVarR.a(new b.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!t0.d(xmlPullParser, str4));
        return aVarR.m();
    }
}
