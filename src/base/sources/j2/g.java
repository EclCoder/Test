package j2;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import l3.l;
import l3.r;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f41917a = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l3.h f41918b = new l3.h();

        a() {
        }

        @Override // j2.g
        public boolean a(o oVar) {
            String str = oVar.f52757n;
            return this.f41918b.a(oVar) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
        }

        @Override // j2.g
        public l b(o oVar) {
            String str = oVar.f52757n;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new m3.a(str, oVar.G, 16000L);
                    case "application/cea-708":
                        return new m3.c(oVar.G, oVar.f52760q);
                }
            }
            if (!this.f41918b.a(oVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarB = this.f41918b.b(oVar);
            return new b(rVarB.getClass().getSimpleName() + "Decoder", rVarB);
        }
    }

    boolean a(o oVar);

    l b(o oVar);
}
