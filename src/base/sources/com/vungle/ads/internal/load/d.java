package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.d0;
import com.vungle.ads.e0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.presenter.o;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final a Companion = new a(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<com.vungle.ads.internal.model.a> adAssets;
    private com.vungle.ads.internal.load.a adLoaderCallback;
    private e0 adOptionalDownloadDurationMetric;
    private e0 adPreloadToReadyDurationMetric;
    private final com.vungle.ads.internal.load.b adRequest;
    private e0 adRequiredDownloadDurationMetric;
    private com.vungle.ads.internal.model.b advertisement;
    private e0 assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final Set<String> downloadRequiredAssets;
    private final Downloader downloader;
    private AtomicBoolean fullyDownloaded;
    private long loadStart;
    private p logEntry;
    private d0 mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final com.vungle.ads.internal.omsdk.c omInjector;
    private final s pathProvider;
    private final e0 requestToResponseMetric;
    private AtomicBoolean requiredAssetDownloaded;
    private final com.vungle.ads.internal.executor.a sdkExecutors;
    private d0 templateHtmlSizeMetric;
    private final com.vungle.ads.internal.network.k vungleApiClient;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements com.vungle.ads.internal.downloader.a {
        private boolean partialDownloadRecorded;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onError$lambda-1, reason: not valid java name */
        public static final void m101onError$lambda1(com.vungle.ads.internal.downloader.e downloadRequest, d this$0, b this$1, com.vungle.ads.internal.downloader.a.C0500a c0500a) {
            kotlin.jvm.internal.s.h(downloadRequest, "$downloadRequest");
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(this$1, "this$1");
            com.vungle.ads.internal.model.a asset = downloadRequest.getAsset();
            if (asset.isPrivacyIcon()) {
                File fileInjectPrivacyIcon = com.vungle.ads.internal.downloader.d.INSTANCE.injectPrivacyIcon(this$0.getPathProvider().getVmDir());
                if (fileInjectPrivacyIcon != null && fileInjectPrivacyIcon.exists()) {
                    this$1.onSuccess(fileInjectPrivacyIcon, downloadRequest);
                    return;
                }
                new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            }
            asset.setStatus(com.vungle.ads.internal.model.a.EnumC0509a.DOWNLOAD_FAILED);
            this$0.fullyDownloaded.set(false);
            if (asset.isRequired()) {
                this$0.requiredAssetDownloaded.set(false);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to download assets ");
            sb2.append(asset.getServerPath());
            sb2.append(". error: ");
            sb2.append(c0500a);
            sb2.append(" errorType=");
            com.vungle.ads.internal.platform.e eVar = com.vungle.ads.internal.platform.e.INSTANCE;
            sb2.append(eVar.classifyNetworkError(c0500a != null ? c0500a.getCause() : null));
            sb2.append(" proxyEnabled=");
            sb2.append(eVar.isProxyEnabled(this$0.getContext()));
            sb2.append(" privateDns=");
            sb2.append(eVar.getPrivateDnsInfo(this$0.getContext()));
            sb2.append(" network=");
            sb2.append(eVar.getActiveNetworkType(this$0.getContext()));
            new AssetRequestError(sb2.toString()).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            if (asset.isRequired()) {
                this$0.downloadRequiredAssets.remove(downloadRequest.getAsset().getServerPath());
                if (this$0.downloadRequiredAssets.isEmpty()) {
                    this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download required assets."));
                    this$0.cancel();
                    return;
                }
            }
            if (this$0.downloadCount.decrementAndGet() <= 0) {
                this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download assets."));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onProgress$lambda-0, reason: not valid java name */
        public static final void m102onProgress$lambda0(d this$0, com.vungle.ads.internal.model.a adAsset) throws Throwable {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(adAsset, "$adAsset");
            this$0.downloadRequiredAssets.remove(adAsset.getServerPath());
            if (this$0.downloadRequiredAssets.isEmpty()) {
                if (this$0.requiredAssetDownloaded.get()) {
                    this$0.onRequiredDownloadCompleted();
                } else {
                    this$0.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                    this$0.cancel();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onSuccess$lambda-2, reason: not valid java name */
        public static final void m103onSuccess$lambda2(File file, b this$0, com.vungle.ads.internal.downloader.e downloadRequest, d this$1) throws Throwable {
            kotlin.jvm.internal.s.h(file, "$file");
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(downloadRequest, "$downloadRequest");
            kotlin.jvm.internal.s.h(this$1, "this$1");
            if (!file.exists()) {
                this$0.onError(new com.vungle.ads.internal.downloader.a.C0500a(-1, new IOException(d.DOWNLOADED_FILE_NOT_FOUND), com.vungle.ads.internal.downloader.a.C0500a.b.Companion.getFILE_NOT_FOUND_ERROR()), downloadRequest);
                return;
            }
            com.vungle.ads.internal.model.a asset = downloadRequest.getAsset();
            asset.setFileSize(file.length());
            asset.setStatus(com.vungle.ads.internal.model.a.EnumC0509a.DOWNLOAD_SUCCESS);
            Integer percentage = asset.getPercentage();
            if (percentage == null || percentage.intValue() == 0 || percentage.intValue() == 100) {
                downloadRequest.stopPartialDownloadRecord();
            }
            if (asset.isHtmlTemplate()) {
                downloadRequest.stopTemplateRecord();
                this$1.templateHtmlSizeMetric.setValue(Long.valueOf(file.length()));
                com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(this$1.templateHtmlSizeMetric, this$1.getLogEntry$vungle_ads_release(), asset.getServerPath());
            } else if (asset.isMainVideo()) {
                this$1.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
                com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(this$1.mainVideoSizeMetric, this$1.getLogEntry$vungle_ads_release(), asset.getServerPath());
            }
            com.vungle.ads.internal.model.b advertisement$vungle_ads_release = this$1.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release != null) {
                advertisement$vungle_ads_release.updateAdAssetPath(asset.getAdIdentifier(), file);
            }
            if (asset.isHtmlTemplate() && !this$1.processVmTemplate(asset, this$1.getAdvertisement$vungle_ads_release())) {
                this$1.fullyDownloaded.set(false);
                if (asset.isRequired()) {
                    this$1.requiredAssetDownloaded.set(false);
                }
            }
            if (asset.isRequired()) {
                this$1.downloadRequiredAssets.remove(asset.getServerPath());
                if (this$1.downloadRequiredAssets.isEmpty()) {
                    if (!this$1.requiredAssetDownloaded.get()) {
                        this$1.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                        this$1.cancel();
                        return;
                    }
                    this$1.onRequiredDownloadCompleted();
                }
            }
            if (this$1.downloadCount.decrementAndGet() <= 0) {
                if (this$1.fullyDownloaded.get()) {
                    this$1.onDownloadCompleted(this$1.getAdRequest());
                } else {
                    this$1.onAdLoadFailed(new AssetRequestError("Failed to download assets."));
                }
            }
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onError(final com.vungle.ads.internal.downloader.a.C0500a c0500a, final com.vungle.ads.internal.downloader.e downloadRequest) {
            kotlin.jvm.internal.s.h(downloadRequest, "downloadRequest");
            q.Companion.e(d.TAG, "onError called: " + c0500a);
            com.vungle.ads.internal.executor.i backgroundExecutor = d.this.getSdkExecutors().getBackgroundExecutor();
            final d dVar = d.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.m101onError$lambda1(downloadRequest, dVar, this, c0500a);
                }
            });
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onProgress(com.vungle.ads.internal.downloader.a.b progress, com.vungle.ads.internal.downloader.e downloadRequest) throws Throwable {
            kotlin.jvm.internal.s.h(progress, "progress");
            kotlin.jvm.internal.s.h(downloadRequest, "downloadRequest");
            final com.vungle.ads.internal.model.a asset = downloadRequest.getAsset();
            Integer percentage = asset.getPercentage();
            q.a aVar = q.Companion;
            aVar.d(d.TAG, "Download progress: " + progress + " url: " + asset.getServerPath());
            if (this.partialDownloadRecorded || percentage == null || progress.getProgressPercent() < percentage.intValue()) {
                return;
            }
            this.partialDownloadRecorded = true;
            if (new yl.f(1, 99).h(percentage.intValue())) {
                downloadRequest.stopPartialDownloadRecord();
            }
            aVar.w(d.TAG, "Download progress: hit chunk percentage=" + percentage + " for url: " + asset.getServerPath());
            if (asset.isRequired()) {
                com.vungle.ads.internal.executor.i backgroundExecutor = d.this.getSdkExecutors().getBackgroundExecutor();
                final d dVar = d.this;
                backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.e
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        d.b.m102onProgress$lambda0(dVar, asset);
                    }
                });
            }
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onStart(com.vungle.ads.internal.downloader.e downloadRequest) {
            kotlin.jvm.internal.s.h(downloadRequest, "downloadRequest");
            q.Companion.w(d.TAG, "onStart called: " + downloadRequest.getAsset().getServerPath());
            downloadRequest.startPartialDownloadRecord();
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onSuccess(final File file, final com.vungle.ads.internal.downloader.e downloadRequest) {
            kotlin.jvm.internal.s.h(file, "file");
            kotlin.jvm.internal.s.h(downloadRequest, "downloadRequest");
            com.vungle.ads.internal.executor.i backgroundExecutor = d.this.getSdkExecutors().getBackgroundExecutor();
            final d dVar = d.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.f
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    d.b.m103onSuccess$lambda2(file, this, downloadRequest, dVar);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.load.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0508d implements com.vungle.ads.internal.presenter.m {
        final /* synthetic */ com.vungle.ads.internal.model.b $it;

        C0508d(com.vungle.ads.internal.model.b bVar) {
            this.$it = bVar;
        }

        @Override // com.vungle.ads.internal.presenter.m
        public void onAdFailedToPlay() throws Throwable {
            d.this.adPreloadToReadyDurationMetric.markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, d.this.adPreloadToReadyDurationMetric, d.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            q.Companion.e(d.TAG, "fail to load ad");
            d.this.onAdLoadReady();
            com.vungle.ads.internal.load.a aVar = d.this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(this.$it);
            }
        }

        @Override // com.vungle.ads.internal.presenter.m
        public void onAdReadyToPlay() throws Throwable {
            d.this.adPreloadToReadyDurationMetric.markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, d.this.adPreloadToReadyDurationMetric, d.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            d.this.onAdLoadReady();
            com.vungle.ads.internal.load.a aVar = d.this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(this.$it);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.f, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.task.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.task.f.class);
        }
    }

    public d(Context context, com.vungle.ads.internal.network.k vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, Downloader downloader, s pathProvider, com.vungle.ads.internal.load.b adRequest) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.s.h(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.s.h(omInjector, "omInjector");
        kotlin.jvm.internal.s.h(downloader, "downloader");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        kotlin.jvm.internal.s.h(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredAssets = new LinkedHashSet();
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.requestToResponseMetric = new e0(Sdk$SDKMetric.b.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.mainVideoSizeMetric = new d0(Sdk$SDKMetric.b.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new d0(Sdk$SDKMetric.b.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new e0(Sdk$SDKMetric.b.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new e0(Sdk$SDKMetric.b.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new e0(Sdk$SDKMetric.b.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new e0(Sdk$SDKMetric.b.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    private final void downloadAssets() {
        com.vungle.ads.internal.model.b.c cVarAdUnit;
        Integer maxDownloadRetryAttempts;
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        int iF = yl.g.f((bVar == null || (cVarAdUnit = bVar.adUnit()) == null || (maxDownloadRetryAttempts = cVarAdUnit.getMaxDownloadRetryAttempts()) == null) ? 0 : maxDownloadRetryAttempts.intValue(), 5);
        for (com.vungle.ads.internal.model.a aVar : this.adAssets) {
            com.vungle.ads.internal.downloader.e eVar = new com.vungle.ads.internal.downloader.e(getAssetPriority(aVar), aVar, this.logEntry, iF);
            if (aVar.isHtmlTemplate()) {
                eVar.startTemplateRecord();
            }
            if (aVar.isRequired()) {
                this.downloadRequiredAssets.add(aVar.getServerPath());
            }
            this.downloader.download(eVar, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, com.vungle.ads.internal.model.a aVar) {
        return file.exists() && file.length() == aVar.getFileSize();
    }

    private final com.vungle.ads.internal.downloader.a getAssetDownloadListener() {
        return new b();
    }

    private final com.vungle.ads.internal.downloader.e.a getAssetPriority(com.vungle.ads.internal.model.a aVar) {
        return aVar.isRequired() ? com.vungle.ads.internal.downloader.e.a.CRITICAL : com.vungle.ads.internal.downloader.e.a.HIGHEST;
    }

    private final File getDestinationDir(com.vungle.ads.internal.model.b bVar) {
        return this.pathProvider.getDownloadsDirForAd(bVar.eventId());
    }

    private final VungleError getErrorInfo(com.vungle.ads.internal.model.b bVar) {
        com.vungle.ads.internal.model.b.c cVarAdUnit = bVar.adUnit();
        Integer errorCode = cVarAdUnit != null ? cVarAdUnit.getErrorCode() : null;
        com.vungle.ads.internal.model.b.c cVarAdUnit2 = bVar.adUnit();
        Integer sleep = cVarAdUnit2 != null ? cVarAdUnit2.getSleep() : null;
        com.vungle.ads.internal.model.b.c cVarAdUnit3 = bVar.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (cVarAdUnit3 != null ? cVarAdUnit3.getInfo() : null);
        if ((errorCode == null || errorCode.intValue() != 10001) && ((errorCode == null || errorCode.intValue() != 10002) && ((errorCode == null || errorCode.intValue() != 20001) && ((errorCode == null || errorCode.intValue() != 30001) && (errorCode == null || errorCode.intValue() != 30002))))) {
            return new AdPayloadError(Sdk$SDKError.b.PLACEMENT_SLEEP, str);
        }
        Sdk$SDKError.b bVarForNumber = Sdk$SDKError.b.forNumber(errorCode.intValue());
        kotlin.jvm.internal.s.g(bVarForNumber, "forNumber(errorCode)");
        return new AdPayloadError(bVarForNumber, str);
    }

    private final VungleError getTemplateError(com.vungle.ads.internal.model.b bVar) {
        com.vungle.ads.internal.model.b.CacheableReplacement cacheableReplacement;
        com.vungle.ads.internal.model.b.CacheableReplacement cacheableReplacement2;
        com.vungle.ads.internal.model.b.c cVarAdUnit = bVar.adUnit();
        com.vungle.ads.internal.model.b.TemplateSettings templateSettings = cVarAdUnit != null ? cVarAdUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new AdResponseEmptyError("Missing template settings");
        }
        Map<String, com.vungle.ads.internal.model.b.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (bVar.isNativeTemplateType()) {
            if (((cacheableReplacements == null || (cacheableReplacement2 = cacheableReplacements.get(com.vungle.ads.internal.l.TOKEN_MAIN_IMAGE)) == null) ? null : cacheableReplacement2.getUrl()) == null) {
                if (((cacheableReplacements == null || (cacheableReplacement = cacheableReplacements.get("MAIN_VIDEO")) == null) ? null : cacheableReplacement.getUrl()) == null) {
                    return new NativeAssetError("Unable to load null main asset.");
                }
            }
            com.vungle.ads.internal.model.b.CacheableReplacement cacheableReplacement3 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((cacheableReplacement3 != null ? cacheableReplacement3.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null privacy image.");
            }
        } else {
            com.vungle.ads.internal.model.b.c cVarAdUnit2 = bVar.adUnit();
            String vmURL = cVarAdUnit2 != null ? cVarAdUnit2.getVmURL() : null;
            if (vmURL == null || vmURL.length() == 0) {
                return new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!z.INSTANCE.isUrlValid(vmURL)) {
                return new InvalidTemplateURLError("Failed to load vm url: " + vmURL);
            }
        }
        if (cacheableReplacements != null) {
            for (Map.Entry<String, com.vungle.ads.internal.model.b.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new InvalidAssetUrlError("None asset URL for " + entry.getKey());
                }
                if (!z.INSTANCE.isUrlValid(url)) {
                    return new InvalidAssetUrlError("Invalid asset URL " + url);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: handleAdMetaData$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m98handleAdMetaData$lambda7(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(d dVar, com.vungle.ads.internal.model.b bVar, d0 d0Var, int i10, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i10 & 2) != 0) {
            d0Var = null;
        }
        dVar.handleAdMetaData$vungle_ads_release(bVar, d0Var);
    }

    private final void injectOMSDKIfNeeded() {
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (bVar == null || !bVar.omEnabled()) {
            return;
        }
        try {
            this.omInjector.init();
            this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
        } catch (Exception e10) {
            q.Companion.e(TAG, "Failed to inject OMSDK: " + e10.getMessage());
            new OmSdkJsError(Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + e10.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m99loadAd$lambda0(d this$0) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.requestToResponseMetric.markStart();
        this$0.requestAd();
    }

    private final void onAdReady() {
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (bVar == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (bVar.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            String strValueOf = String.valueOf(bVar.getIndexFilePath());
            q.Companion.w(TAG, "start preloading");
            o.INSTANCE.preloadWebView$vungle_ads_release(this.context, bVar, this.adRequest.getPlacement(), strValueOf, bVar.getWebViewSettings(), new C0508d(bVar), Long.valueOf(System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(bVar);
            }
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m100onAdReady$lambda5$lambda4(fl.l.a(fl.o.SYNCHRONIZED, new e(this.context))).execute(com.vungle.ads.internal.task.i.Companion.makeJobInfo());
    }

    /* JADX INFO: renamed from: onAdReady$lambda-5$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.task.f m100onAdReady$lambda5$lambda4(fl.k kVar) {
        return (com.vungle.ads.internal.task.f) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDownloadCompleted(com.vungle.ads.internal.load.b bVar) throws Throwable {
        q.Companion.d(TAG, "All download completed " + bVar);
        com.vungle.ads.internal.model.b bVar2 = this.advertisement;
        if (bVar2 != null) {
            bVar2.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() throws Throwable {
        this.adRequiredDownloadDurationMetric.markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(com.vungle.ads.internal.model.a aVar, com.vungle.ads.internal.model.b bVar) {
        if (bVar == null || !aVar.isDownloaded() || aVar.getLocalPath().length() == 0 || !fileIsValid(new File(aVar.getLocalPath()), aVar)) {
            return false;
        }
        File destinationDir = getDestinationDir(bVar);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            q.Companion.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        com.vungle.ads.internal.util.j.printDirectoryTree(destinationDir);
        return true;
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    public final com.vungle.ads.internal.load.b getAdRequest() {
        return this.adRequest;
    }

    public final com.vungle.ads.internal.model.b getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final p getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final s getPathProvider() {
        return this.pathProvider;
    }

    public final com.vungle.ads.internal.executor.a getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final com.vungle.ads.internal.network.k getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(com.vungle.ads.internal.model.b advertisement, d0 d0Var) throws Throwable {
        List<String> loadAdUrls;
        kotlin.jvm.internal.s.h(advertisement, "advertisement");
        this.advertisement = advertisement;
        if (advertisement != null) {
            advertisement.recordExpiryWindowStart();
        }
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        p pVar = this.logEntry;
        if (pVar != null) {
            pVar.setEventId$vungle_ads_release(advertisement.eventId());
        }
        p pVar2 = this.logEntry;
        if (pVar2 != null) {
            pVar2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        p pVar3 = this.logEntry;
        if (pVar3 != null) {
            pVar3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        p pVar4 = this.logEntry;
        if (pVar4 != null) {
            pVar4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        p pVar5 = this.logEntry;
        if (pVar5 != null) {
            pVar5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        p pVar6 = this.logEntry;
        if (pVar6 != null) {
            pVar6.setPartialDownloadEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        p pVar7 = this.logEntry;
        if (pVar7 != null) {
            pVar7.setAdoEnabled$vungle_ads_release(Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        p pVar8 = this.logEntry;
        if (pVar8 != null) {
            pVar8.setAdPoddingEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isAdPoddingEnabled()));
        }
        p pVar9 = this.logEntry;
        if (pVar9 != null) {
            pVar9.setExperiments$vungle_ads_release(advertisement.getExperiments());
        }
        this.requestToResponseMetric.markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.requestToResponseMetric, this.logEntry, (String) null, 4, (Object) null);
        com.vungle.ads.internal.model.g config = advertisement.getConfig();
        if (config != null) {
            com.vungle.ads.internal.e.INSTANCE.initWithConfig$vungle_ads_release(this.context, config, false, d0Var);
        }
        VungleError vungleErrorValidateAdMetadata = validateAdMetadata(advertisement);
        if (vungleErrorValidateAdMetadata != null) {
            onAdLoadFailed(vungleErrorValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetWriteError("Invalid directory. " + destinationDir).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        injectOMSDKIfNeeded();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.k kVarA = fl.l.a(fl.o.SYNCHRONIZED, new c(this.context));
        com.vungle.ads.internal.model.b.c cVarAdUnit = advertisement.adUnit();
        if (cVarAdUnit != null && (loadAdUrls = cVarAdUnit.getLoadAdUrls()) != null) {
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.i.sendTpat$default(m98handleAdMetaData$lambda7(kVarA), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    public final void loadAd(com.vungle.ads.internal.load.a adLoaderCallback) {
        kotlin.jvm.internal.s.h(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = System.currentTimeMillis();
        this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.load.c
            @Override // java.lang.Runnable
            public final void run() {
                d.m99loadAd$lambda0(this.f35808a);
            }
        });
    }

    public final void onAdLoadFailed(VungleError error) {
        boolean z10;
        kotlin.jvm.internal.s.h(error, "error");
        if (this.notifySuccess.get()) {
            return;
        }
        boolean z11 = true;
        if (this.notifyFailed.compareAndSet(false, true)) {
            com.vungle.ads.internal.model.b bVar = this.advertisement;
            if (bVar != null && bVar.isNativeTemplateType()) {
                List<com.vungle.ads.internal.model.a> list = this.adAssets;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((com.vungle.ads.internal.model.a) obj).isMainAssets()) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                fl.q qVar = new fl.q(arrayList, arrayList2);
                List list2 = (List) qVar.d();
                List list3 = (List) qVar.g();
                List list4 = list2;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((com.vungle.ads.internal.model.a) it.next()).isDownloaded()) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                List list5 = list3;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (!((com.vungle.ads.internal.model.a) it2.next()).isDownloaded()) {
                            z11 = false;
                            break;
                        }
                    }
                }
                if (z10 && z11) {
                    this.notifyFailed.set(false);
                    onAdReady();
                    return;
                }
            }
            com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
            if (aVar != null) {
                aVar.onFailure(error);
            }
        }
    }

    public abstract void onAdLoadReady();

    protected abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(com.vungle.ads.internal.model.b bVar) {
        this.advertisement = bVar;
    }

    public final void setLogEntry$vungle_ads_release(p pVar) {
        this.logEntry = pVar;
    }

    public VungleError validateAdMetadata(com.vungle.ads.internal.model.b adPayload) {
        kotlin.jvm.internal.s.h(adPayload, "adPayload");
        com.vungle.ads.internal.model.b.c cVarAdUnit = adPayload.adUnit();
        if (cVarAdUnit != null && cVarAdUnit.getSleep() != null) {
            return getErrorInfo(adPayload);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (!kotlin.jvm.internal.s.c(referenceId, bVar != null ? bVar.placementId() : null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Waterfall request and responses placement don't match ");
            com.vungle.ads.internal.model.b bVar2 = this.advertisement;
            sb2.append(bVar2 != null ? bVar2.placementId() : null);
            sb2.append('.');
            return new PlacementMismatchError(sb2.toString());
        }
        VungleError templateError = getTemplateError(adPayload);
        if (templateError != null) {
            return templateError;
        }
        if (!adPayload.hasExpired()) {
            String strEventId = adPayload.eventId();
            if (strEventId == null || strEventId.length() == 0) {
                return new InvalidEventIdError("Event id is invalid.");
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The ad markup has expired for playback. Ad expiry: ");
        com.vungle.ads.internal.model.b.c cVarAdUnit2 = adPayload.adUnit();
        sb3.append(cVarAdUnit2 != null ? cVarAdUnit2.getExpiry() : null);
        sb3.append(", device: ");
        sb3.append(System.currentTimeMillis());
        return new AdExpiredError(sb3.toString());
    }
}
