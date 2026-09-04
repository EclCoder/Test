package com.vungle.ads.internal.downloader;

import bm.r;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.task.h;
import com.vungle.ads.internal.util.j;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import fl.k;
import fl.l;
import gn.b0;
import gn.d0;
import gn.f0;
import gn.g0;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.t;
import xn.c0;
import xn.f;
import xn.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final a Companion = new a(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 8192;
    private static final long DOWNLOAD_RETRY_FAILURE = 2;
    private static final long DOWNLOAD_RETRY_SUCCESS = 1;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final i downloadExecutor;
    private final k okHttpClient$delegate;
    private final s pathProvider;
    private final CopyOnWriteArrayList<e> transitioning;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static final class b {
        public static final b INSTANCE = new b();
        private static b0 client;

        private b() {
        }

        public final b0 createOkHttpClient(s pathProvider) {
            kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
            b0 b0Var = client;
            if (b0Var != null) {
                return b0Var;
            }
            b0.a aVar = new b0.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            b0.a aVarH = aVar.R(60L, timeUnit).e(60L, timeUnit).d(null).g(true).h(true);
            com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
            long cleverCacheDiskSize = eVar.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = eVar.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            kotlin.jvm.internal.s.g(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
            if (jMin > 0) {
                aVarH.d(new gn.c(pathProvider.getCleverCacheDir(), jMin));
            } else {
                q.Companion.w(c.TAG, "cache disk capacity size <=0, no clever cache active.");
            }
            b0 b0VarC = aVarH.c();
            client = b0VarC;
            return b0VarC;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C0505c extends h {
        final /* synthetic */ com.vungle.ads.internal.downloader.a $downloadListener;
        final /* synthetic */ e $downloadRequest;

        C0505c(e eVar, com.vungle.ads.internal.downloader.a aVar) {
            this.$downloadRequest = eVar;
            this.$downloadListener = aVar;
        }

        @Override // com.vungle.ads.internal.task.h
        public int getPriority() {
            return this.$downloadRequest.getPriority();
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            c.this.launchRequestWithRetry(this.$downloadRequest, this.$downloadListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class d extends t implements tl.a {
        d() {
            super(0);
        }

        @Override // tl.a
        public final b0 invoke() {
            return b.INSTANCE.createOkHttpClient(c.this.pathProvider);
        }
    }

    public c(i downloadExecutor, s pathProvider) {
        kotlin.jvm.internal.s.h(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient$delegate = l.b(new d());
        this.transitioning = new CopyOnWriteArrayList<>();
    }

    private final boolean checkSpaceAvailable(e eVar) {
        s sVar = this.pathProvider;
        String absolutePath = sVar.getVungleDir().getAbsolutePath();
        kotlin.jvm.internal.s.g(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = sVar.getAvailableBytes(absolutePath);
        if (availableBytes >= 20971520) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(eVar.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final g0 decodeGzipIfNeeded(f0 f0Var) {
        g0 g0VarD = f0Var.d();
        if (!r.A(GZIP, f0.c0(f0Var, CONTENT_ENCODING, null, 2, null), true) || g0VarD == null) {
            return g0VarD;
        }
        return new mn.h(f0.c0(f0Var, CONTENT_TYPE, null, 2, null), -1L, c0.c(new xn.r(g0VarD.source())));
    }

    private final void deliverError(e eVar, com.vungle.ads.internal.downloader.a aVar, com.vungle.ads.internal.downloader.a.C0500a c0500a) {
        if (aVar != null) {
            aVar.onError(c0500a, eVar);
        }
    }

    private final void deliverSuccess(File file, e eVar, com.vungle.ads.internal.downloader.a aVar) {
        q.Companion.d(TAG, "On success " + eVar);
        if (aVar != null) {
            aVar.onSuccess(file, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m82download$lambda0(e eVar, c this$0, com.vungle.ads.internal.downloader.a aVar) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.deliverError(eVar, aVar, new com.vungle.ads.internal.downloader.a.C0500a(-1, new OutOfMemory("Failed to execute download request: " + eVar.getAsset().getServerPath()), com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getINTERNAL_ERROR()));
    }

    private final b0 getOkHttpClient() {
        return (b0) this.okHttpClient$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:196:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:197:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:199:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:203:0x0503  */
    /* JADX WARN: Code duplicated, block: B:208:0x0534  */
    /* JADX WARN: Code duplicated, block: B:213:0x0541  */
    /* JADX WARN: Code duplicated, block: B:215:0x055c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0567  */
    /* JADX WARN: Code duplicated, block: B:221:0x059a  */
    /* JADX WARN: Code duplicated, block: B:222:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:224:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:228:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:275:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:213:0x0541, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:217:0x0567, please report this as an issue */
    private final com.vungle.ads.internal.downloader.a.C0500a launchRequest(e eVar, com.vungle.ads.internal.downloader.a aVar) throws Throwable {
        g gVarSource;
        gn.e eVarA;
        f0 f0VarExecute;
        g0 g0VarD;
        g0 g0VarD2;
        com.vungle.ads.internal.downloader.a.C0500a c0500a;
        int status;
        com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.C0504a c0504a;
        int currentRetryAttempt$vungle_ads_release;
        g0 g0VarD3;
        g0 g0VarD4;
        long jContentLength;
        f0 f0Var;
        long j10;
        f0 f0Var2;
        g0 g0VarD5;
        int i10;
        long j11;
        c cVar = this;
        com.vungle.ads.internal.model.a asset = eVar.getAsset();
        q.a aVar2 = q.Companion;
        aVar2.d(TAG, "launch request in thread: " + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        f fVarB = null;
        if (eVar.isCancelled()) {
            aVar2.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new com.vungle.ads.internal.downloader.a.b().setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getCANCELLED());
            return null;
        }
        com.vungle.ads.internal.downloader.a.b bVar = new com.vungle.ads.internal.downloader.a.b();
        bVar.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int iM = -1;
        if (serverPath.length() == 0 || !j.INSTANCE.isValidUrl(serverPath)) {
            return new com.vungle.ads.internal.downloader.a.C0500a(-1, new InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(eVar.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getINTERNAL_ERROR());
        }
        if (localPath.length() == 0) {
            return new com.vungle.ads.internal.downloader.a.C0500a(-1, new AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(eVar.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getFILE_NOT_FOUND_ERROR());
        }
        if (!checkSpaceAvailable(eVar)) {
            return new com.vungle.ads.internal.downloader.a.C0500a(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(eVar.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getDISK_ERROR());
        }
        File file = new File(localPath);
        if (file.exists()) {
            aVar2.d(TAG, "Deleting existing file before download: " + file.getAbsolutePath());
            if (!file.delete()) {
                return new com.vungle.ads.internal.downloader.a.C0500a(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(eVar.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getDISK_ERROR());
            }
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (Exception e10) {
                    e = e10;
                    asset = asset;
                    eVarA = null;
                    f0VarExecute = null;
                    file = file;
                    cVar = cVar;
                    gVarSource = null;
                } catch (Throwable th2) {
                    th = th2;
                    gVarSource = null;
                    eVarA = null;
                    f0VarExecute = null;
                }
            }
            eVarA = cVar.getOkHttpClient().a(new d0.a().v(serverPath).b());
            try {
                f0VarExecute = eVarA.execute();
                try {
                    try {
                        iM = f0VarExecute.m();
                        try {
                            if (f0VarExecute.i0()) {
                                if (f0VarExecute.k() != null) {
                                    try {
                                        com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(new com.vungle.ads.d0(Sdk$SDKMetric.b.CACHED_ASSETS_USED), eVar.getLogEntry$vungle_ads_release(), serverPath);
                                        fl.g0 g0Var = fl.g0.f38750a;
                                    } catch (Exception e11) {
                                        e = e11;
                                        asset = asset;
                                        file = file;
                                        fVarB = null;
                                        cVar = cVar;
                                        gVarSource = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        gVarSource = null;
                                    }
                                }
                                g0 g0VarDecodeGzipIfNeeded = cVar.decodeGzipIfNeeded(f0VarExecute);
                                String strC0 = f0.c0(f0VarExecute, CONTENT_TYPE, null, 2, null);
                                if (strC0 != null) {
                                    eVar.getAsset().setMimeType(strC0);
                                    fl.g0 g0Var2 = fl.g0.f38750a;
                                }
                                gVarSource = g0VarDecodeGzipIfNeeded != null ? g0VarDecodeGzipIfNeeded.source() : null;
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    try {
                                        sb2.append("Start download from url: ");
                                        sb2.append(serverPath);
                                        sb2.append(" mimeType=");
                                        sb2.append(strC0);
                                        aVar2.d(TAG, sb2.toString());
                                        fVarB = c0.b(xn.d0.c(file, false, 1, null));
                                        File file2 = file;
                                        if (g0VarDecodeGzipIfNeeded != null) {
                                            try {
                                                jContentLength = g0VarDecodeGzipIfNeeded.contentLength();
                                            } catch (Exception e12) {
                                                e = e12;
                                                cVar = cVar;
                                                asset = asset;
                                                file = file2;
                                                eVarA = eVarA;
                                                try {
                                                    q.a aVar3 = q.Companion;
                                                    aVar3.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                    bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getERROR());
                                                    com.vungle.ads.internal.downloader.a.C0500a c0500a2 = new com.vungle.ads.internal.downloader.a.C0500a(iM, e, com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getREQUEST_ERROR());
                                                    if (f0VarExecute != null) {
                                                        g0VarD3 = f0VarExecute.d();
                                                    } else {
                                                        g0VarD3 = null;
                                                    }
                                                    if (g0VarD3 != null) {
                                                        g0VarD4.close();
                                                        fl.g0 g0Var3 = fl.g0.f38750a;
                                                    }
                                                    if (eVarA != null) {
                                                        eVarA.cancel();
                                                        fl.g0 g0Var4 = fl.g0.f38750a;
                                                    }
                                                    j jVar = j.INSTANCE;
                                                    jVar.closeQuietly(fVarB);
                                                    jVar.closeQuietly(gVarSource);
                                                    aVar3.d(TAG, "download status: " + bVar.getStatus());
                                                    c0500a = c0500a2;
                                                    status = bVar.getStatus();
                                                    c0504a = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                                    if (status != c0504a.getERROR()) {
                                                        return c0500a;
                                                    }
                                                    if (status == c0504a.getCANCELLED()) {
                                                        q.Companion.d(TAG, "On cancel " + eVar);
                                                        cVar.onProgressChanged(eVar, bVar, aVar);
                                                    } else {
                                                        cVar.deliverSuccess(file, eVar, aVar);
                                                        currentRetryAttempt$vungle_ads_release = eVar.getCurrentRetryAttempt$vungle_ads_release();
                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                            com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 1L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + eVar.getAsset().getServerPath());
                                                        }
                                                    }
                                                    return null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                gVarSource = gVarSource;
                                                fVarB = fVarB;
                                                eVarA = eVarA;
                                                if (f0VarExecute != null) {
                                                    g0VarD = f0VarExecute.d();
                                                } else {
                                                    g0VarD = null;
                                                }
                                                if (g0VarD != null) {
                                                    g0VarD2.close();
                                                    fl.g0 g0Var5 = fl.g0.f38750a;
                                                }
                                                if (eVarA != null) {
                                                    eVarA.cancel();
                                                    fl.g0 g0Var6 = fl.g0.f38750a;
                                                }
                                                j jVar2 = j.INSTANCE;
                                                jVar2.closeQuietly(fVarB);
                                                jVar2.closeQuietly(gVarSource);
                                                q.Companion.d(TAG, "download status: " + bVar.getStatus());
                                                throw th;
                                            }
                                        } else {
                                            jContentLength = 0;
                                        }
                                        try {
                                            bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getSTARTED());
                                            bVar.setSizeBytes(jContentLength);
                                            bVar.setReadBytes(0L);
                                            int i11 = 0;
                                            bVar.setProgressPercent(0);
                                            asset.setContentLength(jContentLength);
                                            cVar = this;
                                            try {
                                                cVar.onProgressChanged(eVar, bVar, aVar);
                                                long j12 = 0;
                                                while (true) {
                                                    if (gVarSource != null) {
                                                        try {
                                                            f0Var = f0VarExecute;
                                                            file = file2;
                                                            try {
                                                                j10 = gVarSource.read(fVarB.u(), 8192L);
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                f0VarExecute = f0Var;
                                                                asset = asset;
                                                                eVarA = eVarA;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                f0VarExecute = f0Var;
                                                                gVarSource = gVarSource;
                                                                fVarB = fVarB;
                                                                eVarA = eVarA;
                                                            }
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            file = file2;
                                                            asset = asset;
                                                            eVarA = eVarA;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            gVarSource = gVarSource;
                                                            fVarB = fVarB;
                                                            eVarA = eVarA;
                                                        }
                                                    } else {
                                                        f0Var = f0VarExecute;
                                                        file = file2;
                                                        j10 = -1;
                                                    }
                                                    try {
                                                        fl.g0 g0Var7 = fl.g0.f38750a;
                                                        if (j10 <= 0) {
                                                            break;
                                                        }
                                                        if (!file.exists()) {
                                                            new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(eVar.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                                                            throw new Downloader.RequestException("File is not existing");
                                                        }
                                                        if (eVar.isCancelled()) {
                                                            bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getCANCELLED());
                                                            break;
                                                        }
                                                        bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getIN_PROGRESS());
                                                        fVarB.C();
                                                        fVarB.flush();
                                                        long j13 = j12 + j10;
                                                        bVar.setReadBytes(j13);
                                                        Long rangeEnd = asset.getRangeEnd();
                                                        f0Var2 = f0Var;
                                                        long jLongValue = rangeEnd != null ? rangeEnd.longValue() : asset.getRangeStart();
                                                        try {
                                                            try {
                                                                if (!asset.isWaitingForDownload() || j13 < jLongValue) {
                                                                    asset = asset;
                                                                    i10 = iM;
                                                                } else {
                                                                    asset = asset;
                                                                    try {
                                                                        q.a aVar4 = q.Companion;
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        i10 = iM;
                                                                        try {
                                                                            sb3.append("Downloader totalRead=");
                                                                            sb3.append(j13);
                                                                            sb3.append(" requiredBytes=");
                                                                            sb3.append(jLongValue);
                                                                            aVar4.e(TAG, sb3.toString());
                                                                            asset.notifyDownloadEnough();
                                                                        } catch (Exception e15) {
                                                                            e = e15;
                                                                            gVarSource = gVarSource;
                                                                            fVarB = fVarB;
                                                                            eVarA = eVarA;
                                                                            f0VarExecute = f0Var2;
                                                                            iM = i10;
                                                                        }
                                                                    } catch (Exception e16) {
                                                                        e = e16;
                                                                        gVarSource = gVarSource;
                                                                        fVarB = fVarB;
                                                                        eVarA = eVarA;
                                                                        f0VarExecute = f0Var2;
                                                                    }
                                                                }
                                                                if (jContentLength > 0) {
                                                                    j11 = j13;
                                                                    i11 = (int) ((((long) 100) * j11) / jContentLength);
                                                                } else {
                                                                    j11 = j13;
                                                                    i11 = i11;
                                                                }
                                                                while (bVar.getProgressPercent() + 1 <= Math.min(i11, 100)) {
                                                                    com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.C0504a c0504a2 = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                                                    bVar.setStatus(c0504a2.getIN_PROGRESS());
                                                                    bVar.setProgressPercent(bVar.getProgressPercent() + 1);
                                                                    if (bVar.getProgressPercent() >= 100) {
                                                                        bVar.setStatus(c0504a2.getDONE());
                                                                    }
                                                                    cVar.onProgressChanged(eVar, bVar, aVar);
                                                                }
                                                                file2 = file;
                                                                f0VarExecute = f0Var2;
                                                                asset = asset;
                                                                jContentLength = jContentLength;
                                                                iM = i10;
                                                                j12 = j11;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                gVarSource = gVarSource;
                                                                fVarB = fVarB;
                                                                eVarA = eVarA;
                                                                f0VarExecute = f0Var2;
                                                                if (f0VarExecute != null) {
                                                                    g0VarD = f0VarExecute.d();
                                                                } else {
                                                                    g0VarD = null;
                                                                }
                                                                if (g0VarD != null) {
                                                                    g0VarD2.close();
                                                                    fl.g0 g0Var8 = fl.g0.f38750a;
                                                                }
                                                                if (eVarA != null) {
                                                                    eVarA.cancel();
                                                                    fl.g0 g0Var9 = fl.g0.f38750a;
                                                                }
                                                                j jVar3 = j.INSTANCE;
                                                                jVar3.closeQuietly(fVarB);
                                                                jVar3.closeQuietly(gVarSource);
                                                                q.Companion.d(TAG, "download status: " + bVar.getStatus());
                                                                throw th;
                                                            }
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            asset = asset;
                                                        }
                                                        asset = asset;
                                                        gVarSource = gVarSource;
                                                        fVarB = fVarB;
                                                        eVarA = eVarA;
                                                        f0VarExecute = f0Var2;
                                                        q.a aVar5 = q.Companion;
                                                        aVar5.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                        bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getERROR());
                                                        com.vungle.ads.internal.downloader.a.C0500a c0500a3 = new com.vungle.ads.internal.downloader.a.C0500a(iM, e, com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getREQUEST_ERROR());
                                                        if (f0VarExecute != null) {
                                                            g0VarD3 = f0VarExecute.d();
                                                        } else {
                                                            g0VarD3 = null;
                                                        }
                                                        if (g0VarD3 != null && (g0VarD4 = f0VarExecute.d()) != null) {
                                                            g0VarD4.close();
                                                            fl.g0 g0Var10 = fl.g0.f38750a;
                                                        }
                                                        if (eVarA != null) {
                                                            eVarA.cancel();
                                                            fl.g0 g0Var11 = fl.g0.f38750a;
                                                        }
                                                        j jVar4 = j.INSTANCE;
                                                        jVar4.closeQuietly(fVarB);
                                                        jVar4.closeQuietly(gVarSource);
                                                        aVar5.d(TAG, "download status: " + bVar.getStatus());
                                                        c0500a = c0500a3;
                                                        status = bVar.getStatus();
                                                        c0504a = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                                        if (status != c0504a.getERROR() || status == c0504a.getSTARTED()) {
                                                            return c0500a;
                                                        }
                                                        if (status == c0504a.getCANCELLED()) {
                                                            q.Companion.d(TAG, "On cancel " + eVar);
                                                            cVar.onProgressChanged(eVar, bVar, aVar);
                                                        } else {
                                                            cVar.deliverSuccess(file, eVar, aVar);
                                                            currentRetryAttempt$vungle_ads_release = eVar.getCurrentRetryAttempt$vungle_ads_release();
                                                            if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 1L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + eVar.getAsset().getServerPath());
                                                            }
                                                        }
                                                        return null;
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        f0Var2 = f0Var;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        f0Var2 = f0Var;
                                                    }
                                                }
                                                f0 f0Var3 = f0Var;
                                                fVarB.flush();
                                                int status2 = bVar.getStatus();
                                                com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.C0504a c0504a3 = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                                if (status2 == c0504a3.getIN_PROGRESS()) {
                                                    bVar.setStatus(c0504a3.getDONE());
                                                    cVar.onProgressChanged(eVar, bVar, aVar);
                                                }
                                                if (f0Var3.d() != null && (g0VarD5 = f0Var3.d()) != null) {
                                                    g0VarD5.close();
                                                }
                                                eVarA.cancel();
                                                j jVar5 = j.INSTANCE;
                                                jVar5.closeQuietly(fVarB);
                                                jVar5.closeQuietly(gVarSource);
                                                q.Companion.d(TAG, "download status: " + bVar.getStatus());
                                                c0500a = null;
                                            } catch (Exception e19) {
                                                e = e19;
                                                asset = asset;
                                                file = file2;
                                                eVarA = eVarA;
                                                q.a aVar6 = q.Companion;
                                                aVar6.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getERROR());
                                                com.vungle.ads.internal.downloader.a.C0500a c0500a4 = new com.vungle.ads.internal.downloader.a.C0500a(iM, e, com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getREQUEST_ERROR());
                                                if (f0VarExecute != null) {
                                                    g0VarD3 = f0VarExecute.d();
                                                } else {
                                                    g0VarD3 = null;
                                                }
                                                if (g0VarD3 != null) {
                                                    g0VarD4.close();
                                                    fl.g0 g0Var12 = fl.g0.f38750a;
                                                }
                                                if (eVarA != null) {
                                                    eVarA.cancel();
                                                    fl.g0 g0Var13 = fl.g0.f38750a;
                                                }
                                                j jVar6 = j.INSTANCE;
                                                jVar6.closeQuietly(fVarB);
                                                jVar6.closeQuietly(gVarSource);
                                                aVar6.d(TAG, "download status: " + bVar.getStatus());
                                                c0500a = c0500a4;
                                                status = bVar.getStatus();
                                                c0504a = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                                if (status != c0504a.getERROR()) {
                                                    return c0500a;
                                                }
                                                if (status == c0504a.getCANCELLED()) {
                                                    q.Companion.d(TAG, "On cancel " + eVar);
                                                    cVar.onProgressChanged(eVar, bVar, aVar);
                                                } else {
                                                    cVar.deliverSuccess(file, eVar, aVar);
                                                    currentRetryAttempt$vungle_ads_release = eVar.getCurrentRetryAttempt$vungle_ads_release();
                                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                                        com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 1L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + eVar.getAsset().getServerPath());
                                                    }
                                                }
                                                return null;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                gVarSource = gVarSource;
                                                fVarB = fVarB;
                                                eVarA = eVarA;
                                                if (f0VarExecute != null) {
                                                    g0VarD = f0VarExecute.d();
                                                } else {
                                                    g0VarD = null;
                                                }
                                                if (g0VarD != null) {
                                                    g0VarD2.close();
                                                    fl.g0 g0Var14 = fl.g0.f38750a;
                                                }
                                                if (eVarA != null) {
                                                    eVarA.cancel();
                                                    fl.g0 g0Var15 = fl.g0.f38750a;
                                                }
                                                j jVar7 = j.INSTANCE;
                                                jVar7.closeQuietly(fVarB);
                                                jVar7.closeQuietly(gVarSource);
                                                q.Companion.d(TAG, "download status: " + bVar.getStatus());
                                                throw th;
                                            }
                                        } catch (Exception e20) {
                                            e = e20;
                                            cVar = this;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    } catch (Exception e21) {
                                        e = e21;
                                        asset = asset;
                                        file = file;
                                        cVar = cVar;
                                        gVarSource = gVarSource;
                                        eVarA = eVarA;
                                        fVarB = null;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        gVarSource = gVarSource;
                                        eVarA = eVarA;
                                        fVarB = null;
                                    }
                                } catch (Exception e22) {
                                    e = e22;
                                    asset = asset;
                                    file = file;
                                    cVar = cVar;
                                    gVarSource = gVarSource;
                                } catch (Throwable th13) {
                                    th = th13;
                                    gVarSource = gVarSource;
                                }
                                status = bVar.getStatus();
                                c0504a = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                if (status != c0504a.getERROR()) {
                                    return c0500a;
                                }
                                if (status == c0504a.getCANCELLED()) {
                                    q.Companion.d(TAG, "On cancel " + eVar);
                                    cVar.onProgressChanged(eVar, bVar, aVar);
                                } else {
                                    cVar.deliverSuccess(file, eVar, aVar);
                                    currentRetryAttempt$vungle_ads_release = eVar.getCurrentRetryAttempt$vungle_ads_release();
                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                        com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 1L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + eVar.getAsset().getServerPath());
                                    }
                                }
                                return null;
                            }
                            asset = asset;
                            file = file;
                            try {
                                throw new Downloader.RequestException(f0VarExecute.m0());
                            } catch (Exception e23) {
                                e = e23;
                                eVarA = eVarA;
                                f0VarExecute = f0VarExecute;
                                iM = iM;
                                gVarSource = null;
                                fVarB = null;
                                q.a aVar7 = q.Companion;
                                aVar7.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getERROR());
                                com.vungle.ads.internal.downloader.a.C0500a c0500a5 = new com.vungle.ads.internal.downloader.a.C0500a(iM, e, com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getREQUEST_ERROR());
                                if (f0VarExecute != null) {
                                    g0VarD3 = f0VarExecute.d();
                                } else {
                                    g0VarD3 = null;
                                }
                                if (g0VarD3 != null) {
                                    g0VarD4.close();
                                    fl.g0 g0Var16 = fl.g0.f38750a;
                                }
                                if (eVarA != null) {
                                    eVarA.cancel();
                                    fl.g0 g0Var17 = fl.g0.f38750a;
                                }
                                j jVar8 = j.INSTANCE;
                                jVar8.closeQuietly(fVarB);
                                jVar8.closeQuietly(gVarSource);
                                aVar7.d(TAG, "download status: " + bVar.getStatus());
                                c0500a = c0500a5;
                                status = bVar.getStatus();
                                c0504a = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                                if (status != c0504a.getERROR()) {
                                    return c0500a;
                                }
                                if (status == c0504a.getCANCELLED()) {
                                    q.Companion.d(TAG, "On cancel " + eVar);
                                    cVar.onProgressChanged(eVar, bVar, aVar);
                                } else {
                                    cVar.deliverSuccess(file, eVar, aVar);
                                    currentRetryAttempt$vungle_ads_release = eVar.getCurrentRetryAttempt$vungle_ads_release();
                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                        com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 1L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + eVar.getAsset().getServerPath());
                                    }
                                }
                                return null;
                            } catch (Throwable th14) {
                                th = th14;
                                eVarA = eVarA;
                                f0VarExecute = f0VarExecute;
                            }
                        } catch (Exception e24) {
                            e = e24;
                            gVarSource = null;
                            fVarB = null;
                            q.a aVar8 = q.Companion;
                            aVar8.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                            bVar.setStatus(com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion.getERROR());
                            com.vungle.ads.internal.downloader.a.C0500a c0500a6 = new com.vungle.ads.internal.downloader.a.C0500a(iM, e, com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getREQUEST_ERROR());
                            if (f0VarExecute != null) {
                                g0VarD3 = f0VarExecute.d();
                            } else {
                                g0VarD3 = null;
                            }
                            if (g0VarD3 != null) {
                                g0VarD4.close();
                                fl.g0 g0Var18 = fl.g0.f38750a;
                            }
                            if (eVarA != null) {
                                eVarA.cancel();
                                fl.g0 g0Var19 = fl.g0.f38750a;
                            }
                            j jVar9 = j.INSTANCE;
                            jVar9.closeQuietly(fVarB);
                            jVar9.closeQuietly(gVarSource);
                            aVar8.d(TAG, "download status: " + bVar.getStatus());
                            c0500a = c0500a6;
                            status = bVar.getStatus();
                            c0504a = com.vungle.ads.internal.downloader.a.b.InterfaceC0503a.Companion;
                            if (status != c0504a.getERROR()) {
                                return c0500a;
                            }
                            if (status == c0504a.getCANCELLED()) {
                                q.Companion.d(TAG, "On cancel " + eVar);
                                cVar.onProgressChanged(eVar, bVar, aVar);
                            } else {
                                cVar.deliverSuccess(file, eVar, aVar);
                                currentRetryAttempt$vungle_ads_release = eVar.getCurrentRetryAttempt$vungle_ads_release();
                                if (currentRetryAttempt$vungle_ads_release > 0) {
                                    com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 1L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + eVar.getAsset().getServerPath());
                                }
                            }
                            return null;
                        }
                    } catch (Exception e25) {
                        e = e25;
                    }
                } catch (Throwable th15) {
                    th = th15;
                }
                gVarSource = null;
                fVarB = null;
            } catch (Exception e26) {
                e = e26;
                gVarSource = null;
                fVarB = null;
                f0VarExecute = null;
            } catch (Throwable th16) {
                th = th16;
                gVarSource = null;
                fVarB = null;
                f0VarExecute = null;
            }
        } catch (Exception e27) {
            e = e27;
            gVarSource = null;
            fVarB = null;
            eVarA = null;
        } catch (Throwable th17) {
            th = th17;
            gVarSource = null;
            fVarB = null;
            eVarA = null;
        }
        if (f0VarExecute != null) {
            g0VarD = f0VarExecute.d();
        } else {
            g0VarD = null;
        }
        if (g0VarD != null && (g0VarD2 = f0VarExecute.d()) != null) {
            g0VarD2.close();
            fl.g0 g0Var110 = fl.g0.f38750a;
        }
        if (eVarA != null) {
            eVarA.cancel();
            fl.g0 g0Var111 = fl.g0.f38750a;
        }
        j jVar10 = j.INSTANCE;
        jVar10.closeQuietly(fVarB);
        jVar10.closeQuietly(gVarSource);
        q.Companion.d(TAG, "download status: " + bVar.getStatus());
        throw th;
    }

    private final void onProgressChanged(e eVar, com.vungle.ads.internal.downloader.a.b bVar, com.vungle.ads.internal.downloader.a aVar) {
        if (aVar != null) {
            aVar.onProgress(bVar, eVar);
        }
    }

    private final boolean shouldRetryDownload(e eVar, com.vungle.ads.internal.downloader.a.C0500a c0500a) {
        if (eVar.isCancelled()) {
            q.Companion.d(TAG, "Download cancelled, not retrying");
            return false;
        }
        Integer percentage = eVar.getAsset().getPercentage();
        if (percentage != null && percentage.intValue() < 100) {
            q.Companion.d(TAG, "Partial download asset (percentage=" + percentage + "), not retrying");
            return false;
        }
        if (!eVar.canRetry$vungle_ads_release()) {
            q.Companion.d(TAG, "Max retry attempts reached (" + eVar.getMaxRetries$vungle_ads_release() + ')');
            return false;
        }
        if (com.vungle.ads.internal.downloader.a.C0500a.Companion.shouldRetry(c0500a)) {
            return true;
        }
        q.Companion.d(TAG, "Error reason " + c0500a.getReason() + " is not retryable");
        return false;
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(e eVar) {
        if (eVar == null || eVar.isCancelled()) {
            return;
        }
        eVar.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((e) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final e eVar, final com.vungle.ads.internal.downloader.a aVar) {
        if (eVar == null) {
            return;
        }
        this.transitioning.add(eVar);
        this.downloadExecutor.execute(new C0505c(eVar, aVar), new Runnable() { // from class: com.vungle.ads.internal.downloader.b
            @Override // java.lang.Runnable
            public final void run() {
                c.m82download$lambda0(eVar, this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRequestWithRetry(e eVar, com.vungle.ads.internal.downloader.a aVar) throws Throwable {
        if (aVar != null) {
            aVar.onStart(eVar);
        }
        com.vungle.ads.internal.downloader.a.C0500a c0500aLaunchRequest = launchRequest(eVar, aVar);
        while (c0500aLaunchRequest != null && shouldRetryDownload(eVar, c0500aLaunchRequest)) {
            eVar.incrementRetryAttempt$vungle_ads_release();
            eVar.recordRetryReason$vungle_ads_release(mTFeqtajA.ZLSrDYHTFhp + c0500aLaunchRequest.getCause().getMessage() + ", Code: " + c0500aLaunchRequest.getServerCode() + ", Reason: " + c0500aLaunchRequest.getReason());
            q.Companion.w(TAG, "Download failed, retrying immediately. Attempt " + eVar.getCurrentRetryAttempt$vungle_ads_release() + '/' + eVar.getMaxRetries$vungle_ads_release() + ". URL: " + eVar.getAsset().getServerPath() + ", Error: " + c0500aLaunchRequest.getCause().getMessage());
            c0500aLaunchRequest = launchRequest(eVar, aVar);
        }
        if (c0500aLaunchRequest != null) {
            q.Companion.e(TAG, "Download failed after " + (eVar.getCurrentRetryAttempt$vungle_ads_release() + 1) + " attempts. URL: " + eVar.getAsset().getServerPath() + ". Retry history: " + eVar.getRetryReasons$vungle_ads_release());
            if (eVar.getCurrentRetryAttempt$vungle_ads_release() > 0) {
                com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.ASSET_DOWNLOAD_RETRY_STATUS, 2L, eVar.getLogEntry$vungle_ads_release(), "retryCount=" + eVar.getCurrentRetryAttempt$vungle_ads_release() + " url=" + eVar.getAsset().getServerPath());
            }
            deliverError(eVar, aVar, c0500aLaunchRequest);
        }
    }
}
