package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum g {
    AV_LOG_STDERR(-16),
    AV_LOG_QUIET(-8),
    AV_LOG_PANIC(0),
    AV_LOG_FATAL(8),
    AV_LOG_ERROR(16),
    AV_LOG_WARNING(24),
    AV_LOG_INFO(32),
    AV_LOG_VERBOSE(40),
    AV_LOG_DEBUG(48),
    AV_LOG_TRACE(56);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11090a;

    g(int i10) {
        this.f11090a = i10;
    }

    public static g e(int i10) {
        g gVar = AV_LOG_STDERR;
        if (i10 == gVar.g()) {
            return gVar;
        }
        g gVar2 = AV_LOG_QUIET;
        if (i10 == gVar2.g()) {
            return gVar2;
        }
        g gVar3 = AV_LOG_PANIC;
        if (i10 == gVar3.g()) {
            return gVar3;
        }
        g gVar4 = AV_LOG_FATAL;
        if (i10 == gVar4.g()) {
            return gVar4;
        }
        g gVar5 = AV_LOG_ERROR;
        if (i10 == gVar5.g()) {
            return gVar5;
        }
        g gVar6 = AV_LOG_WARNING;
        if (i10 == gVar6.g()) {
            return gVar6;
        }
        g gVar7 = AV_LOG_INFO;
        if (i10 == gVar7.g()) {
            return gVar7;
        }
        g gVar8 = AV_LOG_VERBOSE;
        if (i10 == gVar8.g()) {
            return gVar8;
        }
        g gVar9 = AV_LOG_DEBUG;
        return i10 == gVar9.g() ? gVar9 : AV_LOG_TRACE;
    }

    public int g() {
        return this.f11090a;
    }
}
