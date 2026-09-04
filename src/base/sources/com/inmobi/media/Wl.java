package com.inmobi.media;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.api.client.http.HttpStatusCodes;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.inmobi.media.Wl;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Wl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f25961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final El f25962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3348u9 f25963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f25968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f25969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f25972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f25973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f25974n;

    public Wl(AdConfig.VastVideoConfig vastVideoConfig, El vastEventProcessor, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(vastVideoConfig, "vastVideoConfig");
        kotlin.jvm.internal.s.h(vastEventProcessor, "vastEventProcessor");
        this.f25961a = vastVideoConfig;
        this.f25962b = vastEventProcessor;
        this.f25963c = c3348u9;
        this.f25966f = "";
        this.f25967g = "";
        this.f25968h = new ArrayList();
        this.f25969i = new ArrayList();
        this.f25970j = "";
        this.f25971k = "";
        this.f25972l = new ArrayList();
        this.f25973m = new ArrayList();
        this.f25974n = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(Wl wl2, XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Nl nl2;
        String string;
        kotlin.jvm.internal.g0 g0Var;
        wl2.getClass();
        if (dVar instanceof Nl) {
            nl2 = (Nl) dVar;
            int i10 = nl2.f25369d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nl2.f25369d = i10 - Integer.MIN_VALUE;
            } else {
                nl2 = new Nl(wl2, dVar);
            }
        } else {
            nl2 = new Nl(wl2, dVar);
        }
        Object obj = nl2.f25367b;
        Object objF = ll.b.f();
        int i11 = nl2.f25369d;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            try {
                string = xmlPullParser.getAttributeValue(null, "adType").toString();
            } catch (Exception unused) {
                string = MimeTypes.BASE_TYPE_VIDEO;
            }
            if (!kotlin.jvm.internal.s.c(string, MimeTypes.BASE_TYPE_VIDEO)) {
                throw new Kl((short) 1125);
            }
            Function1 ol2 = new Ol(wl2, null, g0Var2, xmlPullParser);
            nl2.f25366a = g0Var2;
            nl2.f25369d = 1;
            if (wl2.a(xmlPullParser, "Ad", ol2, nl2) == objF) {
                return objF;
            }
            g0Var = g0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = nl2.f25366a;
            fl.s.b(obj);
        }
        if (g0Var.f43588a) {
            return fl.g0.f38750a;
        }
        throw new Kl((short) 1101);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(Wl wl2, XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Rl rl2;
        kotlin.jvm.internal.g0 g0Var;
        kotlin.jvm.internal.g0 g0Var2;
        wl2.getClass();
        if (dVar instanceof Rl) {
            rl2 = (Rl) dVar;
            int i10 = rl2.f25652e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rl2.f25652e = i10 - Integer.MIN_VALUE;
            } else {
                rl2 = new Rl(wl2, dVar);
            }
        } else {
            rl2 = new Rl(wl2, dVar);
        }
        Object obj = rl2.f25650c;
        Object objF = ll.b.f();
        int i11 = rl2.f25652e;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.g0 g0Var4 = new kotlin.jvm.internal.g0();
            Function1 sl2 = new Sl(xmlPullParser, wl2, g0Var4, g0Var3, null);
            rl2.f25648a = g0Var3;
            rl2.f25649b = g0Var4;
            rl2.f25652e = 1;
            if (wl2.a(xmlPullParser, "VAST", sl2, rl2) == objF) {
                return objF;
            }
            g0Var = g0Var4;
            g0Var2 = g0Var3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = rl2.f25649b;
            g0Var2 = rl2.f25648a;
            fl.s.b(obj);
        }
        if (g0Var2.f43588a) {
            return fl.g0.f38750a;
        }
        if (g0Var.f43588a) {
            throw new Kl((short) 1124);
        }
        throw new Kl((short) 1102);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(Wl wl2, XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Ul ul2;
        kotlin.jvm.internal.g0 g0Var;
        wl2.getClass();
        if (dVar instanceof Ul) {
            ul2 = (Ul) dVar;
            int i10 = ul2.f25856d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ul2.f25856d = i10 - Integer.MIN_VALUE;
            } else {
                ul2 = new Ul(wl2, dVar);
            }
        } else {
            ul2 = new Ul(wl2, dVar);
        }
        Object obj = ul2.f25854b;
        Object objF = ll.b.f();
        int i11 = ul2.f25856d;
        if (i11 == 0) {
            fl.s.b(obj);
            int i12 = wl2.f25964d + 1;
            wl2.f25964d = i12;
            if (i12 > wl2.f25961a.getMaxWrapperLimit()) {
                throw new Kl((short) 1107);
            }
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            Function1 vl2 = new Vl(wl2, null, g0Var2, xmlPullParser);
            ul2.f25853a = g0Var2;
            ul2.f25856d = 1;
            if (wl2.a(xmlPullParser, "Wrapper", vl2, ul2) == objF) {
                return objF;
            }
            g0Var = g0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = ul2.f25853a;
            fl.s.b(obj);
        }
        if (g0Var.f43588a) {
            return fl.g0.f38750a;
        }
        throw new Kl((short) 1121);
    }

    public static final fl.g0 d(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.s.c(name, "CompanionClickTracking")) {
            String strB = Fl.b(wl2.v(xmlPullParser));
            if (!Fl.a(strB)) {
                strB = null;
            }
            De de2 = strB != null ? new De(strB, CampaignEx.JSON_NATIVE_VIDEO_CLICK) : null;
            if (de2 != null) {
                wl2.f25973m.add(de2);
            }
        } else if (kotlin.jvm.internal.s.c(name, "TrackingEvents")) {
            wl2.f25973m.addAll(wl2.o(xmlPullParser));
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 e(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Companion")) {
            wl2.q(xmlPullParser);
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 h(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.s.c(name, "TrackingEvents")) {
            wl2.f25969i.addAll(wl2.o(xmlPullParser));
        } else if (kotlin.jvm.internal.s.c(name, "VideoClicks")) {
            wl2.a(xmlPullParser, false);
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public final void f(XmlPullParser xmlPullParser) {
        String strB = Fl.b(v(xmlPullParser));
        if (strB.length() != 0) {
            if (!Fl.a(strB)) {
                strB = null;
            }
            if (strB == null) {
                return;
            }
            this.f25969i.add(new De(strB, "Impression"));
            return;
        }
        C3348u9 c3348u9 = this.f25963c;
        if (c3348u9 != null) {
            c3348u9.b("VastParser", "Vast Tracker Error: Impression");
        }
    }

    public final void g(final XmlPullParser xmlPullParser) throws Kl {
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        a(xmlPullParser, "InLine", new tl.a() { // from class: yh.z5
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this, g0Var);
            }
        });
        if (!g0Var.f43588a) {
            throw new Kl((short) 1122);
        }
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
        a(xmlPullParser, "CompanionAds", new tl.a() { // from class: yh.e6
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this, i0Var);
            }
        });
        if (this.f25974n.size() != 0) {
            if (this.f25965e) {
                C3348u9 c3348u9 = this.f25963c;
                if (c3348u9 != null) {
                    c3348u9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map mapA = AbstractC3487zk.a(this.f25962b.f24733a);
                mapA.put("errorCode", (short) 1152);
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("VastParseEvent", mapA, EnumC3281rk.SDK);
                return;
            }
            return;
        }
        if (this.f25965e) {
            HashMap map = new HashMap();
            map.put("[ERRORCODE]", String.valueOf(604));
            map.put("[ADSERVINGID]", this.f25967g);
            map.put("[UNIVERSALADID]", this.f25966f);
            El.a(map, this.f25969i, this.f25963c);
            Map mapA2 = AbstractC3487zk.a(this.f25962b.f24733a);
            mapA2.put("errorCode", (short) 1150);
            C3178nk c3178nk2 = C3178nk.f27064a;
            C3178nk.b("VastParseEvent", mapA2, EnumC3281rk.SDK);
            return;
        }
        if (i0Var.f43593a > 0) {
            HashMap map2 = new HashMap();
            map2.put("[ERRORCODE]", String.valueOf(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE));
            map2.put("[ADSERVINGID]", this.f25967g);
            map2.put("[UNIVERSALADID]", this.f25966f);
            El.a(map2, this.f25969i, this.f25963c);
            Map mapA3 = AbstractC3487zk.a(this.f25962b.f24733a);
            mapA3.put("errorCode", (short) 1151);
            C3178nk c3178nk3 = C3178nk.f27064a;
            C3178nk.b("VastParseEvent", mapA3, EnumC3281rk.SDK);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        a(xmlPullParser, "Creative", new tl.a() { // from class: yh.v5
            @Override // tl.a
            public final Object invoke() {
                return Wl.b(xmlPullParser, this, g0Var);
            }
        });
        return g0Var.f43588a;
    }

    public final void k(final XmlPullParser xmlPullParser) throws Kl {
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        final kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        a(xmlPullParser, "Creatives", new tl.a() { // from class: yh.d6
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, g0Var, this, g0Var2);
            }
        });
        if (!g0Var.f43588a) {
            throw new Kl((short) 1112);
        }
        if (!g0Var2.f43588a) {
            throw new Kl((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) throws Kl {
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        final kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        a(xmlPullParser, "Linear", new tl.a() { // from class: yh.f6
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this, g0Var, g0Var2);
            }
        });
        if (!g0Var.f43588a) {
            throw new Kl((short) 1116);
        }
        if (!g0Var2.f43588a) {
            throw new Kl((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) throws Kl {
        final ArrayList arrayList = new ArrayList();
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        final kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        a(xmlPullParser, "MediaFiles", new tl.a() { // from class: yh.g6
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this, g0Var2, g0Var, arrayList);
            }
        });
        if (!g0Var2.f43588a) {
            throw new Kl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new Kl((short) 1119);
        }
        if (g0Var.f43588a) {
            Map mapA = AbstractC3487zk.a(this.f25962b.f24733a);
            mapA.put("errorCode", (short) 1153);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("VastParseEvent", mapA, EnumC3281rk.SDK);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C3348u9 c3348u9 = this.f25963c;
            if (c3348u9 == null) {
                return -1;
            }
            c3348u9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C3348u9 c3348u10 = this.f25963c;
            if (c3348u10 == null) {
                return -1;
            }
            c3348u10.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "TrackingEvents", new tl.a() { // from class: yh.r5
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            C3348u9 c3348u9 = this.f25963c;
            if (c3348u9 != null) {
                c3348u9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        k0Var.f43597a = "";
        final kotlin.jvm.internal.k0 k0Var2 = new kotlin.jvm.internal.k0();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "Verification", new tl.a() { // from class: yh.i6
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, g0Var, this, k0Var, k0Var2, arrayList);
            }
        });
        if (!g0Var.f43588a) {
            HashMap map = new HashMap();
            map.put("[REASON]", String.valueOf(2));
            map.put("[ADSERVINGID]", this.f25967g);
            map.put("[UNIVERSALADID]", this.f25966f);
            El.a(map, arrayList, this.f25963c);
            return;
        }
        if (!Fl.a((String) k0Var.f43597a)) {
            HashMap map2 = new HashMap();
            map2.put("[REASON]", String.valueOf(3));
            map2.put("[ADSERVINGID]", this.f25967g);
            map2.put("[UNIVERSALADID]", this.f25966f);
            El.a(map2, arrayList, this.f25963c);
            return;
        }
        this.f25969i.add(new Hf(attributeValue, (String) k0Var2.f43597a, (String) k0Var.f43597a));
        C3348u9 c3348u10 = this.f25963c;
        if (c3348u10 != null) {
            c3348u10.a("VastParser", "OMID ADVerification URL : " + k0Var.f43597a);
        }
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Companion", new tl.a() { // from class: yh.h6
            @Override // tl.a
            public final Object invoke() {
                return Wl.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "CompanionAds", new tl.a() { // from class: yh.b6
            @Override // tl.a
            public final Object invoke() {
                return Wl.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creative", new tl.a() { // from class: yh.c6
            @Override // tl.a
            public final Object invoke() {
                return Wl.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creatives", new tl.a() { // from class: yh.s5
            @Override // tl.a
            public final Object invoke() {
                return Wl.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Linear", new tl.a() { // from class: yh.t5
            @Override // tl.a
            public final Object invoke() {
                return Wl.h(xmlPullParser, this);
            }
        });
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int iN = n(xmlPullParser);
        if ((iN == 4 || iN == 5) && (text = xmlPullParser.getText()) != null && J3.a(text)) {
            return text;
        }
        return null;
    }

    public static final fl.g0 g(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Creative")) {
            wl2.s(xmlPullParser);
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 f(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.s.c(name, "Linear")) {
            wl2.u(xmlPullParser);
        } else if (kotlin.jvm.internal.s.c(name, "CompanionAds")) {
            wl2.r(xmlPullParser);
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extensions", new tl.a() { // from class: yh.x5
            @Override // tl.a
            public final Object invoke() {
                return Wl.c(xmlPullParser, this);
            }
        });
    }

    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        a(xmlPullParser, "Companion", new tl.a() { // from class: yh.a6
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this, arrayList, k0Var, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            C3348u9 c3348u9 = this.f25963c;
            if (c3348u9 != null) {
                c3348u9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.f25974n.add(new Dl(arrayList, arrayList2, this.f25973m));
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extension", new tl.a() { // from class: yh.y5
            @Override // tl.a
            public final Object invoke() {
                return Wl.b(xmlPullParser, this);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    public static final fl.g0 b(XmlPullParser xmlPullParser, Wl wl2, kotlin.jvm.internal.g0 g0Var) throws XmlPullParserException, IOException, Kl {
        String name = xmlPullParser.getName();
        if (name == null) {
            wl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -2018804923) {
                if (iHashCode != 1150879268) {
                    if (iHashCode == 1539775849 && name.equals("UniversalAdId")) {
                        String strV = wl2.v(xmlPullParser);
                        if (strV == null) {
                            strV = "";
                        }
                        wl2.f25966f = strV;
                    } else {
                        wl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("CompanionAds")) {
                    wl2.i(xmlPullParser);
                } else {
                    wl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("Linear")) {
                g0Var.f43588a = true;
                wl2.l(xmlPullParser);
            } else {
                wl2.getClass();
                w(xmlPullParser);
            }
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.inmobi.media.Wl] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public final Object a(String str, ArrayList urls, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Ml ml2;
        int i10;
        if (dVar instanceof Ml) {
            ml2 = (Ml) dVar;
            int i11 = ml2.f25289d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                ml2.f25289d = i11 - Integer.MIN_VALUE;
            } else {
                ml2 = new Ml(this, dVar);
            }
        } else {
            ml2 = new Ml(this, dVar);
        }
        Object obj = ml2.f25287b;
        Object objF = ll.b.f();
        int i12 = ml2.f25289d;
        try {
            if (i12 == 0) {
                fl.s.b(obj);
                ml2.f25286a = urls;
                ml2.f25289d = 1;
                urls = urls;
                if (a(str, ml2) == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = ml2.f25286a;
                fl.s.b(obj);
                urls = list;
            }
            return new Hl(this.f25966f, this.f25967g, this.f25969i, this.f25970j, this.f25971k, this.f25974n, this.f25972l);
        } catch (Kl e10) {
            short s10 = e10.f25135a;
            int i13 = 0;
            if (s10 == 1100 || s10 == 1102) {
                i10 = HttpStatusCodes.STATUS_CODE_SEE_OTHER;
            } else if (s10 == 1101 || s10 == 1124 || s10 == 1125 || s10 == 1103 || s10 == 1120 || s10 == 1121 || s10 == 1123 || s10 == 1122 || s10 == 1112 || s10 == 1109 || s10 == 1115 || s10 == 1116 || s10 == 1117) {
                i10 = 101;
            } else if (s10 == 1104) {
                i10 = 100;
            } else if (s10 == 1105 || s10 == 1106) {
                i10 = 900;
            } else if (s10 == 1107) {
                i10 = 302;
            } else if (s10 == 1108 || s10 == 1114) {
                i10 = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
            } else if (s10 == 1111) {
                i10 = 201;
            } else if (s10 == 1113) {
                i10 = 301;
            } else if (s10 == 1118) {
                i10 = 401;
            } else {
                i10 = s10 == 1119 ? 403 : 0;
            }
            HashMap macros = gl.l0.j(fl.w.a("[ERRORCODE]", String.valueOf(i10)), fl.w.a("[ADSERVINGID]", this.f25967g), fl.w.a("[UNIVERSALADID]", this.f25966f));
            short s11 = e10.f25135a;
            if (s11 != 1102 && s11 != 1124) {
                El.a(macros, this.f25969i, this.f25963c);
            } else {
                El.a(macros, gl.r.s0(this.f25968h, this.f25969i), this.f25963c);
            }
            C3348u9 c3348u9 = this.f25963c;
            kotlin.jvm.internal.s.h(macros, "macros");
            kotlin.jvm.internal.s.h(urls, "urls");
            ArrayList arrayList = new ArrayList(gl.r.v(urls, 10));
            for (String str2 : urls) {
                kotlin.jvm.internal.s.h(str2, "<this>");
                kotlin.jvm.internal.s.h(macros, "macros");
                String strI = str2;
                for (Map.Entry entry : macros.entrySet()) {
                    strI = bm.r.I(strI, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                arrayList.add(strI);
            }
            int size = arrayList.size();
            while (i13 < size) {
                Object obj2 = arrayList.get(i13);
                i13++;
                String url = (String) obj2;
                A3 a10 = A3.f24440a;
                Jg priority = Jg.REGULAR;
                kotlin.jvm.internal.s.h(url, "url");
                kotlin.jvm.internal.s.h(priority, "priority");
                Mg.a(priority, new C3264r3(url, c3348u9, null));
            }
            throw e10;
        }
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new tl.a() { // from class: yh.w5
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, this);
            }
        });
    }

    public static final fl.g0 c(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        String attributeValue;
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Extension")) {
            try {
                attributeValue = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                attributeValue = "";
            }
            if (kotlin.jvm.internal.s.c(attributeValue, "AdVerifications")) {
                wl2.d(xmlPullParser);
            }
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public final De b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, NotificationCompat.CATEGORY_EVENT);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String strB = Fl.b(v(xmlPullParser));
        if (!Fl.a(strB)) {
            return null;
        }
        if (kotlin.jvm.internal.s.c(attributeValue, NotificationCompat.CATEGORY_PROGRESS)) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new bm.o("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").h(attributeValue2) && !new bm.o("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").h(attributeValue2)) {
                C3348u9 c3348u9 = this.f25963c;
                if (c3348u9 != null) {
                    c3348u9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new S5(strB, attributeValue2);
            }
        } else {
            if (Xl.f26035a.contains(attributeValue)) {
                kotlin.jvm.internal.s.e(attributeValue);
                return new De(strB, attributeValue);
            }
            C3348u9 c3348u10 = this.f25963c;
            if (c3348u10 != null) {
                c3348u10.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    public static final fl.g0 b(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "AdVerifications")) {
            wl2.c(xmlPullParser);
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Tl tl2;
        if (dVar instanceof Tl) {
            tl2 = (Tl) dVar;
            int i10 = tl2.f25772c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tl2.f25772c = i10 - Integer.MIN_VALUE;
            } else {
                tl2 = new Tl(this, dVar);
            }
        } else {
            tl2 = new Tl(this, dVar);
        }
        Object obj = tl2.f25770a;
        Object objF = ll.b.f();
        int i11 = tl2.f25772c;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                if (TextUtils.isEmpty(str)) {
                    C3348u9 c3348u9 = this.f25963c;
                    if (c3348u9 != null) {
                        c3348u9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                    }
                    throw new Kl((short) 1100);
                }
                try {
                    XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                    B5.f24500a.getClass();
                    if (!B5.s()) {
                        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                    }
                    XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    kotlin.jvm.internal.s.g(xmlPullParserNewPullParser, "apply(...)");
                    tl2.f25772c = 1;
                    if (a(xmlPullParserNewPullParser, tl2) == objF) {
                        return objF;
                    }
                } catch (XmlPullParserException unused) {
                    C3348u9 c3348u10 = this.f25963c;
                    if (c3348u10 != null) {
                        c3348u10.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                    }
                    throw new Kl((short) 1104);
                } catch (Exception unused2) {
                    C3348u9 c3348u11 = this.f25963c;
                    if (c3348u11 != null) {
                        c3348u11.b("VastParser", "VAST Schema validation error: (Exception)");
                    }
                    throw new Kl((short) 1105);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        } catch (Kl e10) {
            C3348u9 c3348u12 = this.f25963c;
            if (c3348u12 != null) {
                c3348u12.b("VastParser", "VAST Schema validation error: " + ((int) e10.f25135a));
            }
            throw e10;
        } catch (Exception e11) {
            C3348u9 c3348u13 = this.f25963c;
            if (c3348u13 != null) {
                String string = Arrays.toString(e11.getStackTrace());
                kotlin.jvm.internal.s.g(string, "toString(...)");
                c3348u13.b("VastParser", "VAST Schema validation error: (Exception) " + string);
            }
            throw new Kl((short) 1106);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Pl pl2;
        kotlin.jvm.internal.g0 g0Var;
        if (dVar instanceof Pl) {
            pl2 = (Pl) dVar;
            int i10 = pl2.f25513d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pl2.f25513d = i10 - Integer.MIN_VALUE;
            } else {
                pl2 = new Pl(this, dVar);
            }
        } else {
            pl2 = new Pl(this, dVar);
        }
        Object obj = pl2.f25511b;
        Object objF = ll.b.f();
        int i11 = pl2.f25513d;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            Function1 ql2 = new Ql(this, null, g0Var2, xmlPullParser);
            pl2.f25510a = g0Var2;
            pl2.f25513d = 1;
            if (a(xmlPullParser, "VAST", ql2, pl2) == objF) {
                return objF;
            }
            g0Var = g0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = pl2.f25510a;
            fl.s.b(obj);
        }
        if (g0Var.f43588a) {
            return fl.g0.f38750a;
        }
        throw new Kl((short) 1103);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2, kotlin.jvm.internal.g0 g0Var) throws XmlPullParserException, IOException, Kl {
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name) {
                case "AdVerifications":
                    wl2.c(xmlPullParser);
                    break;
                case "Creatives":
                    g0Var.f43588a = true;
                    wl2.k(xmlPullParser);
                    break;
                case "AdServingId":
                    String strV = wl2.v(xmlPullParser);
                    if (strV == null) {
                        strV = "";
                    }
                    wl2.f25967g = strV;
                    break;
                case "Error":
                    De deA = wl2.a("error", xmlPullParser);
                    if (deA != null) {
                        wl2.f25969i.add(deA);
                    }
                    break;
                case "Extensions":
                    wl2.e(xmlPullParser);
                    break;
                case "Impression":
                    wl2.f(xmlPullParser);
                    break;
                default:
                    wl2.getClass();
                    w(xmlPullParser);
                    break;
            }
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(XmlPullParser xmlPullParser, kotlin.jvm.internal.g0 g0Var, Wl wl2, kotlin.jvm.internal.g0 g0Var2) throws XmlPullParserException, IOException {
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Creative")) {
            g0Var.f43588a = true;
            if (wl2.j(xmlPullParser)) {
                g0Var2.f43588a = true;
            }
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            wl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -2049897434) {
                if (iHashCode != -1927368268) {
                    if (iHashCode != -385055469) {
                        if (iHashCode == 611554000 && name.equals("TrackingEvents")) {
                            wl2.f25969i.addAll(wl2.o(xmlPullParser));
                        } else {
                            wl2.getClass();
                            w(xmlPullParser);
                        }
                    } else if (name.equals("MediaFiles")) {
                        g0Var2.f43588a = true;
                        wl2.f25972l.addAll(wl2.m(xmlPullParser));
                    } else {
                        wl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("Duration")) {
                    wl2.f25971k = wl2.a(xmlPullParser);
                    g0Var.f43588a = true;
                } else {
                    wl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("VideoClicks")) {
                wl2.a(xmlPullParser, true);
            } else {
                wl2.getClass();
                w(xmlPullParser);
            }
        }
        return fl.g0.f38750a;
    }

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, Kl {
        String strV = v(xmlPullParser);
        if (strV != null) {
            if (TextUtils.isEmpty(strV) ? false : new bm.o("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").h(strV)) {
                return strV;
            }
        }
        C3348u9 c3348u9 = this.f25963c;
        if (c3348u9 != null) {
            c3348u9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new Kl((short) 1115);
    }

    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2, kotlin.jvm.internal.i0 i0Var) throws XmlPullParserException, IOException {
        int i10;
        if (!kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Companion")) {
            wl2.getClass();
            w(xmlPullParser);
            return fl.g0.f38750a;
        }
        i0Var.f43593a++;
        int i11 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            kotlin.jvm.internal.s.g(attributeValue, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C3348u9 c3348u9 = wl2.f25963c;
            if (c3348u9 != null) {
                c3348u9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i10 = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            kotlin.jvm.internal.s.g(attributeValue2, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C3348u9 c3348u10 = wl2.f25963c;
            if (c3348u10 != null) {
                c3348u10.b("VastParser", XTkUEXuiK.TrUT);
            }
        }
        if (i10 > 0 && i11 > 0) {
            wl2.h(xmlPullParser);
            return fl.g0.f38750a;
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2, List list, kotlin.jvm.internal.k0 k0Var, List list2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            wl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -348198615) {
                if (iHashCode != 611554000) {
                    if (iHashCode != 676623548) {
                        if (iHashCode == 1877773523 && name.equals("CompanionClickTracking")) {
                            String strB = Fl.b(wl2.v(xmlPullParser));
                            if (!Fl.a(strB)) {
                                strB = null;
                            }
                            De de2 = strB != null ? new De(strB, CampaignEx.JSON_NATIVE_VIDEO_CLICK) : null;
                            if (de2 != null) {
                                list2.add(de2);
                            }
                        } else {
                            wl2.getClass();
                            w(xmlPullParser);
                        }
                    } else if (name.equals("StaticResource")) {
                        wl2.a(xmlPullParser, list);
                    } else {
                        wl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("TrackingEvents")) {
                    list2.addAll(wl2.o(xmlPullParser));
                } else {
                    wl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals(trPLwhKZgZ.KUd)) {
                String strB2 = Fl.b(wl2.v(xmlPullParser));
                if (Fl.a(strB2)) {
                    k0Var.f43597a = strB2;
                } else {
                    C3348u9 c3348u9 = wl2.f25963c;
                    if (c3348u9 != null) {
                        c3348u9.b("VastParser", "Invalid ClickThrough URL: " + xmlPullParser.getText());
                    }
                }
            } else {
                wl2.getClass();
                w(xmlPullParser);
            }
        }
        return fl.g0.f38750a;
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String strB = Fl.b(v(xmlPullParser));
        if (!Fl.a(strB)) {
            C3348u9 c3348u9 = this.f25963c;
            if (c3348u9 != null) {
                c3348u9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || bm.r.h0(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.f25961a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (bm.r.A((String) it.next(), attributeValue, true)) {
                    list.add(new Ii(strB));
                    return;
                }
            }
        }
        C3348u9 c3348u10 = this.f25963c;
        if (c3348u10 != null) {
            c3348u10.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.f25965e = true;
    }

    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2, List list) throws XmlPullParserException, IOException {
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Tracking")) {
            De deB = wl2.b(xmlPullParser);
            if (deB != null) {
                list.add(deB);
            }
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z10) {
        a(xmlPullParser, "VideoClicks", new tl.a() { // from class: yh.u5
            @Override // tl.a
            public final Object invoke() {
                return Wl.a(xmlPullParser, z10, this);
            }
        });
    }

    public static final fl.g0 a(XmlPullParser xmlPullParser, boolean z10, Wl wl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.s.c(name, "ClickThrough")) {
            if (z10) {
                String strB = Fl.b(wl2.v(xmlPullParser));
                if (Fl.a(strB)) {
                    wl2.f25970j = strB;
                }
            }
        } else if (kotlin.jvm.internal.s.c(name, "ClickTracking")) {
            De deA = wl2.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, xmlPullParser);
            if (deA != null) {
                wl2.f25969i.add(deA);
            }
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    public final boolean a(int i10, int i11, String str, String str2, int i12) {
        if (Fl.a(str) && i10 > 0 && i11 > 0) {
            if (this.f25961a.getBitRate().getBitrate_mandatory() && i12 <= 0) {
                C3348u9 c3348u9 = this.f25963c;
                if (c3348u9 != null) {
                    c3348u9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i12);
                }
                return false;
            }
            if (bm.r.A(str2, "Progressive", true)) {
                return true;
            }
            C3348u9 c3348u10 = this.f25963c;
            if (c3348u10 != null) {
                c3348u10.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        C3348u9 c3348u11 = this.f25963c;
        if (c3348u11 != null) {
            c3348u11.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + " " + i10 + ", " + i11);
        }
        return false;
    }

    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, List list) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        if (!kotlin.jvm.internal.s.c(xmlPullParser.getName(), "MediaFile")) {
            wl2.getClass();
            w(xmlPullParser);
            return fl.g0.f38750a;
        }
        g0Var.f43588a = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        int i12 = 0;
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "bitrate");
            kotlin.jvm.internal.s.g(attributeValue3, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C3348u9 c3348u9 = wl2.f25963c;
            if (c3348u9 != null) {
                c3348u9.b("VastParser", "Invalid Value for BitRate.");
            }
            i10 = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            kotlin.jvm.internal.s.g(attributeValue4, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C3348u9 c3348u10 = wl2.f25963c;
            if (c3348u10 != null) {
                c3348u10.b("VastParser", "Invalid Value for Media Width.");
            }
            i11 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            kotlin.jvm.internal.s.g(attributeValue5, "getAttributeValue(...)");
            i12 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C3348u9 c3348u11 = wl2.f25963c;
            if (c3348u11 != null) {
                c3348u11.b("VastParser", "Invalid Value for Media Height.");
            }
        }
        int i13 = i12;
        String strB = Fl.b(wl2.v(xmlPullParser));
        if (!wl2.a(i11, i13, strB, attributeValue, i10)) {
            return fl.g0.f38750a;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = wl2.f25961a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (bm.r.A((String) it.next(), attributeValue2, true)) {
                        kotlin.jvm.internal.s.e(attributeValue);
                        kotlin.jvm.internal.s.e(attributeValue2);
                        list.add(new Gl(i11, i13, strB, attributeValue, attributeValue2, i10));
                        return fl.g0.f38750a;
                    }
                }
            }
        }
        C3348u9 c3348u12 = wl2.f25963c;
        if (c3348u12 != null) {
            c3348u12.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (J3.a(attributeValue2)) {
            g0Var2.f43588a = true;
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(XmlPullParser xmlPullParser, Wl wl2) throws XmlPullParserException, IOException {
        if (kotlin.jvm.internal.s.c(xmlPullParser.getName(), "Verification")) {
            wl2.p(xmlPullParser);
        } else {
            wl2.getClass();
            w(xmlPullParser);
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    public static final fl.g0 a(XmlPullParser xmlPullParser, kotlin.jvm.internal.g0 g0Var, Wl wl2, kotlin.jvm.internal.k0 k0Var, kotlin.jvm.internal.k0 k0Var2, List list) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            wl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != 611554000) {
                if (iHashCode != 1561251035) {
                    if (iHashCode == 1749252741 && name.equals("VerificationParameters")) {
                        k0Var2.f43597a = Fl.b(wl2.v(xmlPullParser));
                    } else {
                        wl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals("JavaScriptResource")) {
                    if (g0Var.f43588a) {
                        wl2.getClass();
                        w(xmlPullParser);
                        return fl.g0.f38750a;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
                    if (attributeValue != null && bm.r.N(attributeValue, CampaignEx.KEY_OMID, false, 2, null)) {
                        g0Var.f43588a = true;
                        k0Var.f43597a = Fl.b(wl2.v(xmlPullParser));
                    }
                } else {
                    wl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals("TrackingEvents")) {
                list.addAll(wl2.o(xmlPullParser));
            } else {
                wl2.getClass();
                w(xmlPullParser);
            }
        }
        return fl.g0.f38750a;
    }

    public final De a(String str, XmlPullParser xmlPullParser) {
        String strB = Fl.b(v(xmlPullParser));
        if (!Fl.a(strB)) {
            C3348u9 c3348u9 = this.f25963c;
            if (c3348u9 == null) {
                return null;
            }
            c3348u9.b("VastParser", "Vast Tracker Error: " + str + " " + strB);
            return null;
        }
        return new De(strB, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, tl.a aVar) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.s.c(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                aVar.invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0066 -> B:31:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0074 -> B:31:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r6, java.lang.String r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.inmobi.media.Ll
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.Ll r0 = (com.inmobi.media.Ll) r0
            int r1 = r0.f25228f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25228f = r1
            goto L18
        L13:
            com.inmobi.media.Ll r0 = new com.inmobi.media.Ll
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f25226d
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f25228f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            kotlin.jvm.functions.Function1 r6 = r0.f25225c
            java.lang.String r7 = r0.f25224b
            org.xmlpull.v1.XmlPullParser r8 = r0.f25223a
            fl.s.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L77
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            fl.s.b(r9)
            r5.n(r6)
        L40:
            int r9 = r6.getEventType()
            if (r9 != r3) goto L47
            goto L5e
        L47:
            java.lang.String r9 = r6.getName()
            if (r9 == 0) goto L61
            java.lang.String r9 = r6.getName()
            boolean r9 = kotlin.jvm.internal.s.c(r9, r7)
            if (r9 == 0) goto L61
            int r9 = r6.getEventType()
            r2 = 3
            if (r9 != r2) goto L61
        L5e:
            fl.g0 r6 = fl.g0.f38750a
            return r6
        L61:
            int r9 = r6.getEventType()
            r2 = 2
            if (r9 != r2) goto L77
            r0.f25223a = r6
            r0.f25224b = r7
            r0.f25225c = r8
            r0.f25228f = r3
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            r5.n(r6)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(org.xmlpull.v1.XmlPullParser, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
