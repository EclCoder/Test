package com.vungle.ads.internal.downloader;

import com.vungle.ads.e0;
import com.vungle.ads.g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import gl.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private final com.vungle.ads.internal.model.a asset;
    private final AtomicBoolean cancelled;
    private final AtomicInteger currentRetryAttempt;
    private e0 downloadTemplateDuration;
    private final p logEntry;
    private final int maxRetries;
    private e0 partialDownloadDurationMetric;
    private final a priority;
    private final List<String> retryReasons;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        a(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public e(a priority, com.vungle.ads.internal.model.a asset, p pVar, int i10) {
        s.h(priority, "priority");
        s.h(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.logEntry = pVar;
        this.maxRetries = i10;
        this.cancelled = new AtomicBoolean(false);
        this.currentRetryAttempt = new AtomicInteger(0);
        this.retryReasons = Collections.synchronizedList(new ArrayList());
    }

    public final boolean canRetry$vungle_ads_release() {
        return this.currentRetryAttempt.get() < this.maxRetries;
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final com.vungle.ads.internal.model.a getAsset() {
        return this.asset;
    }

    public final int getCurrentRetryAttempt$vungle_ads_release() {
        return this.currentRetryAttempt.get();
    }

    public final p getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final int getMaxRetries$vungle_ads_release() {
        return this.maxRetries;
    }

    /* JADX INFO: renamed from: getPriority, reason: collision with other method in class */
    public final a m83getPriority() {
        return this.priority;
    }

    public final List<String> getRetryReasons$vungle_ads_release() {
        List<String> retryReasons = this.retryReasons;
        s.g(retryReasons, "retryReasons");
        return r.I0(retryReasons);
    }

    public final int incrementRetryAttempt$vungle_ads_release() {
        return this.currentRetryAttempt.incrementAndGet();
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final void recordRetryReason$vungle_ads_release(String reason) {
        s.h(reason, "reason");
        this.retryReasons.add(reason);
    }

    public final void startPartialDownloadRecord() {
        if (this.partialDownloadDurationMetric != null) {
            return;
        }
        e0 e0Var = new e0(Sdk$SDKMetric.b.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.partialDownloadDurationMetric = e0Var;
        e0Var.markStart();
    }

    public final void startTemplateRecord() {
        e0 e0Var = new e0(Sdk$SDKMetric.b.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadTemplateDuration = e0Var;
        e0Var.markStart();
    }

    public final void stopPartialDownloadRecord() throws Throwable {
        e0 e0Var = this.partialDownloadDurationMetric;
        if (e0Var != null) {
            e0Var.markEnd();
            g.INSTANCE.logMetric$vungle_ads_release(e0Var, this.logEntry, "percentage=" + this.asset.getPercentage() + " url=" + this.asset.getServerPath());
        }
    }

    public final void stopTemplateRecord() throws Throwable {
        e0 e0Var = this.downloadTemplateDuration;
        if (e0Var != null) {
            e0Var.markEnd();
            g.INSTANCE.logMetric$vungle_ads_release(e0Var, this.logEntry, this.asset.getServerPath());
        }
    }

    public String toString() {
        return "DownloadRequest{priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", retryAttempt=" + this.currentRetryAttempt.get() + ", maxRetries=" + this.maxRetries + ", logEntry=" + this.logEntry + '}';
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ e(a aVar, com.vungle.ads.internal.model.a aVar2, p pVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i11 & 4) != 0 ? null : pVar, (i11 & 8) != 0 ? 0 : i10);
    }
}
