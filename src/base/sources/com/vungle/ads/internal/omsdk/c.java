package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.vungle.ads.a0;
import com.vungle.ads.internal.f;
import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ql.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final a Companion = new a(null);
    private static final String TAG = "OMInjector";
    private AtomicReference<String> cachedOMSDKJS;
    private AtomicReference<String> cachedOMSessionJS;
    private final Context context;
    private final Handler uiHandler;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(Context context) {
        s.h(context, "context");
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(a0.omid_session_client_v1_6_2);
        this.cachedOMSessionJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m110init$lambda2(c this$0) {
        Object objB;
        s.h(this$0, "this$0");
        try {
            r.a aVar = r.f38769b;
            if (!Omid.isActive()) {
                Omid.activate(this$0.context);
            }
            objB = r.b(g0.f38750a);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "error: " + thE.getLocalizedMessage());
        }
    }

    private final String loadJsFromRaw(int i10) {
        Object objB;
        try {
            r.a aVar = r.f38769b;
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(i10);
            s.g(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, bm.d.f9079b), 8192);
            try {
                String strC = k.c(bufferedReader);
                ql.b.a(bufferedReader, null);
                objB = r.b(strC);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th4));
        }
        return (String) (r.h(objB) ? null : objB);
    }

    private final File writeToFile(String str, File file) throws IOException {
        if (str == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write(str);
            fileWriter.flush();
            ql.b.a(fileWriter, null);
            return file;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.b.a(fileWriter, th2);
                throw th3;
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(a0.omsdk_v1_6_2);
        this.cachedOMSDKJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.b
            @Override // java.lang.Runnable
            public final void run() {
                c.m110init$lambda2(this.f35840a);
            }
        });
    }

    public final List<File> injectJsFiles$vungle_ads_release(File dir) throws IOException {
        s.h(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, f.OM_SDK_JS);
        if (!file.exists()) {
            q.Companion.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, f.OM_SESSION_JS);
        if (!file2.exists()) {
            q.Companion.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }
}
