package bb;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f8791a = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements k {
        a() {
        }

        @Override // bb.k
        public boolean a(v0 v0Var) {
            String str = v0Var.f18868l;
            return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // bb.k
        public j b(v0 v0Var) {
            String str = v0Var.f18868l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new db.a(v0Var.f18870n);
                    case "application/pgs":
                        return new eb.a();
                    case "application/x-mp4-vtt":
                        return new kb.a();
                    case "text/vtt":
                        return new kb.h();
                    case "application/x-quicktime-tx3g":
                        return new jb.a(v0Var.f18870n);
                    case "text/x-ssa":
                        return new gb.a(v0Var.f18870n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new cb.a(str, v0Var.D, 16000L);
                    case "text/x-exoplayer-cues":
                        return new g();
                    case "application/cea-708":
                        return new cb.c(v0Var.D, v0Var.f18870n);
                    case "application/x-subrip":
                        return new hb.a();
                    case "application/ttml+xml":
                        return new ib.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(v0 v0Var);

    j b(v0 v0Var);
}
