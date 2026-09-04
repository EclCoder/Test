package l3;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements r.a {
    @Override // l3.r.a
    public boolean a(t1.o oVar) {
        String str = oVar.f52757n;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    @Override // l3.r.a
    public r b(t1.o oVar) {
        String str = oVar.f52757n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new n3.a(oVar.f52760q);
                case "application/pgs":
                    return new o3.a();
                case "application/x-mp4-vtt":
                    return new t3.a();
                case "text/vtt":
                    return new t3.g();
                case "application/x-quicktime-tx3g":
                    return new s3.a(oVar.f52760q);
                case "text/x-ssa":
                    return new p3.b(oVar.f52760q);
                case "application/x-subrip":
                    return new q3.a();
                case "application/ttml+xml":
                    return new r3.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // l3.r.a
    public int c(t1.o oVar) {
        String str = oVar.f52757n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
