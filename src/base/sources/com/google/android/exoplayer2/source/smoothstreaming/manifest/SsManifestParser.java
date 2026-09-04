package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import ca.l;
import ca.p;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import ob.r0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SsManifestParser implements com.google.android.exoplayer2.upstream.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f18200a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private UUID f18206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f18207g;

        public b(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f18206f;
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0291a(uuid, l.a(uuid, this.f18207g), q(this.f18207g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f18205e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f18205e = true;
                this.f18206f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f18205e) {
                this.f18207g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private v0 f18208e;

        public c(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrK = r0.K(str);
                byte[][] bArrJ = ob.e.j(bArrK);
                if (bArrJ == null) {
                    arrayList.add(bArrK);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrJ);
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return MimeTypes.VIDEO_H264;
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return MimeTypes.AUDIO_AAC;
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE8) || str.equalsIgnoreCase(AC3SpecificBox.TYPE)) {
                return MimeTypes.AUDIO_AC3;
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE9) || str.equalsIgnoreCase(EC3SpecificBox.TYPE)) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE12) || str.equalsIgnoreCase(AudioSampleEntry.TYPE11)) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE13)) {
                return MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (str.equalsIgnoreCase("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.f18208e;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            int i10;
            v0.b bVar = new v0.b();
            String strR = r(m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.M(MimeTypes.VIDEO_MP4).n0(k(xmlPullParser, "MaxWidth")).S(k(xmlPullParser, "MaxHeight")).V(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strR == null) {
                    strR = MimeTypes.AUDIO_AAC;
                }
                int iK = k(xmlPullParser, "Channels");
                int iK2 = k(xmlPullParser, "SamplingRate");
                List listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listQ.isEmpty() && MimeTypes.AUDIO_AAC.equals(strR)) {
                    listQ = Collections.singletonList(q9.a.a(iK2, iK));
                }
                bVar.M(MimeTypes.AUDIO_MP4).J(iK).h0(iK2).V(listQ);
            } else if (iIntValue == 3) {
                String str = (String) c("Subtype");
                if (str == null) {
                    i10 = 0;
                } else if (str.equals("CAPT")) {
                    i10 = 64;
                } else if (str.equals("DESC")) {
                    i10 = UserVerificationMethods.USER_VERIFY_ALL;
                } else {
                    i10 = 0;
                }
                bVar.M(MimeTypes.APPLICATION_MP4).e0(i10);
            } else {
                bVar.M(MimeTypes.APPLICATION_MP4);
            }
            this.f18208e = bVar.U(xmlPullParser.getAttributeValue(null, "Index")).W((String) c("Name")).g0(strR).I(k(xmlPullParser, "Bitrate")).X((String) c("Language")).G();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f18209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f18212h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f18213i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f18214j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f18215k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f18216l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0291a f18217m;

        public d(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f18215k = -1;
            this.f18217m = null;
            this.f18209e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) {
                this.f18209e.add((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) obj);
            } else if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0291a) {
                ob.a.g(this.f18217m == null);
                this.f18217m = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0291a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.f18209e.size();
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[size];
            this.f18209e.toArray(bVarArr);
            if (this.f18217m != null) {
                com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0291a c0291a = this.f18217m;
                h hVar = new h(new h.b(c0291a.f18240a, MimeTypes.VIDEO_MP4, c0291a.f18241b));
                for (int i10 = 0; i10 < size; i10++) {
                    com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i10];
                    int i11 = bVar.f18243a;
                    if (i11 == 2 || i11 == 1) {
                        v0[] v0VarArr = bVar.f18252j;
                        for (int i12 = 0; i12 < v0VarArr.length; i12++) {
                            v0VarArr[i12] = v0VarArr[i12].b().O(hVar).G();
                        }
                    }
                }
            }
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a(this.f18210f, this.f18211g, this.f18212h, this.f18213i, this.f18214j, this.f18215k, this.f18216l, this.f18217m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            this.f18210f = k(xmlPullParser, "MajorVersion");
            this.f18211g = k(xmlPullParser, "MinorVersion");
            this.f18212h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f18213i = l(xmlPullParser, "Duration");
            this.f18214j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f18215k = i(xmlPullParser, "LookaheadCount", -1);
            this.f18216l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f18212h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f18218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f18219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18220g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f18221h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f18222i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f18223j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f18224k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f18225l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f18226m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f18227n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f18228o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f18229p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ArrayList f18230q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f18231r;

        public e(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f18218e = str;
            this.f18219f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) throws ParserException {
            int iS = s(xmlPullParser);
            this.f18220g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.f18220g == 3) {
                this.f18221h = m(xmlPullParser, "Subtype");
            } else {
                this.f18221h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f18221h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f18223j = attributeValue;
            p("Name", attributeValue);
            this.f18224k = m(xmlPullParser, "Url");
            this.f18225l = i(xmlPullParser, "MaxWidth", -1);
            this.f18226m = i(xmlPullParser, "MaxHeight", -1);
            this.f18227n = i(xmlPullParser, "DisplayWidth", -1);
            this.f18228o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f18229p = attributeValue2;
            p("Language", attributeValue2);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f18222i = jI;
            if (jI == -1) {
                this.f18222i = ((Long) c("TimeScale")).longValue();
            }
            this.f18230q = new ArrayList();
        }

        private void r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f18230q.size();
            long j10 = j(xmlPullParser, "t", C.TIME_UNSET);
            int i10 = 1;
            if (j10 == C.TIME_UNSET) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f18231r == -1) {
                        throw ParserException.c("Unable to infer start time", null);
                    }
                    j10 = this.f18231r + ((Long) this.f18230q.get(size - 1)).longValue();
                }
            }
            this.f18230q.add(Long.valueOf(j10));
            this.f18231r = j(xmlPullParser, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, C.TIME_UNSET);
            long j11 = j(xmlPullParser, CampaignEx.JSON_KEY_AD_R, 1L);
            if (j11 > 1 && this.f18231r == C.TIME_UNSET) {
                throw ParserException.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f18230q.add(Long.valueOf((this.f18231r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            }
            if (MimeTypes.BASE_TYPE_AUDIO.equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if (MimeTypes.BASE_TYPE_VIDEO.equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw ParserException.c("Invalid key value[" + attributeValue + "]", null);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof v0) {
                this.f18219f.add((v0) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            v0[] v0VarArr = new v0[this.f18219f.size()];
            this.f18219f.toArray(v0VarArr);
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b(this.f18218e, this.f18224k, this.f18220g, this.f18221h, this.f18222i, this.f18223j, this.f18225l, this.f18226m, this.f18227n, this.f18228o, this.f18229p, v0VarArr, this.f18230q, this.f18231r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public SsManifestParser() {
        try {
            this.f18200a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.d.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a parse(Uri uri, InputStream inputStream) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f18200a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            throw ParserException.c(null, e10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f18203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f18204d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f18203c = aVar;
            this.f18201a = str;
            this.f18202b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f18204d.size(); i10++) {
                Pair pair = (Pair) this.f18204d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f18203c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f18202b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f18201a);
                            if (aVarE == null) {
                                i10 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final int k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final long l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final String m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected final void p(String str, Object obj) {
            this.f18204d.add(Pair.create(str, obj));
        }

        protected void a(Object obj) {
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected void o(XmlPullParser xmlPullParser) {
        }
    }
}
