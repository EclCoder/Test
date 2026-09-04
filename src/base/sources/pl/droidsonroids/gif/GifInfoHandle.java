package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
final class GifInfoHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f50167a;

    static {
        i.b();
    }

    GifInfoHandle() {
    }

    private static native void bindSurface(long j10, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor();

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10);

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    private static int i(FileDescriptor fileDescriptor, boolean z10) throws ErrnoException {
        try {
            int iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
            return iCreateTempNativeFileDescriptor;
        } finally {
            if (z10) {
                Os.close(fileDescriptor);
            }
        }
    }

    private static native boolean isOpaque(long j10);

    private static long o(FileDescriptor fileDescriptor, long j10, boolean z10) throws GifIOException {
        int i10;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                i10 = i(fileDescriptor, z10);
            } catch (Exception e10) {
                throw new GifIOException(c.OPEN_FAILED.f50229b, e10.getMessage());
            }
        } else {
            i10 = extractNativeFileDescriptor(fileDescriptor, z10);
        }
        return openNativeFileDescriptor(i10, j10);
    }

    static native long openFile(String str);

    static native long openNativeFileDescriptor(int i10, long j10);

    static GifInfoHandle p(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return new GifInfoHandle(assetFileDescriptorOpenAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    private static native void postUnbindSurface(long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    private static native void setOptions(long j10, char c10, boolean z10);

    private static native void setSpeedFactor(long j10, float f10);

    void A(float f10) {
        if (f10 <= 0.0f || Float.isNaN(f10)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f10 < 4.656613E-10f) {
            f10 = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f50167a, f10);
        }
    }

    void a(Surface surface, long[] jArr) {
        bindSurface(this.f50167a, surface, jArr);
    }

    synchronized int b() {
        return getCurrentFrameIndex(this.f50167a);
    }

    synchronized int c() {
        return getCurrentLoop(this.f50167a);
    }

    synchronized int d() {
        return getCurrentPosition(this.f50167a);
    }

    synchronized int e() {
        return getDuration(this.f50167a);
    }

    synchronized int f() {
        return getHeight(this.f50167a);
    }

    protected void finalize() throws Throwable {
        try {
            r();
        } finally {
            super.finalize();
        }
    }

    synchronized int g() {
        return getLoopCount(this.f50167a);
    }

    synchronized int h() {
        return getNativeErrorCode(this.f50167a);
    }

    synchronized int j() {
        return getNumberOfFrames(this.f50167a);
    }

    synchronized long[] k() {
        return getSavedState(this.f50167a);
    }

    synchronized int l() {
        return getWidth(this.f50167a);
    }

    synchronized boolean m() {
        return isOpaque(this.f50167a);
    }

    synchronized boolean n() {
        return this.f50167a == 0;
    }

    synchronized void q() {
        postUnbindSurface(this.f50167a);
    }

    synchronized void r() {
        free(this.f50167a);
        this.f50167a = 0L;
    }

    synchronized long s(Bitmap bitmap) {
        return renderFrame(this.f50167a, bitmap);
    }

    synchronized boolean t() {
        return reset(this.f50167a);
    }

    synchronized long u() {
        return restoreRemainder(this.f50167a);
    }

    synchronized int v(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f50167a, jArr, bitmap);
    }

    synchronized void w() {
        saveRemainder(this.f50167a);
    }

    synchronized void x(int i10, Bitmap bitmap) {
        seekToTime(this.f50167a, i10, bitmap);
    }

    void y(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f50167a, (char) i10);
        }
    }

    void z(char c10, boolean z10) {
        setOptions(this.f50167a, c10, z10);
    }

    GifInfoHandle(String str) {
        this.f50167a = openFile(str);
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f50167a = o(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }
}
