package com.vungle.ads.internal.model;

import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;
    private final String localPath;
    private String mimeType;
    private final Integer percentage;
    private Long rangeEnd;
    private long rangeStart;
    private final String serverPath;
    private EnumC0509a status;
    private final Object waitLock;
    private final AtomicBoolean waitingForDownload;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum EnumC0509a {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public a(String adIdentifier, String serverPath, String localPath, boolean z10, Integer num) {
        s.h(adIdentifier, "adIdentifier");
        s.h(serverPath, "serverPath");
        s.h(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z10;
        this.percentage = num;
        this.status = EnumC0509a.NEW;
        this.mimeType = "application/octet-stream";
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !s.c(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        if (this.status == aVar.status && this.fileSize == aVar.fileSize && this.isRequired == aVar.isRequired && s.c(this.adIdentifier, aVar.adIdentifier) && s.c(this.serverPath, aVar.serverPath) && this.contentLength == aVar.contentLength && s.c(this.percentage, aVar.percentage)) {
            return s.c(this.localPath, aVar.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final EnumC0509a getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j10 = this.fileSize;
        int iHashCode2 = (((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Boolean.hashCode(this.isRequired)) * 31;
        long j11 = this.contentLength;
        int i10 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isDownloaded() {
        return this.status == EnumC0509a.DOWNLOAD_SUCCESS;
    }

    public final boolean isHtmlTemplate() {
        return s.c(this.adIdentifier, b.KEY_VM);
    }

    public final boolean isMainAssets() {
        return s.c(this.adIdentifier, com.vungle.ads.internal.l.TOKEN_MAIN_IMAGE) || s.c(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isMainVideo() {
        return s.c(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isPrivacyIcon() {
        return s.c(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                g0 g0Var = g0.f38750a;
            }
        }
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setMimeType(String str) {
        s.h(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setRangeEnd(Long l10) {
        this.rangeEnd = l10;
    }

    public final void setRangeStart(long j10) {
        this.rangeStart = j10;
    }

    public final void setStatus(EnumC0509a enumC0509a) {
        s.h(enumC0509a, "<set-?>");
        this.status = enumC0509a;
    }

    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    public final void waitForDownload() {
        Object objB;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                r.a aVar = r.f38769b;
                this.waitLock.wait();
                objB = r.b(g0.f38750a);
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                objB = r.b(fl.s.a(th2));
            }
            Throwable thE = r.e(objB);
            if (thE != null) {
                q.Companion.e("AdAsset", "Interrupted while waiting for file download: " + this, thE);
            }
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, boolean z10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : num);
    }
}
