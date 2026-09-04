package com.arthenica.ffmpegkit;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q f11075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f f11076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f11077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f11078r;

    private e(String[] strArr, f fVar, i iVar, q qVar, j jVar) {
        super(strArr, iVar, jVar);
        this.f11076p = fVar;
        this.f11075o = qVar;
        this.f11077q = new LinkedList();
        this.f11078r = new Object();
    }

    public static e u(String[] strArr, f fVar, i iVar, q qVar) {
        return new e(strArr, fVar, iVar, qVar, FFmpegKitConfig.i());
    }

    @Override // com.arthenica.ffmpegkit.n
    public boolean c() {
        return true;
    }

    public void t(p pVar) {
        synchronized (this.f11078r) {
            this.f11077q.add(pVar);
        }
    }

    public String toString() {
        return "FFmpegSession{sessionId=" + this.f11060a + ", createTime=" + this.f11062c + ", startTime=" + this.f11063d + ", endTime=" + this.f11064e + ", arguments=" + FFmpegKitConfig.c(this.f11065f) + ", logs=" + n() + ", state=" + this.f11069j + ", returnCode=" + this.f11070k + ", failStackTrace='" + this.f11071l + "'}";
    }

    public f v() {
        return this.f11076p;
    }

    public q w() {
        return this.f11075o;
    }
}
