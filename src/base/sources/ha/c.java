package ha;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ma.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f40305a = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c {
        a() {
        }

        @Override // ha.c
        public boolean a(v0 v0Var) {
            String str = v0Var.f18868l;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // ha.c
        public b b(v0 v0Var) {
            String str = v0Var.f18868l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new ia.b();
                    case "application/x-icy":
                        return new la.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new ja.b();
                    case "application/x-scte35":
                        return new oa.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(v0 v0Var);

    b b(v0 v0Var);
}
