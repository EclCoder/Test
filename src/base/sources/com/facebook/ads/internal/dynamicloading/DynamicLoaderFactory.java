package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.internal.util.common.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX_FOLDER_NAME = "audience_network";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = DYNAMIC_LOADING_BUILD_TYPE.equals(BuildConfig.BUILD_TYPE);
    public static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static final AtomicBoolean sInitializing = new AtomicBoolean();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface RemoteClassLoaderFactory {
        ClassLoader create(Context context);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MultithreadedBundleWrapper f14884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AudienceNetworkAds.InitListener f14885d;

        a(Context context, boolean z10, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
            this.f14882a = context;
            this.f14883b = z10;
            this.f14884c = multithreadedBundleWrapper;
            this.f14885d = initListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            DynamicLoader dynamicLoader;
            ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f14882a);
            synchronized (DynamicLoaderFactory.class) {
                DynamicLoader dynamicLoaderDoMakeLoader = null;
                th2 = null;
                for (int i10 = 0; i10 < 3; i10++) {
                    try {
                        dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(this.f14882a, false);
                        break;
                    } catch (Throwable th3) {
                        if (i10 == 2) {
                            try {
                                if (!this.f14883b) {
                                    DexLoadErrorReporter.reportDexLoadingIssue(this.f14882a, DynamicLoaderFactory.createErrorMessage(th3), 0.1d);
                                    DynamicLoaderFactory.setFallbackMode(true);
                                }
                                th2 = th3;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        } else {
                            SystemClock.sleep(200L);
                        }
                    }
                }
                dynamicLoader = dynamicLoaderDoMakeLoader;
            }
            DynamicLoaderFactory.doCallInitialize(this.f14882a, dynamicLoader, th2, this.f14883b, this.f14884c, this.f14885d);
            DynamicLoaderFactory.sInitializing.set(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudienceNetworkAds.InitListener f14886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f14887b;

        b(AudienceNetworkAds.InitListener initListener, Throwable th2) {
            this.f14886a = initListener;
            this.f14887b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14886a.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.f14887b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements AudienceNetworkAds.InitResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f14888a;

        c(Throwable th2) {
            this.f14888a = th2;
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitResult
        public String getMessage() {
            return DynamicLoaderFactory.createErrorMessage(this.f14888a);
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitResult
        public boolean isSuccess() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(Throwable th2) {
        return new c(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createErrorMessage(Throwable th2) {
        return "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.\n" + stackTraceToString(th2);
    }

    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        try {
            ClassLoader classLoaderCreate = ((RemoteClassLoaderFactory) context.getClassLoader().loadClass("com.facebook.ads.internal.dynamicloading.RemoteClassLoaderFactoryImpl").getDeclaredConstructor(null).newInstance(null)).create(context);
            if (classLoaderCreate != null) {
                return classLoaderCreate;
            }
        } catch (Exception unused) {
            FlashPreferences.getSharedPreferences(context).edit().clear().apply();
        }
        String[] list = context.getAssets().list("audience_network");
        if (list == null || list.length == 0) {
            Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
            throw new RuntimeException("Failed to find assets in audience_network");
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.length];
        for (int i10 = 0; i10 < list.length; i10++) {
            String str = list[i10];
            InputStream inputStreamOpen = context.getAssets().open("audience_network" + File.separator + str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int i11 = inputStreamOpen.read(bArr);
                if (i11 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
            }
            inputStreamOpen.close();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byteBufferArr[i10] = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        }
        com.facebook.ads.internal.dynamicloading.b.a();
        return com.facebook.ads.internal.dynamicloading.a.a(byteBufferArr, DynamicLoaderFactory.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(Context context, DynamicLoader dynamicLoader, Throwable th2, boolean z10, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        if (th2 != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(initListener, th2), 100L);
                return;
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th2);
                return;
            }
        }
        if (dynamicLoader != null) {
            if (z10) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z10) {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader = atomicReference.get();
        if (dynamicLoader == null) {
            if (LOAD_FROM_ASSETS) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
                Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            }
            if (z10) {
                dynamicLoader.maybeInitInternally(context);
            }
            atomicReference.set(dynamicLoader);
        }
        return dynamicLoader;
    }

    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Throwable th2) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th2);
            return null;
        }
    }

    private static File getCacheCodeDirLegacy(Context context, File file) throws IOException {
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (IOException unused) {
            File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    private static File getCodeCacheDir(Context context, File file) {
        return context.getCodeCacheDir();
    }

    public static DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file) throws IOException {
        File file2 = new File(file, "audience_network");
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z10) {
        if (z10 || !sInitializing.getAndSet(true)) {
            new Thread(new a(context, z10, multithreadedBundleWrapper, initListener)).start();
        }
    }

    public static synchronized boolean isFallbackMode() {
        return sFallbackMode;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? createInMemoryClassLoader(context) : makeLegacyAdsSdkClassLoader(context);
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws IOException {
        String path = context.getFilesDir().getPath();
        String[] list = context.getAssets().list("audience_network");
        if (list == null || list.length == 0) {
            Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
            throw new RuntimeException("Failed to find assets in audience_network");
        }
        String[] strArr = new String[list.length];
        for (int i10 = 0; i10 < list.length; i10++) {
            String str = list[i10];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(path);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(str);
            strArr[i10] = sb2.toString();
            InputStream inputStreamOpen = context.getAssets().open("audience_network" + str2 + str);
            FileOutputStream fileOutputStream = new FileOutputStream(strArr[i10]);
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int i11 = inputStreamOpen.read(bArr);
                if (i11 > 0) {
                    fileOutputStream.write(bArr, 0, i11);
                }
            }
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return new DexClassLoader(com.bytedance.sdk.openadsdk.core.model.a.a(File.pathSeparator, strArr), context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
    }

    public static synchronized DynamicLoader makeLoader(Context context) {
        return makeLoader(context, true);
    }

    public static synchronized DynamicLoader makeLoaderUnsafe() {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        Context applicationContextViaReflection = getApplicationContextViaReflection();
        if (applicationContextViaReflection == null) {
            throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
        }
        return makeLoader(applicationContextViaReflection, true);
    }

    public static synchronized void setFallbackMode(boolean z10) {
        try {
            if (z10) {
                sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
            } else {
                sDynamicLoader.set(null);
                sFallbackMode = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String stackTraceToString(Throwable th2) {
        return Log.getStackTraceString(th2);
    }

    public static synchronized DynamicLoader makeLoader(Context context, boolean z10) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        try {
        } catch (Throwable th2) {
            Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th2);
            DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th2), 0.1d);
            DynamicLoader dynamicLoaderMakeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
            sDynamicLoader.set(dynamicLoaderMakeFallbackLoader);
            sFallbackMode = true;
            return dynamicLoaderMakeFallbackLoader;
        }
        return doMakeLoader(context, z10);
    }

    private static void mkdirChecked(File file) throws IOException {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                str = "Failed to create dir " + file.getPath() + UoyZyZEcGYBpIg.hKHXeLqns;
            } else {
                str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + UoyZyZEcGYBpIg.kHKcVRQYo + parentFile.canWrite();
            }
            Log.e(AudienceNetworkAds.TAG, str);
            throw new IOException("Failed to create directory " + file.getPath() + ", detailed message: " + str);
        }
    }
}
