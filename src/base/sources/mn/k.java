package mn;

import bm.r;
import gn.c0;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46513d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f46514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46516c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            c0 c0Var;
            int i10;
            String strSubstring;
            s.h(statusLine, "statusLine");
            if (r.N(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    c0Var = c0.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    c0Var = c0.HTTP_1_1;
                }
            } else if (r.N(statusLine, "ICY ", false, 2, null)) {
                c0Var = c0.HTTP_1_0;
                i10 = 4;
            } else {
                if (!r.N(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                c0Var = c0.HTTP_1_1;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            s.g(strSubstring2, "substring(...)");
            Integer numQ = r.q(strSubstring2);
            if (numQ == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = numQ.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i10 + 4);
                s.g(strSubstring, "substring(...)");
            }
            return new k(c0Var, iIntValue, strSubstring);
        }

        private a() {
        }
    }

    public k(c0 protocol, int i10, String message) {
        s.h(protocol, "protocol");
        s.h(message, "message");
        this.f46514a = protocol;
        this.f46515b = i10;
        this.f46516c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f46514a == c0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f46515b);
        sb2.append(' ');
        sb2.append(this.f46516c);
        return sb2.toString();
    }
}
