package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements com.vungle.ads.internal.executor.a {
    public static final a Companion = new a(null);
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    private i API_EXECUTOR;
    private i BACKGROUND_EXECUTOR;
    private i DOWNLOADER_EXECUTOR;
    private i IO_EXECUTOR;
    private i JOB_EXECUTOR;
    private i LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES;
    private i OFFLOAD_EXECUTOR;
    private i UA_EXECUTOR;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.NUMBER_OF_CORES = iAvailableProcessors;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new i(iAvailableProcessors, iAvailableProcessors, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_jr"));
        this.IO_EXECUTOR = new i(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_io"));
        this.API_EXECUTOR = new i(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_api"));
        this.LOGGER_EXECUTOR = new i(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_logger"));
        this.BACKGROUND_EXECUTOR = new i(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_background"));
        this.UA_EXECUTOR = new i(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new i(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new c("vng_down"));
        this.OFFLOAD_EXECUTOR = new i(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ol"));
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getApiExecutor() {
        return this.API_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getBackgroundExecutor() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getDownloaderExecutor() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getIoExecutor() {
        return this.IO_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getJobExecutor() {
        return this.JOB_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getLoggerExecutor() {
        return this.LOGGER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getOffloadExecutor() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public i getUaExecutor() {
        return this.UA_EXECUTOR;
    }
}
