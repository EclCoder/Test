package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static hnj hnj;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0195hn {
        void hnj();

        void hnj(Throwable th2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        boolean hn();

        boolean hnj();

        ExecutorService qor();
    }

    public static void hnj(hnj hnjVar) {
        hnj = hnjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean qor(Context context, Intent intent, InterfaceC0195hn interfaceC0195hn) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0195hn == null) {
                    return true;
                }
                interfaceC0195hn.hnj();
                return true;
            } catch (Throwable th2) {
                if (interfaceC0195hn != null) {
                    interfaceC0195hn.hnj(th2);
                }
            }
        }
        return false;
    }

    public static void hnj(final Context context, final Intent intent, final InterfaceC0195hn interfaceC0195hn) {
        ExecutorService executorServiceQor;
        hnj hnjVar = hnj;
        if (hnjVar == null || !hnjVar.hn() || (executorServiceQor = hnj.qor()) == null) {
            qor(context, intent, interfaceC0195hn);
        } else {
            executorServiceQor.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.hn.1
                @Override // java.lang.Runnable
                public void run() {
                    hn.qor(context, intent, interfaceC0195hn);
                }
            });
        }
    }

    public static boolean hnj(final Context context, final Intent intent, final InterfaceC0195hn interfaceC0195hn, boolean z10) {
        hnj hnjVar;
        ExecutorService executorServiceQor;
        if (z10 && (hnjVar = hnj) != null && hnjVar.hnj() && (executorServiceQor = hnj.qor()) != null) {
            executorServiceQor.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.hn.2
                @Override // java.lang.Runnable
                public void run() {
                    hn.qor(context, intent, interfaceC0195hn);
                }
            });
            return true;
        }
        return qor(context, intent, interfaceC0195hn);
    }

    public static Activity hnj(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean hnj(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
