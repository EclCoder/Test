package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    public static final a Companion = new a(null);
    private static final String TAG = m.class.getSimpleName();
    private static final m instance = new m();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m getInstance() {
            return m.instance;
        }

        private a() {
        }
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m179displayImage$lambda0(String str, Function1 onImageLoaded) {
        kotlin.jvm.internal.s.h(onImageLoaded, "$onImageLoaded");
        if (bm.r.N(str, "file://", false, 2, null)) {
            String strSubstring = str.substring(7);
            kotlin.jvm.internal.s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                onImageLoaded.invoke(bitmapDecodeFile);
                return;
            }
            q.a aVar = q.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            aVar.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void displayImage(final String str, final Function1 onImageLoaded) {
        kotlin.jvm.internal.s.h(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            q.a aVar = q.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            aVar.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            q.a aVar2 = q.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            aVar2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.m179displayImage$lambda0(str, onImageLoaded);
                }
            });
        }
    }

    public final void getImageSize(String str, tl.o onImageSizeLoaded) {
        kotlin.jvm.internal.s.h(onImageSizeLoaded, "onImageSizeLoaded");
        if (str == null || str.length() == 0 || !bm.r.N(str, "file://", false, 2, null)) {
            q.a aVar = q.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            aVar.w(TAG2, "the valid uri is required.");
            return;
        }
        String strSubstring = str.substring(7);
        kotlin.jvm.internal.s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final void init(Executor ioExecutor) {
        kotlin.jvm.internal.s.h(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
