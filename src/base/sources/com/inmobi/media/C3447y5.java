package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3447y5 implements InterfaceC3396w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f27908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f27909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f27910c;

    /* JADX WARN: Code duplicated, block: B:10:0x0080  */
    public C3447y5(Context context, CrashConfig crashConfig, Fc eventBus) {
        C3447y5 c3447y5;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(crashConfig, "crashConfig");
        kotlin.jvm.internal.s.h(eventBus, "eventBus");
        this.f27908a = crashConfig;
        this.f27909b = eventBus;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.s.g(listSynchronizedList, "synchronizedList(...)");
        this.f27910c = listSynchronizedList;
        if (this.f27908a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new W4(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f27908a.getAnr().getAppExitReason().getEnabled()) {
            B5.f24500a.getClass();
            if (B5.t()) {
                c3447y5 = this;
                listSynchronizedList.add(new C3443y1(context, c3447y5, this.f27908a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.f27908a.getAnr().getAppExitReason().getMaxNumberOfLines()));
            } else {
                c3447y5 = this;
            }
        } else {
            c3447y5 = this;
        }
        if (c3447y5.f27908a.getAnr().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C2873c(c3447y5.f27908a.getAnr().getWatchdog().getInterval(), this));
        }
    }

    public final void a(X9 incidentEvent) {
        int i10;
        kotlin.jvm.internal.s.h(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C3468z1) && this.f27908a.getAnr().getAppExitReason().getEnabled()) {
            i10 = 152;
        } else if ((incidentEvent instanceof X4) && this.f27908a.getCrashConfig().getEnabled()) {
            i10 = 150;
        } else if (!(incidentEvent instanceof C3208oo) || !this.f27908a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = 151;
        }
        this.f27909b.b(new J2(i10, incidentEvent.f26767a, gl.l0.f(fl.w.a(DataSchemeDataSource.SCHEME_DATA, incidentEvent))));
    }
}
