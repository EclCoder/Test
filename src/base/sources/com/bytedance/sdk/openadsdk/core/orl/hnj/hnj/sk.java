package com.bytedance.sdk.openadsdk.core.orl.hnj.hnj;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.orl.ta;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends com.bytedance.sdk.openadsdk.core.orl.hnj.hn {
    public static final String dse = null;

    public sk(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    public static int hn(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    private void qor(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj((as) null, (List<com.bytedance.sdk.openadsdk.core.orl.hn.qor>) Collections.singletonList(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(str).hnj()), this.hnj > 0 ? com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.UNDEFINED_ERROR, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn) null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.orl.hnj.hn
    public com.bytedance.sdk.openadsdk.core.orl.hnj hnj(String str, File file, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.f14125sk = 0;
        InputStream inputStream = null;
        if (this.f14124hn == null) {
            this.f14125sk = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.f14125sk = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes(C.UTF8_NAME)) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, C.UTF8_NAME);
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHnj = hnj(xmlPullParserNewPullParser, list);
                    hnj(hnjVarHnj);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return hnjVarHnj;
                } catch (Exception unused2) {
                    this.f14125sk = -3;
                    hnj((com.bytedance.sdk.openadsdk.core.orl.hnj) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = byteArrayInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj {
        String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj f14129hn;
        String hnj;
        com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> f14130sk = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> dkl = new ArrayList();
        float dse = Float.MIN_VALUE;

        public hnj() {
        }

        public void hn(String str) {
            this.dkl.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(str).hnj());
        }

        public void hnj(String str, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar) {
            this.hnj = str;
            this.f14129hn = enumC0231hnj;
            this.qor = hnVar;
        }

        public void hnj(String str) {
            this.f14130sk.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(str).hnj());
        }

        public hnj(String str, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar) {
            hnj(str, enumC0231hnj, hnVar);
        }
    }

    public static String hn(XmlPullParser xmlPullParser, String str) {
        String strTrim;
        String str2 = dse;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.orl.hnj] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.orl.hnj.hn, com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private com.bytedance.sdk.openadsdk.core.orl.hnj hn(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) throws Throwable {
        ?? r16;
        ?? r10 = 0;
        if (this.hnj >= 5) {
            hnj(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.orl.gjv();
        String str = null;
        com.bytedance.sdk.openadsdk.core.orl.qor qorVarHnj = null;
        Set<ta> setHnj = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHnj = hnj(str, r10, list);
                if (hnjVarHnj != null) {
                    if (hnjVarHnj.qor() == null) {
                        hnjVarHnj.hnj(qorVarHnj);
                    }
                    hnjVarHnj.hnj().hnj(gjvVar);
                    if (setHnj != null) {
                        hnjVarHnj.hnj(setHnj);
                    }
                }
                return hnjVarHnj;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                r16 = r10;
                switch (name) {
                    case "VASTAdTagURI":
                        String strHnj = hnj(hn(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strHnj)) {
                            str = strHnj;
                            continue;
                            break;
                        } else {
                            hnj(xmlPullParser, "Wrapper", 3);
                            this.f14125sk = -2;
                            return r16;
                        }
                        break;
                    case "Error":
                        list.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(hn(xmlPullParser, "Error")).hnj());
                        continue;
                        break;
                    case "Extensions":
                        break;
                    case "TrackingEvents":
                        qor.hnj(xmlPullParser, gjvVar);
                        continue;
                        break;
                    case "CompanionAds":
                        qorVarHnj = com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.hnj.hnj(this.f14124hn, xmlPullParser);
                        continue;
                        break;
                    case "ClickTracking":
                        gjvVar.dse(hnj(xmlPullParser, "ClickTracking"));
                        continue;
                        break;
                    case "Impression":
                        gjvVar.hnj(hnj(xmlPullParser, name));
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setHnj = gjv.hnj(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = r10;
            }
            r10 = r16;
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar) {
        if (this.dkl == null) {
            this.dkl = new com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj();
        }
        com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj hnjVar2 = this.dkl;
        hnjVar2.hnj = this.f14125sk;
        hnjVar2.f14126hn = this.hnj;
        if (hnjVar != null) {
            hnjVar2.qor = hnjVar.hnj().f14103hn.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.orl.hnj hnj(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list3;
        xmlPullParser.require(2, dse, "VAST");
        boolean z10 = false;
        String strHn = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strHn = hn(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (hnj(xmlPullParser.getAttributeValue(dse, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z10 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHnj = hn.hnj(this.f14124hn, xmlPullParser3, list3, this.qor, this.gjv);
                                        if (hnjVarHnj != null) {
                                            if (!TextUtils.isEmpty(hnjVarHnj.dse())) {
                                                return hnjVarHnj;
                                            }
                                            this.f14125sk = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHn = hn(xmlPullParser3, list3);
                                            if (hnjVarHn != null) {
                                                return hnjVarHn;
                                            }
                                        } else {
                                            hnj(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            hnj(xmlPullParser);
                            z10 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        hnj(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z10) {
            this.f14125sk = -4;
            qor(strHn);
        }
        if (this.f14125sk == 0) {
            this.f14125sk = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> hnj(XmlPullParser xmlPullParser, String str) {
        return hnj(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> hnj(XmlPullParser xmlPullParser, String str, boolean z10) {
        return hnj(hn(xmlPullParser, str), z10);
    }

    public static void hnj(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void hnj(XmlPullParser xmlPullParser, String str, int i10) {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> hnj(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(str).hnj(z10).hnj());
    }
}
