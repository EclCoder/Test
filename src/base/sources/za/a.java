package za;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public k a(com.google.android.exoplayer2.source.rtsp.h hVar) {
        String str = (String) ob.a.e(hVar.f17998c.f18868l);
        str.getClass();
        switch (str) {
            case "video/3gpp":
                return new e(hVar);
            case "video/hevc":
                return new g(hVar);
            case "audio/amr-wb":
            case "audio/3gpp":
                return new d(hVar);
            case "audio/mp4a-latm":
                return hVar.f18000e.equals("MP4A-LATM") ? new h(hVar) : new b(hVar);
            case "audio/ac3":
                return new c(hVar);
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return new l(hVar);
            case "video/mp4v-es":
                return new i(hVar);
            case "video/avc":
                return new f(hVar);
            case "audio/opus":
                return new j(hVar);
            case "video/x-vnd.on2.vp8":
                return new n(hVar);
            case "video/x-vnd.on2.vp9":
                return new o(hVar);
            default:
                return null;
        }
    }
}
