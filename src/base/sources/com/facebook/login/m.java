package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.facebook.internal.y0;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 m2\u00020\u0001:\u0003GKNB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0015¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020#H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0003JC\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ;\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010cR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lcom/facebook/login/m;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "Lfl/g0;", "onDismiss", "(Landroid/content/DialogInterface;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/facebook/login/w$e;", com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, "U", "(Lcom/facebook/login/w$e;)V", "", "", "B", "()Ljava/util/Map;", "D", "()Ljava/lang/String;", "", "isSmartLogin", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Z)Landroid/view/View;", "", "E", "(Z)I", "Lcom/facebook/FacebookException;", "ex", "K", "(Lcom/facebook/FacebookException;)V", "J", "I", "()Z", "Lcom/facebook/login/m$c;", "currentRequestState", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lcom/facebook/login/m$c;)V", "N", "R", "userId", "Lcom/facebook/login/m$b;", "permissions", "accessToken", "name", "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", "O", "(Ljava/lang/String;Lcom/facebook/login/m$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "", "expiresIn", "L", "(Ljava/lang/String;JLjava/lang/Long;)V", "C", "(Ljava/lang/String;Lcom/facebook/login/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "a", "Landroid/view/View;", "progressBar", "Landroid/widget/TextView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/widget/TextView;", "confirmationCode", "c", "instructions", "Lcom/facebook/login/n;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/facebook/login/n;", "deviceAuthMethodHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "Lcom/facebook/m0;", "f", "Lcom/facebook/m0;", "currentGraphRequestPoll", "Ljava/util/concurrent/ScheduledFuture;", "g", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "h", "Lcom/facebook/login/m$c;", "i", "Z", "isBeingDestroyed", "j", "isRetry", CampaignEx.JSON_KEY_AD_K, "Lcom/facebook/login/w$e;", "Lcom/facebook/j0;", "F", "()Lcom/facebook/j0;", "pollRequest", "l", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class m extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f15643m = "device/login";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f15644n = "device/login_status";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f15645o = 1349174;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private View progressBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextView confirmationCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextView instructions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n deviceAuthMethodHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean completed = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile com.facebook.m0 currentGraphRequestPoll;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile ScheduledFuture scheduledPoll;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile c currentRequestState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isBeingDestroyed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isRetry;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private w.e request;

    /* JADX INFO: renamed from: com.facebook.login.m$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b b(JSONObject jSONObject) throws JSONException {
            String strOptString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                String permission = jSONObjectOptJSONObject.optString("permission");
                kotlin.jvm.internal.s.g(permission, "permission");
                if (permission.length() != 0 && !kotlin.jvm.internal.s.c(permission, "installed") && (strOptString = jSONObjectOptJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) != null) {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                arrayList2.add(permission);
                            }
                        } else if (strOptString.equals("granted")) {
                            arrayList.add(permission);
                        }
                    } else if (strOptString.equals("expired")) {
                        arrayList3.add(permission);
                    }
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f15657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f15658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f15659c;

        public b(List grantedPermissions, List declinedPermissions, List expiredPermissions) {
            kotlin.jvm.internal.s.h(grantedPermissions, "grantedPermissions");
            kotlin.jvm.internal.s.h(declinedPermissions, "declinedPermissions");
            kotlin.jvm.internal.s.h(expiredPermissions, "expiredPermissions");
            this.f15657a = grantedPermissions;
            this.f15658b = declinedPermissions;
            this.f15659c = expiredPermissions;
        }

        public final List a() {
            return this.f15658b;
        }

        public final List b() {
            return this.f15659c;
        }

        public final List c() {
            return this.f15657a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f15661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f15664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f15665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f15660f = new b(null);
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.h(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c() {
        }

        public final String a() {
            return this.f15661a;
        }

        public final long b() {
            return this.f15664d;
        }

        public final String c() {
            return this.f15663c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f15662b;
        }

        public final void f(long j10) {
            this.f15664d = j10;
        }

        public final void g(long j10) {
            this.f15665e = j10;
        }

        public final void i(String str) {
            this.f15663c = str;
        }

        public final void j(String str) {
            this.f15662b = str;
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str2 = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.s.g(str2, "format(locale, format, *args)");
            this.f15661a = str2;
        }

        public final boolean l() {
            return this.f15665e != 0 && (new Date().getTime() - this.f15665e) - (this.f15664d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.s.h(dest, "dest");
            dest.writeString(this.f15661a);
            dest.writeString(this.f15662b);
            dest.writeString(this.f15663c);
            dest.writeLong(this.f15664d);
            dest.writeLong(this.f15665e);
        }

        protected c(Parcel parcel) {
            kotlin.jvm.internal.s.h(parcel, "parcel");
            this.f15661a = parcel.readString();
            this.f15662b = parcel.readString();
            this.f15663c = parcel.readString();
            this.f15664d = parcel.readLong();
            this.f15665e = parcel.readLong();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends Dialog {
        d(androidx.fragment.app.s sVar, int i10) {
            super(sVar, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (m.this.I()) {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(m this$0, com.facebook.o0 response) {
        FacebookException facebookException;
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        com.facebook.x xVarB = response.b();
        if (xVarB == null) {
            try {
                JSONObject jSONObjectC = response.c();
                if (jSONObjectC == null) {
                    jSONObjectC = new JSONObject();
                }
                String string = jSONObjectC.getString("access_token");
                kotlin.jvm.internal.s.g(string, "resultObject.getString(\"access_token\")");
                this$0.L(string, jSONObjectC.getLong("expires_in"), Long.valueOf(jSONObjectC.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e10) {
                this$0.K(new FacebookException(e10));
                return;
            }
        }
        int i10 = xVarB.i();
        if (i10 == f15645o || i10 == 1349172) {
            this$0.R();
            return;
        }
        if (i10 == 1349152) {
            c cVar = this$0.currentRequestState;
            if (cVar != null) {
                s7.a.a(cVar.e());
            }
            w.e eVar = this$0.request;
            if (eVar != null) {
                this$0.U(eVar);
                return;
            } else {
                this$0.J();
                return;
            }
        }
        if (i10 == 1349173) {
            this$0.J();
            return;
        }
        com.facebook.x xVarB2 = response.b();
        if (xVarB2 == null || (facebookException = xVarB2.f()) == null) {
            facebookException = new FacebookException();
        }
        this$0.K(facebookException);
    }

    private final void C(String userId, b permissions, String accessToken, Date expirationTime, Date dataAccessExpirationTime) {
        n nVar = this.deviceAuthMethodHandler;
        if (nVar != null) {
            nVar.z(accessToken, com.facebook.h0.n(), userId, permissions.c(), permissions.a(), permissions.b(), com.facebook.l.DEVICE_AUTH, expirationTime, null, dataAccessExpirationTime);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final com.facebook.j0 F() {
        Bundle bundle = new Bundle();
        c cVar = this.currentRequestState;
        bundle.putString("code", cVar != null ? cVar.c() : null);
        bundle.putString("access_token", D());
        return com.facebook.j0.f15486n.B(null, f15644n, bundle, new com.facebook.j0.b() { // from class: com.facebook.login.h
            @Override // com.facebook.j0.b
            public final void a(com.facebook.o0 o0Var) {
                m.A(this.f15615a, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(m this$0, View view) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.J();
    }

    private final void L(final String accessToken, long expiresIn, Long dataAccessExpirationTime) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = expiresIn != 0 ? new Date(new Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new Date(dataAccessExpirationTime.longValue() * 1000);
        }
        final Date date3 = date;
        final Date date4 = date2;
        com.facebook.j0 j0VarX = com.facebook.j0.f15486n.x(new com.facebook.a(accessToken, com.facebook.h0.n(), MBridgeConstans.ENDCARD_URL_TYPE_PL, null, null, null, null, date2, null, date3, null, UserVerificationMethods.USER_VERIFY_ALL, null), "me", new com.facebook.j0.b() { // from class: com.facebook.login.j
            @Override // com.facebook.j0.b
            public final void a(com.facebook.o0 o0Var) {
                m.M(this.f15626a, accessToken, date4, date3, o0Var);
            }
        });
        j0VarX.F(com.facebook.p0.GET);
        j0VarX.G(bundle);
        j0VarX.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(m this$0, String accessToken, Date date, Date date2, com.facebook.o0 response) {
        JSONException jSONException;
        EnumSet enumSetX;
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(accessToken, "$accessToken");
        kotlin.jvm.internal.s.h(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        com.facebook.x xVarB = response.b();
        if (xVarB != null) {
            FacebookException facebookExceptionF = xVarB.f();
            if (facebookExceptionF == null) {
                facebookExceptionF = new FacebookException();
            }
            this$0.K(facebookExceptionF);
            return;
        }
        try {
            JSONObject jSONObjectC = response.c();
            if (jSONObjectC == null) {
                try {
                    jSONObjectC = new JSONObject();
                } catch (JSONException e10) {
                    jSONException = e10;
                    this$0.K(new FacebookException(jSONException));
                    return;
                }
            }
            String string = jSONObjectC.getString("id");
            kotlin.jvm.internal.s.g(string, "jsonObject.getString(\"id\")");
            b bVarB = INSTANCE.b(jSONObjectC);
            String string2 = jSONObjectC.getString("name");
            kotlin.jvm.internal.s.g(string2, "jsonObject.getString(\"name\")");
            c cVar = this$0.currentRequestState;
            if (cVar != null) {
                s7.a.a(cVar.e());
            }
            com.facebook.internal.w wVarF = com.facebook.internal.a0.f(com.facebook.h0.n());
            if (!kotlin.jvm.internal.s.c((wVarF == null || (enumSetX = wVarF.x()) == null) ? null : Boolean.valueOf(enumSetX.contains(y0.RequireConfirm)), Boolean.TRUE) || this$0.isRetry) {
                this$0.C(string, bVarB, accessToken, date, date2);
            } else {
                this$0.isRetry = true;
                this$0.O(string, bVarB, accessToken, string2, date, date2);
            }
        } catch (JSONException e11) {
            jSONException = e11;
        }
    }

    private final void N() {
        c cVar = this.currentRequestState;
        if (cVar != null) {
            cVar.g(new Date().getTime());
        }
        this.currentGraphRequestPoll = F().l();
    }

    private final void O(final String userId, final b permissions, final String accessToken, String name, final Date expirationTime, final Date dataAccessExpirationTime) {
        String string = getResources().getString(com.facebook.common.e.f15058g);
        kotlin.jvm.internal.s.g(string, "resources.getString(R.st…login_confirmation_title)");
        String string2 = getResources().getString(com.facebook.common.e.f15057f);
        kotlin.jvm.internal.s.g(string2, "resources.getString(R.st…confirmation_continue_as)");
        String string3 = getResources().getString(com.facebook.common.e.f15056e);
        kotlin.jvm.internal.s.g(string3, "resources.getString(R.st…ogin_confirmation_cancel)");
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format(string2, Arrays.copyOf(new Object[]{name}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str, new DialogInterface.OnClickListener() { // from class: com.facebook.login.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m.P(this.f15633a, userId, permissions, accessToken, expirationTime, dataAccessExpirationTime, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m.Q(this.f15640a, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(m this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(userId, "$userId");
        kotlin.jvm.internal.s.h(permissions, "$permissions");
        kotlin.jvm.internal.s.h(accessToken, "$accessToken");
        this$0.C(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(m this$0, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        View viewG = this$0.G(false);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewG);
        }
        w.e eVar = this$0.request;
        if (eVar != null) {
            this$0.U(eVar);
        }
    }

    private final void R() {
        c cVar = this.currentRequestState;
        Long lValueOf = cVar != null ? Long.valueOf(cVar.b()) : null;
        if (lValueOf != null) {
            this.scheduledPoll = n.f15668e.a().schedule(new Runnable() { // from class: com.facebook.login.g
                @Override // java.lang.Runnable
                public final void run() {
                    m.S(this.f15611a);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(m this$0) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.N();
    }

    private final void T(c currentRequestState) {
        this.currentRequestState = currentRequestState;
        TextView textView = this.confirmationCode;
        View view = null;
        if (textView == null) {
            kotlin.jvm.internal.s.w("confirmationCode");
            textView = null;
        }
        textView.setText(currentRequestState.e());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), s7.a.c(currentRequestState.a()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            kotlin.jvm.internal.s.w("instructions");
            textView2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            kotlin.jvm.internal.s.w("confirmationCode");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.progressBar;
        if (view2 == null) {
            kotlin.jvm.internal.s.w("progressBar");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        if (!this.isRetry && s7.a.f(currentRequestState.e())) {
            new com.facebook.appevents.o0(getContext()).f("fb_smart_login_service");
        }
        if (currentRequestState.l()) {
            R();
        } else {
            N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(m this$0, com.facebook.o0 response) {
        FacebookException facebookException;
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(response, "response");
        if (this$0.isBeingDestroyed) {
            return;
        }
        if (response.b() != null) {
            com.facebook.x xVarB = response.b();
            if (xVarB == null || (facebookException = xVarB.f()) == null) {
                facebookException = new FacebookException();
            }
            this$0.K(facebookException);
            return;
        }
        JSONObject jSONObjectC = response.c();
        if (jSONObjectC == null) {
            jSONObjectC = new JSONObject();
        }
        c cVar = new c();
        try {
            cVar.j(jSONObjectC.getString("user_code"));
            cVar.i(jSONObjectC.getString("code"));
            cVar.f(jSONObjectC.getLong("interval"));
            this$0.T(cVar);
        } catch (JSONException e10) {
            this$0.K(new FacebookException(e10));
        }
    }

    public Map B() {
        return null;
    }

    public String D() {
        return f1.b() + '|' + f1.c();
    }

    protected int E(boolean isSmartLogin) {
        return isSmartLogin ? com.facebook.common.d.f15051d : com.facebook.common.d.f15049b;
    }

    protected View G(boolean isSmartLogin) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.s.g(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View viewInflate = layoutInflater.inflate(E(isSmartLogin), (ViewGroup) null);
        kotlin.jvm.internal.s.g(viewInflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.c.f15047f);
        kotlin.jvm.internal.s.g(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(com.facebook.common.c.f15046e);
        kotlin.jvm.internal.s.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.confirmationCode = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(com.facebook.common.c.f15042a);
        kotlin.jvm.internal.s.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.H(this.f15589a, view);
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(com.facebook.common.c.f15043b);
        kotlin.jvm.internal.s.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        this.instructions = textView2;
        if (textView2 == null) {
            kotlin.jvm.internal.s.w("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(com.facebook.common.e.f15052a)));
        return viewInflate;
    }

    protected boolean I() {
        return true;
    }

    protected void J() {
        if (this.completed.compareAndSet(false, true)) {
            c cVar = this.currentRequestState;
            if (cVar != null) {
                s7.a.a(cVar.e());
            }
            n nVar = this.deviceAuthMethodHandler;
            if (nVar != null) {
                nVar.x();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    protected void K(FacebookException ex) {
        kotlin.jvm.internal.s.h(ex, "ex");
        if (this.completed.compareAndSet(false, true)) {
            c cVar = this.currentRequestState;
            if (cVar != null) {
                s7.a.a(cVar.e());
            }
            n nVar = this.deviceAuthMethodHandler;
            if (nVar != null) {
                nVar.y(ex);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void U(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.v()));
        e1.s0(bundle, "redirect_uri", request.n());
        e1.s0(bundle, "target_user_id", request.l());
        bundle.putString("access_token", D());
        Map mapB = B();
        bundle.putString("device_info", s7.a.d(mapB != null ? gl.l0.v(mapB) : null));
        com.facebook.j0.f15486n.B(null, f15643m, bundle, new com.facebook.j0.b() { // from class: com.facebook.login.i
            @Override // com.facebook.j0.b
            public final void a(com.facebook.o0 o0Var) {
                m.V(this.f15620a, o0Var);
            }
        }).l();
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        d dVar = new d(requireActivity(), com.facebook.common.f.f15060b);
        dVar.setContentView(G(s7.a.e() && !this.isRetry));
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        c cVar;
        w wVarY;
        kotlin.jvm.internal.s.h(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        kotlin.jvm.internal.s.f(sVarRequireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        a0 a0Var = (a0) ((FacebookActivity) sVarRequireActivity).getCurrentFragment();
        this.deviceAuthMethodHandler = (n) ((a0Var == null || (wVarY = a0Var.y()) == null) ? null : wVarY.o());
        if (savedInstanceState != null && (cVar = (c) savedInstanceState.getParcelable("request_state")) != null) {
            T(cVar);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        com.facebook.m0 m0Var = this.currentGraphRequestPoll;
        if (m0Var != null) {
            m0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.scheduledPoll;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.s.h(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        J();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.s.h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable("request_state", this.currentRequestState);
        }
    }
}
