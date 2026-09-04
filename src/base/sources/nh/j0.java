package nh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.hecorat.screenrecorder.free.AzRecorderApp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j0 {
    public static void b(Context context, int i10) {
        try {
            e(context, i10, "", 1);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private static void c(Context context, int i10, int i11) {
        try {
            e(context, i10, "", i11);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static void d(Context context, int i10, String str) {
        try {
            e(context, i10, str, 1);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e(Context context, int i10, String str, int i11) {
        if (context != null) {
            try {
                Toast.makeText(context, context.getString(i10, str), i11).show();
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    public static void f(Context context, String str) {
        try {
            g(context, str, 1);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private static synchronized void g(Context context, String str, int i10) {
        try {
            Toast.makeText(context, str, i10).show();
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static void h(int i10) {
        i(i10, "", 1);
    }

    private static synchronized void i(final int i10, final String str, final int i11) {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: nh.i0
                @Override // java.lang.Runnable
                public final void run() {
                    j0.e(AzRecorderApp.e().getApplicationContext(), i10, str, i11);
                }
            });
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static void j(Context context, int i10) {
        try {
            c(context, i10, 0);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }
}
