package com.vungle.ads.internal.downloader;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0500a {
        public static final C0501a Companion = new C0501a(null);
        public static final int DEFAULT_SERVER_CODE = -1;
        private final Throwable cause;

        @b
        private final int reason;
        private final int serverCode;

        /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0501a {
            public /* synthetic */ C0501a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean shouldRetry(C0500a error) {
                s.h(error, "error");
                if (error.getReason() != b.Companion.getREQUEST_ERROR()) {
                    return false;
                }
                int serverCode = error.getServerCode();
                if (serverCode != -1 && serverCode != 408 && serverCode != 500) {
                    switch (serverCode) {
                        case 502:
                        case 503:
                        case PglCryptUtils.BASE64_FAILED /* 504 */:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            }

            private C0501a() {
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        @Retention(RetentionPolicy.RUNTIME)
        public @interface b {
            public static final C0502a Companion = C0502a.$$INSTANCE;

            /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.a$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class C0502a {
                static final /* synthetic */ C0502a $$INSTANCE = new C0502a();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                private C0502a() {
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setDISK_ERROR(int i10) {
                    DISK_ERROR = i10;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i10) {
                    FILE_NOT_FOUND_ERROR = i10;
                }

                public final void setINTERNAL_ERROR(int i10) {
                    INTERNAL_ERROR = i10;
                }

                public final void setREQUEST_ERROR(int i10) {
                    REQUEST_ERROR = i10;
                }
            }
        }

        public C0500a(int i10, Throwable cause, int i11) {
            s.h(cause, "cause");
            this.serverCode = i10;
            this.cause = cause;
            this.reason = i11;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }

        public String toString() {
            return "DownloadError(serverCode=" + this.serverCode + ", reason=" + this.reason + ", cause=" + this.cause + ')';
        }
    }

    void onError(C0500a c0500a, e eVar);

    void onProgress(b bVar, e eVar);

    void onStart(e eVar);

    void onSuccess(File file, e eVar);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        private int progressPercent;
        private long readBytes;
        private long sizeBytes;
        private int status;
        private long timestampDownloadStart;

        /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        @Retention(RetentionPolicy.RUNTIME)
        public @interface InterfaceC0503a {
            public static final C0504a Companion = C0504a.$$INSTANCE;

            /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class C0504a {
                private static int STARTED;
                static final /* synthetic */ C0504a $$INSTANCE = new C0504a();
                private static int IN_PROGRESS = 1;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int ERROR = 7;

                private C0504a() {
                }

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final void setCANCELLED(int i10) {
                    CANCELLED = i10;
                }

                public final void setDONE(int i10) {
                    DONE = i10;
                }

                public final void setERROR(int i10) {
                    ERROR = i10;
                }

                public final void setIN_PROGRESS(int i10) {
                    IN_PROGRESS = i10;
                }

                public final void setSTARTED(int i10) {
                    STARTED = i10;
                }
            }
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final long getReadBytes() {
            return this.readBytes;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public final int getStatus() {
            return this.status;
        }

        public final long getTimestampDownloadStart() {
            return this.timestampDownloadStart;
        }

        public final void setProgressPercent(int i10) {
            this.progressPercent = i10;
        }

        public final void setReadBytes(long j10) {
            this.readBytes = j10;
        }

        public final void setSizeBytes(long j10) {
            this.sizeBytes = j10;
        }

        public final void setStatus(int i10) {
            this.status = i10;
        }

        public final void setTimestampDownloadStart(long j10) {
            this.timestampDownloadStart = j10;
        }

        public String toString() {
            return "Progress(status=" + this.status + ", percent=" + this.progressPercent + ", startAt=" + this.timestampDownloadStart + ", readed=" + this.readBytes + ", total=" + this.sizeBytes + ')';
        }

        @InterfaceC0503a
        public static /* synthetic */ void getStatus$annotations() {
        }
    }
}
