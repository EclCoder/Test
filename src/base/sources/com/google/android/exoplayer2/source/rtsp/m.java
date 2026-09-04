package com.google.android.exoplayer2.source.rtsp;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.google.common.collect.i0;
import com.mbridge.msdk.foundation.download.Command;
import java.util.List;
import java.util.Map;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f18039b = new b().e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.d0 f18040a;

    public com.google.common.collect.d0 b() {
        return this.f18040a;
    }

    public String d(String str) {
        com.google.common.collect.c0 c0VarE = e(str);
        if (c0VarE.isEmpty()) {
            return null;
        }
        return (String) i0.d(c0VarE);
    }

    public com.google.common.collect.c0 e(String str) {
        return this.f18040a.get(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f18040a.equals(((m) obj).f18040a);
        }
        return false;
    }

    public int hashCode() {
        return this.f18040a.hashCode();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.common.collect.d0.a f18041a;

        public b() {
            this.f18041a = new com.google.common.collect.d0.a();
        }

        public b b(String str, String str2) {
            this.f18041a.e(m.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String[] strArrZ0 = r0.Z0((String) list.get(i10), ":\\s?");
                if (strArrZ0.length == 2) {
                    b(strArrZ0[0], strArrZ0[1]);
                }
            }
            return this;
        }

        public b d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        public m e() {
            return new m(this);
        }

        public b(String str, String str2, int i10) {
            this();
            b(Command.HTTP_HEADER_USER_AGENT, str);
            b("CSeq", String.valueOf(i10));
            if (str2 != null) {
                b("Session", str2);
            }
        }
    }

    private m(b bVar) {
        this.f18040a = bVar.f18041a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        if (sc.c.a(str, "Accept")) {
            return "Accept";
        }
        String str2 = PAFNPq.nsJh;
        if (sc.c.a(str, str2)) {
            return str2;
        }
        if (sc.c.a(str, "Authorization")) {
            return "Authorization";
        }
        if (sc.c.a(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (sc.c.a(str, "Blocksize")) {
            return "Blocksize";
        }
        if (sc.c.a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (sc.c.a(str, "Connection")) {
            return "Connection";
        }
        if (sc.c.a(str, "Content-Base")) {
            return "Content-Base";
        }
        if (sc.c.a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (sc.c.a(str, "Content-Language")) {
            return "Content-Language";
        }
        if (sc.c.a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (sc.c.a(str, "Content-Location")) {
            return "Content-Location";
        }
        if (sc.c.a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (sc.c.a(str, "CSeq")) {
            return "CSeq";
        }
        if (sc.c.a(str, "Date")) {
            return "Date";
        }
        if (sc.c.a(str, "Expires")) {
            return "Expires";
        }
        if (sc.c.a(str, "Location")) {
            return "Location";
        }
        if (sc.c.a(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (sc.c.a(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (sc.c.a(str, "Public")) {
            return "Public";
        }
        if (sc.c.a(str, Command.HTTP_HEADER_RANGE)) {
            return Command.HTTP_HEADER_RANGE;
        }
        if (sc.c.a(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (sc.c.a(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (sc.c.a(str, "Scale")) {
            return "Scale";
        }
        if (sc.c.a(str, "Session")) {
            return "Session";
        }
        if (sc.c.a(str, "Speed")) {
            return "Speed";
        }
        if (sc.c.a(str, "Supported")) {
            return "Supported";
        }
        if (sc.c.a(str, "Timestamp")) {
            return "Timestamp";
        }
        if (sc.c.a(str, "Transport")) {
            return "Transport";
        }
        if (sc.c.a(str, Command.HTTP_HEADER_USER_AGENT)) {
            return Command.HTTP_HEADER_USER_AGENT;
        }
        if (sc.c.a(str, "Via")) {
            return "Via";
        }
        return sc.c.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }
}
