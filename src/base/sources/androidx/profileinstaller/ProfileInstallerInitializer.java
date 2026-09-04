package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements r4.a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: j4.e
            @Override // java.lang.Runnable
            public final void run() {
                f.h(context);
            }
        });
    }

    @Override // r4.a
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // r4.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: j4.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f42001a.f(applicationContext);
            }
        });
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: j4.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.g(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
