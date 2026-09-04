package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f1834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f1835b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1834a = intent;
        this.f1835b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1834a.setData(uri);
        androidx.core.content.a.startActivity(context, this.f1834a, this.f1835b);
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0018d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f1838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f1839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f1840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray f1841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f1842g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f1845j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f1836a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.browser.customtabs.a.C0015a f1837b = new androidx.browser.customtabs.a.C0015a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1843h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f1844i = true;

        public C0018d() {
        }

        private void f() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f1836a.hasExtra("com.android.browser.headers") ? this.f1836a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f1836a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void l(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1836a.putExtras(bundle);
        }

        private void m() {
            if (this.f1839d == null) {
                this.f1839d = a.a();
            }
            c.a(this.f1839d, this.f1845j);
        }

        public d a() {
            if (!this.f1836a.hasExtra("android.support.customtabs.extra.SESSION")) {
                l(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f1838c;
            if (arrayList != null) {
                this.f1836a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f1840e;
            if (arrayList2 != null) {
                this.f1836a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1836a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1844i);
            this.f1836a.putExtras(this.f1837b.a().a());
            Bundle bundle = this.f1842g;
            if (bundle != null) {
                this.f1836a.putExtras(bundle);
            }
            if (this.f1841f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1841f);
                this.f1836a.putExtras(bundle2);
            }
            this.f1836a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1843h);
            int i10 = Build.VERSION.SDK_INT;
            f();
            if (i10 >= 34) {
                m();
            }
            ActivityOptions activityOptions = this.f1839d;
            return new d(this.f1836a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0018d b(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f1836a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", i10);
            return this;
        }

        public C0018d c(boolean z10) {
            this.f1836a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !z10);
            return this;
        }

        public C0018d d(Bitmap bitmap) {
            this.f1836a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        public C0018d e(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f1836a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public C0018d g(boolean z10) {
            this.f1836a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !z10);
            return this;
        }

        public C0018d h(int i10) {
            return i(i10, 0);
        }

        public C0018d i(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f1836a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f1836a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public C0018d j(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f1836a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i10);
            return this;
        }

        public C0018d k(i iVar) {
            this.f1836a.setPackage(iVar.f().getPackageName());
            l(iVar.e(), iVar.g());
            return this;
        }

        public C0018d n(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1843h = i10;
            if (i10 == 1) {
                this.f1836a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i10 == 2) {
                this.f1836a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f1836a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        public C0018d o(boolean z10) {
            this.f1836a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public C0018d p(boolean z10) {
            this.f1836a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }

        public C0018d(i iVar) {
            if (iVar != null) {
                k(iVar);
            }
        }
    }
}
