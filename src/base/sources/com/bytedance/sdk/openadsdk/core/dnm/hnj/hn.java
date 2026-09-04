package com.bytedance.sdk.openadsdk.core.dnm.hnj;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.openadsdk.core.oj;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static volatile hn hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final ArrayList<String> f13703hn = new ArrayList<>();
    private final AtomicBoolean qor = new AtomicBoolean(false);
    private long gjv = System.currentTimeMillis();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f13704sk = 0;
    private long dkl = 0;
    private String dse = "";
    private String aq = "";
    private String ojm = "";

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f13705ta = false;
    private boolean dnm = false;

    public static hn hnj(Application application) {
        if (hnj == null) {
            synchronized (hn.class) {
                try {
                    if (hnj == null) {
                        hn hnVar = new hn();
                        hnj = hnVar;
                        hnVar.f13705ta = hnj((Context) application);
                        hnj.dnm = hnj(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        hnj.hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hn(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f13703hn.contains(localClassName)) {
            this.f13703hn.remove(localClassName);
        }
        if (this.f13703hn.size() == 0) {
            this.gjv = System.currentTimeMillis();
            this.qor.set(true);
            this.aq = localClassName;
        }
    }

    private static int hnj(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean hnj(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void hnj(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f13703hn.size() == 0) {
            this.dse = localClassName;
            this.f13704sk = System.currentTimeMillis();
            this.dkl = System.currentTimeMillis() - this.gjv;
            this.qor.set(false);
        }
        if (!this.f13703hn.contains(localClassName)) {
            this.f13703hn.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.ojm = localClassName;
    }

    private void hnj() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z10 = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objValueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.f13703hn.contains(localClassName)) {
                            this.f13703hn.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.qor;
                if (this.f13703hn.size() > 0) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public String hnj(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.f13704sk;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.qor.get() && this.dnm) {
            i11 |= 2;
        }
        if (!this.qor.get() && this.dkl >= 5000 && j11 < 1000) {
            i11 = this.aq.equals(this.ojm) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.dkl).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.qor).put("alert", this.dnm).put(NotificationCompat.CATEGORY_SYSTEM, this.f13705ta).put("actsize", this.f13703hn.size()).put("mutiproc", true ^ eum.hnj(oj.hnj())).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.dse = "";
        this.dkl = 0L;
        this.f13704sk = 0L;
        this.gjv = System.currentTimeMillis();
        return string;
    }
}
