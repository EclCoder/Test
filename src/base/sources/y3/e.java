package y3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Ly3/e;", "Ly3/z1;", "Ly3/e$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", CampaignEx.JSON_KEY_AD_Q, "()Ly3/e$b;", "", "o", "()Z", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "Ly3/m1;", "navOptions", "Ly3/z1$a;", "navigatorExtras", "Ly3/d1;", "s", "(Ly3/e$b;Landroid/os/Bundle;Ly3/m1;Ly3/z1$a;)Ly3/d1;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "e", "Landroid/app/Activity;", "hostActivity", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@z1.b("activity")
public class e extends z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends d1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Intent f57188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f57189i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z1 activityNavigator) {
            super(activityNavigator);
            kotlin.jvm.internal.s.h(activityNavigator, "activityNavigator");
        }

        private final String M(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            kotlin.jvm.internal.s.g(packageName, "getPackageName(...)");
            return bm.r.I(str, "${applicationId}", packageName, false, 4, null);
        }

        @Override // y3.d1
        public void B(Context context, AttributeSet attrs) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(attrs, "attrs");
            super.B(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, e2.f57190a);
            kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
            R(M(context, typedArrayObtainAttributes.getString(e2.f57195f)));
            String string = typedArrayObtainAttributes.getString(e2.f57191b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                O(new ComponentName(context, string));
            }
            N(typedArrayObtainAttributes.getString(e2.f57192c));
            String strM = M(context, typedArrayObtainAttributes.getString(e2.f57193d));
            if (strM != null) {
                P(Uri.parse(strM));
            }
            Q(M(context, typedArrayObtainAttributes.getString(e2.f57194e)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // y3.d1
        public boolean H() {
            return false;
        }

        public final String I() {
            Intent intent = this.f57188h;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName J() {
            Intent intent = this.f57188h;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String K() {
            return this.f57189i;
        }

        public final Intent L() {
            return this.f57188h;
        }

        public final b N(String str) {
            if (this.f57188h == null) {
                this.f57188h = new Intent();
            }
            Intent intent = this.f57188h;
            kotlin.jvm.internal.s.e(intent);
            intent.setAction(str);
            return this;
        }

        public final b O(ComponentName componentName) {
            if (this.f57188h == null) {
                this.f57188h = new Intent();
            }
            Intent intent = this.f57188h;
            kotlin.jvm.internal.s.e(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final b P(Uri uri) {
            if (this.f57188h == null) {
                this.f57188h = new Intent();
            }
            Intent intent = this.f57188h;
            kotlin.jvm.internal.s.e(intent);
            intent.setData(uri);
            return this;
        }

        public final b Q(String str) {
            this.f57189i = str;
            return this;
        }

        public final b R(String str) {
            if (this.f57188h == null) {
                this.f57188h = new Intent();
            }
            Intent intent = this.f57188h;
            kotlin.jvm.internal.s.e(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // y3.d1
        public boolean equals(Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f57188h;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((b) obj).f57188h);
                } else {
                    zFilterEquals = ((b) obj).f57188h == null;
                }
                if (zFilterEquals && kotlin.jvm.internal.s.c(this.f57189i, ((b) obj).f57189i)) {
                    return true;
                }
            }
            return false;
        }

        @Override // y3.d1
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f57188h;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f57189i;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // y3.d1
        public String toString() {
            ComponentName componentNameJ = J();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameJ != null) {
                sb2.append(" class=");
                sb2.append(componentNameJ.getClassName());
            } else {
                String strI = I();
                if (strI != null) {
                    sb2.append(" action=");
                    sb2.append(strI);
                }
            }
            String string = sb2.toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return string;
        }
    }

    public e(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        this.context = context;
        for (Object obj : am.j.g(context, new Function1() { // from class: y3.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return e.r((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.hostActivity = (Activity) obj;
            }
        }
        obj = null;
        this.hostActivity = (Activity) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context r(Context it) {
        kotlin.jvm.internal.s.h(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @Override // y3.z1
    public boolean o() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // y3.z1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this);
    }

    @Override // y3.z1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public d1 f(b destination, Bundle args, m1 navOptions, z1.a navigatorExtras) {
        Intent intent;
        int intExtra;
        String strEncode;
        kotlin.jvm.internal.s.h(destination, "destination");
        if (destination.L() == null) {
            throw new IllegalStateException(("Destination " + destination.p() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.L());
        if (args != null) {
            intent2.putExtras(args);
            String strK = destination.K();
            if (strK != null && strK.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strK);
                while (matcher.find()) {
                    Bundle bundleA = n4.c.a(args);
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.s.e(strGroup);
                    if (!n4.c.b(bundleA, strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + args + " to fill data pattern " + strK).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    v vVar = (v) destination.m().get(strGroup);
                    p1 p1VarA = vVar != null ? vVar.a() : null;
                    if (p1VarA == null || (strEncode = p1VarA.i(p1VarA.a(args, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(args.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.j()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.p());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int iC = navOptions.c();
            int iD = navOptions.d();
            if ((iC <= 0 || !kotlin.jvm.internal.s.c(resources.getResourceTypeName(iC), "animator")) && (iD <= 0 || !kotlin.jvm.internal.s.c(resources.getResourceTypeName(iD), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                kotlin.jvm.internal.s.e(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD));
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + " when launching " + destination);
            }
        }
        this.context.startActivity(intent2);
        if (navOptions != null && this.hostActivity != null) {
            int iA = navOptions.a();
            int iB = navOptions.b();
            if ((iA > 0 && kotlin.jvm.internal.s.c(resources.getResourceTypeName(iA), "animator")) || (iB > 0 && kotlin.jvm.internal.s.c(resources.getResourceTypeName(iB), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + destination);
            } else if (iA >= 0 || iB >= 0) {
                this.hostActivity.overridePendingTransition(yl.g.d(iA, 0), yl.g.d(iB, 0));
            }
        }
        return null;
    }
}
