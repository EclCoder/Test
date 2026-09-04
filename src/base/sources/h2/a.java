package h2;

import c3.h;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40162a = new C0600a();

    /* JADX INFO: renamed from: h2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0600a implements a {
        C0600a() {
        }

        @Override // h2.a
        public boolean a(o oVar) {
            String str = oVar.f52757n;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // h2.a
        public x2.a b(o oVar) {
            String str = oVar.f52757n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new y2.b();
                    case "application/x-icy":
                        return new b3.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new z2.b();
                    case "application/x-scte35":
                        return new e3.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(o oVar);

    x2.a b(o oVar);
}
