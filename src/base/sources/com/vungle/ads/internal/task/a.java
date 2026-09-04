package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import fl.o;
import gl.s0;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements com.vungle.ads.internal.task.b {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final C0532a Companion = new C0532a(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final s pathProvider;

    /* JADX INFO: renamed from: com.vungle.ads.internal.task.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0532a {
        public /* synthetic */ C0532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d makeJobInfo$default(C0532a c0532a, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return c0532a.makeJobInfo(str);
        }

        public final d makeJobInfo(String str) {
            d priority = new d(a.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(a.AD_ID_KEY, str);
            }
            return priority.setExtras(bundle).setUpdateCurrent(str == null);
        }

        private C0532a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.persistence.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
        }
    }

    public a(Context context, s pathProvider) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.k kVarA = fl.l.a(o.SYNCHRONIZED, new b(this.context));
        int i10 = m146checkIfSdkUpgraded$lambda4(kVarA).getInt("VERSION_CODE", -1);
        if (i10 < 70702) {
            if (i10 < 70000) {
                dropV6Data();
            }
            if (i10 < 70100) {
                dropV700Data();
            }
            if (i10 < 70301) {
                dropV730TempData();
            }
            if (i10 < 70500) {
                dropV742TpatData();
            }
            if (i10 < 70600) {
                dropV750Data();
            }
            m146checkIfSdkUpgraded$lambda4(kVarA).put("VERSION_CODE", 70702).apply();
        }
    }

    /* JADX INFO: renamed from: checkIfSdkUpgraded$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.b m146checkIfSdkUpgraded$lambda4(fl.k kVar) {
        return (com.vungle.ads.internal.persistence.b) kVar.getValue();
    }

    private final void dropV6Data() {
        q.Companion.d(TAG, "CleanupJob: drop old files data");
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            com.vungle.ads.internal.util.j.delete$default(file, null, 2, null);
            com.vungle.ads.internal.util.j.delete$default(new File(file.getPath() + "-journal"), null, 2, null);
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        String string = this.context.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
        this.context.deleteSharedPreferences("com.vungle.sdk");
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        kotlin.jvm.internal.s.g(noBackupFilesDir, "context.noBackupFilesDir");
        com.vungle.ads.internal.util.j.delete$default(new File(noBackupFilesDir, "vungle_settings"), null, 2, null);
        if (string != null) {
            com.vungle.ads.internal.util.j.delete$default(new File(string), null, 2, null);
        }
    }

    private final void dropV700Data() {
        com.vungle.ads.internal.util.j.delete$default(new File(this.context.getApplicationInfo().dataDir, "vungle"), null, 2, null);
    }

    private final void dropV730TempData() {
        try {
            com.vungle.ads.internal.util.j.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"), null, 2, null);
            com.vungle.ads.internal.util.j.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"), null, 2, null);
        } catch (Exception e10) {
            q.Companion.e(TAG, "Failed to delete temp data", e10);
        }
    }

    private final void dropV742TpatData() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            com.vungle.ads.internal.util.j.delete$default(new File(noBackupFilesDir, "failedTpats"), null, 2, null);
            com.vungle.ads.internal.util.j.delete$default(new File(noBackupFilesDir, "failedGenericTpats"), null, 2, null);
        } catch (Exception e10) {
            q.Companion.e(TAG, "Failed to delete 742 tpat data", e10);
        }
    }

    private final void dropV750Data() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            com.vungle.ads.internal.util.j.delete$default(new File(noBackupFilesDir, "vungle_cache/downloads"), null, 2, null);
            com.vungle.ads.internal.util.j.delete$default(new File(noBackupFilesDir, "vungle_cache/js"), null, 2, null);
        } catch (Exception e10) {
            q.Companion.e(TAG, "Failed to delete 750 data", e10);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final s getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.b
    public int onRunJob(Bundle bundle, f jobRunner) {
        File downloadsDirForAd;
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(jobRunner, "jobRunner");
        File vmDir = this.pathProvider.getVmDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = vmDir;
        }
        q.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!kotlin.jvm.internal.s.c(downloadsDirForAd, vmDir)) {
                com.vungle.ads.internal.util.j.delete$default(downloadsDirForAd, null, 2, null);
                return 0;
            }
            checkIfSdkUpgraded();
            com.vungle.ads.internal.util.j.deleteContents(downloadsDirForAd, s0.h(com.vungle.ads.internal.f.OM_SDK_JS, com.vungle.ads.internal.f.OM_SESSION_JS));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
