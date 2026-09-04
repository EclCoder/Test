package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f30550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f30551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30552c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.image.c f30554b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0395a implements Runnable {
            RunnableC0395a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f30554b.onFailedLoad(SVWsZyNSAChGIA.EpddE, aVar.f30553a);
            }
        }

        a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f30553a = str;
            this.f30554b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(o0.d(this.f30553a), this.f30553a, null, this.f30554b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b(qEagQqzJZsd.vJXzFZOsr, "createDownloadRequest error");
            }
            if (this.f30554b == null) {
                return;
            }
            d.this.f30551b.post(new RunnableC0395a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f30557a = new d(null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f30558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f30559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f30561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f30562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.same.image.c f30563f;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30565a;

            b(String str) {
                this.f30565a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f30563f.onFailedLoad(c.this.f30562e, this.f30565a);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForFailed error", e10);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0396c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f30567a;

            RunnableC0396c(Bitmap bitmap) {
                this.f30567a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f30563f.onSuccessLoad(this.f30567a, c.this.f30562e);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e10);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f30559b = handler;
            this.f30558a = threadPoolExecutor;
            this.f30562e = str;
            this.f30560c = str2;
            this.f30561d = str3;
            this.f30563f = cVar;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f30558a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f30563f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.f30560c + this.f30561d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e10.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void b() {
            File file;
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f30562e + " imagePath = " + this.f30560c + this.f30561d);
                try {
                    file = new File(this.f30560c + this.f30561d);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e10);
                    }
                    file = null;
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    q0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        private void a(String str) {
            if (this.f30563f == null) {
                return;
            }
            this.f30559b.post(new b(str));
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar != null) {
                try {
                    return gVar.a(bitmap);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e10);
                    }
                }
            }
            return bitmap;
        }

        private void a(Bitmap bitmap) {
            if (this.f30563f == null) {
                return;
            }
            this.f30559b.post(new RunnableC0396c(bitmap));
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f30552c + o0.d(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return b(str2);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e10);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f30552c + o0.d(str));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
                }
                file = null;
            }
            return file != null && file.isFile() && file.exists();
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e11);
            }
            return false;
        }
    }

    private d() {
        this.f30551b = new Handler(Looper.getMainLooper());
        this.f30552c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f30550a = f.b();
    }

    public static d a() {
        return b.f30557a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f30499u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f30498t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f30497s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f30552c).withDownloadStateListener(new c(this.f30551b, this.f30550a, str2, this.f30552c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e10);
            }
            return null;
        }
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f30550a.execute(a(str, gVar, cVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "loadImage error", e10);
            }
        }
    }
}
