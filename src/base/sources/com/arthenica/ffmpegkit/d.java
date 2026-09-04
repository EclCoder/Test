package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a() {
        FFmpegKitConfig.nativeFFmpegCancel(0L);
    }

    public static void b(long j10) {
        FFmpegKitConfig.nativeFFmpegCancel(j10);
    }

    public static e c(String str, f fVar, i iVar, q qVar) {
        return d(FFmpegKitConfig.m(str), fVar, iVar, qVar);
    }

    public static e d(String[] strArr, f fVar, i iVar, q qVar) {
        e eVarU = e.u(strArr, fVar, iVar, qVar);
        FFmpegKitConfig.d(eVarU);
        return eVarU;
    }
}
