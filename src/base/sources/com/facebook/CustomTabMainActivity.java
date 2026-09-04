package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.e1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "resultCode", "Landroid/content/Intent;", "resultIntent", "Lfl/g0;", "a", "(ILandroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "", "Z", "shouldCloseCustomTab", "Landroid/content/BroadcastReceiver;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/content/BroadcastReceiver;", "redirectReceiver", "c", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14828d = CustomTabMainActivity.class.getSimpleName() + ".extra_action";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14829e = CustomTabMainActivity.class.getSimpleName() + ".extra_params";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14830f = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14831g = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14832h = CustomTabMainActivity.class.getSimpleName() + ".extra_targetApp";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14833i = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14834j = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCloseCustomTab = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver redirectReceiver;

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri uri = Uri.parse(str);
            Bundle bundleQ0 = e1.q0(uri.getQuery());
            bundleQ0.putAll(e1.q0(uri.getFragment()));
            return bundleQ0;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14837a;

        static {
            int[] iArr = new int[com.facebook.login.i0.values().length];
            try {
                iArr[com.facebook.login.i0.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14837a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f14833i);
            String str = CustomTabMainActivity.f14831g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private final void a(int resultCode, Intent resultIntent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            s1.a.b(this).e(broadcastReceiver);
        }
        if (resultIntent != null) {
            String stringExtra = resultIntent.getStringExtra(f14831g);
            Bundle bundleB = stringExtra != null ? INSTANCE.b(stringExtra) : new Bundle();
            Intent intent = getIntent();
            kotlin.jvm.internal.s.g(intent, "intent");
            Intent intentP = com.facebook.internal.u0.p(intent, bundleB, null);
            if (intentP != null) {
                resultIntent = intentP;
            }
            setResult(resultCode, resultIntent);
        } else {
            Intent intent2 = getIntent();
            kotlin.jvm.internal.s.g(intent2, "intent");
            setResult(resultCode, com.facebook.internal.u0.p(intent2, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        String str = CustomTabActivity.f14823c;
        if (kotlin.jvm.internal.s.c(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (savedInstanceState != null || (stringExtra = getIntent().getStringExtra(f14828d)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f14829e);
        boolean zA = (b.f14837a[com.facebook.login.i0.f15621b.a(getIntent().getStringExtra(f14832h)).ordinal()] == 1 ? new com.facebook.internal.m0(stringExtra, bundleExtra) : new com.facebook.internal.f(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f14830f));
        this.shouldCloseCustomTab = false;
        if (!zA) {
            setResult(0, getIntent().putExtra(f14834j, true));
            finish();
        } else {
            c cVar = new c();
            this.redirectReceiver = cVar;
            s1.a.b(this).c(cVar, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        super.onNewIntent(intent);
        if (kotlin.jvm.internal.s.c(f14833i, intent.getAction())) {
            s1.a.b(this).d(new Intent(CustomTabActivity.f14824d));
            a(-1, intent);
        } else if (kotlin.jvm.internal.s.c(CustomTabActivity.f14823c, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            a(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
